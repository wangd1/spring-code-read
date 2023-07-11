package com.wang;

import com.wang.service.OrderService;
import com.wang.service.UserService;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyTest {

	public static void main(String[] args) {
//		testEnhancer();
//		testProxyFactory();
	}

	private static void testProxyFactory() {

		OrderService target = new OrderService();

		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTarget(target);
		proxyFactory.addAdvice((MethodBeforeAdvice) (method, args, target1) -> {
			System.out.println("proxy before");
		});
		OrderService proxy = (OrderService) proxyFactory.getProxy();
		proxy.test();
	}

	public static void testEnhancer(){
		Enhancer enhancer = new Enhancer();
		OrderService target = new OrderService();
		enhancer.setSuperclass(OrderService.class);
		enhancer.setCallbacks(new Callback[]{(MethodInterceptor) (o, method, objects, methodProxy) -> {
			System.out.println("cglib proxy before");
			method.invoke(target,objects);
			System.out.println("cglib proxy after");
			return null;
		}});
		OrderService proxy = (OrderService) enhancer.create();
		proxy.test();
	}
}
