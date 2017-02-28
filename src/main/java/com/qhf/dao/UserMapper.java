package com.qhf.dao;

import com.qhf.entity.User;

public interface UserMapper {

	com.qhf.entity.User findOneById(int id);

	void insert(User u);

}
