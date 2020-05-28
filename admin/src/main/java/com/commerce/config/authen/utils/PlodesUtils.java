package com.commerce.config.authen.utils;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

/**
 * Description: plodes
 * Created by yhsh on 2020/4/14 11:49
 * version 2.0
 * 方法说明  公共类
 */
public class PlodesUtils {

	/**
	 * 简单判断是否为手机号
	 *
	 * @param phoneNo 手机号
	 * @return boolean
	 */
	public static boolean isPhoneNo(String phoneNo) {
		String regex = "[1]\\d{10}";
		if (StringUtils.isBlank(phoneNo))
			return false;
		else
			return phoneNo.matches(regex);
	}

	/**
	 * 获取UUID 做为数据库各个表的主键,不采用自增长
	 */
	public static String getUUID() {
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		return uuid;
	}


	/**
	 * 判断是否为 AJAX 请求
	 *
	 * @param request HttpServletRequest
	 * @return boolean
	 */
	public static boolean isAjaxRequest(HttpServletRequest request) {
		return (request.getHeader("X-Requested-With") != null
				&& "XMLHttpRequest".equals(request.getHeader("X-Requested-With")));
	}

}
