package com.employee;

public class Organization {
	private String organizeName;
	private Address organizeAddress;

	public Organization() {
		super();
	}

	public Organization(String organizeName, Address organizeAddress) {
		super();
		this.organizeName = organizeName;
		this.organizeAddress = organizeAddress;
	}

	public String getOrganizeName() {
		return organizeName;
	}

	public void setOrganizeName(String organizeName) {
		this.organizeName = organizeName;
	}

	public Address getOrganizeAddress() {
		return organizeAddress;
	}

	public void setOrganizeAddress(Address organizeAddress) {
		this.organizeAddress = organizeAddress;
	}

	@Override
	public String toString() {
		return "Organization [organizeName=" + organizeName + ", organizeAddress=" + organizeAddress + "]";
	}

}
