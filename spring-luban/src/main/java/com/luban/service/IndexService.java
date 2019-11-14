package com.luban.service;

import com.luban.dto.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @DepensOn 表示IndexService的初始化要在UserService之后
 */
@Component
@DependsOn("userService")
public class IndexService {

	@Autowired
	A a;

	public IndexService(){
		System.out.println("indexService init");
	}

	@Autowired
	Services service1;

	public void printA(){
		a.print();
	}


}
