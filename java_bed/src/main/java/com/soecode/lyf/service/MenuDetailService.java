package com.soecode.lyf.service;

import com.soecode.lyf.entity.MenuDetail;

import java.util.List;

/**
 * 业务接口：站在"使用者"角度设计接口 三个方面：方法定义粒度，参数，返回类型（return 类型/异常）
 */
public interface MenuDetailService {

	/**
	 * 查询所有
	 * @return
	 */
	List<MenuDetail> queryMenuDetailAll();

	/**
	 * 查询
	 * @param msId
	 * @return
	 */
	List<MenuDetail> queryMdByMsId(long msId);

	/**
	 * 增加
	 * @return
	 */
	Integer addMenuDetail(long msId, String mdname, String mdImg,String mdNowprice,
						  String mdPreprice, String mdDescribe,String mdMonthsale,String mdPraise);

	/**
	 * 更新
	 * @return
	 */
	Integer updateMenuDetail(long msId, String mdname, String mdImg,String mdNowprice,
							 String mdPreprice, String mdDescribe,String mdMonthsale,String mdPraise);

}
