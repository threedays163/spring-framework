package com.luban.service;

import org.springframework.stereotype.Component;

@Component
public class UserService {

	public UserService(){
		print();
	}

	public void print(){
		System.out.println("print userService");
	}
}
