package kr.ac.dit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.dit.domain.StudentVO;

@Controller
public class StudentController {
	@RequestMapping("read")
	public void read(Model model) {
		StudentVO studentVO = new StudentVO(); //객체 생성
		studentVO.setNo("201521267");
		studentVO.setName("이현철");
		model.addAttribute(studentVO);
		
		
	}
 
}
