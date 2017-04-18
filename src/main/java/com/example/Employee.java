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
	int id;
	
	public Employee(){
		
	}
	
	public Employee(String name, String gender, int id){
		this.name = name;
		this.gender = gender;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getId() {
		return id;
	}
}
