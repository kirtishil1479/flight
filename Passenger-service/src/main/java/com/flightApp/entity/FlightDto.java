package com.flightApp.entity;

import java.util.Date;

public class FlightDto {
	
	private String origin;
    private String destination;
    private Date flightDate;
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getFlightDate() {
		return flightDate;
	}
	public void setFlightDate(Date flightDate) {
		this.flightDate = flightDate;
	}
	@Override
	public String toString() {
		return "FlightDto [origin=" + origin + ", destination=" + destination + ", flightDate=" + flightDate + "]";
	}
	public FlightDto() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
