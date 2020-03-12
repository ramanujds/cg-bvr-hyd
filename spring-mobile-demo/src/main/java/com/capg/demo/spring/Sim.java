package com.capg.demo.spring;

public interface Sim {

	public void call() ;
	
	public void browse() ;
	
	default void printAllContacts() {
		System.out.println("No contacts found");
	}
}
