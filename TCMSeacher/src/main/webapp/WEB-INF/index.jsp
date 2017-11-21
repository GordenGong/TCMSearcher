<%@page pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>查询主页</title>
<link type="text/css" rel="stylesheet"
	href="css/reg1.css" />
<link type="text/css" rel="stylesheet"
	href="css/reg2.css" />

<!-- 自己写的js -->
<script type="text/javascript" src="javaScript/jquery-1.11.1.js"></script>
<script type="text/javascript" src="javaScript/regist.js"></script>

</head>
<body>
	<div id="form-header" class="header">
		<div class="logo-con w clearfix">
			<img src="">
			<div class="logo-title">欢迎使用病例查询软件(试用版1.0)</div>
		</div>
	</div>
	<div class="container w">
		<div class="main clearfix" id="form-main">
			<div class="reg-form fl">
				
					<div class="form-item form-item-account" id="form-item-account">
						<label>病例编号</label> <input type="text" id="form-account"
							name="regName" class="field" autocomplete="off" maxlength="20"
							placeholder="您所要查询的病例编号" />
					</div>
					<div id="reg-name-msg" class="input-tip">
						<span></span>
					</div>
					<div class="form-item">
						<label>患者姓名</label>  <input
							type="text" name="pwd" id="form-pwd" class="field"
							maxlength="20" placeholder="您所要查询的患者姓名"/>
					</div>
					<!-- 行间小字 -->
					<div id="reg-pwd-msg" class="input-tip">
						<span></span>
					</div>
					<div class="form-item">
						<label>高级查询</label> <input
							type="text" name="pwdRepeat" id="form-equalTopwd"
							class="field" placeholder="请输入关键字" maxlength="20"
							 />
					</div>
					<div id="reg-confirm-msg" class="input-tip">
						<span></span>
					</div>
					<div class="item-email-wrap">
						
						<div class="input-tip">
							<span></span>
						</div>
					</div>
					<div class="item-phone-wrap">
						<div class="form-item form-item-phone">
							<label class="select-country" id="select-country"
								country_id="0086">vip通道<a href="javascript:void(0) "
								tabindex="-1" class="arrow"></a></label> <input type="text"
								id="form-phone" name="phone" class="field"
								placeholder="请输入vip密码" autocomplete="off" maxlength="11" /> 
						</div>
						<div id="reg-tel-msg" class="input-tip">
							<span></span>
						</div>
						
					</div>
					
					
					<div class="form-agreen">
						<div>
						
						</div>
						<div id="reg-total-msg" class="input-tip">
							<span></span>
						</div>
					</div>
					<div id="regist">
						<button class="btn-register">立即查询</button>
					</div>
				
			</div>
			
</body>
</html>


