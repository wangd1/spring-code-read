package com.wang;

import com.wang.service.UserService;
import com.wang.service.WangFactoryBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//		UserService userService = (UserService) context.getBean("userService");
//		userService.test();

		WangFactoryBean wangFactoryBean = (WangFactoryBean) context.getBean("wangFactoryBean");
	}
}
