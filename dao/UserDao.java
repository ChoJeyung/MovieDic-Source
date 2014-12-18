package dao;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import vo.User;


public interface UserDao {
	List<User> selectList() throws Exception;
	int insert(User user) throws Exception;
	int delete(int no) throws Exception;
	User selectById(int no) throws Exception;
	int update(User user) throws Exception;
	User exist(String email, String password) throws Exception;
}
