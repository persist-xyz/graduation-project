package com.soecode.lyf.dao;

import com.soecode.lyf.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDao {

	/**
	 * 查询
	 * @return
	 */
	List<Order> queryOrderAll(@Param("userid") int userid ,@Param("order_status") int order_status);

	/**
	 * 添加
	 * @param
	 * @return
	 */
	Integer addOrder(@Param("userid") int userid,@Param("username") String username, @Param("sellerid") int sellerid, @Param("mdid") int mdid,
					 @Param("order_create_time") String order_create_time, @Param("order_number") String order_number,
					 @Param("order_single_number") int order_single_number,@Param("usersellername") String usersellername,
					 @Param("useravatar") String useravatar);

	/**
	 * @param userid
	 * @param sellerid
	 * @param order_number
	 * @param order_status
	 * @return
	 */
	Integer updateOrderStatus(@Param("userid") int userid, @Param("sellerid") int sellerid,
							  @Param("order_number") String order_number,@Param("order_status") int order_status);


}
