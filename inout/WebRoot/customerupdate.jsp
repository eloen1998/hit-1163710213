<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>query</title>
	</head>
	<body>
		<form action="customerupdate" method="post">
			<table align="center" border="1">
				<tr align="center">
					<th>
						ID
					</th>
					<td>
						<input name="ID" readonly="readonly" value="${customer.ID}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						客户编号
					</th>
					<td>
						<input name="cid" value="${customer.cid}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						客户姓名
					</th>
					<td>
						<input name="name" value="${customer.name}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						客户电话号码
					</th>
					<td>
						<input name="phone" value="${customer.phone}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						客户类别（1：批发    2：零售）
					</th>
					<td>
						<input name="kind" value="${customer.kind}"/>
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
