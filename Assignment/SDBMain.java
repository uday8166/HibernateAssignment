package com.te.Assignment;

import java.util.Scanner;

public class SDBMain {
	public static void main(String[] args) {

		SwitchMain.evaluate();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Y to continue || N to Exit");

		String enter = scanner.next();

		while (enter.equalsIgnoreCase("Y")) {

			SwitchMain.evaluate();

			System.out.println("Enter Y to continue || N to Exit");
			enter = scanner.next();

		}
		{
		while (enter != null) {
			if (enter.equalsIgnoreCase("n")) {
				System.exit(0);
			} else if (enter.equalsIgnoreCase("y")) {
				while (enter.equalsIgnoreCase("Y")) {

					SwitchMain.evaluate();

					System.out.println("Enter Y to continue || N to Exit");
					enter = scanner.next();
				}
			} else {
				
				try {
					ValidatingValue.validate(enter);
				} catch (InvalidInputException e) {
					
					e.getMessage();
					
//					e.printStackTrace();
				}
			}
		} enter=scanner.next();
	}
}
}

