<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add river</title>
</head>
<body>
	<a href=list>Return to river list</a>
	<br />
	<form method="POST">
		<table border="1">
			<tbody>
				<tr>
					<th>Name</th>
					<td><input type="text" name="name" /></td>
				</tr>
				<tr>
					<th>Length</th>
					<td><input type="text" name="length" /></td>
				</tr>
				<tr>
					<th>Location</th>
					<td><input type="text" name="location" /></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit"
						value="ADD NEW" /></td>
				</tr>
			</tbody>
		</table>
	</form>
	<br />
	<hr />
</html>