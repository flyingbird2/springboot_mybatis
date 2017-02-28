package com.qhf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qhf.dao.UserMapper;
import com.qhf.entity.User;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	public Object findOne(String id) {
		User u = userMapper.findOneById(Integer.parseInt(id));
		return u;
	}

	@Transactional
	public void insert() {

		User u = new User();
		u.setName("333");
		userMapper.insert(u);
		//int i = 1 / 0; 可以测试事务是否起作用
		userMapper.insert(u);

	}
}
