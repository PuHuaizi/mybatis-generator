/**
 * 
 */
package com.huatek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author puxiongxiong
 * @date 2019年4月19日 
 */
@Controller
public class Test {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public void name() {
		System.out.println("hello world！");
	}
}
