package com.ustglobal.jpawithhibernateassign;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateassign.dto.Bike;



public class ReadDemo {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		Bike productDetail = entityManager.find(Bike.class, 10);
		System.out.println("ID----------"+productDetail.getBid());
		System.out.println("Name--------"+productDetail.getBname());
		System.out.println("Quantity----"+productDetail.getBmodel());
		System.out.println("Quantity----"+productDetail.getBprice());
		entityManager.close();
	}//end of main method
}//end of ReadDemo

