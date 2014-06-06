package com.hibernate.interceptors.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.hibernate.interceptors.entities.Human;
import com.hibernate.interceptors.interceptors.AuditLogInterceptor;

public class HumanDao {

	public boolean addHuman(Human human) {

		AuditLogInterceptor interceptor = new AuditLogInterceptor();
		Session session = HibernateUtil.getSessionFactory().openSession(interceptor);
		interceptor.setSession(session);

		try {
			session.beginTransaction();
			session.save(human);
			session.getTransaction().commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			// TODO: handle exception
			throw e;
		}

	}

}
