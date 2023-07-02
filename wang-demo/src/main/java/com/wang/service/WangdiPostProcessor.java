package com.wang.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author wangd1
 * @date 2021/10/3
 */
@Component
public class WangdiPostProcessor implements BeanPostProcessor {
	// @Override
	// public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
	// 	if("userService".equals(beanName)){
	// 		((UserService) bean).test();
	// 		System.out.println("实例化后");
	// 	}
	// 	return true;
	// }

	// @Override
	// public void postProcessMergedBeanDefinition(RootBeanDefinition beanDefinition, Class<?> beanType, String beanName) {
	// 	if("userService".equals(beanName)){
	// 		beanDefinition.getPropertyValues().add("orderService",new OrderService());
	// 	}
	// }

	// @Override
	// public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
	// 	if ("userService".equals(beanName)) {
	// 		System.out.println("实例化前");
	// 	}
	// 	return null;
	// }


	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("初始化前");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("初始化后");
		return bean;
	}
}
