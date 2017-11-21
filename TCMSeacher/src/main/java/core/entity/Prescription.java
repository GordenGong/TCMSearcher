package core.entity;

import java.io.Serializable;

public class Prescription implements Serializable{

	private static final long serialVersionUID = -4096890935325429781L;
	//处方编号
	private String prescription_id;
	//外键，对应的患者编号
	private String patient_id;
	//患者姓名
	private String prescription_name;
	//具体处方用药
	private String prescription_herb;
	//处方开始时间
	private String prescription_start_time;
	//处方结束时间
	private String prescription_end_time;
	//处方的备注，为json串
	private String prescription_remark;
	//处方表资料状态：1是正常，0是在回收站中
	private String prescription_status;
	
	//空构造便于创建对象
	public Prescription() {

	}

	public Prescription(String prescription_id, String patient_id, String prescription_name, String prescription_herb,
			String prescription_start_time, String prescription_end_time, String prescription_remark,
			String prescription_status) {
		super();
		this.prescription_id = prescription_id;
		this.patient_id = patient_id;
		this.prescription_name = prescription_name;
		this.prescription_herb = prescription_herb;
		this.prescription_start_time = prescription_start_time;
		this.prescription_end_time = prescription_end_time;
		this.prescription_remark = prescription_remark;
		this.prescription_status = prescription_status;
	}

	public String getPrescription_id() {
		return prescription_id;
	}

	public void setPrescription_id(String prescription_id) {
		this.prescription_id = prescription_id;
	}

	public String getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}

	public String getPrescription_name() {
		return prescription_name;
	}

	public void setPrescription_name(String prescription_name) {
		this.prescription_name = prescription_name;
	}

	public String getPrescription_herb() {
		return prescription_herb;
	}

	public void setPrescription_herb(String prescription_herb) {
		this.prescription_herb = prescription_herb;
	}

	public String getPrescription_start_time() {
		return prescription_start_time;
	}

	public void setPrescription_start_time(String prescription_start_time) {
		this.prescription_start_time = prescription_start_time;
	}

	public String getPrescription_end_time() {
		return prescription_end_time;
	}

	public void setPrescription_end_time(String prescription_end_time) {
		this.prescription_end_time = prescription_end_time;
	}

	public String getPrescription_remark() {
		return prescription_remark;
	}

	public void setPrescription_remark(String prescription_remark) {
		this.prescription_remark = prescription_remark;
	}

	public String getPrescription_status() {
		return prescription_status;
	}

	public void setPrescription_status(String prescription_status) {
		this.prescription_status = prescription_status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patient_id == null) ? 0 : patient_id.hashCode());
		result = prime * result + ((prescription_end_time == null) ? 0 : prescription_end_time.hashCode());
		result = prime * result + ((prescription_herb == null) ? 0 : prescription_herb.hashCode());
		result = prime * result + ((prescription_id == null) ? 0 : prescription_id.hashCode());
		result = prime * result + ((prescription_name == null) ? 0 : prescription_name.hashCode());
		result = prime * result + ((prescription_remark == null) ? 0 : prescription_remark.hashCode());
		result = prime * result + ((prescription_start_time == null) ? 0 : prescription_start_time.hashCode());
		result = prime * result + ((prescription_status == null) ? 0 : prescription_status.hashCode());
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
		Prescription other = (Prescription) obj;
		if (patient_id == null) {
			if (other.patient_id != null)
				return false;
		} else if (!patient_id.equals(other.patient_id))
			return false;
		if (prescription_end_time == null) {
			if (other.prescription_end_time != null)
				return false;
		} else if (!prescription_end_time.equals(other.prescription_end_time))
			return false;
		if (prescription_herb == null) {
			if (other.prescription_herb != null)
				return false;
		} else if (!prescription_herb.equals(other.prescription_herb))
			return false;
		if (prescription_id == null) {
			if (other.prescription_id != null)
				return false;
		} else if (!prescription_id.equals(other.prescription_id))
			return false;
		if (prescription_name == null) {
			if (other.prescription_name != null)
				return false;
		} else if (!prescription_name.equals(other.prescription_name))
			return false;
		if (prescription_remark == null) {
			if (other.prescription_remark != null)
				return false;
		} else if (!prescription_remark.equals(other.prescription_remark))
			return false;
		if (prescription_start_time == null) {
			if (other.prescription_start_time != null)
				return false;
		} else if (!prescription_start_time.equals(other.prescription_start_time))
			return false;
		if (prescription_status == null) {
			if (other.prescription_status != null)
				return false;
		} else if (!prescription_status.equals(other.prescription_status))
			return false;
		return true;
	}
	
	
	
	
}
