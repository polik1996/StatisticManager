<%@page import="web_view.SelectTable"%>
<%@page import="model.Team"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>teamList3</title>
</head>
<body>
	<center>
		<select size="5" name="team3Bean">
			<%
				Class<Team> c = Team.class;
				for (Object x : SelectTable.getController().getObjectList(c)) {
					Team obj = (Team) x;
			%>
			<option>
				<%=obj.toString()%></option>
			<%
				}
			%>
		</select>
	</center>
</body>
</html>
