package com.HospitalManagementSystem.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.HospitalManagementSystem.model.Patient;

@Repository
public interface HospitalManagementDao extends CrudRepository<Patient, Integer> {
	public Patient findByFirstNameAndLastName(String firstName, String lastName);
/*
	public boolean existsById(String string);*/
}
