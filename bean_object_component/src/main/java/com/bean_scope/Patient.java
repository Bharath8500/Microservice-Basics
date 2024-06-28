package com.bean_scope;
import java.util.*;
public class Patient {

	// TODO Auto-generated method stub
	private String patientName;
	private String patientId;
	private String patientRoomNo;
	private ArrayList<Address> address; 

	public Patient() {
		super();
	}

	

	public Patient(String patientName, String patientId, String patientRoomNo, ArrayList<Address> address) {
		super();
		this.patientName = patientName;
		this.patientId = patientId;
		this.patientRoomNo = patientRoomNo;
		this.address = address;
	}



	public ArrayList<Address> getAddress() {
		return address;
	}



	public void setAddress(ArrayList<Address> address) {
		this.address = address;
	}



	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientRoomNo() {
		return patientRoomNo;
	}

	public void setPatientRoomNo(String patientRoomNo) {
		this.patientRoomNo = patientRoomNo;
	}



}
