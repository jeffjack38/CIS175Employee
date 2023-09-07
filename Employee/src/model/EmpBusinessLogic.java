/**
 * @author jeade - jeaden
 * CIS175 - Fall 2023
 *Sep 7, 2023
 */
package model;


public class EmpBusinessLogic {
	
	public double calculateYearlySalary(Employee employee) {
		double yearlySalary = 0;
		yearlySalary = employee.getMonthlySalary() * 12;
		return yearlySalary;
	}
	
	public double calculateAppraisal(Employee employee) {
		double appraisal = 0;
		
		if (employee.getMonthlySalary() < 10000) {
			appraisal = 500;
		} else {
			appraisal = 1000;
		}
		
		return appraisal;
	}
	
	public boolean isRetirementAge(Employee employee) {
		
		if (employee.getAge() < 64) {
			return false;
		} else {
			return true;
		}
		
	}

}
