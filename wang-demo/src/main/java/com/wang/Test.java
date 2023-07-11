package com.wang;

import com.wang.mapper.OrderMapper;
import com.wang.mapper.UserMapper;
import com.wang.mybatis.spring.WangMybatisFactoryBean;
import com.wang.service.User;
import com.wang.service.UserService;
import com.wang.service.WangFactoryBean;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		UserService userService = (UserService) context.getBean("userService");
		userService.test();

//		User user = context.getBean("user", User.class);

//		WangFactoryBean wangFactoryBean = (WangFactoryBean) context.getBean("wangFactoryBean");
//		context.close();
	}
}
