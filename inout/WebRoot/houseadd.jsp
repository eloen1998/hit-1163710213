<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>query</title>
	</head>
	<body>
		<form action="houseadd" method="post">
			<table align="center" border="1">
				<tr align="center">
					<th>
						商品编号
					</th>
					<td>
						<input name="gid" />
					</td>
				</tr>
				<tr align="center">
					<th>
						商品数量
					</th>
					<td>
						<input name="num" />
					</td>
				</tr>
				<tr align="center">
					<th>
						进货日期
					</th>
					<td>
						<input name="date" />
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
