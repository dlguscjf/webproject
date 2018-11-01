package kr.ac.dit.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.dit.domain.StudentVO;

import kr.ac.dit.service.StudentService;

@Controller
public class StudentController {

@Autowired
private StudentService studentService;
@RequestMapping(value="create", method=RequestMethod.GET) // create.jsp가 get방식일때 실행
public void createGET() throws Exception {	
}
@RequestMapping(value="create", method=RequestMethod.POST) //create.jsp가 post방식일때 실행
public void createPOST(StudentVO studentVO, Model model) throws Exception {
studentService.createStudent(studentVO);
}
@RequestMapping("read")
public void readList(Model model) throws Exception { //read.jsp를 실행하면 실행
	model.addAttribute("items", studentService.readStudentList());
}
}