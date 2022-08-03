package com.flightApp.entity;

import java.util.Date;

public class SearchDetails {
	
	private String Source;
	private String destination;
    private Date journeyDate;
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	@Override
	public String toString() {
		return "SearchDetails [Source=" + Source + ", destination=" + destination + ", journeyDate=" + journeyDate
				+ "]";
	}
	public SearchDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
