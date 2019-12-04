package com.HospitalManagementSystem.service;

import org.springframework.transaction.annotation.Transactional;

import com.HospitalManagementSystem.model.Patient;
@Transactional
public interface HospitalManagementService {

	public Patient enrollPatient(Patient patient) ;
	/*public Boolean existsByFirstname(String firstName);
	public Boolean existsByLastname(String lastName);*/
	public Patient existByName(String firstName,String lastName);
}
