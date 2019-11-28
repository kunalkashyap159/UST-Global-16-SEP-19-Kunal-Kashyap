package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetoone.Person;
import com.ustglobal.jpawithhibernate.onetoone.Votercard;

public class TestOneToOne {
	public static void main(String[] args) {

		Votercard vc = new Votercard();
		vc.setVid(10);
		vc.setVname("Miller");
		Person p = new Person();
		p.setPname("Miller");
		p.setPid(1);
		p.setVotercard(vc);

		EntityTransaction entityTransaction=null;
		EntityManager entityManager=null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			entityManager.persist(p);
			System.out.println("Record Saved");
			entityTransaction.commit();
			entityManager.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}