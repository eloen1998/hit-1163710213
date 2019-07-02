<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>query</title>
	</head>
	<body>
		<form action="orderupdate" method="post">
			<table align="center" border="1">
				<tr align="center">
					<th>
						ID
					</th>
					<td>
						<input name="ID" readonly="readonly" value="${order.ID}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						订单编号
					</th>
					<td>
						<input name="oid" value="${order.oid}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						日期
					</th>
					<td>
						<input name="date" value="${order.date}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						订单类型（1：批发  2：零售）
					</th>
					<td>
						<input name="kind" value="${order.kind}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						商品编号
					</th>
					<td>
						<input name="gid" value="${order.gid}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						商品数量
					</th>
					<td>
						<input name="num" value="${order.num}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						客户编号
					</th>
					<td>
						<input name="cid" value="${order.cid}"/>
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
