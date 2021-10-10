package com.condominium.resident.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Resident implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	private UUID id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Person person;
	
    @OneToOne
	private Point point;
	
    @OneToMany(
    		  cascade = CascadeType.ALL,
    	        orphanRemoval = true)
    private List<Associate> associates = new ArrayList<>();
    
    
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

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
	

}
