<%@ page import = "java.util.*" %>
<%@ page import = "exBean1.studentVO" %>
<%@ page import = "exBean1.studentDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<%
  List<studentVO> items = new ArrayList<studentVO>();
	studentDAO dao = new studentDAO();
  items = dao.selectStudent(); //selectStudent()메서드를 수행하여 List로 record set을 넘겨 받는다
%>
<%
 for(int i=0;i<items.size();i++) {
  studentVO item = (studentVO)items.get(i); //List에서 record를 하나씩 가져온다
  %>
  <%= item.getNo() %> <!-- 테이블의 no출력 -->
  <%= item.getName() %>  <br> <!-- 테이블의 name출력 후 줄변경 -->
  <%
  }
%>
</body>
</html>

