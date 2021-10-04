package com.te.Assignment;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.technoelevate.Employee;
import com.te.technoelevate3.Student;

public class FetchParticular {
public static void fetch() {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter a vlue for ID : ");
	int id= scanner.nextInt();
	
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
	EntityManager  manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();  
	
	transaction.begin();
	
	String qry= "from Employee where id= :id"; 
	Query query = manager.createQuery(qry); 
	query.setParameter("id",  id);               
	Employee student = (Employee) query.getSingleResult();
	System.out.println(student);
   
	
	
	transaction.commit();
} 
}
