package kr.ac.dit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class SampleController1 {
	@RequestMapping("urlA") //주소명 지정 , 단 jsp파일과 이름이 같아야함
	public void urlA() {
		
	}
}
