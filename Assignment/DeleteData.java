package com.te.Assignment;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteData {
public static void Delete() {
	
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter a value for id : ");  
	
	int id = scanner.nextInt();
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	transaction.begin();
	String qry = "delete from Employee where id = :id";
	Query query = manager.createQuery(qry);  
	query.setParameter("id", id) ;                 
	int result = query.executeUpdate();  
	transaction.commit();
	
}
}
