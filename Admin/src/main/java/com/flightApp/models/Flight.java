package com.flightApp.models;



import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	
	   @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private long flightId;
	    private String flightName;
	    private String origin;
	    private String destination;
	    private LocalDateTime date;
	    private String fare;
	    private String status;
		
		public Flight() {
			super();
			// TODO Auto-generated constructor stub
		}

	

		public long getFlightId() {
			return flightId;
		}



		public void setFlightId(long flightId) {
			this.flightId = flightId;
		}



		public String getFlightName() {
			return flightName;
		}



		public void setFlightName(String flightName) {
			this.flightName = flightName;
		}



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



		public LocalDateTime getDate() {
			return date;
		}



		public void setDate(LocalDateTime date) {
			this.date = date;
		}



		public String getFare() {
			return fare;
		}



		public void setFare(String fare) {
			this.fare = fare;
		}



		public String getStatus() {
			return status;
		}



		public void setStatus(String status) {
			this.status = status;
		}



		@Override
		public String toString() {
			return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", origin=" + origin
					+ ", destination=" + destination + ", date=" + date + ", fare=" + fare + ", status=" + status + "]";
		}

	
	    
	    
	    
	    

}
