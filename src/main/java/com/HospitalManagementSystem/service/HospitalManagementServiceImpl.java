package com.HospitalManagementSystem.service;

import javax.persistence.NonUniqueResultException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.HospitalManagementSystem.dao.HospitalManagementDao;
import com.HospitalManagementSystem.model.Patient;

@Service
public class HospitalManagementServiceImpl implements HospitalManagementService {
	private static final Logger logger = LoggerFactory.getLogger(HospitalManagementServiceImpl.class);
	@Autowired
	HospitalManagementDao hospitalManagementDao;

	@Transactional
	@Override
	public Patient enrollPatient(Patient patient) {
		logger.info("enroll patient in service");
		 this.hospitalManagementDao.save(patient);
		return patient;
	}

	@Override
	public Patient existByName(String firstName, String lastName) {

		Patient p = this.hospitalManagementDao.findByFirstNameAndLastName(firstName, lastName);
		logger.info("existsByName method in service");
		return p;
	}
}
