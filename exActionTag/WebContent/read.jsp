<%@ page import = "java.util.*" %>
<%@ page import = "exActionTag.studentVO" %> <!-- list에 클래스를 사용하기 위해 import를 사용 자바빈과는 별도 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<jsp:useBean id="item" scope="page" class="exActionTag.studentVO"/> <!-- studentVO라는 클래스를 item이라는 객체로 사용하기 위해 선언 -->
<jsp:useBean id="dao" scope="page" class="exActionTag.studentDAO"/> <!-- studentDAO라는 클래스를 dao이라는 객체로 사용하기 위해 선언 -->
</html>
<%
  List<studentVO> items = new ArrayList<studentVO>();
  items = dao.selectStudent(); //selectStudent()메서드를 수행하여 List로 record set을 넘겨 받는다
%>
<%
 for(int i=0;i<items.size();i++) { //현재 리스트의 크기만큼 반복실행
  item = items.get(i); //리스트의 처음 값부터 순차적으로 itme에 삽입
%>
  <%=item.getNo()%> <!-- item에서 no값을 불러드림 -->
  <%=item.getName()%><BR> <!-- item에서 name값을 불러드림 -->
 <%}%>




 
