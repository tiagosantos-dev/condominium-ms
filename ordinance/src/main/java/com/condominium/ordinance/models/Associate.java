package com.condominium.ordinance.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Associate implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "UUID")
	private UUID id;
	
	private Person person;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Person authorizationBy;
	
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
	public Person getAuthorizationBy() {
		return authorizationBy;
	}
	public void setAuthorizationBy(Person authorizationBy) {
		this.authorizationBy = authorizationBy;
	}
	
	
	
}
