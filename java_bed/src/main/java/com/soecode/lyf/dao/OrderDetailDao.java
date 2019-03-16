package com.soecode.lyf.dao;

import com.soecode.lyf.entity.OrderDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDetailDao {

	/**
	 * 查询
	 * @return
	 */

	List<OrderDetail> queryOrderDetailAll(@Param("userid") int userid );

	List<OrderDetail> queryUserOrderDetail(@Param("sellerid") int sellerid ,@Param("order_status") int order_status);

	
}
