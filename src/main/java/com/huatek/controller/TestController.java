/**
 * 
 */
package com.huatek.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author puxiongxiong
 * @date 2019年4月19日 
 */
@Controller
public class TestController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(HttpServletRequest request) {
		System.out.println("Hello World！");

		// 重定向
		// return "redirect:redirect.jsp";

		// 转发
		return "forward:forward.jsp";
	}
}
