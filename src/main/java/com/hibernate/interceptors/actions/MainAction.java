package com.hibernate.interceptors.actions;

import com.hibernate.interceptors.bo.HumanBo;
import com.hibernate.interceptors.entities.Human;
import com.opensymphony.xwork2.ActionSupport;

public class MainAction extends ActionSupport {

	private static final long serialVersionUID = -2974496923274149601L;
	
	private HumanBo humanBussinessObj = new HumanBo();
	
	private String firstName;
	private String middleName;
	private String lastName;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return SUCCESS;
	}

	public String add() {
		
		Human h = new Human();
		h.setFirstName(firstName);
		h.setMiddleName(middleName);
		h.setLastName(lastName);
		
		humanBussinessObj.add(h);
		
		return SUCCESS;
	}

	public String edit() {
		return SUCCESS;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
