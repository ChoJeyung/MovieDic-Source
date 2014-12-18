package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mybatis.MyBatisConnectionFactory;

import vo.Movie;

public class MySqlMovieDao implements MovieDao{
	SqlSessionFactory sqlSessionFactory;
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}
	@Override
	public List<Movie> selectList() throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			return sqlSession.selectList("dao.MovieDao.selectList");
		} finally {
			// TODO: handle exception
			sqlSession.close();
		}
	}

	@Override
	public int insert(Movie movie) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			int count = sqlSession.insert("dao.MovieDao.insert", movie);
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
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			int count = sqlSession.delete("dao.MovieDao.delete", no);
			sqlSession.commit();
			return count;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sqlSession.close();
		}
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Movie selectById(int no) throws Exception {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			return sqlSession.selectOne("dao.MovieDao.selectById", no);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sqlSession.close();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Movie movie) throws Exception {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			int count = sqlSession.update("dao.MovieDao.update", movie);
			sqlSession.commit();
			return count;
		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return 0;
	}

}
