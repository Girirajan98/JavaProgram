package org.Polmorphism;

public class MethodOverloading {
	
	private void EmployeeDetails(String name) {
	System.out.println("The Employee name is "+name);
	}
	
	private void EmployeeDetails(int id) {
		System.out.println("The Employee id is "+id);
		}
	
	private void EmployeeDetails(double salary) {
		System.out.println("The Employee Salary is "+salary);
		}
	
	private void EmployeeDetails(long Phoneno) {
		System.out.println("The Employee Phone number  is "+Phoneno);
		}
	
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		
		m.EmployeeDetails("kaaviyan");
		m.EmployeeDetails(12345);
		m.EmployeeDetails(25333.000);
		m.EmployeeDetails(766872788883l);
	}

}
