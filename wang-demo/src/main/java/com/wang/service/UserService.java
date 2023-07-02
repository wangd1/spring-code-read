package com.wang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 周瑜
 */

@Component
public class UserService {

	@Autowired
	private OrderService orderService;

	public void test() {
		System.out.println(orderService);
	}

}
