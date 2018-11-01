<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="css/user_common.css" rel="stylesheet" type="text/css">
	</head>
	<body>
	<c:forEach var="item" items="${items}">
			${item.email}
			${item.password}<br>
		</c:forEach>
	</body>
</html>