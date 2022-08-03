package com.flightApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightApp.models.Security;

public interface SecurityRepo extends JpaRepository<Security, String> {

}
