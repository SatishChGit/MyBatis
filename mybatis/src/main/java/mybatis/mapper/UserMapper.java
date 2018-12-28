package mybatis.mapper;

import java.util.List;

import mybatis.model.User;

public interface UserMapper {
	
	void insertUser(User  user);
	
	User getUser(int id);
	
	List<User> getUsers();
	
	boolean updateUser(User user, int id);
	
	int deleteUser(int userId);

}
