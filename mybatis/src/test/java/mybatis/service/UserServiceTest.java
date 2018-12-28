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
		Assert.assertEquals(1, user.getUserId());
		System.out.println(user);
	}
	@Test
	public void testGetUserId1() {
		User user = userService.getUser(0);
		Assert.assertNull(user);
		System.out.println(user);
	}
	@Test
	public void testInsertUser() {
		User user = new User();
		user.setUserId(2);
		user.setUserName("Monima");
		user.setPassword("123");
		userService.insertUser(user);
	}
	
	@AfterClass
	public static void destry() {
		userService = null;
	}

}
