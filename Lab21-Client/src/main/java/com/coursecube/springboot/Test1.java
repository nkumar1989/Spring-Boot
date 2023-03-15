package com.coursecube.springboot;

import org.springframework.web.client.RestTemplate;


public class Test1 {
	
	public static void main(String[] args) {
		
	RestTemplate restTemp=new RestTemplate();
	String URL="http://localhost:54321/addAccount";
	Account acc=new Account("SA","B-99",75000);
	String msg=restTemp.postForObject(URL, acc, String.class);
	System.out.println(msg);
	System.out.println("Done");
	
	}
}