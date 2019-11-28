package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetomany.Pencil;
import com.ustglobal.jpawithhibernate.onetomany.PencilBox;

public class TestOneToMany {
	public static void main(String[] args) {

		PencilBox peBox = new PencilBox();
		peBox.setBid(1);
		peBox.setBname("Apsara");

		Pencil pencil = new Pencil();
		pencil.setPid(1);
		pencil.setColor("green");
		pencil.setPencilBox(peBox);

		Pencil pencil1 = new Pencil();
		pencil1.setPid(2);
		pencil1.setColor("blue");
		pencil1.setPencilBox(peBox);



		EntityTransaction entityTransaction=null;
		EntityManager entityManager=null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(pencil);
			entityManager.persist(pencil1);

			System.out.println("Record Saved");
			entityTransaction.commit();
			entityManager.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}