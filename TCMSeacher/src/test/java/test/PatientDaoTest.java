package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import core.dao.PatientDao;
import core.entity.Patient;

public class PatientDaoTest extends BaseTest{
	PatientDao patientDao;
	
	@Before
	public void patientInit(){
		patientDao=ctx.getBean("patientDao",PatientDao.class);
	}
	
	@Test
	public void savePatientTest(){
		Patient p=new Patient("6023","李白","0","19920623","0","13753116327","北京","hahah","aa","1");
		int i=patientDao.savePatient(p);
		System.out.println(i);
	}
	@Test
	public void updateTablePatientTest(){
		Patient p=new Patient();
		p.setPatient_id("1");
		p.setPatient_remark("测试用例");
		int i=patientDao.updateTablePatient(p);
		System.out.println(i);
	}
	@Test
	public void findPatientByIdTest(){
		Patient p=patientDao.findPatientById("29");
		System.out.println(p);
	}
	@Test
	public void findPatientByNameTest(){
		List<Patient> list=patientDao.findPatientByName("蔡政");
		System.out.println(list);
	}
	@Test
	public void findPatientsByAmbiguous(){
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("param", "月经");
		map.put("start", 0);
		map.put("size", 20);
		List<Patient> paList=patientDao.findPatientsByAmbiguous(map);
		System.out.println(paList.size());
		for(Patient p:paList){
			System.out.println(p);
		}
	}
	
	
	
	
	
	
	
}
