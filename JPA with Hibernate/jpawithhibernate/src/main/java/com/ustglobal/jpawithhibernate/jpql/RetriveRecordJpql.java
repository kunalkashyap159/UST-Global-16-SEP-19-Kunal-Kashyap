package com.ustglobal.jpawithhibernate.jpql;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.Product;

public class RetriveRecordJpql {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		String jpql = "from Product";
		Query query = entityManager.createQuery(jpql);

		ArrayList<Product> l = (ArrayList<Product>) query.getResultList();
		for (Product product : l) {
			System.out.println("Id :"+product.getPid());
			System.out.println("Name :"+product.getPname());
			System.out.println("Quantity :"+product.getQuantity());
		}

		entityManager.close();

	}//end of main method
}//end of class
