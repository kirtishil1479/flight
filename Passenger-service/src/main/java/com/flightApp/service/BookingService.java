package com.flightApp.service;

import java.time.LocalDate;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightApp.entity.BookingDetails;

import com.flightApp.exception.BookingException;
import com.flightApp.repository.BookingRepo;

@Service
public class BookingService {
	
	@Autowired
	private BookingRepo repo;

	
	
	public BookingDetails ticketBooking(BookingDetails details) throws BookingException {
		if(details!=null) {
		LocalDate date=LocalDate.now();
		details.setDate(date);
		
		return this.repo.save(details);
		}
		
		 throw new  BookingException("Wrong Details....!");
	}
	
	
		public BookingDetails  findByPnr(int pnr) throws BookingException {
			 List<BookingDetails> findByPnr = this.repo.findByPnr(pnr);
			if(findByPnr==null) {
				throw new BookingException("Incorrect PNR");
					
			}
			return findByPnr.get(pnr);
			
		}
		
	
		
	
	public List<BookingDetails> getAllBooking() throws BookingException{
		
		List<BookingDetails> list = this.repo.findAll();
		if(list.isEmpty()) {
			throw new BookingException("Booking details not available");
		}
		return list;
		
	}
	
	
	public BookingDetails cancelticket(int pnr,BookingDetails details) throws BookingException {
		List<BookingDetails> findByPnr = this.repo.findByPnr(pnr);
		if(findByPnr!=null) {
			details.setStatus("Cancel");
			
		     return repo.save(details);
				
		}
		throw new BookingException("PNR No=" +pnr +" is Not present");
	}
	
	
	
	
	
	

}
