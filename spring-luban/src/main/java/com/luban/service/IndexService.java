package com.luban.service;

import com.luban.annoation.MyAnnotation;

import java.lang.reflect.Field;

public class IndexService {

	@MyAnnotation
	UserService userService;

	public void aaaa(){
		userService.print();
	}

	/**
	 * 自定义注解处理示例
	 * @param args
	 */
	public static void main(String[] args) {
		IndexService indexService=new IndexService();

		Class<IndexService> indexServiceClass=IndexService.class;

		try {
			Field field =indexServiceClass.getDeclaredField("userService");
			if(field.getDeclaredAnnotation(MyAnnotation.class)!=null){
				field.setAccessible(true);
				field.set(indexService, new UserService());
			}
			indexService.aaaa();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
