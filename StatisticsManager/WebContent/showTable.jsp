<%@ page import="javax.swing.table.TableModel" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>showTable</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css"> 
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script> 
<style type="text/css">
</style>
</head>
<body>
	<%
		String tableName = (String)request.getAttribute("tableName");
		TableModel model = (TableModel) request.getAttribute("model");
	%>
	<center>
		<b> Таблиця <%=tableName%></b>
		<table class="table" border="1" width="150" >
			<tr class="warning">
				<%
					int nCol = model.getColumnCount();
					for(int i = 0; i < nCol; i++){
						String h = model.getColumnName(i);
				%>
				<th class ="active" width="100%"><%=h%></th>
				<%	}	%>
			</tr>
			<%
				int nRow = model.getRowCount();
				for(int r = 0; r < nRow; r++){
			%>
			<tr class="warning">
			<%
				for(int j = 0; j <nCol; j++){
					String str = model.getValueAt(r, j).toString();
			%>
			<td class="info" width="100" align="center"> <%=str%> </td>
			<%	} %>
			</tr>
			<%	} %>
		</table>
	</center>
</body>
</html>