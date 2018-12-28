package mybatis.service;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import mybatis.model.User;

public class UserServiceTest {
	
	private static UserService userService;
	@BeforeClass
	public static void configure() {
		userService = new UserService();
	}
	@Test
	public void testGetUserId() {
		User user = userService.getUser(1);
		Assert.assertNotNull(user);
		System.out.println(user);
	}
	@AfterClass
	public static void destry() {
		userService = null;
	}

}
