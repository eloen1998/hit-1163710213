<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>query</title>
	</head>
	<body>
		<form action="userupdate" method="post">
			<table align="center" border="1">
				<tr align="center">
					<th>
						ID
					</th>
					<td>
						<input name="ID" readonly="readonly" value="${user.ID}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						用户名
					</th>
					<td>
						<input name="username" value="${user.username}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						密码
					</th>
					<td>
						<input name="password" value="${user.password}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						管理员（true/false）
					</th>
					<td>
						<input name="isadmin" value="${user.isadmin}"/>
					</td>
				</tr>
				<tr align="center">
					<td colspan="2">
						<input type="submit" value="修改" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
