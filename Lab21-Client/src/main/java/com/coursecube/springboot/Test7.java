package com.coursecube.springboot;

import java.util.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
/*
* @Author : Srinivas Dande
* @Company : CourseCube Private Limited
* @Website : www.coursecube.com
* */
public class Test7 {
	
	public static void main(String[] args) {
		
	RestTemplate restTemp=new RestTemplate();
	String URL="http://localhost:54321/myaccounts";
	ResponseEntity<List> respEntity= restTemp.getForEntity(URL, List.class);
	System.out.println(respEntity.getStatusCode());
	System.out.println(respEntity.getStatusCodeValue());
	HttpHeaders myheaders= respEntity.getHeaders();
	System.out.println(myheaders);
	List<Map<String, String>> accList=respEntity.getBody();
	for(Map<String, String> mymap:accList) {
	System.out.println(mymap);
	}
	System.out.println("Done");
	}
	
}