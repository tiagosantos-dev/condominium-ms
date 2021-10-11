package com.condominium.servicesupplier.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "UUID")
	private UUID id;
	
	private String cnpj;
	private String nameFantasy;
	private String phoneNumber;
	private String email;
	
	@OneToMany(mappedBy = "company")
	private List<Employee> employee = new ArrayList<>();
	
	public Company() {}
	
	public Company(UUID id, String cnpj, String nameFantasy, String phoneNumber, String email) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.nameFantasy = nameFantasy;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNameFantasy() {
		return nameFantasy;
	}
	public void setNameFantasy(String nameFantasy) {
		this.nameFantasy = nameFantasy;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
