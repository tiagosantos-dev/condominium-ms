package com.condominium.resident.models;

import java.io.Serializable;
import java.util.UUID;

public class Resident implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private UUID id;
	
	private Person person;
	
	private Point point;
	
	public Resident(){}

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

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
	

}
