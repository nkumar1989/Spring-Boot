package com.coursecube.springboot;


public class Hello {
	
	String name;
	
	String messgae;
	
	Hello(){
		
	}

	public Hello(String name, String messgae) {
		super();
		this.name = name;
		this.messgae = messgae;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessgae() {
		return messgae;
	}

	public void setMessgae(String messgae) {
		this.messgae = messgae;
	}
	
	
	
	
}