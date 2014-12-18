package dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mybatis.MyBatisConnectionFactory;

import vo.User;
public class MySqlUserDao implements UserDao{
SqlSessionFactory sqlSessionFactory;
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public List<User> selectList() throws Exception {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			return sqlSession.selectList("dao.UserDao.selectList");
		} finally {
			// TODO: handle exception
			sqlSession.close();
		}
	}

	@Override
	public int insert(User user) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			int count = sqlSession.insert("dao.UserDao.insert", user);
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
			int count = sqlSession.delete("dao.UserDao.delete", no);
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
	public User selectById(int no) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			return sqlSession.selectOne("dao.UserDao.selectById", no);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sqlSession.close();
		}
		return null;
	}

	@Override
	public int update(User user) throws Exception {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			int count = sqlSession.update("dao.UserDao.update", user);
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
	public User exist(String email, String password) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
