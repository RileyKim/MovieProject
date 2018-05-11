<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c"  uri="http://java.sun.com/jstl/core_rt"%>
 
<!DOCTYPE html>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>body.jsp</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/admin/base.css"  >
</head>
<body>
	<br />
	<font id="title" size="25px">회원 목록</font>
	<br />
	<hr>
	
	<table class="adminUser">
		<thead>
			<tr>
				<th class="adminSeq">번호</th>
				<th class="adminId">아이디</th>
				<th class="adminEmail">이메일</th>
				<th class="adminStatus">유저/관리자</th>
				<th class="adminDelete">삭제</th>
				<th class="adminSetting">권한</th>	
			</tr>
		</thead>
		
		<tbody>
			<c:forEach items="${list}" var="n">
				<tr>
					<td class="adminSeq">${n.adminSeq}</td>
					<td class="adminId">${n.adminId}</td>
					<td class="adminEmail">${n.adminEmail}</td>
					<td class="adminStatus">${n.adminStatus}</td>
					<%-- <td class="adminDelete">${n.adminDelete}</td>
					<td class="adminSetting">${n.adminSetting}</td> --%>
				</tr>
			</c:forEach>
		
		</tbody>
	</table>
	
	
</body>
</html>