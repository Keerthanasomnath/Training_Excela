package com.training.application;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.training.appointment.Appointment;
import com.training.doctor.*;
import com.training.patient.*;

public class Application {

	public static void main(String[] args) {
		
		Patient patient1 = new Patient (101,"Ram","Anna Nagar",91500);
		Patient patient2 = new Patient (102,"Narayan","Anna Nagar west",5635);
		Patient patient3 = new Patient (103,"medu","Anna Nagar east",7025);

		Set<Patient> set = new HashSet<>();
          set.add(patient1);
          set.add(patient2);
          set.add(patient3);
          
          
        Doctor drsudha = new Doctor(33,"Sudha","ENT",set); 
        Doctor drsudh = new Doctor(36,"Sudha","ENT",set); 

       
        System.out.println("Doctor:"+drsudha.getDoctorName());
        for(Patient eachPat: drsudha.getPatient()) {
        System.out.println(eachPat);
        	
        }
        
        Map<Doctor,Patient> map = new HashMap<>();
        map.put(drsudh, patient1);
        map.put(drsudha,patient2);
      // map.put(drsudha, patient3);
		     
//        map.put(drsudha,patient2);
//        map.put(drsudha, patient3);

        
        System.out.println("++++++++++++++++++++++++");
    System.out.println(map.get(drsudha));			
//    System.out.println(map.get(902));
//    System.out.println(map.get(904));			

    Set<Doctor> keys = map.keySet();
    System.out.println(keys);

	}

}
