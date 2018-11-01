package kr.ac.dit.persistence;
import java.util.*;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kr.ac.dit.domain.StudentVO;
@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public void insertStudent(StudentVO studentVO) throws Exception {
		 sqlSession.insert("StudentMapper.insertStudent", studentVO);
		  //기존의 방법 대신 한줄로 처리
	}
	@Override
	public List<StudentVO> selectStudentList() throws Exception {
		  return sqlSession.selectList("StudentMapper.selectStudentList"); 
		  //select문도 한줄로 처리 가능
	}
}

