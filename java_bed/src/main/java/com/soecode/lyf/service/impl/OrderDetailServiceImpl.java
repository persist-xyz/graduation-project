package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.OrderDetailDao;
import com.soecode.lyf.entity.OrderDetail;
import com.soecode.lyf.service.OrderDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private OrderDetailDao orderDetailDao;

	@Override
	public List<OrderDetail> queryOrderDetailAll(int userid) {
		return orderDetailDao.queryOrderDetailAll(userid);
	}

	@Override
	public List<OrderDetail> queryUserOrderDetail(int sellerid, int order_status) {
		return orderDetailDao.queryUserOrderDetail(sellerid, order_status);
	}
}
