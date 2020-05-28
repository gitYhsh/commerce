package com.commerce.filter;

/**
 * Description: nocos_test
 * Created by yhsh on 2020/3/17 14:51
 * version 2.0
 * 方法说明
 */
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * 鉴权过滤器
 */
@Component
public class AuthFilter implements GlobalFilter, Ordered {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		String token = exchange.getRequest().getQueryParams().getFirst("token");

//		if (token == null || token.isEmpty()) {
//			ServerHttpResponse response = exchange.getResponse();
//			// 封装错误信息
//			Map<String, Object> responseData = Maps.newHashMap();
//			responseData.put("code", 401);
//			responseData.put("message", "非法请求");
//			responseData.put("cause", "Token is empty");
//			try {
//				// 将信息转换为 JSON
//				ObjectMapper objectMapper = new ObjectMapper();
//				byte[] data = objectMapper.writeValueAsBytes(responseData);
//
//				// 输出错误信息到页面
//				DataBuffer buffer = response.bufferFactory().wrap(data);
//				response.setStatusCode(HttpStatus.UNAUTHORIZED);
//				response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
//				return response.writeWith(Mono.just(buffer));
//			} catch (JsonProcessingException e) {
//				e.printStackTrace();
//			}
//		}
		return chain.filter(exchange);
	}

	/**
	 * 设置过滤器的执行顺序
	 *
	 * @return
	 */
	@Override
	public int getOrder() {
		return Ordered.LOWEST_PRECEDENCE;
	}
}