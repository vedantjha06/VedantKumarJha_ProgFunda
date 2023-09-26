package com.gradedproject.q1;

class HrDepartment extends SuperDepartment {
	String departmentName()
	{
		return "HR department";
	}
	String getTodaysWork()
	{
		return "Fill out today’s timesheet and mark your attendance";
	}
	String getWorkDeadline()
	{
		return "Complete it by EOD";
	}
	String doActivity()
	{
		return "Team lunch";
	}

}
