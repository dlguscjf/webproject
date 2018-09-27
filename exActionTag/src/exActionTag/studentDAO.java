package exActionTag;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import exActionTag.studentVO;
public class studentDAO {
 public void insertStudent(studentVO item) throws Exception {
  String no = item.getNo();
  String name = item.getName();


  Class.forName("oracle.jdbc.driver.OracleDriver");
  Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","201521267","201521267");

 

  PreparedStatement pstmt = conn.prepareStatement("insert into student values(?,?)");
  pstmt.setString(1,no);
  pstmt.setString(2,name);
  pstmt.executeUpdate();

 

  pstmt.close();

  conn.close();
 }
 public List<studentVO> selectStudent() throws Exception { //List에 record set을 담아 넘겨 준다
	   List<studentVO> items = new ArrayList<studentVO>();

	   // DB 접속
	   Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","201521267","201521267");
	   PreparedStatement sql = conn.prepareStatement("select * from student");
	   ResultSet rs = sql.executeQuery();
	   // SQL문 실행

	   while(rs.next()) {
	    // 가져온 레코드 값 리스트에 세트
		studentVO vo = new  studentVO(); 
		vo.setNo(rs.getString("no")); //찾은 no값을 vo에 저장
		vo.setName(rs.getString("name")); //찾은 name값을 vo에 저장
	    items.add(vo); //vo값을 items에 추가
	   } 
	   return items;
	 }
}
