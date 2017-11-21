package core.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import core.dao.PatientDao;
import core.entity.Patient;
import core.service.PatientException;
import core.service.PatientService;
import core.util.TransTools;

@Service("patientService")
public class PatientServiceImpl implements PatientService{
	@Resource
	private PatientDao patientDao;
	private TransTools tool;
	
	public PatientServiceImpl(){
		tool=new TransTools();
	}
	
	public Patient findPatientById(String patient_id) throws PatientException {
		if(patient_id==null || patient_id.trim().isEmpty()){
			throw new PatientException("用户id不能为空");
		}
		Patient patient =patientDao.findPatientById(patient_id);
		if(patient==null){
			throw new PatientException("不存在该用户");
		}
		patient=tool.dic_Map(patient);
		return patient;
	}

	public List<Patient> findPatienstByName(String patient_name) throws PatientException {
		if(patient_name==null || patient_name.trim().isEmpty()){
			throw new PatientException("用户姓名不能为空");
		}
		List<Patient> patientList=patientDao.findPatientByName(patient_name);
		if(patientList.isEmpty()){
			throw new PatientException("不存在该用户");
		}
		//数据字典转换
		List<Patient> resultList=new ArrayList<Patient>();
		for(Patient p:patientList){
			Patient pa=tool.dic_Map(p);
			resultList.add(pa);
		}
		return resultList;
	}

	public Patient savePatient(Patient patient) throws PatientException {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updatePatient(Map dataMap) throws PatientException {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Patient> findPatienstByAmbiguous(String keyword) throws PatientException {
		if(keyword==null || keyword.trim().isEmpty()){
			throw new PatientException("关键字不能为空！");
		}
		Map<String,Object> ambiguousMap=new HashMap<String,Object>();
		ambiguousMap.put("param", keyword);
		//暂时每页显示20个，此处可进行分页处理
		ambiguousMap.put("start", 0);
		ambiguousMap.put("size", 20);
		List<Patient> paList=patientDao.findPatientsByAmbiguous(ambiguousMap);
		if(paList.isEmpty()){
			throw new PatientException("查询结果为空，请重新输入关键字");
		}
		return paList;
	}


}
