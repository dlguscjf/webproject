package kr.ac.dit.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kr.ac.dit.domain.UserVO;
import kr.ac.dit.persistence.UserDAO;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	public void createUser(UserVO userVO) throws Exception {
		userDAO.insertUser(userVO);
	}
	public List<UserVO> readUserList() throws Exception {
		return userDAO.selectUserList();
	}
}
