package com.training.appointment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.training.doctor.Doctor;
import com.training.patient.Patient;

public class Appointment {


	private Map<Doctor,Set<Patient>>map;

	public Appointment() {
		super();
   map= new HashMap<>();
	}

	public Appointment(Map<Doctor, Set<Patient>> map) {
		super();
		this.map = map;
	}

	public Map<Doctor, Set<Patient>> getMap() {
		return map;
	}

	public void setMap(Map<Doctor, Set<Patient>> map) {
		this.map = map;
	}
 public Set<Patient> getPatient(Doctor Key){
	 
	 return this.map.get(Key);
 }

	@Override
	public String toString() {
		return "Appointment [map=" + map + "]";
	}


}
