package test;

import org.junit.Before;
import org.junit.Test;

import core.entity.Patient;
import core.service.PatientService;

public class PatientServiceTest extends BaseTest {
	PatientService patientService;

	@Before
	public void initPatientService(){
		patientService=ctx.getBean("patientService",PatientService.class);
	}
	@Test
	public void findPatientByIdTest(){
		Patient p=patientService.findPatientById("14");
		System.out.println(p);
	}
	
	
	
}
