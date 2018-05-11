<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
      <tr>
         <th>LOC_CODE</th>
         <th>LOC_NAME</th>
         
         
      </tr>
      <c:forEach items="${ list }" var="list">
         <tr>
            <td>${list.loc_code}</td>
            <td>${list.loc_name}</td>
                     
         </tr>
      </c:forEach>
   </table>
</body>
</html>