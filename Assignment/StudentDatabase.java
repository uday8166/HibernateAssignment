package com.te.Assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class StudentDatabase {
	@Id
	private int Roll_no;
	private String name;
	private String standard;
	
	
	public StudentDatabase() {
		 
		
		
	} 
	
	
	
}
