<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!-- jsp를 단순하게 사용하기위해 사용 -->
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
		<c:forEach var="item" items="${items}"> <!-- jsp에서 for문을 사용하기 위해서는 복잡하기때문에 태그를 사용 -->
			${item.no}
			${item.name}<br>
		</c:forEach>
	</body>
</html>

