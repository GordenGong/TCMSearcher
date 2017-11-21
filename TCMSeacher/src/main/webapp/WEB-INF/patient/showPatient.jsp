<%@page pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>查看详情</title>
<!-- 自己写的css -->
<style type="text/css">
	td {
		height:30px;
		weight:80px;
	}
</style>
<!-- 引入jquery -->
<script type="text/javascript" src="javaScript/jquery-1.11.1.js"></script>
<!-- 自己写的js -->
<script type="text/javascript" src="javaScript/showPatient.js"></script>
<script type="text/javascript">
	$(function(){
		//alert(window.location.search);
		var param=window.location.search;
		//很重要浏览器用此编码，所以要用此处解码
		param=decodeURI(param);
		//console.log(param);
		if(param.indexOf("?")!=-1){
			var direction=param.split("=")[0];
			var value=param.split("=")[1];
			if(direction=='?id'){
				findById(value);
			}else if(direction=='?name'){
				findByName(value);
			}else if(direction=='?keyword'){
				findByAmbigous(value);
			}		
		}
	});
</script>

</head>
<body>
	<h1 align="center">查看患者详情</h1>
	<div>
		<table border="1" align="center" cellspacing="0" id="patient_table01">
			<tr id="patient_tr_01">
				<td>病例编号</td>
				<td>患者姓名</td>
				<td>患者性别</td>
				<td>患者生日</td>
				<td>患者婚姻状态</td>
				<td>患者手机号</td>
				<td>患者住址</td>
				<td>患者用方</td>
				<td>患者就诊情况</td>
				<td>备注信息</td>
			</tr>
			
		</table>
	</div>
	<div id="erro_div" align="center">
	</div>
</body>
</html>