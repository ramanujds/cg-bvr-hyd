package com.capg.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mobile")
public class Mobile {

	@Autowired
	@Qualifier("vodafone")
	Sim sim;
	
	public void makeACall() {
		sim.call();
	}
	
	public void browseInternet() {
		sim.browse();
	}
	
	public void printAllContacts() {
		sim.printAllContacts();
	}
	
	
	
}
