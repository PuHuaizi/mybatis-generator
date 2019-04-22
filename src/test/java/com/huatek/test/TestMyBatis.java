/**
 * 
 */
package com.huatek.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.huatek.model.User;
import com.huatek.service.UserService;

/**
 * @author puxiongxiong
 * @date 2019年4月22日 
 */
//使用junit4进行测试
@RunWith(SpringJUnit4ClassRunner.class)
//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	private ApplicationContext ac = null;

	@Resource
	private UserService userService = null;

	public void test() {
		User user = userService.selectByPrimaryKey(1);
		System.out.println(user.getLoginName());
		logger.info(JSON.toJSONString(user));
	}
}
