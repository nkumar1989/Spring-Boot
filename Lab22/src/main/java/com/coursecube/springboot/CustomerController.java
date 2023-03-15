package com.coursecube.springboot;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController
public class CustomerController {
	

	@Autowired
	CustomerService customerService;
	
	@GetMapping(value = "/mycustomer/custId/{custId}")
	public Customer getCustomerByCid(@PathVariable("custId") int custId) {
	System.out.println("CC-getCustomerByCid() - " + custId);
	Customer cust =null;
	try {
	cust = customerService.getCustomerByCid(custId);
	} catch (CustomerIDNotFoundException ex) {
	throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer ID Not Found", ex);
	}
	return cust;
	}
	
	@GetMapping(value = "/mycustomer/phone/{phone}")
	public Customer getCustomerByPhone(@PathVariable("phone") long phone) {
	System.out.println("CC-getCustomerByPhone() - " + phone);
	Customer cust =null;
	try {
	cust = customerService.getCustomerByPhone(phone);
	} catch (InvalidPhoneNumberException ex) {
	throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Phone Number Not Found",
	ex);
	}
	return cust;
	}
	
	@GetMapping(value = "/mycustomer/city/{city}")
	public List<Customer> getCustomersByCity(@PathVariable("city") String city) {
	System.out.println("CC-getCustomersByCity() - " + city);
	List<Customer> custList = null;
	try {
	custList = customerService.getCustomersByCity(city);
	} catch (CityNotFoundException ex) {
	throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "City Not Found", ex);
	}
	return custList;
	}
	
}