package kr.ac.dit.persistence;
import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import kr.ac.dit.domain.StudentVO;
@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void insertStudent(StudentVO studentVO) throws Exception {
		  jdbcTemplate.update("insert into user values(?,?)", studentVO.getNo(), studentVO.getName());
		  //기존의 방법 대신 한줄로 처리
	}
	@Override
	public List<StudentVO> selectStudentList() throws Exception {
		List<StudentVO> items = new ArrayList<StudentVO>();
			    List<Map<String, Object>> rows = jdbcTemplate.queryForList("select * from user"); 
			    //map을 이용하여 간편하게 select문 사용
			    for (@SuppressWarnings("rawtypes") Map row : rows) { //@SuppressWarnings("rawtypes")는 Map의 Warnings을 무시
			      StudentVO item = new StudentVO(); 
			      item.setNo((String) row.get("no")); 
			      item.setName((String) row.get("name")); 
			      items.add(item); 
			    } 
			    return items;
	}
}

