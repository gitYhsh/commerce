package com.commerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author:yhsh
 * @Date:Create in 17:06 2020/6/22
 * @des: 类描述
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class CusApplocation {

    public static void main(String[] args) {
        SpringApplication.run(CusApplocation.class, args);
    }


}
