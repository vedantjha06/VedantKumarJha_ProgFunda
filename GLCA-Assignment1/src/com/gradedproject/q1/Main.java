package com.gradedproject.q1;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDepartment Ad=new AdminDepartment();
		HrDepartment Hr=new HrDepartment();
		TechDepartment Tech=new TechDepartment();
		
		System.out.println("Welcome to the "+Ad.departmentName());
		System.out.println(Ad.getTodaysWork());
		System.out.println(Ad.getWorkDeadline());
		System.out.println(Ad.isTodayAHoliday());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Welcome to the "+Hr.departmentName());
		System.out.println(Hr.doActivity());
		System.out.println(Hr.getTodaysWork());
		System.out.println(Hr.getWorkDeadline());
		System.out.println(Hr.isTodayAHoliday());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Welcome to the "+Tech.departmentName());
		System.out.println(Tech.getTodaysWork());
		System.out.println(Tech.getWorkDeadline());
		System.out.println(Tech.getTechStackInformation());
		System.out.println(Tech.isTodayAHoliday());
		
		
		

	}

}
