package com.te.Assignment;

import java.util.Scanner;

public class SwitchMain {

	public static void evaluate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to fetch all data of Employee table ||"
				+ " Enter 2 to fetch a particular record from Employee table ||"
				+ " Enter 3 to update a data present in the Employee table || "
				+ "Enter 4 to delete a particular record fro the Employee table ");
		int key=scanner.nextInt();
		
		switch (key) {
		case 1: FetchingAllData.fetchAll();
			    break;
		case 2: FetchParticular.fetch();
				break;
	    case 3: UpdateData.Update();
	    		break;
	    case 4: DeleteData.Delete();
	    		break;
		default: 
				 try {
				ValidatingValue.validate(key);
			} catch (InvalidInputException e) {
//				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		
			break;
		}
	}
}
