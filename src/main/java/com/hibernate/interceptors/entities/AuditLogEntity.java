package com.hibernate.interceptors.entities;

import java.util.Date;

public class AuditLogEntity {

	private Long auditLogId;
	private String action;
	private String detail;
	private Date createdDate;
	private Long entityId;
	private String entityName;

	public AuditLogEntity(String action, String detail, Date date, Long id,
			String className) {
		setAction(action);
		setDetail(detail);
		setCreatedDate(date);
		setEntityId(id);
		setEntityName(className);
	}

	public Long getAuditLogId() {
		return auditLogId;
	}

	public void setAuditLogId(Long auditLogId) {
		this.auditLogId = auditLogId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public long getEntityId() {
		return entityId;
	}

	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

}
