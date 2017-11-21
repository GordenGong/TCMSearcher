package core.service;

import java.util.List;
import java.util.Map;

import core.entity.Patient;

public interface PatientService{
	public Patient findPatientById(String patient_id) throws PatientException;
	public List<Patient> findPatienstByName(String patient_name)throws PatientException;
	public Patient savePatient(Patient patient)throws PatientException;
	public boolean updatePatient(Map dataMap)throws PatientException;
	public List<Patient> findPatienstByAmbiguous(String keyword)throws PatientException;
	
	
}
