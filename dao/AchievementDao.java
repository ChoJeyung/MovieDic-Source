package dao;

import java.util.List;

import vo.Achievement;

public interface AchievementDao {
	List<Achievement> selectList() throws Exception;
	int insert(Achievement achievement) throws Exception;
	int delete(int no) throws Exception;
	Achievement selectById(int no) throws Exception;
	int update(Achievement achievement) throws Exception;
}
