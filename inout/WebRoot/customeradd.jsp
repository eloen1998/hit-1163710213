<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>query</title>
	</head>
	<body>
		<form action="customeradd" method="post">
			<table align="center" border="1">
				<tr align="center">
					<th>
						客户编号
					</th>
					<td>
						<input name="cid" />
					</td>
				</tr>
				<tr align="center">
					<th>
						客户姓名
					</th>
					<td>
						<input name="name" />
					</td>
				</tr>
				<tr align="center">
					<th>
						客户电话号码
					</th>
					<td>
						<input name="phone" />
					</td>
				</tr>
				<tr align="center">
					<th>
						客户类别（1：批发    2：零售）
					</th>
					<td>
						<input name="kind" />
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
