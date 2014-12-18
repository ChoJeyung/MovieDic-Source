package dao;

import java.util.List;

import vo.Movie;

public interface MovieDao {
	List<Movie> selectList() throws Exception;
	int insert(Movie movie) throws Exception;
	int delete(int no) throws Exception;
	Movie selectById(int no) throws Exception;
	int update(Movie movie) throws Exception;
}
