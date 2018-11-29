package kr.ac.dit.persistence;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kr.ac.dit.domain.BoardVO;
@Repository
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	SqlSession sqlSession;
	@Override
	public List<BoardVO> selectList() throws Exception {
		return sqlSession.selectList("BoardMapper.selectList"); 
	}
	@Override
	public void insert(BoardVO boardVO) throws Exception {
		sqlSession.insert("BoardMapper.insert", boardVO);
	}
	@Override
	public BoardVO select(int no) throws Exception {
		return sqlSession.selectOne("BoardMapper.select", no); 
	}
	@Override
	public void update(BoardVO boardVO) throws Exception {
		sqlSession.update("BoardMapper.update", boardVO);
	}
	@Override
	public void delete(int no) throws Exception {
		sqlSession.delete("BoardMapper.delete", no); 
	}
	@Override
	 public void insertAttachFile(String fileName) {
	  sqlSession.insert("BoardMapper.insertAttachFile",fileName);
	  //mapper을 이용해서 파일 이름을 받아 sql문 실행
	 }
	@Override
	//mapper을 이용해서 게시글 번호을 받아 sql문 실행 하고 리스트로 출력
	public List<String> selectAttachFile(int no) throws Exception {
		  return sqlSession.selectList("BoardMapper.selectAttachFile", no);
		 }
}
