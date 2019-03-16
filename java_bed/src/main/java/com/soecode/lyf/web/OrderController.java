package com.soecode.lyf.web;

import com.soecode.lyf.entity.Order;
import com.soecode.lyf.service.OrderService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/order") // url:/模块/资源/{id}/细分 /seckill/list
public class OrderController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private OrderService orderService;
	@RequestMapping(value = "/queryOrderAll", method = RequestMethod.GET)
	@ResponseBody
	private List<Order> list(@Param("userid") int userid,@Param("order_status") int order_status) {
		List<Order> list= orderService.queryOrderAll(userid , order_status);
		return list;
	}

	@RequestMapping(value = "/addOrder", method = RequestMethod.POST)
	@ResponseBody
	private String addOrder(@Param("userid") int userid,@Param("username") String username, @Param("sellerid") int sellerid, @Param("mdid") String mdids,@Param("usersellername")String usersellername,@Param("useravatar") String useravatar) {
		Integer addList = orderService.addOrder(userid, username, sellerid, mdids, usersellername, useravatar);
		return Integer.toString(addList);
	}

	@RequestMapping(value = "/updateOrderStatus", method = RequestMethod.POST)
	@ResponseBody
	private String updateOrderStatus(@Param("userid") int userid, @Param("sellerid") int sellerid,
									 @Param("order_number") String order_number,@Param("order_status") int order_status) {
		Integer updateOrderList = orderService.updateOrderStatus(userid, sellerid, order_number, order_status);
		return updateOrderList.toString();
	}
}
