<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>其他页面</title>
</head>
<body>

	<div>
		<strong> ${sessionScope.user.username}!!!!! </strong>
	</div>
	<form action="user/outLogin">
		<table>
			<tr>
				<td><input type="submit" value="退出登录" ></td>
			</tr>
		</table>
	</form>

</body>
</html>