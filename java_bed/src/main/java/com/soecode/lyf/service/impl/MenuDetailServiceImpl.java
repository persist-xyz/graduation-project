package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.MenuDetailDao;
import com.soecode.lyf.entity.MenuDetail;
import com.soecode.lyf.service.MenuDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuDetailServiceImpl implements MenuDetailService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private MenuDetailDao menudetailDao;

	@Override
	public List<MenuDetail> queryMenuDetailAll() {
		 List<MenuDetail> list=menudetailDao.queryMenuDetailAll();
		return list;
	}

	@Override
	public List<MenuDetail> queryMdByMsId(long msId) {
		return menudetailDao.queryMdByMsId(msId);
	}

	@Override
	public Integer addMenuDetail(long msId, String mdName, String mdImg,String mdNowprice,
								 String mdPreprice, String mdDescribe,String mdMonthsale,String mdPraise) {
		return menudetailDao.addMenuDetail(msId, mdName, mdImg, mdNowprice,
				 mdPreprice, mdDescribe, mdMonthsale, mdPraise);
	}

	@Override
	public Integer updateMenuDetail(long msId, String mdName, String mdImg,String mdNowprice,
									String mdPreprice, String mdDescribe,String mdMonthsale,String mdPraise) {
		return menudetailDao.updateMenuDetail(msId, mdName, mdImg, mdNowprice,
				mdPreprice, mdDescribe, mdMonthsale, mdPraise);
	}
}
