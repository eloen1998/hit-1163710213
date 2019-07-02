<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>query</title>
	</head>
	<body>
		<form action="useradd" method="post">
			<table align="center" border="1">
				<tr align="center">
					<th>
						用户名
					</th>
					<td>
						<input name="username" />
					</td>
				</tr>
				<tr align="center">
					<th>
						密码
					</th>
					<td>
						<input name="password" />
					</td>
				</tr>
				<tr align="center">
					<th>
						管理员（true/false）
					</th>
					<td>
						<input name="isadmin" />
					</td>
				</tr>
				<tr align="center">
					<td colspan="2">
						<input type="submit" value="添加" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
