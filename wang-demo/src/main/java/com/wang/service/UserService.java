package com.wang.service;

import com.wang.annotate.Random;
import com.wang.annotate.RoundRobin;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author 周瑜
 */

@Component
public class UserService {

	@Autowired
	private OrderService orderService;

	@Autowired
	@RoundRobin
	private LoadBalance loadBalance;

//	private OrderService orderService;
//	public void setOrderService(OrderService orderService){
//		this.orderService = orderService;
//	}

	public void test() {
		System.out.println(orderService);
		System.out.println(loadBalance.select());
	}

}
