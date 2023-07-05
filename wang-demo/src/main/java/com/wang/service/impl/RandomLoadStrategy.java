package com.wang.service.impl;

import com.wang.annotate.Random;
import com.wang.service.LoadBalance;
import org.springframework.stereotype.Component;

@Component
@Random
public class RandomLoadStrategy implements LoadBalance {
	@Override
	public String select() {
		return "random";
	}
}
