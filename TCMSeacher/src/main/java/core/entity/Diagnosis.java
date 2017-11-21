package core.entity;

import java.io.Serializable;

public class Diagnosis implements Serializable{

	private static final long serialVersionUID = 3567162915327369953L;
	//外键，对应的患者id
	private String patient_id;
	//诊断编号
	private String diagnosis_id;
	//诊断次数：初诊是1，二诊是2，以此类推
	private String diagnosis_degree;
	//诊断时间
	private String diagnosis_time;
	//诊断主诉
	private String diagnosis_chief_complaint;
	//诊断现病史
	private String diagnosis_current_history;
	//诊断既往史
	private String diagnosis_past_history;
	//诊断家族史
	private String diagnosis_family_history;
	//诊断个人史
	private String diagnosis_self_history;
	//西医诊断
	private String diagnosis_morden_medical;
	//中医诊断
	private String diagnosis_tradtional_medical;
	//诊断治法
	private String diagnosis_prescription;
	//诊断用药
	private String diagnosis_herb;
	//诊断处方用法
	private String diagnosis_usage;
	//实验室检查
	private String diagnosis_lab_check;
	//对应初诊编码    diagnosis_id
	private String diagnosis_relatedto_firstid;
	//诊断备注 为json串
	private String diagnosis_remark;
	//诊断表资料状态：1是正常，0是在回收站中
	private String diagnosis_status;
	
	public Diagnosis() {

	}

	public Diagnosis(String patient_id, String diagnosis_id, String diagnosis_degree, String diagnosis_time,
			String diagnosis_chief_complaint, String diagnosis_current_history, String diagnosis_past_history,
			String diagnosis_family_history, String diagnosis_self_history, String diagnosis_morden_medical,
			String diagnosis_tradtional_medical, String diagnosis_prescription, String diagnosis_herb,
			String diagnosis_usage, String diagnosis_lab_check, String diagnosis_relatedto_firstid,
			String diagnosis_remark, String diagnosis_status) {
		super();
		this.patient_id = patient_id;
		this.diagnosis_id = diagnosis_id;
		this.diagnosis_degree = diagnosis_degree;
		this.diagnosis_time = diagnosis_time;
		this.diagnosis_chief_complaint = diagnosis_chief_complaint;
		this.diagnosis_current_history = diagnosis_current_history;
		this.diagnosis_past_history = diagnosis_past_history;
		this.diagnosis_family_history = diagnosis_family_history;
		this.diagnosis_self_history = diagnosis_self_history;
		this.diagnosis_morden_medical = diagnosis_morden_medical;
		this.diagnosis_tradtional_medical = diagnosis_tradtional_medical;
		this.diagnosis_prescription = diagnosis_prescription;
		this.diagnosis_herb = diagnosis_herb;
		this.diagnosis_usage = diagnosis_usage;
		this.diagnosis_lab_check = diagnosis_lab_check;
		this.diagnosis_relatedto_firstid = diagnosis_relatedto_firstid;
		this.diagnosis_remark = diagnosis_remark;
		this.diagnosis_status = diagnosis_status;
	}

	@Override
	public String toString() {
		return "Diagnosis [patient_id=" + patient_id + ", diagnosis_id=" + diagnosis_id + ", diagnosis_degree="
				+ diagnosis_degree + ", diagnosis_time=" + diagnosis_time + ", diagnosis_chief_complaint="
				+ diagnosis_chief_complaint + ", diagnosis_current_history=" + diagnosis_current_history
				+ ", diagnosis_past_history=" + diagnosis_past_history + ", diagnosis_family_history="
				+ diagnosis_family_history + ", diagnosis_self_history=" + diagnosis_self_history
				+ ", diagnosis_morden_medical=" + diagnosis_morden_medical + ", diagnosis_tradtional_medical="
				+ diagnosis_tradtional_medical + ", diagnosis_prescription=" + diagnosis_prescription
				+ ", diagnosis_herb=" + diagnosis_herb + ", diagnosis_usage=" + diagnosis_usage
				+ ", diagnosis_lab_check=" + diagnosis_lab_check + ", diagnosis_relatedto_firstid="
				+ diagnosis_relatedto_firstid + ", diagnosis_remark=" + diagnosis_remark + ", diagnosis_status="
				+ diagnosis_status + "]";
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}

	public String getDiagnosis_id() {
		return diagnosis_id;
	}

	public void setDiagnosis_id(String diagnosis_id) {
		this.diagnosis_id = diagnosis_id;
	}

	public String getDiagnosis_degree() {
		return diagnosis_degree;
	}

	public void setDiagnosis_degree(String diagnosis_degree) {
		this.diagnosis_degree = diagnosis_degree;
	}

	public String getDiagnosis_time() {
		return diagnosis_time;
	}

	public void setDiagnosis_time(String diagnosis_time) {
		this.diagnosis_time = diagnosis_time;
	}

	public String getDiagnosis_chief_complaint() {
		return diagnosis_chief_complaint;
	}

	public void setDiagnosis_chief_complaint(String diagnosis_chief_complaint) {
		this.diagnosis_chief_complaint = diagnosis_chief_complaint;
	}

	public String getDiagnosis_current_history() {
		return diagnosis_current_history;
	}

	public void setDiagnosis_current_history(String diagnosis_current_history) {
		this.diagnosis_current_history = diagnosis_current_history;
	}

	public String getDiagnosis_past_history() {
		return diagnosis_past_history;
	}

	public void setDiagnosis_past_history(String diagnosis_past_history) {
		this.diagnosis_past_history = diagnosis_past_history;
	}

	public String getDiagnosis_family_history() {
		return diagnosis_family_history;
	}

	public void setDiagnosis_family_history(String diagnosis_family_history) {
		this.diagnosis_family_history = diagnosis_family_history;
	}

	public String getDiagnosis_self_history() {
		return diagnosis_self_history;
	}

	public void setDiagnosis_self_history(String diagnosis_self_history) {
		this.diagnosis_self_history = diagnosis_self_history;
	}

	public String getDiagnosis_morden_medical() {
		return diagnosis_morden_medical;
	}

	public void setDiagnosis_morden_medical(String diagnosis_morden_medical) {
		this.diagnosis_morden_medical = diagnosis_morden_medical;
	}

	public String getDiagnosis_tradtional_medical() {
		return diagnosis_tradtional_medical;
	}

	public void setDiagnosis_tradtional_medical(String diagnosis_tradtional_medical) {
		this.diagnosis_tradtional_medical = diagnosis_tradtional_medical;
	}

	public String getDiagnosis_prescription() {
		return diagnosis_prescription;
	}

	public void setDiagnosis_prescription(String diagnosis_prescription) {
		this.diagnosis_prescription = diagnosis_prescription;
	}

	public String getDiagnosis_herb() {
		return diagnosis_herb;
	}

	public void setDiagnosis_herb(String diagnosis_herb) {
		this.diagnosis_herb = diagnosis_herb;
	}

	public String getDiagnosis_usage() {
		return diagnosis_usage;
	}

	public void setDiagnosis_usage(String diagnosis_usage) {
		this.diagnosis_usage = diagnosis_usage;
	}

	public String getDiagnosis_lab_check() {
		return diagnosis_lab_check;
	}

	public void setDiagnosis_lab_check(String diagnosis_lab_check) {
		this.diagnosis_lab_check = diagnosis_lab_check;
	}

	public String getDiagnosis_relatedto_firstid() {
		return diagnosis_relatedto_firstid;
	}

	public void setDiagnosis_relatedto_firstid(String diagnosis_relatedto_firstid) {
		this.diagnosis_relatedto_firstid = diagnosis_relatedto_firstid;
	}

	public String getDiagnosis_remark() {
		return diagnosis_remark;
	}

	public void setDiagnosis_remark(String diagnosis_remark) {
		this.diagnosis_remark = diagnosis_remark;
	}

	public String getDiagnosis_status() {
		return diagnosis_status;
	}

	public void setDiagnosis_status(String diagnosis_status) {
		this.diagnosis_status = diagnosis_status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diagnosis_id == null) ? 0 : diagnosis_id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diagnosis other = (Diagnosis) obj;
		if (diagnosis_id == null) {
			if (other.diagnosis_id != null)
				return false;
		} else if (!diagnosis_id.equals(other.diagnosis_id))
			return false;
		return true;
	}
	

	
	
	
}
