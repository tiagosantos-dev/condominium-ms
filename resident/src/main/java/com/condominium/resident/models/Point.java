package com.condominium.resident.models;

import java.util.UUID;

public class Point {
	
	private UUID id;
	private String block;
	private String allotment;
	
	private Address address;
	
	public Point() {}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getAllotment() {
		return allotment;
	}

	public void setAllotment(String allotment) {
		this.allotment = allotment;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
