package com.hibernate.interceptors.entities;

import com.hibernate.interceptors.interfaces.AuditLog;

public class Human implements AuditLog{

	private Long humanId;
	private String firstName;
	private String middleName;
	private String lastName;

	private String taxIdentificationNumber;
	private String sssId;

	public Long getHumanId() {
		return humanId;
	}

	public void setHumanId(Long humanId) {
		this.humanId = humanId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public void setTaxIdentificationNumber(String taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}

	public String getSssId() {
		return sssId;
	}

	public void setSssId(String sssId) {
		this.sssId = sssId;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return humanId;
	}

	public String getDetail() {
		// TODO Auto-generated method stub
		return "The new human is " + firstName + " " + lastName;
	}

	public String getTargetName() {
		// TODO Auto-generated method stub
		return null;
	}

}
