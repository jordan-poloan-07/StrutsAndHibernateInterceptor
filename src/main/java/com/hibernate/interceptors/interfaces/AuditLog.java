package com.hibernate.interceptors.interfaces;

public interface AuditLog {

	Long getId();
	String getDetail();
	String getTargetName();
	
}
