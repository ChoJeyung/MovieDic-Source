package dao;

import java.util.List;

import vo.Question;
import vo.User;

public interface QuestionDao {
	List<Question> selectList() throws Exception;
	int insert(Question question) throws Exception;
	int delete(int no) throws Exception;
	Question selectById(int no) throws Exception;
	int update(Question question) throws Exception;
}
