/**
 * @author jeade - jeaden
 * CIS175 - Fall 2023
 *Sep 7, 2023
 */
package model;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {
	
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestEmployeeLogic.class);
		
		for (org.junit.runner.notification.Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}

}
