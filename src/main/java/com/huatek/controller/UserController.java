/**
 * 
 */
package com.huatek.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huatek.model.User;
import com.huatek.service.UserService;

/**
 * @author puxiongxiong
 * @date 2019年4月22日 
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;

	public String toIndex(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt((request.getParameter("id")));
		User user = this.userService.selectByPrimaryKey(userId);
		model.addAttribute(user.getName());
		return "showUser";
	}
}
