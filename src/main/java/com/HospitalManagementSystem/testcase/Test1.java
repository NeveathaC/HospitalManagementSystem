package com.HospitalManagementSystem.testcase;


import static org.junit.Assert.*;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.HospitalManagementSystem.dao.HospitalManagementDao;
import com.HospitalManagementSystem.model.Patient;
import com.HospitalManagementSystem.service.HospitalManagementServiceImpl;
@RunWith(SpringJUnit4ClassRunner.class)
public class Test1 {
/*@Mock*/
	@InjectMocks
	HospitalManagementServiceImpl hospitalManagementServiceImpl = new HospitalManagementServiceImpl();

	@Mock
	HospitalManagementDao hospitalManagementDao;

	@Before
	public void init() {
	MockitoAnnotations.initMocks(this);
	}
@BeforeClass
public static void setUpBeforeClass() throws Exception {

}
@AfterClass
public static void tearDownAfterClass() throws Exception {
}
@Before
public void setUp() throws Exception {
	hospitalManagementServiceImpl=new HospitalManagementServiceImpl();
}

@After
public void tearDown() throws Exception {

}
@Test
public void testAdmin(){
 
	Patient patient = new Patient("ishwarya", "i", "ntce1997", Date.valueOf("2015-03-31"), "neve@gmail.com", "+918234567786", "Tamilnadu", "Star Health Insurance");
	Patient newpatient = hospitalManagementServiceImpl.enrollPatient(patient);
       //assertEquals( true, admin instanceof Admin);
       assertEquals("ishwarya", newpatient.getFirstName());
       assertEquals("i", newpatient.getLastName());
System.out.println(newpatient.getFirstName());

   
}

}


