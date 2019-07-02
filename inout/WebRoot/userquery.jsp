<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>query</title>
	</head>
	<body>
		<form action="userqueryid" method="post">
			<table align="center" width="100%" >
				<tr>
					<td align="left" ><a href="index.jsp">首页</a>
					<td align="left" ><a href="useradd.jsp">添加用户</a></td>
					<td align="right" ><input name="id" ></td>
					<td align="left" ><input type="submit" value="搜索"></td>
				</tr>
			</table>
		</form>
		<form >
			<table align="center" border="1" width="100%" bgcolor="pink">
				<tr>
					<th>
						ID
					</th>
					<th>
						用户名
					</th>
					<th>
						密码
					</th>
					<th>
						管理员
					</th>
				</tr>

				<c:forEach items="${users}" var="user">
					<tr>
						<td align="center">
							${user.ID}
						</td>
						<td align="center">
							${user.username}
						</td>
						<td align="center">
							${user.password}
						</td>
						<td align="center">
							${user.isadmin}
						</td>
						<td align="center">
							<a href="userquerybyid?id=${user.ID}">修改</a>
						</td>
						<td align="center">
							<a href="userremove?id=${user.ID}" onclick="return confirm('您确定要删除吗？')">删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</body>
</html>
