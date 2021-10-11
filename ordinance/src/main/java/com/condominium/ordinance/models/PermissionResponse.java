package com.condominium.ordinance.models;

import java.time.LocalDateTime;
import java.util.UUID;

public class PermissionResponse {
	
	private UUID id;
	

	private PermisionStatus status;
	
	
	private Resident resident;
	
	
	private Requestor requestor;
	
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

	public Resident getResident() {
		return resident;
	}

	public void setResident(Resident resident) {
		this.resident = resident;
	}

	public Requestor getRequestor() {
		return requestor;
	}

	public void setRequestor(Requestor requestor) {
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
