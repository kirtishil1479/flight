package com.flightApp.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class BookingDetails implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pnr;
	private int flightId;
	private String flightName;
	private String source;
	private String destination;
	private LocalDate Date;
	private LocalDateTime departTime;
	private double fare;
	private int seat;
	private String status="Active";
	@ElementCollection
	private List<PassengerDetails> details;
	
	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	public LocalDateTime getDepartTime() {
		return departTime;
	}
	public void setDepartTime(LocalDateTime departTime) {
		this.departTime = departTime;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<PassengerDetails> getDetails() {
		return details;
	}
	public void setDetails(List<PassengerDetails> details) {
		this.details = details;
	}
	
	
	
	




}
