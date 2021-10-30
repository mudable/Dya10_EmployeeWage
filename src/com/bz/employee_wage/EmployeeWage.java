package com.bz.employee_wage;

import java.util.Random;

public class EmployeeWage {
	// Constants
	final static int IS_PART_TIME = 1;
	final static int IS_FULL_TIME = 2;

	public static String company;
	static int empRatePerHr;
	static int numOfWorkingDays;
	static int maxHrsPerMonth;
	int totalEmpWage;

	/*
	 * created function and passed the parameter to calculate total employee wage
	 * for particular company. by passing arguments inside function
	 */
	public EmployeeWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHrsPerMonth) {

		this.company = company;
		this.empRatePerHr = empRatePerHr;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHrsPerMonth = maxHrsPerMonth;
	}
	public void calculateEmpWage() {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			Random random = new Random();
			int empCheck = random.nextInt(3);
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 8;
				break;
			case IS_FULL_TIME:
				empHrs = 12;
				break;
			default:
				empHrs = 0;
				break;
			}
			totalEmpHrs += empHrs;
			System.out.println("Days#" + totalWorkingDays + "EmpHrs :" + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHr;
		}
	@Override
	public String toString() {
		return " Total EmployeeWage for company:"+company+"is:"+totalEmpWage;
	}

	public static void main(String[] args) {
	EmployeeWage jio =new EmployeeWage ("jio", 20, 3, 15);
		EmployeeWage airtel=new EmployeeWage("airtel", 20, 3, 15);
		jio.calculateEmpWage();
		System.out.println(jio);
		airtel.calculateEmpWage();
		System.out.println(airtel);
	}
	
}
