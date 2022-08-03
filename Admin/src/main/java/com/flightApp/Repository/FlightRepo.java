package com.flightApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightApp.models.Flight;

public interface FlightRepo extends JpaRepository<Flight, Long> {

}
