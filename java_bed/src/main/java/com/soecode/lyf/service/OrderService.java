package com.soecode.lyf.service;

import com.soecode.lyf.entity.Order;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface OrderService {

	/**
	 * 查询所有
	 * @return
	 */
	List<Order> queryOrderAll(int userid ,int order_status);

	/**
	 * 增加
	 * @return
	 */
	Integer addOrder(int userid,String username, int sellerid, String mdids ,String usersellername, String useravatar);

	/**
	 * @param userid
	 * @param sellerid
	 * @param order_number
	 * @param order_status
	 * @return
	 */
	Integer updateOrderStatus(int userid, int sellerid,String order_number,int order_status);


}
