package com.condominium.ordinance.models;

import java.util.UUID;

public class Visitor extends Requestor {
	
	private UUID id;
	
	private Person person;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
