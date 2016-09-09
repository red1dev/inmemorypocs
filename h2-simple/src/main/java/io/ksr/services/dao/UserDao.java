package io.ksr.services.dao;

import java.util.List;

import io.ksr.services.model.User;

public interface UserDao {

	User findByName(String name);
	
	List<User> findAll();

}