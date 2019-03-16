package com.soecode.lyf.service;

import com.soecode.lyf.entity.OrderDetail;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface OrderDetailService {

	/**
	 * 查询所有
	 * @return
	 */
	List<OrderDetail> queryOrderDetailAll(int userid);

	List<OrderDetail> queryUserOrderDetail(int sellerid, int order_status);

}
