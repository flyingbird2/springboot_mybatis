package com.qhf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qhf.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/greeting")
	@ResponseBody
	public Object hello() {
		return "Hello Spring";
	}

	@ResponseBody
	@RequestMapping("/user")
	public Object get(@RequestParam String id) {
		return userService.findOne(id);
	}

	@ResponseBody
	@RequestMapping("/insert")
	public Object testinsert() {
		try {
			userService.insert();
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}
		
	}
}
