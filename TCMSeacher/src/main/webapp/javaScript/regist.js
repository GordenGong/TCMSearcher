/*注册界面js*/
$(function(){
	$('#form-account').blur(checkPatientId);
	$('#regist').click(registAction);
});

function checkPatientId(){
	//console.log(111);
	var id=$('#form-account').val();
	var reg=/^\d+$/;
	$('#reg-name-msg').empty();
	if(!reg.test(id)){
		$('#reg-name-msg').html('请输入数字编号');
		return false;
	}else{
		$('#reg-name-msg').html('√');
		return true;
	}
}


function registAction(){
	var n=checkPatientId();
	//id可以为空，但必须是数字
	var id=$('#form-account').val();
	if(id!=null && id!=''){
		if(n!=1){
			return;
		}		
	}

	var name=$('#form-pwd').val();
	var keyword=$('#form-equalTopwd').val();
	if(id !=null && id != undefined && id!= ''){
		//console.log(id);
		var url='/TCMSeacher/showPatient.do?id='+id;
		location.href=url;
	}else if(name !=null && name != undefined && name!= ''){
		var url='/TCMSeacher/showPatient.do?name='+name;
		location.href=url;
	}else if(keyword !=null && keyword != undefined && keyword!= ''){
		var url='/TCMSeacher/showPatient.do?keyword='+keyword;
		//console.log(url);
		location.href=url;
	}else{
		$('#reg-total-msg').empty().html('请输入至少一项查询条件');
		return;
	}

}





