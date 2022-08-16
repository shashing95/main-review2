package com.bridgelabz.hospital;

import java.util.List;

public class Hospital {
	
	private String department;
	private List<Patient> Patient;
	 
	public List<Patient> getPatient() {
		return Patient;
	}
	public void setPatient(List<Patient> patient) {
		Patient = patient;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

}
