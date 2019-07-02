<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>query</title>
	</head>
	<body>
		<form action="orderqueryoid" method="post">
			<table align="center" width="100%" >
				<tr>
					<td align="left" ><a href="index.jsp">首页</a>
					<td align="left" ><a href="orderadd.jsp">添加订单</a></td>
					<td align="right" ><input name="oid" ></td>
					<td align="left" ><input type="submit" value="搜索"></td>
				</tr>
			</table>
		</form>
		<form >
			<table align="center" border="1" width="100%" bgcolor="pink">
				<tr>
					<th>
						订单编号
					</th>
					<th>
						日期
					</th>
					<th>
						订单类别（1：批发   2：零售）
					</th>
					<th>
						商品编号
					</th>
					<th>
						商品名称
					</th>
					<th>
						商品数量
					</th>
					<th>
						客户编号
					</th>
					<th>
						客户姓名
					</th>
					<th>
						总金额
					</th>
					<th>
						利润
					</th>
				</tr>

				<c:forEach items="${orders}" var="order">
					<tr>
						<td align="center">
							${order.oid}
						</td>
						<td align="center">
							${order.date}
						</td>
						<td align="center">
							${order.kind}
						</td>
						<td align="center">
							${order.gid}
						</td>
						<td align="center">
							${order.gname}
						</td>
						<td align="center">
							${order.num}
						</td>
						<td align="center">
							${order.cid}
						</td>
						<td align="center">
							${order.cname}
						</td>
						<td align="center">
							${order.amount}
						</td>
						<td align="center">
							${order.profit}
						</td>
						<td align="center">
							<a href="orderquerybyoid?oid=${order.oid}">修改</a>
						</td>
						<td align="center">
							<a href="orderremove?oid=${order.oid}" onclick="return confirm('您确定要删除吗？')">删除</a>
						</td>
						<td align="center">
							<a href="orderend?oid=${order.oid}" onclick="return confirm('您确定要结算吗？')">结算</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</body>
</html>
