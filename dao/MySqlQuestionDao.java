package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.Question;

import com.mybatis.MyBatisConnectionFactory;

public class MySqlQuestionDao implements QuestionDao{
	SqlSessionFactory sqlSessionFactory;
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}
	@Override
	public List<Question> selectList() throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			return sqlSession.selectList("dao.QuestionDao.selectList");
		} finally {
			// TODO: handle exception
			sqlSession.close();
		}
	}

	@Override
	public int insert(Question question) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			int count = sqlSession.insert("dao.QuestionDao.insert", question);
			sqlSession.commit();
			return count;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sqlSession.close();
		}
		return 0;
	}

	@Override
	public int delete(int no) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			int count = sqlSession.insert("dao.QuestionDao.delete", no);
			sqlSession.commit();
			return count;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sqlSession.close();
		}
		return 0;
	}

	@Override
	public Question selectById(int no) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			return sqlSession.selectOne("dao.QuestionDao.selectById", no);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sqlSession.close();
		}
		return null;
	}

	@Override
	public int update(Question question) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			int count = sqlSession.insert("dao.QuestionDao.update", question);
			sqlSession.commit();
			return count;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sqlSession.close();
		}
		return 0;
	}

}
