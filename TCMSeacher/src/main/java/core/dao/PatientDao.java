package core.dao;

import java.util.List;
import java.util.Map;

import core.entity.Patient;

public interface PatientDao {
	public int savePatient(Patient patient);
	public int updateTablePatient(Patient patient);
	public Patient findPatientById(String patient_id);
	public List<Patient> findPatientByName(String patient_name);
	public List<Patient> findPatientsByAmbiguous(Map<String,Object> dataMap);
}
