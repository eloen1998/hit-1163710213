<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>query</title>
	</head>
	<body>
		<form action="goodadd" method="post">
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
						商品类别
					</th>
					<td>
						<input name="kind" />
					</td>
				</tr>
				<tr align="center">
					<th>
						商品名称
					</th>
					<td>
						<input name="name" />
					</td>
				</tr>
				<tr align="center">
					<th>
						进价
					</th>
					<td>
						<input name="inprice" />
					</td>
				</tr>
				<tr align="center">
					<th>
						批发价
					</th>
					<td>
						<input name="outprice1" />
					</td>
				</tr>
				<tr align="center">
					<th>
						零售价
					</th>
					<td>
						<input name="outprice2" />
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
