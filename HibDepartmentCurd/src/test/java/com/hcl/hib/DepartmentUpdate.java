package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DepartmentUpdate {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		int deptno=2;
		Query q=s.createQuery("from Department Where Deptno="+deptno);
		List<Department> lstDepartment=q.list();
		Department res=lstDepartment.get(0);
		
		Transaction t=s.beginTransaction();
		res.setDname("suresh");
		res.setLoc("inkollu");
		res.setCity("ongole");
		res.setHead("andhra");
		
		s.save(res);
		t.commit();
		System.out.println("record updated..");

	}
}
