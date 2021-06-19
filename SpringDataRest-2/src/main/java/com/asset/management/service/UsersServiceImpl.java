package com.asset.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asset.management.dao.UsersDao;
import com.asset.management.entity.Users;
@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersDao usersDao;
	public UsersServiceImpl() {
		
	}

	@Override
	public List<Users> getUser() {
		return usersDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Users getUsers(long usersId) {
		return usersDao.getOne(usersId);
	}

	@Override
	public Users addUsers(Users users) {
		usersDao.save(users);
		return users;
	}

	@Override
	public Users updateUsers(Users users) {
		usersDao.save(users);
		return users;
	}

	@Override
	public void deleteUsers(long parseLong) {
		@SuppressWarnings("deprecation")
		Users entity=usersDao.getOne(parseLong);
		usersDao.delete(entity);
		
	}

}
