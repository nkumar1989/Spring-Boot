package com.coursecube.springboot;

import java.util.*;
import org.springframework.web.client.RestTemplate;


public class Test6 {
	
	public static void main(String[] args) {
	RestTemplate restTemp=new RestTemplate();
	String URL="http://localhost:54321/myaccounts";
	List<Map<String, String>> accList=restTemp.getForObject(URL, List.class);
	for(Map<String, String> mymap:accList) {
	System.out.println(mymap);
	}
	System.out.println("Done");
	}
	
}
