package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableFeignClients
@EnableHystrix
@EnableCaching
public class SmsServerTradeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsServerTradeApplication.class, args);
	}

}
