package com.coursecube.springboot;

import java.util.*;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	public Customer getCustomerByCid(int custId) {
		
	Customer cust = null;
	if (custId >= 100) {
	cust = new Customer(custId, "Srinivas", "sri@jlc.com", 12345, "Blore");
	} else {
	throw new CustomerIDNotFoundException();
	}
	return cust;
	}
	
	public Customer getCustomerByPhone(long phone) {
		Customer cust = null;
		if (phone >= 50000) {
		cust = new Customer(109, "Dande", "dande@jlc.com", phone, "Blore");
		} else {
		throw new InvalidPhoneNumberException();
		}
		return cust;
		}
	
	public List<Customer> getCustomersByCity(String city) {
		List<Customer> custList = new ArrayList<>();
		if (city.equals("Blore")) {
		custList.add(new Customer(101, "Sri", "sri@jlc.com", 111, city));
		custList.add(new Customer(102, "Vas", "vas@jlc.com", 222, city));
		custList.add(new Customer(103, "SD", "sd@jlc.com", 333, city));
		custList.add(new Customer(104, "DS", "ds@jlc.com", 444, city));
		custList.add(new Customer(105, "Dande", "dande@jlc.com", 555, city));
		custList.add(new Customer(106, "Dande", "dande@jlc.com", 555, city));
		} else {
		throw new CityNotFoundException();
		}
		return custList;
		}
}