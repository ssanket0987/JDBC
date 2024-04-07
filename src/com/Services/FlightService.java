package com.Services;
import java.util.List;
import java.util.Set;

import com.model.Flight;

import exception.InvalidIdException;

public interface FlightService {
	
	Flight addFlight(Flight flight);
	Set<Flight> getAllFlight()throws Exception;
	Flight getFlightById(int id)throws InvalidIdException;
	
	List<Flight> searchFlight(String source,String destination);
	
	int updateFlight(int flightId, Flight newFlight);
	List<Flight> listByPriceOrder();

}
