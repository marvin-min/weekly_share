package com.jarorwar.tut.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jarorwar.tut.interceptor.DemoInterceptor;

@Configuration
public class MybatisConfig {

	@Bean
	DemoInterceptor demoInterceptor() {
		System.out.println("=======myCacheInterceptor===========");
		return new DemoInterceptor();
	}
}
