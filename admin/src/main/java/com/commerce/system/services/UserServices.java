package com.commerce.system.services;


import com.commerce.system.domian.User;

/**
 * Description: plodes
 * Created by yhsh on 2020/3/19 10:38
 * version 2.0
 * 方法说明
 */
public interface UserServices  {

	/**获取用户列表**/
	//@Cacheable(value="users", key="#p0")
	User getAllUser(String username);

	/**根据用户名或者手机号，查询用户**/
	User checkUserByLogin(User user);


}
