package com.personal.macauyeah;

import org.hibernate.Session;

public class TestHibernate {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}

}
