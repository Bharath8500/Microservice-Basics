package com.employee;

public class Employee {
	private long employeeId;
	private String employeeName;
	private String employeeSalary;
	private Address employeeAddress;
	private Organization employeeOrganize;

	public Employee() {
		super();
	}

	public Employee(long employeeId, String employeeName, String employeeSalary, Address employeeAddress,
			Organization employeeOrganize) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeAddress = employeeAddress;
		this.employeeOrganize = employeeOrganize;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Address getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public Organization getEmployeeOrganize() {
		return employeeOrganize;
	}

	public void setEmployeeOrganize(Organization employeeOrganize) {
		this.employeeOrganize = employeeOrganize;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", employeeAddress=" + employeeAddress + ", employeeOrganize=" + employeeOrganize
				+ "]";
	}

}
