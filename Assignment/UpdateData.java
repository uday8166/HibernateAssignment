package com.te.Assignment;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateData {

	public static void Update() {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a Value for name : ");  
		String name = scanner.next();
		System.out.println("Enter a vlaue for designation : "); 
		String desg= scanner.next();
		System.out.println("Enter a Value for ID : ");
		int id=scanner.nextInt();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		String qry="update Employee set name = :name , designation = :desgn where id = :id";
		Query query = manager.createQuery(qry); 
		query.setParameter("name", name);
		query.setParameter("desgn", desg);
		query.setParameter("id", id);  
		int result = query.executeUpdate();
		transaction.commit();
	}
}
