package com.flightApp.controller;

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

import com.flightApp.entity.BookingDetails;
import com.flightApp.exception.BookingException;
import com.flightApp.service.BookingService;

@RestController
@RequestMapping("/ticket")
public class PassengerController {
	
	@Autowired
	private BookingService service;
	

	@PostMapping("/bookTicket")
	private ResponseEntity<String> bookingticket(@RequestBody BookingDetails details) throws BookingException {
		BookingDetails book = this.service.ticketBooking(details);
		if(book!=null) {
			String msg="Ticket Booked Successfully";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/searchPNR")
	public ResponseEntity<List<BookingDetails>> searchByPnr(@PathVariable int pnr) throws BookingException {
		BookingDetails findByPnr = this.service.findByPnr(pnr);
		if(findByPnr!=null) {
		 return new ResponseEntity(pnr,HttpStatus.OK);
	}
	return new ResponseEntity<>(HttpStatus.BAD_REQUEST);	
	}
	
	
	@GetMapping("/getAllBooking")
	public ResponseEntity<List<BookingDetails>> findAllBooking() throws BookingException{
		
	List<BookingDetails> allBooking = this.service.getAllBooking();
	
	return new ResponseEntity<List<BookingDetails>>(allBooking,HttpStatus.OK);
	} 
	
	
	@PutMapping("/CancelTicket")
	public ResponseEntity<BookingDetails> cancelTicket(@RequestBody BookingDetails cancel,@PathVariable int pnr) throws BookingException{
		BookingDetails cancelticket = this.service.cancelticket(pnr, cancel);
		return new ResponseEntity<BookingDetails>(cancelticket,HttpStatus.ACCEPTED) ;
	}
	
	

	
	
	

}
