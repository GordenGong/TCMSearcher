<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>check js</title>
<script type="text/javascript" src="javaScript/jquery-1.11.1.js"></script>
<script type="text/javascript">
	$(function(){
		var str="var a=4;var b=6;var c; if(a>b){c=a+b+_param['num1'];console.log('a is bigger than b')}else{c=a+b+_param['num3'];console.log('b is bigger than a')}; return c;";
		var b= new Function('var _param = arguments[0];' + str);
		var e={"num1":5,"num2":50,"num3":500};
		var d=b(e);
		alert(d);
	});
	

	
	
</script>

</head>
<body>
	<h1>测试写活js</h1>
</body>
</html>