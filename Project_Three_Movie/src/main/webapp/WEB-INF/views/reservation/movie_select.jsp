<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title><tiles:getAsString name="title" /></title>
</head>
<body>
<h3>Book Tickets</h3><br>
<h3>영화 선택</h3>
<form action="./loc_select.do" method="post">
	<table>
		<tr>
			<td><input type="image" name = "movie_code" src="${pageContext.request.contextPath }/resources/images/avengers.jpg" width="150" height="200" value="M1"></td>
			<td><input type="image" name = "movie_code" src="${pageContext.request.contextPath }/resources/images/champion.jpg" width="150" height="200" value="M2"></td>
			<td><input type="image" name = "movie_code" src="${pageContext.request.contextPath }/resources/images/gongiam.jpg" width="150" height="200" value="M3"></td>
			<td><input type="image" name = "movie_code" src="${pageContext.request.contextPath }/resources/images/avengers2.jpg" width="150" height="200" value="M1"></td>
			<td><input type="image" name = "movie_code" src="${pageContext.request.contextPath }/resources/images/champion2.jpg" width="150" height="200" value="M2"></td>
			<td><input type="image" name = "movie_code" src="${pageContext.request.contextPath }/resources/images/gongiam2.jpg" width="150" height="200" value="M3"></td>
		</tr>
		<tr>
			<td><center>어벤져스:인피니티워</center></td>
			<td><center>챔피언</center></td>
			<td><center>곤지암</center></td>
			<td><center>어벤져스:인피니티워</center></td>
			<td><center>챔피언</center></td>
			<td><center>곤지암</center></td>
		</tr>
	</table>

</form>


</body>
</html>