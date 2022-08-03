package com.flightApp.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightApp.Repository.FlightRepo;
import com.flightApp.exception.FlightNotFoundException;
import com.flightApp.models.Flight;


@Service
public class FlightService {

	@Autowired
	private FlightRepo flightRepo;
	

	public boolean addFlights(Flight flight) {
		Flight save = this.flightRepo.save(flight);
		if(save!=null) {
		LocalDateTime date=LocalDateTime.now();
		flight.setDate(date);
		return true;
		}
		return false;

	}

	public boolean block(Flight flight ,Long flightId) {
		Optional<Flight> findById = this.flightRepo.findById(flightId);
		if (findById.isPresent()) {
			flight.setStatus("Block");
			flightRepo.save(flight);
			return true;
		}
		return false;
	}

	public boolean unblock(Flight flight ,Long flightId) {
		Optional<Flight> findById = this.flightRepo.findById(flightId);
		if (findById.isPresent()) {
			flight.setStatus("Unblock");
			flightRepo.save(flight);
			return true;
		}
		return false;
	}

	public List<Flight> getAllFlights() {
		List<Flight> list = this.flightRepo.findAll();
		if(list!=null) {
			return list;
		}else {
			throw new FlightNotFoundException("Flights Not Available");
		}

	}

	public boolean getflightById(Long id) {
		Optional<Flight> findById = this.flightRepo.findById(id);

		if (findById != null) {
			return true;
		}
		return false;
	}
	
	
	public boolean UpdateFlight(Flight flight ,Long flightId) {
		
		Optional<Flight> optional = this.flightRepo.findById(flightId);
		
		if(optional.isPresent()) {
			Flight update = this.flightRepo.save(flight);
			update.setFlightName(flight.getFlightName());
			update.setOrigin(flight.getOrigin());
			update.setDestination(flight.getDestination());
			update.setDate(flight.getDate());
			update.setFare(flight.getFare());
			update.setStatus(flight.getStatus());
			
			this.flightRepo.save(update);
			
			return true;
		}
		
		
		throw new FlightNotFoundException("Given Flight Id is not available");
		
	}
	
	
	

}
