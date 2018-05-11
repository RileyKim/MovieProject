<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:getAsString name="title" /></title>
</head>

<body>

<h3>영화관 선택</h3>
	<form name="select" action="./date_select.do" method="post">
		<input type="hidden" name="movie_code" value="${movie_code}">
		
		<table>
			<tr>
				<c:forEach items="${ list }" var="list">
					<td><button type="submit" name="loc_code" value="${list.loc_code}"> ${list.loc_code} </button></td>
				</c:forEach>
			</tr>
		</table>
	</form>
</body>
</html>