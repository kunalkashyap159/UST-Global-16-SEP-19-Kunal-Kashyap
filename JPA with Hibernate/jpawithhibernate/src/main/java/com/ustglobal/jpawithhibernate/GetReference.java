package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class GetReference {	public static void main(String[] args) {

		EntityTransaction transaction=null;
		EntityManager entityManager=null;

		EntityManagerFactory entityManagerFactory =
				Persistence.createEntityManagerFactory("TestPersistence");
		entityManager= entityManagerFactory.createEntityManager();
		Product productInfo = entityManager.getReference(Product.class, 100);
		
	//	Product productInfo = entityManager.getReference(Product.class, 10); It will show
	//	EntityNotFoundException....
		
		System.out.println("ID----------"+productInfo.getPid());
		System.out.println("Name--------"+productInfo.getPname());
		System.out.println("Quantity----"+productInfo.getQuantity());
		entityManager.close();
	}//end of main method
}//end of GetReference

