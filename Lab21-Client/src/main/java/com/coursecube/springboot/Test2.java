package com.coursecube.springboot;

import org.springframework.web.client.RestTemplate;


public class Test2 {
	
	public static void main(String[] args) {
	RestTemplate restTemp=new RestTemplate();
	String URL="http://localhost:54321/myaccount/101";
	Account acc=restTemp.getForObject(URL, Account.class) ;
	System.out.println(acc);
	System.out.println("Done");
	}
	
}