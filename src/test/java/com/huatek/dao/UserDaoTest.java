/**
 * 
 */
package com.huatek.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.huatek.BaseTest;
import com.huatek.model.User;

/**
 * @author puxiongxiong
 * @date 2019年4月23日 
 */
public class UserDaoTest extends BaseTest {

	@Autowired
	private UserMapper userDao;

	private static final Logger logger = LogManager.getLogger(UserDaoTest.class.getName());

	@Test
	public void testSelectByPrimaryKey() {
		System.out.println("测试Dao接口方法开始执行中······");
		User user = userDao.selectByPrimaryKey(1);
		System.out.println("成功获取用户名：" + user.getName());
		logger.info("testtLog", "test");
	}
}
