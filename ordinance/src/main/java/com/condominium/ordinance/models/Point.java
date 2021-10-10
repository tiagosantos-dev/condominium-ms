package com.condominium.ordinance.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Point implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private UUID id;
	
	private String block;
	private String allotment;
	
	@OneToOne
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
