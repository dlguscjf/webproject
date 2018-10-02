package kr.ac.dit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController2 {
	//하나의 클래스에 여러 url을 선언해도 상관 없음
	@RequestMapping("urlB")
	public String urlBGet() { //string으로 선언후 return 값을 선언하면 선언한 이름의 jsp파일이 실행됨
		return "view";
	}
	@RequestMapping("urlC")
	public String urlCGet(@ModelAttribute("msg") String msg) {
		//@ModelAttribute("msg")는 jsp에 넘겨줄 변수 String msg urlCGet에서 사용할 변수
		return "view";
	}

}
