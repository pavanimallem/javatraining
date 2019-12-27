package com.pack.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.pack.form.Customer;
import com.pack.service.CustomerServiceImpl;
@Repository
public class CustomerDaoImpl implements CustomerDao {
	private static Logger log=Logger.getLogger(CustomerDaoImpl.class);
	private SessionFactory sessionFactory;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public List<Customer> listcustomer() {
		// TODO Auto-generated method stub
		Query q=sessionFactory.getCurrentSession().createQuery("from Customer");
		List l=q.list();
		return l;
	}

}
