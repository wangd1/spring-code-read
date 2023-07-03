package com.wang.service;

import org.springframework.beans.factory.SmartFactoryBean;
import org.springframework.stereotype.Component;

@Component
public class WangFactoryBean implements SmartFactoryBean {
	@Override
	public Object getObject() throws Exception {
		return new User();
	}

	@Override
	public Class<?> getObjectType() {
		return User.class;
	}

	@Override
	public boolean isEagerInit() {
		return true;
	}
}
