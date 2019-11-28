package com.ustglobal.jpawithhibernateassign;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateassign.dto.Bike;

public class InsertDemo {
	public static void main(String[] args) {
		Bike bikeinfo = new Bike();
		bikeinfo.setBid(10);
		bikeinfo.setBname("Suzuki");
		bikeinfo.setBmodel("HayaBusa");
		bikeinfo.setBprice(1600000);


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(bikeinfo);
		System.out.println("Record Saved");
		entityTransaction.commit();
		entityManager.close();
	}
}
