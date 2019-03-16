package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.MenuSortDetailDao;
import com.soecode.lyf.entity.MenuSortDetail;
import com.soecode.lyf.service.MenuSortDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuSortDetailServiceImpl implements MenuSortDetailService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private MenuSortDetailDao menuSortDetailDao;

	@Override
	public List<MenuSortDetail> queryMenuSortDetail(long userid) {
		return menuSortDetailDao.queryMenuSortDetail(userid);
	}

	
}
