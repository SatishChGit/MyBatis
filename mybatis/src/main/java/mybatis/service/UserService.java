package mybatis.service;

import org.apache.ibatis.session.SqlSession;

import mybatis.mapper.UserMapper;
import mybatis.model.User;
import mybatis.util.MyBatisUtil;

public class UserService {

	public User getUser(int userId) {
		SqlSession session = MyBatisUtil.getSessionFactory().openSession();
		try {
			UserMapper userMapper = session.getMapper(UserMapper.class);
			return userMapper.getUser(userId);
		} finally {
			session.close();
		}
	}

}
