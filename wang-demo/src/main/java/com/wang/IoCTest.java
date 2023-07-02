package com.wang;

import com.wang.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangd1
 */
public class IoCTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		AppConfig appConfig = applicationContext.getBean("appConfig", AppConfig.class);
		UserService userService = appConfig.userService();
		userService.test();
	}

}
