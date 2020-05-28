package com.commerce.controller;

import com.commerce.system.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: commerce
 * Created by yhsh on 2020/5/27 15:59
 * version 2.0
 * 方法说明
 */
@RestController
public class UserController {

	@Autowired
	private UserServices userServices;
	@GetMapping(value = "getAllUser")
	public Object getAllUse(){
		return userServices.getAllUser("");
	}
}
