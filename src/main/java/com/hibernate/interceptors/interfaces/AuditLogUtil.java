package com.hibernate.interceptors.interfaces;

import java.sql.Connection;
import java.util.Date;

import org.hibernate.Session;

import com.hibernate.interceptors.dao.HibernateUtil;
import com.hibernate.interceptors.entities.AuditLogEntity;

public class AuditLogUtil {
	public static void LogIt(String action, AuditLog entity, Connection conn) {

		Session tempSession = HibernateUtil.getSessionFactory().openSession(
				conn);

		try {

			AuditLogEntity auditRecord = new AuditLogEntity(action,
					entity.getDetail(), new Date(), entity.getId(), entity
							.getClass().toString());
			tempSession.save(auditRecord);
			tempSession.flush();

		} finally {
			tempSession.close();
		}
	}
}
