package com.flightApp.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.flightApp.Repository.SecurityRepo;
import com.flightApp.models.Security;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	/*
	// find userdata from database -> wrap in UserDetailsService => User
	//
	// Customer cus = repo.findById(name);
	// new User(cus.getEmail(), cus.getPassword(), roles)
	//  
	*/
	
	@Autowired
	private SecurityRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		Customer cus = repo.findById(username);
//		return new User(cus.getUsername(), cus.getPassword(), null);
		if("admin".equals(username)) {
			Set<SimpleGrantedAuthority> authorities = new HashSet<>();
	        authorities.add(new SimpleGrantedAuthority("ROLE_" + "ADMIN"));
            Optional<Security> optional=repo.findById("admin");
//			return new User("admin", "{noop}admin@123", authorities);
//			return new User("admin", "{bcrypt}$2a$10$O0p8Te2oeuuE.J4ffXlsJ.NFlK2R7b708JJxh8fsfTZ6Ih42bAKA6", authorities);
			return new User("admin",optional.get().getPassword(), authorities);
		
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}
