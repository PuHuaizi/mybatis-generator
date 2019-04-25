/**
 * 
 */
package com.huatek.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huatek.model.User;
import com.huatek.service.UserService;

/**
 * @author puxiongxiong
 * @date 2019年4月22日 
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String toIndex(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt((request.getParameter("id")));
		User user = this.userService.selectByPrimaryKey(userId);

		model.addAttribute("name", user.getName());
		model.addAttribute("loginName", user.getLoginName());
		model.addAttribute("lastName", user.getLastLoginName());

		return "showUser";
	}
}
