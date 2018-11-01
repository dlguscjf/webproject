package kr.ac.dit.persistence;
import java.util.*;
import kr.ac.dit.domain.UserVO;
public interface UserDAO {
	public void insertUser(UserVO userVO) throws Exception;
	public List<UserVO> selectUserList() throws Exception;
}
