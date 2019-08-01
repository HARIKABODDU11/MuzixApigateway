package com.example.springbootzuulgatwayproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy// to act as api gate way
public class SpringBootzuulgatwayproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootzuulgatwayproxyApplication.class, args);
	}

}
