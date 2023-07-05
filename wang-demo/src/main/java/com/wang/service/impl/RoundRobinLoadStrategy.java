package com.wang.service.impl;

import com.wang.annotate.RoundRobin;
import com.wang.service.LoadBalance;
import org.springframework.stereotype.Component;

/**
 * @author wangd1
 */
@Component
@RoundRobin
public class RoundRobinLoadStrategy implements LoadBalance {
	@Override
	public String select() {
		return "roundRobin";
	}
}
