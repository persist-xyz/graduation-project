package com.soecode.lyf.service;

import com.soecode.lyf.entity.MenuSort;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface MenuSortService {

	/**
	 * 查询所有
	 * @return
	 */
	List<MenuSort> queryMenuSortAll(long sellerId);

	/**
	 * 增加
	 * @return
	 */
	Integer addMenuSort(long sellerId ,String msName);

	/**
	 * 更新
	 * @return
	 */
	Integer updateMenuSort(long sellerId ,String msName);

}
