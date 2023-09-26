package com.gradedproject.q1;

class AdminDepartment extends SuperDepartment {
	String departmentName()
	{
		return "admin department";
	}
	String getTodaysWork()
	{
		return "Complete your document submission";
	}
	String getWorkDeadline()
	{
		return "Complete it by EOD";
	}
}
