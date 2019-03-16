package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.OrderDao;
import com.soecode.lyf.entity.Order;
import com.soecode.lyf.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private OrderDao orderDao;

	@Override
	public List<Order> queryOrderAll(int  userid ,int order_status) {
		return orderDao.queryOrderAll(userid ,order_status);
	}

	@Override
	public Integer addOrder(int userid, String username ,int sellerid, String mdids, String usersellername, String useravatar) {
		// TODO 添加事务 transaction
		String[] _mdids = mdids.split("_");
		String order_create_time = Long.toString( new Date().getTime());
		String order_number= Integer.toString(sellerid) + Integer.toString(userid) + order_create_time;
		for(int i=0;i<_mdids.length;i++){
			String[] _mdid=_mdids[i].split("-");
			Integer order_single_number=Integer.parseInt(_mdid[1]);
			Integer mdid=Integer.parseInt(_mdid[0]);
			orderDao.addOrder( userid, username, sellerid, mdid, order_create_time, order_number, order_single_number,usersellername,useravatar);
		}
		return 1;
	}

	@Override
	public Integer updateOrderStatus(int userid, int sellerid, String order_number,int order_status) {
		return orderDao.updateOrderStatus(userid, sellerid, order_number, order_status);
	}

}
