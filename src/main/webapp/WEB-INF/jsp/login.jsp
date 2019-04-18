<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>校园-登录</title>
	<link rel="stylesheet" href="../res/css/auth.css">
</head>

<body>
	<div class="lowin lowin-blue">
		<div class="lowin-brand">
			<img src="../res/img/kodinger.jpg" alt="logo">
		</div>
		<div class="lowin-wrapper">
			<div class="lowin-box lowin-login">
				<div class="lowin-box-inner">
					<form>
						<p>登录您的帐号</p>
						<div class="lowin-group">
							<label>手机号 <a href="#" class="login-back-link">登录?</a></label>
							<input type="phone" autocomplete="Phone" name="Phone" class="lowin-input">
						</div>
						<div class="lowin-group password-group">
							<label>密码 <a href="#" class="forgot-link">忘记密码?</a></label>
							<input type="password" name="password" autocomplete="current-password" class="lowin-input">
						</div>
						<button class="lowin-btn login-btn">
							登 录
						</button>

						<div class="text-foot">
							还没有帐号? <a href="" class="register-link">注册</a>
						</div>
					</form>
				</div>
			</div>

			<div class="lowin-box lowin-register">
				<div class="lowin-box-inner">
					<form>
						<p>创建您的帐号</p>
						<div class="lowin-group">
							<label>手机号</label>
							<input type="phone" autocomplete="phone" name="phone" class="lowin-input">
						</div>
						<div class="lowin-group">
							<label>密码</label>
							<input type="password" name="password" autocomplete="current-password" class="lowin-input">
						</div>
						<button class="lowin-btn">
							注 册
						</button>

						<div class="text-foot">
							已经拥有账号? <a href="" class="login-link">登录</a>
						</div>
					</form>
				</div>
			</div>
		</div>

		<footer class="lowin-footer">
			copyright © 2019-2020 Lynn
		</footer>
	</div>

	<script src="../res/js/auth.js"></script>
	<script>
		Auth.init({
			login_url: '#login',
			forgot_url: '#forgot'
		});
	</script>
</body>
</html>
