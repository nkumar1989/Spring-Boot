package com.coursecube.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/myhello")
	public String getMessage1() {
	System.out.println("HC-getMessage1()");
	return "I am getMessage1";
	}
	
	@GetMapping("/myhello/{name}")
	public String getMessage2(@PathVariable String name) {
	System.out.println("HC-getMessage2()");
	String msg="Hello "+name +" !!! - I am getMessage2";
	return msg;
	}
	
	@GetMapping("/myhello/{name}/{email}")
	public String getMessage3(@PathVariable String name,@PathVariable String email) {
	System.out.println("HC-getMessage3()");
	System.out.println(name+"\t"+email);
	String msg="Hello "+name +" !!! - I am getMessage3";
	return msg;
	}
	
	@GetMapping(value="/hello1/{name}",produces = "application/json" )
	public Hello getMessage4(@PathVariable String name) {
	System.out.println("HC-getMessage4()");
	Hello hello=new Hello();
	hello.setName(name);
	String msg="Hello "+name +" !!! - I am getMessage4";
	hello.setMessgae(msg);
	return hello;
	}
	
	@GetMapping(value = "/hello2/{name}", produces = "application/xml")
	public Hello getMessage5(@PathVariable String name) {
	System.out.println("HC-getMessage5()");
	Hello hello=new Hello();
	hello.setName(name);
	String msg="Hello "+name +" !!! - I am getMessage5";
	hello.setMessgae(msg);
	return hello;
	}
	
	@RequestMapping(value = "/hello3/{name}", method = RequestMethod.GET)
	public Hello getMessage6(@PathVariable("name") String name) {
	System.out.println("HC-getMessage6()");
	Hello hello=new Hello();
	hello.setName(name);
	String msg="Hello "+name +" !!! - I am getMessage6";
	hello.setMessgae(msg);
	return hello;
	}
	
	@RequestMapping(value = "/hello4/{name}", method = RequestMethod.GET,produces
			= "application/json")
			public Hello getMessage7(@PathVariable("name") String name) {
			System.out.println("HC-getMessage7()");
			Hello hello=new Hello();
			hello.setName(name);
			String msg="Hello "+name +" !!! - I am getMessage7";
			hello.setMessgae(msg);
			return hello;
			}
	
}