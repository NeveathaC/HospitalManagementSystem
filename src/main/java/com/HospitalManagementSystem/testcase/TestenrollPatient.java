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

import com.HospitalManagementSystem.dao.HospitalManagementDao;
import com.HospitalManagementSystem.model.Patient;
import com.HospitalManagementSystem.service.HospitalManagementService;
import com.HospitalManagementSystem.service.HospitalManagementServiceImpl;

public class TestenrollPatient {
	@InjectMocks
	HospitalManagementServiceImpl hospitalManagementServiceImpl = new HospitalManagementServiceImpl();

	@Mock
	HospitalManagementDao hospitalManagementDao;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() throws ParseException {
		
		  String sDate1="31/12/1998";
		  Date dob=(java.sql.Date) new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		 
		
		Patient patient = new Patient();
		/*patient.setDob("12-02-1998");*/
		patient.setFirstName("ishwarya");
		patient.setLastName("i");
		patient.setPassword("ntce1997");
		patient.setDob((java.sql.Date) dob); 
		patient.setContactNumber("+918234567786");
		patient.setState("Tamilnadu");
		patient.setInsurancePlan("Star Health Insurance");
		boolean r;
		boolean f=false;
		boolean s=true;

		hospitalManagementServiceImpl.enrollPatient(patient);

		if (hospitalManagementDao.save(patient) != null) {
			r = true;
		}

		else {
			r = false;
		}

		/*assertEquals(f, r);*/
		assertEquals(s, r);
	}

}
