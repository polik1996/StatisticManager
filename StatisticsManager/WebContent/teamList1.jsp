<%@page import="web_view.SelectTable"%>
<%@page import="model.Team"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>teamList1</title>
</head>
<body>
		<select size="5" name="team1Bean">
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
</body>
</html>
