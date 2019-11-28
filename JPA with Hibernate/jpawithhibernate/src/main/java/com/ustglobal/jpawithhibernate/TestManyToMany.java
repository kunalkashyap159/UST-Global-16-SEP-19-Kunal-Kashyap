package com.ustglobal.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.manytomany.Course;
import com.ustglobal.jpawithhibernate.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {



		Course c1 = new Course();
		c1.setId(100);
		c1.setCname("sql");
		Course c2 = new Course();
		c2.setId(200);
		c2.setCname("hibernate");
		ArrayList<Course> l = new ArrayList<Course>();
		l.add(c1);
		l.add(c2);


		Student s1 = new Student();
		s1.setSid(1);
		s1.setSname("Kunal");
		s1.setCourse(l);
	




		EntityTransaction entityTransaction=null;
		EntityManager entityManager=null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(s1);

			System.out.println("Record Saved");
			entityTransaction.commit();
			entityManager.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}
