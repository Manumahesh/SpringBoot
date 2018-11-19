package com.perfaware.SpringBootSample;

public class PutClass {
	
	private String name = "manu";
	private String roll = "12";
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		System.out.println(roll);
		return roll;
	}

	public void setRoll(String roll) {
		System.out.println(roll);
		this.roll = roll;
	}

	PutClass(){
		System.out.println(name+" "+roll);
	}

	@Override
	public String toString() {
		return "[name=" + name + ", roll=" + roll + "]";
	}	
}
