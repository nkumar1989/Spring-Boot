package com.coursecube.springboot;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AccountDAO extends JpaRepository<Account, Integer> {
	
}