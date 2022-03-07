package com.miniproject.carrental.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.miniproject.carrental.model.Car;
@Repository
public class CarBo {
	
	@Autowired
	SessionFactory sf;
	

	public List<Car> getAllCars() {

		List<Car> li=null;
		
		Session s=sf.openSession();
		s.beginTransaction();
		li=s.createCriteria(Car.class).list();
		s.getTransaction().commit();
		s.close();
		return li;
	
	}

}
