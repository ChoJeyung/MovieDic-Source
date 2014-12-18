package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mybatis.MyBatisConnectionFactory;

import vo.Achievement;

public class MySqlAchievementDao implements AchievementDao {
	SqlSessionFactory sqlSessionFactory;
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}
	@Override
	public List<Achievement> selectList() throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			return sqlSession.selectList("dao.AchievementDao.selectList");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sqlSession.close();
		}
		return null;
	}

	@Override
	public int insert(Achievement achievement) throws Exception {
		// TODO Auto-generated method stub
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			int count = sqlSession.insert("dao.AchievementDao.isnert", achievement);
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
			int count = sqlSession.delete("dao.AchievementDao.delete", no);
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
	public Achievement selectById(int no) throws Exception {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			return sqlSession.selectOne("dao.AchievementDao.selectById", no);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			sqlSession.close();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Achievement achievement) throws Exception {
		SqlSession sqlSession = MyBatisConnectionFactory.getSqlSessionFactory().openSession();
		try {
			int count = sqlSession.update("dao.AchievementDao.update", achievement);
			sqlSession.commit();
			return count;
		} finally {
			sqlSession.close();
		}
		// TODO Auto-generated method stub
	}

}
