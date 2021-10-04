package com.te.Assignment;

public class ValidatingValue {

	public static void validate(int value) throws InvalidInputException{
		if((value<1) && (value>4)) {
			throw new InvalidInputException("Enter a Valid Input");
			
		}else {
			System.err.println("Value is not valid");    
			
		}
			
		}
	
	public static void validate(String value) throws InvalidInputException{
		if(value!=null) {
			System.err.println("Value is not valid");
		
		}else {
			
			throw new InvalidInputException("Enter a Valid Input");
			
			
		}
	}}

