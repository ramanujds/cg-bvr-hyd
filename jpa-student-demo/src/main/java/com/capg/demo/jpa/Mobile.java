package com.capg.demo.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int serialNo;
	
	private String model;
	private String brand;
	
	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(String model, String brand) {
		super();
		this.model = model;
		this.brand = brand;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Mobile [serialNo=" + serialNo + ", model=" + model + ", brand=" + brand + "]";
	}
	
	
	
	
}
