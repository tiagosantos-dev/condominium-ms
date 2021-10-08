package com.condominium.resident.models;

import java.io.Serializable;
import java.util.UUID;

public class Address implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private UUID id;
	private String street;
	private String number;
	private String zipCode;
	private String referencePoint;
	
	public Address() {}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getReferencePoint() {
		return referencePoint;
	}
	public void setReferencePoint(String referencePoint) {
		this.referencePoint = referencePoint;
	}
	
	
	
}
