package com.capg.demo.spring;

public class Mobile {

	Sim sim;
	
	
	
	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	public void makeACall() {
		sim.call();
	}
	
	public void browseInternet() {
		sim.browse();
	}
	
	
	
	
}
