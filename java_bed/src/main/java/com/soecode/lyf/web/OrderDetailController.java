package com.soecode.lyf.web;

import com.soecode.lyf.entity.OrderDetail;
import com.soecode.lyf.service.OrderDetailService;
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
@RequestMapping("/orderdetail") // url:/模块/资源/{id}/细分 /seckill/list
public class OrderDetailController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private OrderDetailService orderService;

	@RequestMapping(value = "/queryOrderDetailAll", method = RequestMethod.POST)
	@ResponseBody
	private List<OrderDetail> list(@Param("userid") int userid ) {
		List<OrderDetail> list= orderService.queryOrderDetailAll(userid);
		System.out.print("==================" + list);
		return list;
	}

	@RequestMapping(value = "/queryUserOrderDetail", method = RequestMethod.POST)
	@ResponseBody
	private List<OrderDetail> list(@Param("sellerid") int sellerid ,@Param("order_status") int order_status) {
		List<OrderDetail> list= orderService.queryUserOrderDetail(sellerid, order_status);
		return list;
	}

}
