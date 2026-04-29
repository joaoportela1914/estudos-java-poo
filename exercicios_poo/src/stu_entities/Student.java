package stu_entities;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	public String pass() {
		if (finalGrade() >= 60.00) {
			return "PASS";
		}
		else{
			return "FAILED \n"
					+ "MISSING " 
		            + String.format("%.2f", (60.0 - finalGrade())) 
		            + " POINTS";
		}
	}
}
