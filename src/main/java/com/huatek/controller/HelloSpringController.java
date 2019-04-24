package com.huatek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author puxiongxiong
 * @date 2019年4月19日
 */
@Controller
public class HelloSpringController {
	String message = "Welcome to Spring MVC!";

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "Spring") String name) {

//		指定视图
		ModelAndView mv = new ModelAndView("hellospring");
//		向视图中添加所要的展示或使用的内容，将在页面中使用
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
}
