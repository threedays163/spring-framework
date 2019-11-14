package com.luban.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("zlService1")
public class ZlService1 implements Zl {

	public ZlService1(){
		System.out.println("ZlService1 construct");
	}

	@PostConstruct
	public void init(){
		System.out.println("ZlService1 postConstruct");
	}
}
