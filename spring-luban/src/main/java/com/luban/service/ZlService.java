package com.luban.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("zlService")
public class ZlService implements Zl{

	public ZlService(){
		System.out.println("ZlService construct");
	}

	@PostConstruct
	public void init(){
		System.out.println("ZlService postConstruct");
	}
}