package com.hibernate.interceptors.interceptors;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.CallbackException;
import org.hibernate.EmptyInterceptor;
import org.hibernate.Session;
import org.hibernate.type.Type;

import com.hibernate.interceptors.interfaces.AuditLog;
import com.hibernate.interceptors.interfaces.AuditLogUtil;

public class AuditLogInterceptor extends EmptyInterceptor {

	private static final long serialVersionUID = 5959489343236268575L;

	Session session;
	private Set inserts = new HashSet();
	private Set updates = new HashSet();
	private Set deletes = new HashSet();

	public void setSession(Session session) {
		this.session = session;
	}

	public boolean onSave(Object entity, Serializable id, Object[] state,
			String[] propertyNames, Type[] types) throws CallbackException {

		System.out.println("onSave");

		if (entity instanceof AuditLog) {
			inserts.add(entity);
		}
		return false;

	}

	public boolean onFlushDirty(Object entity, Serializable id,
			Object[] currentState, Object[] previousState,
			String[] propertyNames, Type[] types) throws CallbackException {

		System.out.println("onFlushDirty");

		if (entity instanceof AuditLog) {
			updates.add(entity);
		}
		return false;

	}

	public void onDelete(Object entity, Serializable id, Object[] state,
			String[] propertyNames, Type[] types) {

		System.out.println("onDelete");

		if (entity instanceof AuditLog) {
			deletes.add(entity);
		}
	}

	// called before commit into database
	public void preFlush(Iterator iterator) {
		System.out.println("preFlush");
	}

	// called after committed into database
	public void postFlush(Iterator iterator) {
		System.out.println("postFlush");

		try {

			for (Iterator it = inserts.iterator(); it.hasNext();) {
				AuditLog entity = (AuditLog) it.next();
				System.out.println("postFlush - insert");
				AuditLogUtil.LogIt("Saved", entity, session.connection());
			}

			for (Iterator it = updates.iterator(); it.hasNext();) {
				AuditLog entity = (AuditLog) it.next();
				System.out.println("postFlush - update");
				AuditLogUtil.LogIt("Updated", entity, session.connection());
			}

			for (Iterator it = deletes.iterator(); it.hasNext();) {
				AuditLog entity = (AuditLog) it.next();
				System.out.println("postFlush - delete");
				AuditLogUtil.LogIt("Deleted", entity, session.connection());
			}

		} finally {
			inserts.clear();
			updates.clear();
			deletes.clear();
		}
	}
}
