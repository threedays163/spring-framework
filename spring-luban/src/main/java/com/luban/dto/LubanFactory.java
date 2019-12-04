package com.luban.dto;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class LubanFactory {

	public static Object getMapper(Class clazz){
		Class[] classes=new Class[]{clazz};
		InvocationHandler handler=new LubanInvocationHandler();
		Object o=Proxy.newProxyInstance(LubanFactory.class.getClassLoader(), classes, handler);
		return o;
	}
}
