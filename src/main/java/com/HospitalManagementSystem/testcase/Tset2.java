package com.HospitalManagementSystem.testcase;

import static org.junit.Assert.*;
import java.sql.Date;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.HospitalManagementSystem.model.Patient;
import com.HospitalManagementSystem.service.HospitalManagementServiceImpl;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Tset2 {
	@Autowired
	HospitalManagementServiceImpl hospitalManagementService;
	Patient p;

	@Before
	public void setUp() throws Exception {
		System.out.println("Before method");
	}

	@Test()
	public void test() {
		p = new Patient("ishwarya", "i", "ntce1997", Date.valueOf("2015-03-31"), "neve@gmail.com", "+918234567786",
				"Tamilnadu", "Star Health Insurance");

		Patient newp = hospitalManagementService.enrollPatient(p);
		assertEquals("ishwarya", newp.getFirstName());
		System.out.println("after method");
	}

}
