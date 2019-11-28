package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class InsertDemo {
	public static void main(String[] args) {
		Product productinfo = new Product();
		productinfo.setPid(103);
		productinfo.setPname("Car");
		productinfo.setQuantity(5);


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(productinfo);
		System.out.println("Record Saved");
		entityTransaction.commit();
		entityManager.close();
	}
}
