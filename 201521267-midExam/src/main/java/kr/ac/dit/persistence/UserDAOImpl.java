package kr.ac.dit.persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import kr.ac.dit.domain.UserVO;
@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public void insertUser(UserVO userVO) throws Exception {
		 jdbcTemplate.update("insert into user values(?,?)", userVO.getEmail(), userVO.getPassword());
	}
	@Override
	public List<UserVO> selectUserList() throws Exception {
		List<UserVO> items = new ArrayList<UserVO>();
		 List<Map<String, Object>> rows = jdbcTemplate.queryForList("select * from user"); 
		  
		    for (@SuppressWarnings("rawtypes") Map row : rows) { 
		      UserVO item = new UserVO(); 
		      item.setEmail((String) row.get("email")); 
		      item.setPassword((String) row.get("password")); 
		      items.add(item); 
		    } 
		    return items;
		
	}
}
