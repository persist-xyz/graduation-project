package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.UserDao;
import com.soecode.lyf.entity.User;
import com.soecode.lyf.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> queryUserAll() {
		return userDao.queryUserAll();
	}

	@Override
	public List<User> queryUserById(String userid) {
		return userDao.queryUserById(userid);
	}

	@Override
	public User getByName(String username,String userpwd,String usertype) {
		return userDao.queryByName(username,userpwd,usertype);
	}

	@Override
	public Integer addUser(String username, String userpwd, String usertel, String useradr, String usertype, String usersellername) {
		return userDao.addUser(username,userpwd,usertel,useradr,usertype,usersellername);
	}

	@Override
	public Integer updateUser(String username, String usertel, String useradr, String usertype, String usersellername,String usersendpay,String userdistributionpay,String useravatar) {
		return userDao.updateUser(username, usertel,useradr,usertype,usersellername, usersendpay, userdistributionpay, useravatar);
	}

	@Override
	public Integer updateUserPwd(String username,String userpwd) {
		return userDao.updateUserPwd(username,userpwd);
	}
	@Override
	public Integer updateUserTel(String username,String usertel) {
		return userDao.updateUserTel(username, usertel);
	}
	@Override
	public Integer updateUserAdr(String username, String useradr,String usertel) {
		return userDao.updateUserAdr(username,useradr,usertel);
	}
}
