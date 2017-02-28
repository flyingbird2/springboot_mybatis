package com.qhf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qhf.dao.UserMapper;
import com.qhf.entity.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public Object findOne(String id) {
	User u =	userMapper.findOneById(Integer.parseInt(id));
		return u;
	}

}
