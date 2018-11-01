package kr.ac.dit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import kr.ac.dit.domain.StudentVO;

import kr.ac.dit.persistence.StudentDAO;

@Service

public class StudentServiceImpl implements StudentService {

@Autowired

private StudentDAO studentDAO;

public void createStudent(StudentVO studentVO) throws Exception {
// sql문을 제외한 다른 로직을 사용하기 위해 중간다리 설정
studentDAO.insertStudent(studentVO);

}
public List<StudentVO> readStudentList() throws Exception {
	return studentDAO.selectStudentList();
}
}

 