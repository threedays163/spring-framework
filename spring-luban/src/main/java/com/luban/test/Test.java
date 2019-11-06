package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.service.LubanService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.security.auth.login.AppConfigurationEntry;

public class Test {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath:spring.xml");

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
		context.getBean(LubanService.class).xx();

		context.close();
	}
}
