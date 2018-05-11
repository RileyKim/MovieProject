package kosta.project.three.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class RvDAOImpl implements RvDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<LocDTO> getLocList() {
		List<LocDTO> list;
		RvDAO dao = sqlSession.getMapper(RvDAO.class);
		return dao.getLocList();
	}

}
