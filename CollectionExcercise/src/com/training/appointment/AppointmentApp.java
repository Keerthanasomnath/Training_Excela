package com.training.appointment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.doctor.Doctor;
import com.training.patient.Patient;

public class AppointmentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient patient1 = new Patient (101,"Ram","Anna Nagar",91500);
		Patient patient2 = new Patient (102,"Narayan","Anna Nagar west",5635);
		
		
		Set<Patient> kannaPatList = new HashSet<>();
        kannaPatList.add(patient1);
        kannaPatList.add(patient2);
		
        Doctor kanna=new Doctor(101, "kanna", "ENT", kannaPatList);
        Map<Doctor,Set<Patient>> map = new HashMap<>();
        map.put(kanna, kannaPatList);
        
        Appointment app=new Appointment(map);
        System.out.println(app.getPatient(kanna));
	}

}
