<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>query</title>
	</head>
	<body>
		<form action="houseupdate" method="post">
			<table align="center" border="1">
				<tr align="center">
					<th>
						ID
					</th>
					<td>
						<input name="ID" readonly="readonly" value="${house.ID}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						商品编号
					</th>
					<td>
						<input name="gid" readonly="readonly" value="${house.gid}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						商品名称
					</th>
					<td>
						<input name="gname" readonly="readonly" value="${house.gname}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						商品库存
					</th>
					<td>
						<input name="num" readonly="readonly" value="${house.num}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						上次进货日期
					</th>
					<td>
						<input name="date" readonly="readonly" value="${house.date}"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						进货数量
					</th>
					<td>
						<input name="innum"/>
					</td>
				</tr>
				<tr align="center">
					<th>
						进货日期
					</th>
					<td>
						<input name="newdate"/>
					</td>
				</tr>
				<tr align="center">
					<td colspan="2">
						<input type="submit" value="进货" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
