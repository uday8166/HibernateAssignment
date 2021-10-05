package com.te.Assignment;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import net.bytebuddy.asm.Advice.Exit;

public class UpdateData {

	public static void Update() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Value for ID : ");
		int id = scanner.nextInt();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
//		EntityTransaction transaction2 = manager.getTransaction();
//
		transaction.begin();
		String qry = "update Employee set name = :name , designation = :desgn where id = :id";
		Query query = manager.createQuery(qry);  

		System.out.println("Do You want to update the Name: press Y to update or N to exit");

		String val = scanner.next();

		switch (val) {
		case "y":
			System.out.println("Enter a Value for name : ");
			String name = scanner.next();
			query.setParameter("name", name);
			break;
		case "n":
			System.out.println(" ");
			break;

		default:
			break;
		}
//		if(val.equalsIgnoreCase("y")) {
//			System.out.println("Enter a Value for name : ");  
//			String name = scanner.next();
//		query.setParameter("name",name);
//		} else if (val.equalsIgnoreCase("n")) {
//		  System.out.println("");
//		} else {
//			System.out.println("Enter a valid Input");
//		}

		System.out.println("Do You want to update the Designation: press Y to update or N to exit");
		String val1 = scanner.next();
		switch (val1) {
		case "y":
			System.out.println("Enter a vlaue for designation : ");
			String desg = scanner.next();
			query.setParameter("desgn", desg);

			break;
		case "n":
			System.out.println(" ");
			break;

		default:
			break;
		}

//		System.out.println("Do You want to update the Designation: press Y to update or N to exit");
//		String val1=scanner.next();
//		if(val.equalsIgnoreCase("y")) {
//			System.out.println("Enter a vlaue for designation : "); 
//			String desg= scanner.next();
//		query.setParameter("desgn", desg);
//		} else if (val.equalsIgnoreCase("n")) {
//		      System.out.println("");   
//		} else {
//			System.out.println("Enter a valid Input");
//		}

		query.setParameter("id", id);
		int result = query.executeUpdate();
		transaction.commit();
	}
}
