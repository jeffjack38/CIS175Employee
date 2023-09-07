/**
 * @author jeade - jeaden
 * CIS175 - Fall 2023
 *Sep 7, 2023
 */
package model;


public class Employee {
	private String name;
	private double monthlySalary;
	private int age;
	 
	//default no arg constructor
	public Employee() {
		
	}
	
	//constructor that taks name and sets the name instance variable
	public Employee (String name) {
		this.name = name;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	

}
