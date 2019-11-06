package com.luban.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author mac
 */
@Component
public class LubanService {

	@Autowired
	ZlService zlService;

	public void xx(){
		System.out.println(zlService);
	}
}
