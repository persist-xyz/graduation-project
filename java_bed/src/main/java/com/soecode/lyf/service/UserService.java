package com.soecode.lyf.service;

import com.soecode.lyf.entity.User;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface UserService {

	/**
	 * 查询所有
	 * @return
	 */
	List<User> queryUserAll();

	/**
	 * 查询所有
	 * @return
	 */
	List<User> queryUserById(String userid);

	/**
	 * 查询
	 * @param username
	 * @param userpwd
	 * @param usertype
	 * @return
	 */
	User getByName(String username,String userpwd,String usertype);

	/**
	 * 增加
	 * @return
	 */
	Integer addUser(String username, String userpwd, String usertel,String useradr,String usertype,String usersellername);

	/**
	 * 更新
	 * @return
	 */
	Integer updateUser(String username,String usertel,String useradr,String usertype,String usersellername,String usersendpay,String userdistributionpay,String useravatar);

	/**
	 * 更新
	 * @return
	 */
	Integer updateUserPwd(String username, String userpwd);

	/**
	 * 更新
	 * @return
	 */
	Integer updateUserTel(String username, String usertel);

	/**
	 * 更新
	 * @return
	 */
	Integer updateUserAdr(String username, String useradr, String usertel);

}
