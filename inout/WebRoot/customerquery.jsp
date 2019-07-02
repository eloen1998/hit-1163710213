<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>query</title>
	</head>
	<body>
		<form action="customerquerycid" method="post">
			<table align="center" width="100%" >
				<tr>
					<td align="left" ><a href="index.jsp">首页</a>
					<td align="left" ><a href="customeradd.jsp">添加客户</a></td>
					<td align="right" ><input name="cid" ></td>
					<td align="left" ><input type="submit" value="按客户编号搜索"></td>
				</tr>
			</table>
		</form>
		<form action="customerquerybykind" method="post">
			<table align="center" width="100%" >
				<tr>
					<td align="right" ><input name="kind" ></td>
					<td align="left" ><input type="submit" value="按客户类别搜索"></td>
				</tr>
			</table>
		</form>
		<form >
			<table align="center" border="1" width="100%" bgcolor="pink">
				<tr>
					<th>
						客户编号
					</th>
					<th>
						客户姓名
					</th>
					<th>
						客户电话号码
					</th>
					<th>
						客户类别（1：批发    2：零售）
					</th>
				</tr>

				<c:forEach items="${customers}" var="customer">
					<tr>
						<td align="center">
							${customer.cid}
						</td>
						<td align="center">
							${customer.name}
						</td>
						<td align="center">
							${customer.phone}
						</td>
						<td align="center">
							${customer.kind}
						</td>
						<td align="center">
							<a href="customerquerybycid?cid=${customer.cid}">修改</a>
						</td>
						<td align="center">
							<a href="customerremove?cid=${customer.cid}" onclick="return confirm('您确定要删除吗？')">删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</body>
</html>
