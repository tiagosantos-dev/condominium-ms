package com.condominium.ordinance.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	
	private String street;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String number;
	
	private String zipCode;
	
	private String referencePoint;
	
	private LatLong latLong;
	
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

	public LatLong getLatLong() {
		return latLong;
	}

	public void setLatLong(LatLong latLong) {
		this.latLong = latLong;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
