package mybatis.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	private static SqlSessionFactory factory;

	static {
		Reader fileReader = null;

		try {
			fileReader = Resources.getResourceAsReader("mybatisconfig.xml");
			factory = new SqlSessionFactoryBuilder().build(fileReader);
		} catch (Exception ex) {
			System.out.println("" + ex.getMessage());
		}
	}

	public static SqlSessionFactory getSessionFactory() {
		return factory;
	}

}
