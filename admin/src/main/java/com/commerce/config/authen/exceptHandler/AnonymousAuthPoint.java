package com.commerce.config.authen.exceptHandler;

import com.alibaba.fastjson.JSONObject;
import com.commerce.Utils.ApiResult;
import com.commerce.Utils.Constant;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description: plodes
 * Created by yhsh on 2020/4/14 10:47
 * version 2.0
 * 方法说明  匿名用户权限过滤
 */
@Configuration
public class AnonymousAuthPoint implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest request, HttpServletResponse response,
	                     AuthenticationException authException) throws IOException, ServletException {
		response.setCharacterEncoding("utf-8");
		response.setContentType(Constant.JSONUTF8);
		response.getWriter().print(JSONObject.toJSONString(ApiResult.error("没有访问权限!")));
	}

}


