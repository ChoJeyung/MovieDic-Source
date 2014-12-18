package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mybatis.MyBatisConnectionFactory;

import vo.Actor;

public class MySqlActorDao implements ActorDao{
	SqlSessionFactory sqlSessionFactory;
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}
	@Override
	public List<Actor> selectList() throws Exception {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			return sqlSession.selectList("dao.ActorDao.selectList");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sqlSession.close();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Actor actor) throws Exception {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			int count = sqlSession.insert("dao.ActorDao.insert", actor);
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
	public int delete(int no) throws Exception {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			int count = sqlSession.delete("dao.ActorDao.delete", no);
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
	public Actor selectById(int no) throws Exception {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			return sqlSession.selectOne("dao.ActorDao.selectById", no);
		} finally {
			sqlSession.close();
		}
		// TODO Auto-generated method stub
	}

	@Override
	public int update(Actor actor) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			int count = sqlSession.update("dao.ActorDao.update", actor);
			sqlSession.commit();
			return count;
		} finally {
			sqlSession.close();
		}
	}

}
