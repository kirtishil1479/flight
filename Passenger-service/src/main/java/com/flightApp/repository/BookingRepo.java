package com.flightApp.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.flightApp.entity.BookingDetails;

public interface BookingRepo extends JpaRepository<BookingDetails,Integer> {
	
	public List<BookingDetails> findByPnr(int pnr); 
	    
}
