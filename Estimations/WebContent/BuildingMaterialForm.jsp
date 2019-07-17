<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>



		<form action="SaveBuildingMaterialControler" method="post">
			<table>
				
				<tr>
					<td>Item: <input type="text" name="item"><br></td>

				</tr>
				<tr>
					<td>Quantity: <input type="text" name="quantity"><br></td>

				</tr>
				<tr>
					<td>Unit: <input type="text" name="unit"><br></td>

				</tr>
				<tr>
					<td><button type="submit">Add</button>
				</tr>

			</table>

		</form>
	</center>
</body>
</html>