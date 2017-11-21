package core.util;

import java.util.Map;

import core.entity.Patient;

public class TransTools {
	//数据字典
	public Patient dic_Map(Patient p){
		//性别转换
		if(p.getPatient_gender()!=null){
			if(p.getPatient_gender().equals("0")){
				p.setPatient_gender("男");
			}else if(p.getPatient_gender().equals("1")){
				p.setPatient_gender("女");
			}else{
				p.setPatient_gender("其他");
			}
		}
		//婚姻状态转换
		if(p.getPatient_marital_status()!=null){
			if(p.getPatient_marital_status().equals("0")){
				p.setPatient_marital_status("未婚");
			}else if(p.getPatient_marital_status().equals("1")){
				p.setPatient_marital_status("已婚");
			}else if(p.getPatient_marital_status().equals("2")){
				p.setPatient_marital_status("离异");
			}else{
				p.setPatient_marital_status("无");
			}			
		}
		//处理patient_remark为空情况
		if(p.getPatient_remark()==null || p.getPatient_remark().equalsIgnoreCase("null")){
			p.setPatient_remark("无");
		}
		
		
		
		return p;
	}
}
