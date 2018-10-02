package kr.ac.dit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.dit.domain.StudentVO;

@Controller
public class SampleController3 {
	@RequestMapping("urlD")
	public String urlD(Model model) /* model이라는 객체 생성*/{  
		StudentVO studentVO = new StudentVO(); //객체 생성
		studentVO.setNo("201521267");
		studentVO.setName("이현철");
		model.addAttribute(studentVO); //read.jsp로 값 전달
		return "read";
	}
}
