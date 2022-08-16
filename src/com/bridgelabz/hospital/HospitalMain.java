package com.bridgelabz.hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Hospital");
		Map<String, List<Hospital>> hospitals = new HashMap<>();
		List<Hospital> hospital = new ArrayList<>();
		List<Patient> Patient = new ArrayList<>();
		Patient pt = new Patient();
		pt.setAge(12);
		pt.setCity("Bagalkot");
		pt.setDepartment("");
		pt.setName("raju");
		pt.setPhoneNumber(923654785);
		pt.setState("Karnataka");
		Patient.add(pt);
		Hospital hs = new Hospital();
		hs.setDepartment("GYNOCOLOGY");
		hs.setPatient(Patient);
		hospital.add(hs);
		hospitals.put("Kerudi", hospital);

	}

}
