package com.condominium.ordinance.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Permision implements Serializable{
	
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(generator = "UUID")
	private UUID id;
	
	@Enumerated(EnumType.STRING)
	private PermisionStatus status;
	
	
	private UUID resident;
	
	
	private UUID requestor;
	
	@Enumerated(EnumType.STRING)
	private TypeRequestor type;
	
	
	private LocalDateTime createdAt;
	
	
	private LocalDateTime updateAt;
	

	

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public PermisionStatus getStatus() {
		return status;
	}

	public void setStatus(PermisionStatus status) {
		this.status = status;
	}

	public UUID getResident() {
		return resident;
	}

	public void setResident(UUID resident) {
		this.resident = resident;
	}

	public UUID getRequestor() {
		return requestor;
	}

	public void setRequestor(UUID requestor) {
		this.requestor = requestor;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}

	public TypeRequestor getType() {
		return type;
	}

	public void setType(TypeRequestor type) {
		this.type = type;
	}

	

}
