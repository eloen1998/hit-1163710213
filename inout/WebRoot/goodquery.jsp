<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>query</title>
	</head>
	<body>
		<form action="goodquerygid" method="post">
			<table align="center" width="100%" >
				<tr>
					<td align="left" ><a href="index.jsp">首页</a>
					<td align="left" ><a href="goodadd.jsp">添加商品</a></td>
					<td align="right" ><input name="gid" ></td>
					<td align="left" ><input type="submit" value="搜索"></td>
				</tr>
			</table>
		</form>
		<form >
			<table align="center" border="1" width="100%" bgcolor="pink">
				<tr>
					<th>
						商品编号
					</th>
					<th>
						商品类别
					</th>
					<th>
						商品名称
					</th>
					<th>
						进价
					</th>
					<th>
						批发价
					</th>
					<th>
						零售价
					</th>
				</tr>

				<c:forEach items="${goods}" var="good">
					<tr>
						<td align="center">
							${good.gid}
						</td>
						<td align="center">
							${good.kind}
						</td>
						<td align="center">
							${good.name}
						</td>
						<td align="center">
							${good.inprice}
						</td>
						<td align="center">
							${good.outprice1}
						</td>
						<td align="center">
							${good.outprice2}
						</td>
						<td align="center">
							<a href="goodquerybygid?gid=${good.gid}">修改</a>
						</td>
						<td align="center">
							<a href="goodremove?gid=${good.gid}" onclick="return confirm('您确定要删除吗？')">删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</body>
</html>
