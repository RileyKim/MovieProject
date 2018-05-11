<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c"  uri="http://java.sun.com/jstl/core_rt"%>
 
 <%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
 
<!DOCTYPE html>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title" /> </title>
</head>
<body>
	<table border="0" cellpadding="0" cellspacing="1" bgcolor="#a0a0a0" width="80%">
		<tr height="80" valign="middle"  bgcolor="#ffffff">
			<td colspan="2"><tiles:insertAttribute  name="header" /> </td>
		</tr>
	
		<tr height="670" bgcolor="#ffffff">
			<td width="15%" valign="top"> <tiles:insertAttribute name="menu" /> </td>
			<td width="85%" align="center"> <tiles:insertAttribute name="body" /> </td>
		</tr>
		
		
	</table>
</body>
</html>





