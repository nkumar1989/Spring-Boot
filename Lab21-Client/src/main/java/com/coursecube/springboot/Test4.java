package com.coursecube.springboot;

import org.springframework.web.client.RestTemplate;


public class Test4 {
	
	public static void main(String[] args) {
	RestTemplate restTemp=new RestTemplate();
	String URL="http://localhost:54321/mywithdraw";
	TxInfo txInfo=new TxInfo(102, 10000);
	restTemp.put(URL,txInfo) ;
	System.out.println("Done");
	}
	
}