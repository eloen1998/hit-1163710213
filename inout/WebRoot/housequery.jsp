<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>query</title>
	</head>
	<body>
		<form action="housequerygid" method="post">
			<table align="center" width="100%" >
				<tr>
					<td align="left" ><a href="index.jsp">首页</a>
					<td align="left" ><a href="houseadd.jsp">添加商品</a></td>
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
						商品名称
					</th>
					<th>
						库存数量
					</th>
					<th>
						进货日期
					</th>
				</tr>

				<c:forEach items="${houses}" var="house">
					<tr>
						<td align="center">
							${house.gid}
						</td>
						<td align="center">
							${house.gname}
						</td>
						<td align="center">
							${house.num}
						</td>
						<td align="center">
							${house.date}
						</td>
						<td align="center">
							<a href="housequerybygid?gid=${house.gid}">进货</a>
						</td>
						<td align="center">
							<a href="houseremove?gid=${house.gid}" onclick="return confirm('您确定要删除吗？')">删除</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</body>
</html>
