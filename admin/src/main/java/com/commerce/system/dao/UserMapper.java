package com.commerce.system.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.commerce.system.domian.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

	List<User> selectAll();

}