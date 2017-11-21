package core.web;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import core.entity.Patient;
import core.service.PatientService;
import core.util.WorkoutResult;
import test.Log4jTest;

@RequestMapping("/patient")
@Controller
public class PatientController extends BaseController {
	@Resource
	private PatientService patientService;
	
	
	@RequestMapping("/findById.do")
	@ResponseBody
	public WorkoutResult<Patient> findPatientById(String patient_id){
		Patient p= patientService.findPatientById(patient_id);
		return new WorkoutResult<Patient>(p);
	}
	
	@RequestMapping("/findByName.do")
	@ResponseBody
	public WorkoutResult<List<Patient>> findPatientByName(String patient_name){
		List<Patient> paList=patientService.findPatienstByName(patient_name);
		return new WorkoutResult<List<Patient>>(paList);
	}
	
	@RequestMapping("/findByAmbiguous.do")
	@ResponseBody
	public WorkoutResult<List<Patient>> findPatientByAmbiguous(HttpServletRequest req) throws UnsupportedEncodingException{
		req.setCharacterEncoding("utf-8");
		String keyword=req.getParameter("keyword");
		List<Patient> paList=patientService.findPatienstByAmbiguous(keyword);
		return new WorkoutResult<List<Patient>>(paList);
	}
	
	
}
