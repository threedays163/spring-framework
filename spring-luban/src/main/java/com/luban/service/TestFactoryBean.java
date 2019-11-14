package com.luban.service;

import com.luban.dto.A;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class TestFactoryBean implements FactoryBean<A> {
	@Override
	public A getObject() throws Exception {
		return new A();
	}

	@Override
	public Class<?> getObjectType() {
		return A.class;
	}
}
