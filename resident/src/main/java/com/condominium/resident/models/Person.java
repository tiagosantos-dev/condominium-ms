package com.condominium.resident.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private UUID id;
	
	private String fullName;
	
	private String socialSecurityNumber;
	
	private LocalDate birthDate;
	
	public Person(){}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
