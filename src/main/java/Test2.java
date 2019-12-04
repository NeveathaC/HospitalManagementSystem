import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.HospitalManagementSystem.dao.HospitalManagementDao;
import com.HospitalManagementSystem.service.HospitalManagementServiceImpl;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class Test2 {
   @Autowired
   HospitalManagementServiceImpl hospitalManagementServiceImpl = new HospitalManagementServiceImpl();
   
   @Autowired
   HospitalManagementDao hospitalManagementDao;


   @Test
   public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {
      Mockito.when(hospitalManagementServiceImpl.enrollPatient(patient))..thenReturn("Mock Product Name");
    		/*  getProductName()).thenReturn("Mock Product Name");*/
      String testName = hospitalManagementServiceImpl.enrollPatient(patient);
      Assert.assertEquals("Mock Product Name", testName);
   }
}