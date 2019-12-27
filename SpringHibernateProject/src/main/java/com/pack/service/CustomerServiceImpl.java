package com.pack.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.controller.CustomerController;
import com.pack.dao.CustomerDao;
import com.pack.form.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
	private static Logger log=Logger.getLogger(CustomerServiceImpl.class);
	
	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
    @Transactional
	public List<Customer> listCustomer() {
		log.info("inside service's listcustomer");
		List<Customer> l=customerDao.listcustomer();
		return l;
	}

}
