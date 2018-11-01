package kr.ac.dit.service;
import java.util.*;
import kr.ac.dit.domain.UserVO;
public interface UserService {
	public void createUser(UserVO userVO) throws Exception;
	public List<UserVO> readUserList() throws Exception;
}
