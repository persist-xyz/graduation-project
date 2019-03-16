package com.soecode.lyf.service.impl;

import com.soecode.lyf.dao.MenuSortDao;
import com.soecode.lyf.entity.MenuSort;
import com.soecode.lyf.service.MenuSortService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuSortServiceImpl implements MenuSortService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	// 注入Service依赖
	@Autowired
	private MenuSortDao menusortDao;

	@Override
	public List<MenuSort> queryMenuSortAll(long sellerId) {
		return menusortDao.queryMenuSortAll(sellerId);
	}

	@Override
	public Integer addMenuSort(long sellerId ,String msName) {
		return menusortDao.addMenuSort(sellerId ,msName);
	}

	@Override
	public Integer updateMenuSort(long sellerId ,String msName) {
		return menusortDao.updateMenuSort(sellerId ,msName);
	}
}
