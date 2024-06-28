package com.test;

public class College {

	private String collegeName;
	private String collegeEmail;
	private long collegePhno;
	public College() {
		super();
	}
	public College(String collegeName, String collegeEmail, long collegePhno) {
		super();
		this.collegeName = collegeName;
		this.collegeEmail = collegeEmail;
		this.collegePhno = collegePhno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeEmail() {
		return collegeEmail;
	}
	public void setCollegeEmail(String collegeEmail) {
		this.collegeEmail = collegeEmail;
	}
	public long getCollegePhno() {
		return collegePhno;
	}
	public void setCollegePhno(long collegePhno) {
		this.collegePhno = collegePhno;
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", collegeEmail=" + collegeEmail + ", collegePhno=" + collegePhno
				+ "]";
	}
	
}
