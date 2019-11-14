package com.luban.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author mac
 */
@Component
public class LubanService implements InitializingBean {

	@Qualifier("zlService")
	@Autowired
	Zl zlService;

	@Qualifier("zlService1")
	@Autowired
	Zl zlServcie1;

	public void setZlService(Zl zlService) {
		this.zlService = zlService;
	}

	public LubanService(){
		System.out.println("lubanService construct");
	}

	@PostConstruct
	public void init(){
		System.out.println("lubanService postConstruct");
	}

	@PostConstruct
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("lubanService afterPropertiesSet");
	}

	public void xx(){
		System.out.println(zlService);
	}
}
