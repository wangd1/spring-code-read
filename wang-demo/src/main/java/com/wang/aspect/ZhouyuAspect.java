package com.wang.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ZhouyuAspect {

//	@DeclareParents(value = "com.zhouyu.service.UserService", defaultImpl = UserImplement.class)
//	private UserInterface userInterface;

	@Before("execution(public void com.wang.service.UserService.test())")
	public void zhouyuBefore(JoinPoint joinPoint) {
		System.out.println("zhouyuBefore");
	}


	@After("execution(public void com.wang.service.OrderService.test())")
	public void wangAfter(JoinPoint joinPoint){
		System.out.println("wangAfter");
	}
}
