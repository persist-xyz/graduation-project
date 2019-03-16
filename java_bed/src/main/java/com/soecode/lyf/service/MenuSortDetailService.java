package com.soecode.lyf.service;

import com.soecode.lyf.entity.MenuSortDetail;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface MenuSortDetailService {

	/**
	 * 查询
	 * @return
	 */
	List<MenuSortDetail> queryMenuSortDetail(long userid);

	
}
