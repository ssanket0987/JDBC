package com.model;

import java.util.Date;

public class Flight implements Comparable{

	private int flightId;
	private String flightType;
	private double flightPrice;
	private String sourceAirport;
	private String destinationAirport;
	private Date flyDate;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightType() {
		return flightType;
	}
	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}
	public double getFlightPrice() {
		return flightPrice;
	}
	public void setFlightPrice(double flightPrice) {
		this.flightPrice = flightPrice;
	}
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public Date getFlyDate() {
		return flyDate;
	}
	public void setFlyDate(Date flyDate) {
		this.flyDate = flyDate;
	}
	public Flight(int flightId, String flightType, double flightPrice, String sourceAirport, String destinationAirport,
			Date flyDate) {
		super();
		this.flightId = flightId;
		this.flightType = flightType;
		this.flightPrice = flightPrice;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.flyDate = flyDate;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightType=" + flightType + ", flightPrice=" + flightPrice
				+ ", sourceAirport=" + sourceAirport + ", destinationAirport=" + destinationAirport + ", flyDate="
				+ flyDate + "]";
	}
	@Override
	public int compareTo(Object obj) {
		Flight flight=(Flight)obj;
		if(this.flightId>flight.flightId) {
			return 1;
		}
		return -1;
	}
	
	
		
	
	
	
	
	
}
