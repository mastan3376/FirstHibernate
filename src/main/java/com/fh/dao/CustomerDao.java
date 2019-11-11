package com.fh.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.fh.entity.Customer;
import com.fh.helper.SessionFactoryHelper;

public class CustomerDao {
	private SessionFactory sessionFactory;

	public void saveCustomer(Customer customer) {
		boolean flag = false;
		Transaction transaction = null;
		sessionFactory = SessionFactoryHelper.getSessionFactory();
		Session session = sessionFactory.openSession();
		try {
			transaction = session.beginTransaction();
			session.save(customer);
			flag = true;
		}
		finally {
			if(transaction != null) {
				if(flag) {
					transaction.commit();
				}
				else {
					transaction.rollback();
				}
			}
		}
		
	}
}
