
package com.ustglobal.jpawithhibernate.jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReadRecordJpql {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager= entityManagerFactory.createEntityManager();

		String jpql = "select pname from Product";
		Query query = entityManager.createQuery(jpql);

		ArrayList<String> l = (ArrayList<String>) query.getResultList();

			System.out.println(l);
		entityManager.close();

	}//end of main method
}//end of class
