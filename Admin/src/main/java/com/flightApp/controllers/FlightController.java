package com.flightApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightApp.models.Flight;

import com.flightApp.services.FlightService;

@RestController
@RequestMapping("/api/flight")
public class FlightController {
	
	@Autowired
	private FlightService flightservice;
	

	
	
	@PostMapping("/AddFlight")
	public ResponseEntity<String> addFlights(@RequestBody  Flight flight) {
		boolean addFlights = this.flightservice.addFlights(flight);
		if(addFlights==true) {
			String msg="Flight Added Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}
		String msg="Flight Not added";
		return new ResponseEntity<String>(msg,HttpStatus.NOT_ACCEPTABLE);
	}
	
	@PutMapping("/BlockFlight")
	public boolean blockFlight(@RequestBody  Flight flight,@PathVariable Long flightId) {
		return this.flightservice.block(flight, flightId);
		
	}
	
	@PutMapping("/unblockFlight")
	public boolean unblockFlight(@RequestBody  Flight flight,@PathVariable Long flightId ) {
		return flightservice.unblock(flight,flightId);
	}
	
	@GetMapping("/getAllFlights")
	public List<Flight> getAllFlights(){
		
		return this.flightservice.getAllFlights();
	}
	
	@GetMapping("/getFlightById/{id}")
	public boolean getFlight(@PathVariable Long id){
		
		return this.flightservice.getflightById(id);
	}
	
	@PutMapping("/updateflight/{flightId}")
	public ResponseEntity<String> UpadateFlight(@RequestBody Flight flight ,@PathVariable Long flightId) {
		boolean updateFlight = this.flightservice.UpdateFlight(flight, flightId);
		if(updateFlight==true) {
			String msg="Flight Upadte Successfully";
			return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}
		String msg="Flight Not Updated";
		return new ResponseEntity<String>(msg,HttpStatus.NOT_ACCEPTABLE);
	}

}
