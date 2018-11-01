package kr.ac.dit.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.dit.domain.UserVO;
import kr.ac.dit.service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping(value="createUser", method=RequestMethod.GET)
	public void createGET() throws Exception {	
	}
	@RequestMapping(value="createUser", method=RequestMethod.POST) 
	public void createPOST(UserVO UserVO, Model model) throws Exception {
		userService.createUser(UserVO);
	}
	@RequestMapping("readUserList")
	public void readList(Model model) throws Exception { 
		model.addAttribute("items", userService.readUserList());
	}
}