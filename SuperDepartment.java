package com.greatlearning.model;

public class SuperDepartment {
	
	public String departmentName;

	public SuperDepartment(String departmentName) {
		super();
		this.departmentName = departmentName;
	}
	
    public String getTodaysWork;

	public SuperDepartment(String departmentName, String getTodaysWork) {
		super();
		this.departmentName = departmentName;
		this.getTodaysWork = getTodaysWork;
	}
    
	public String getWorkDeadline;

	public SuperDepartment(String departmentName, String getTodaysWork, String getWorkDeadline) {
		super();
		this.departmentName = departmentName;
		this.getTodaysWork = getTodaysWork;
		this.getWorkDeadline = getWorkDeadline;
	}
	
    public String isTodayAHoliday;

	public SuperDepartment(String departmentName, String getTodaysWork, String getWorkDeadline,
			String isTodayAHoliday) {
		super();
		this.departmentName = departmentName;
		this.getTodaysWork = getTodaysWork;
		this.getWorkDeadline = getWorkDeadline;
		this.isTodayAHoliday = isTodayAHoliday;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public String getGetTodaysWork() {
		return getTodaysWork;
	}

	public String getGetWorkDeadline() {
		return getWorkDeadline;
	}

	public String getIsTodayAHoliday() {
		return isTodayAHoliday;
	}
    

	

 
}
