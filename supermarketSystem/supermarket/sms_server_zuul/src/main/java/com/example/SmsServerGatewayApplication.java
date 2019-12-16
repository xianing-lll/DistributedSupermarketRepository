package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableHystrix
public class SmsServerGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsServerGatewayApplication.class, args);
	}

}
