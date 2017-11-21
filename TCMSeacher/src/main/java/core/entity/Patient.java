package core.entity;

import java.io.Serializable;

public class Patient implements Serializable{

	private static final long serialVersionUID = 8295937445998981569L;
	//患者编号
	private String patient_id;
	//患者姓名
	private String patient_name;
	//病人性别:0是男，1是女，2是其他
	private String patient_gender;
	//患者生日
	private String patient_birthday;
	//病人婚姻状况：0未婚，1已婚，2离异,3无
	private String patient_marital_status;
	//患者手机号
	private String patient_mobile;
	//患者住址
	private String patient_address;
	//患者备注
	private String patient_remark;
	//患者其他信息，为json串
	private String patient_otherinfo;
	//病人资料状态：1是正常，0是在回收站中
	private String patient_status;
	
	public Patient() {
		
	}

	public Patient(String patient_id, String patient_name, String patient_gender, String patient_birthday,
			String patient_marital_status, String patient_mobile, String patient_address, String patient_remark,
			String patient_otherinfo, String patient_status) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.patient_gender = patient_gender;
		this.patient_birthday = patient_birthday;
		this.patient_marital_status = patient_marital_status;
		this.patient_mobile = patient_mobile;
		this.patient_address = patient_address;
		this.patient_remark = patient_remark;
		this.patient_otherinfo = patient_otherinfo;
		this.patient_status = patient_status;
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public String getPatient_gender() {
		return patient_gender;
	}

	public void setPatient_gender(String patient_gender) {
		this.patient_gender = patient_gender;
	}

	public String getPatient_birthday() {
		return patient_birthday;
	}

	public void setPatient_birthday(String patient_birthday) {
		this.patient_birthday = patient_birthday;
	}

	public String getPatient_marital_status() {
		return patient_marital_status;
	}

	public void setPatient_marital_status(String patient_marital_status) {
		this.patient_marital_status = patient_marital_status;
	}

	public String getPatient_mobile() {
		return patient_mobile;
	}

	public void setPatient_mobile(String patient_mobile) {
		this.patient_mobile = patient_mobile;
	}

	public String getPatient_address() {
		return patient_address;
	}

	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}

	public String getPatient_remark() {
		return patient_remark;
	}

	public void setPatient_remark(String patient_remark) {
		this.patient_remark = patient_remark;
	}

	public String getPatient_otherinfo() {
		return patient_otherinfo;
	}

	public void setPatient_otherinfo(String patient_otherinfo) {
		this.patient_otherinfo = patient_otherinfo;
	}

	public String getPatient_status() {
		return patient_status;
	}

	public void setPatient_status(String patient_status) {
		this.patient_status = patient_status;
	}

	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", patient_name=" + patient_name + ", patient_gender="
				+ patient_gender + ", patient_birthday=" + patient_birthday + ", patient_marital_status="
				+ patient_marital_status + ", patient_mobile=" + patient_mobile + ", patient_address=" + patient_address
				+ ", patient_remark=" + patient_remark + ", patient_otherinfo=" + patient_otherinfo
				+ ", patient_status=" + patient_status + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patient_id == null) ? 0 : patient_id.hashCode());
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
		Patient other = (Patient) obj;
		if (patient_id == null) {
			if (other.patient_id != null)
				return false;
		} else if (!patient_id.equals(other.patient_id))
			return false;
		return true;
	}
	
	
}
