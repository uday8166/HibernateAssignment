package com.te.Assignment;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.te.technoelevate.Employee;

import antlr.collections.List;

public class FetchingAllData {

	public static void fetchAll(){
		
//		Scanner scanner= new Scanner(System.in);
//		System.out.println("Enter a value for ID");
//		int id=scanner.nextInt();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager= factory.createEntityManager();
		 
		String qry = " from Employee ";
		Query query = manager.createQuery(qry); 
//		query.setParameter("id", id); 
//		Employee employee= (Employee) query.getSingleResult();
//		System.out.println(employee);
		
		java.util.List<Employee> list = query.getResultList();
		
		System.out.println(list);
		
		System.out.println("-------------");
		
		for (Employee employee : list) {
			System.out.println(employee);  
		}
		 
		}
	}

