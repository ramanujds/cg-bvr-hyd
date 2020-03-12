package com.capg.demo.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("airtel")
public class AirtelSim implements Sim{

	
	@Value("${airtel.callCharges}")
	private float callCharges;
	@Value("${airtel.internetSpeed}")
	private float internetSpeed;
	@Value("#{${airtel.contacts}}")
	private List<String> contacts;
	
	
	
	public AirtelSim() {
		System.out.println("Airtel Bean Created using Default Constructor");
	}
	
	
	public AirtelSim(float callCharges, float internetSpeed) {
		super();
		System.out.println("Airtel Bean Created and Values Injected through Parameterized Constructor");
		System.out.println("");
		this.callCharges = callCharges;
		this.internetSpeed = internetSpeed;
	}


	public float getCallCharges() {
		return callCharges;
	}

	
	public List<String> getContacts() {
		return contacts;
	}


	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}


	public void setCallCharges(float callCharges) {
		System.out.println("Call charges set through Setter");
		this.callCharges = callCharges;
	}

	public float getInternetSpeed() {
		
		return internetSpeed;
	}

	public void setInternetSpeed(float internetSpeed) {
		System.out.println("Internet Speed set through Setter");
		this.internetSpeed = internetSpeed;
	}

	public void call() {
		System.out.println("Calling with Airtel.. charges - "+callCharges+"/min");
	}
	
	public void browse() {
		System.out.println("Browsing with Airtel.. speed - "+internetSpeed+"mb/s");
	}
	public void printAllContacts() {
		contacts.forEach(System.out::println);
	}
}
