package dao;

import java.util.List;

import vo.Actor;

public interface ActorDao {
	List<Actor> selectList() throws Exception;
	int insert(Actor actor) throws Exception;
	int delete(int no) throws Exception;
	Actor selectById(int no) throws Exception;
	int update(Actor actor) throws Exception;
}
