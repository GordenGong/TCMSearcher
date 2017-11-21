var patient_template="<tr>"
					+"<td>[patient_id]</td>"
					+"<td>[patient_name]</td>"
					+"<td>[patient_gender]</td>"
					+"<td>[patient_birthday]</td>"
					+"<td>[patient_marital_status]</td>"
					+"<td>[patient_mobile]</td>"
					+"<td>[patient_address]</td>"
					+"<td>无</td>"
					+"<td>[patient_otherinfo]</td>"
					+"<td>[patient_remark]</td>"
					+"</tr>"
	



//用id查询
function findById(id){
	//ajax请求
	var url="/TCMSeacher/patient/findById.do";
	var data={patient_id:id};
	$.post(url,data,function(result){		
		if(result.state==0){
			var patient=result.data;
			var total="";
			patient_template=patient_template.replace("[patient_id]",patient.patient_id );
			patient_template=patient_template.replace("[patient_name]",patient.patient_name );
			patient_template=patient_template.replace("[patient_gender]",patient.patient_gender );
			patient_template=patient_template.replace("[patient_birthday]",patient.patient_birthday );
			patient_template=patient_template.replace("[patient_marital_status]",patient.patient_marital_status );
			patient_template=patient_template.replace("[patient_mobile]",patient.patient_mobile );
			patient_template=patient_template.replace("[patient_address]",patient.patient_address );
			patient_template=patient_template.replace("[patient_otherinfo]",patient.patient_otherinfo );
			patient_template=patient_template.replace("[patient_remark]",patient.patient_remark );
			total+=patient_template;	
			$('#patient_table01').append(total);
		}else{
			var msg=result.message;
			$('#erro_div').empty().html(msg);
		}
		
	});
}
//用名字查询
function findByName(name){
	
}
//模糊查询
function findByAmbigous(keyword){
	//console.log(keyword);
	var url="/TCMSeacher/patient/findByAmbiguous.do";
	var data={keyword:keyword};
	$.post(url,data,function(result){
		if(result.state==0){
			var patient=result.data;
			var patient_template1="";
			var total="";
			for(var i=0;i<patient.length;i++){
				patient_template1=patient_template.replace("[patient_id]",patient[i].patient_id );
				patient_template1=patient_template1.replace("[patient_name]",patient[i].patient_name );
				patient_template1=patient_template1.replace("[patient_gender]",patient[i].patient_gender );
				patient_template1=patient_template1.replace("[patient_birthday]",patient[i].patient_birthday );
				patient_template1=patient_template1.replace("[patient_marital_status]",patient[i].patient_marital_status );
				patient_template1=patient_template1.replace("[patient_mobile]",patient[i].patient_mobile );
				patient_template1=patient_template1.replace("[patient_address]",patient[i].patient_address );
				patient_template1=patient_template1.replace("[patient_otherinfo]",patient[i].patient_otherinfo );
				patient_template1=patient_template1.replace("[patient_remark]",patient[i].patient_remark );
				total+=patient_template1;
				patient_template1="";
			}
			$('#patient_table01').append(total);
		}else{
			var msg=result.message;
			$('#erro_div').empty().html(msg);
		}
	});
	

}




