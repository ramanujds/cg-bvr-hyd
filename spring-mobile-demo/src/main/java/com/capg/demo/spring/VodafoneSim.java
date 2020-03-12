package com.capg.demo.spring;

import java.util.Map;

public class VodafoneSim implements Sim{

	private float callCharges;
	private float internetSpeed;
	Map<String, Long> contacts;
	
	
	public Map<String, Long> getContacts() {
		return contacts;
	}


	public void setContacts(Map<String, Long> contacts) {
		this.contacts = contacts;
	}


	public VodafoneSim() {
		// TODO Auto-generated constructor stub
	}
	
	
	public VodafoneSim(float callCharges, float internetSpeed) {
		super();
		this.callCharges = callCharges;
		this.internetSpeed = internetSpeed;
	}


	public float getCallCharges() {
		return callCharges;
	}

	public void setCallCharges(float callCharges) {
		this.callCharges = callCharges;
	}

	public float getInternetSpeed() {
		return internetSpeed;
	}

	public void setInternetSpeed(float internetSpeed) {
		this.internetSpeed = internetSpeed;
	}

	public void call() {
		System.out.println("Calling with Vodafone.. charges - "+callCharges+"/min");
	}
	
	public void browse() {
		System.out.println("Browsing with Vodafone.. speed - "+internetSpeed+"mb/s");
	}
	
	@Override
	public void printAllContacts() {
		contacts.forEach((name,number)->System.out.println(name+" - "+number));
	}
}