/**
 * 
 */
package com.huatek.service;

import com.huatek.model.User;

/**
 * @author puxiongxiong
 * @date 2019年4月22日 
 */
public interface UserService {
	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);
}
