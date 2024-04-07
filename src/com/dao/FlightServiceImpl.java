package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.Services.FlightService;
import com.model.Flight;
import com.utility.DBUtil;

public class FlightServiceImpl implements FlightService {

	@Override
	public Flight addFlight(Flight flight) {

		try (Connection con = DBUtil.getConnect();) {
			final String INSERT_QUERY = "INSERT INTO FlightInfo VALUES(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(INSERT_QUERY);
			ps.setInt(1, flight.getFlightId());
			ps.setString(2, flight.getFlightType());
			ps.setDouble(3, flight.getFlightPrice());
			ps.setString(4, flight.getSourceAirport());
			ps.setString(5, flight.getDestinationAirport());

			java.util.Date d1 = flight.getFlyDate();
			long timesinmillis = d1.getTime();
			java.sql.Date flyDate = new java.sql.Date(timesinmillis);

			ps.setDate(6, flyDate);

			int insertStatus = ps.executeUpdate();
			if (insertStatus > 0) {
				return flight;
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	@Override
	public Set<Flight> getAllFlight() {
		Set<Flight> setOfFlight = new TreeSet<>();
		try (Connection con = DBUtil.getConnect();
			 PreparedStatement ps = con.prepareStatement("SELECT * FROM FlightInfo");
			 ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				int id = rs.getInt("flight_id");
				String fType = rs.getString(2);
				double fprice = rs.getDouble(3);
				String source = rs.getString(4);
				String dest = rs.getString(5);
				java.sql.Date d1 = rs.getDate(6);
				java.util.Date utilDate=new java.util.Date(d1.getTime());
				

				Flight f = new Flight(id, fType, fprice, source, dest,utilDate);
				setOfFlight.add(f);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return setOfFlight;
	}

	@Override
	public Flight getFlightById(int id)throws InvalidException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Flight> searchFlight(String source, String destination) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateFlight(int flightId, Flight newFlight) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Flight> listByPriceOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	                                                                                                                          

}
