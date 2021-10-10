package com.condominium.resident.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public abstract class Requestor {
	
	@Id
	@GeneratedValue(generator = "UUID")
	private UUID id;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}


}
