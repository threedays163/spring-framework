package com.luban.test;

import com.luban.annoation.MyAnnotation;
import com.luban.service.UserService;

import java.lang.reflect.Field;

public class AnnotationTest {

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
		AnnotationTest annotationTest =new AnnotationTest();

		Class<AnnotationTest> indexServiceClass= AnnotationTest.class;

		try {
			Field field =indexServiceClass.getDeclaredField("userService");
			if(field.getDeclaredAnnotation(MyAnnotation.class)!=null){
				field.setAccessible(true);
				field.set(annotationTest, new UserService());
			}
			annotationTest.aaaa();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
