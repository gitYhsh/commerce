package com.commerce.system.services.Impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.commerce.system.dao.UserMapper;
import com.commerce.system.domian.User;
import com.commerce.system.services.UserServices;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: plodes
 * Created by yhsh on 2020/3/19 10:39
 * version 2.0
 * 方法说明
 */
@Service
public class UserServicesImpl implements UserServices {

	private static Logger logger = LoggerFactory.getLogger(UserServicesImpl.class);
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getAllUser(String username) {
		try {

			return userMapper.selectById("1");
		}catch (Exception e){
			e.printStackTrace();
			logger.error("获取用户列表失败："+e.getMessage());
		}
		return null;
	}

	@Override
	public User checkUserByLogin(User user) {
		try {

			QueryWrapper<User> queryWrapper = new QueryWrapper<>();

			String mobile = user.getMobile();
			if (!StringUtils.isEmpty(mobile)){
				queryWrapper.eq("mobile",mobile);
			}
			String username = user.getUsername();
			if (!StringUtils.isEmpty(username)){
				queryWrapper.eq("username",username);
			}
			return userMapper.selectOne(queryWrapper);
		}catch (Exception e){
			logger.error("获取用户失败:"+ e.getMessage());
		}
		return null;
	}
}
