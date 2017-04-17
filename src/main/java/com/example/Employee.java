/**
 * 
 */
package com.example;

/**
 * @author trainee
 *
 */
public class Employee {
	
	String name;
	String gender;
	
	public Employee(){
		
	}
	
	public Employee(String name, String gender){
		this.name = name;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
}
