package com.HospitalManagementSystem.testcase;

import static org.junit.Assert.*;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/*import java.util.Date;*/

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.HospitalManagementSystem.dao.HospitalManagementDao;
import com.HospitalManagementSystem.model.Patient;
import com.HospitalManagementSystem.service.HospitalManagementService;
import com.HospitalManagementSystem.service.HospitalManagementServiceImpl;

public class TestenrollPatient {
	/*
*/
	@Autowired
	HospitalManagementServiceImpl hospitalManagementServiceImpl;

	@Autowired
	HospitalManagementDao hospitalManagementDao;

	

	@Test
	public void test() throws ParseException {

		String sDate1 = "2015-03-31";
		Date dob = Date.valueOf(sDate1);
		Patient patient = new Patient("ishwarya", "i", "ntce1997", Date.valueOf("2015-03-31"), "neve@gmail.com",
				"+918234567786", "Tamilnadu", "Star Health Insurance");
		patient.setPatientId(1006);
		boolean r;
		boolean f = false;
		boolean s = true;

		Patient p= hospitalManagementServiceImpl.enrollPatient(patient); 
		
		System.out.println(hospitalManagementDao.save(patient));
	/*	if (hospitalManagementDao.save(patient)!= null) {*/
		if(p!=null){
			r = true;
		}

		else {
			r = false;
		}

		/* assertEquals(f, r); */
		assertEquals(s, r);
	}

}
