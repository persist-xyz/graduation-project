package com.soecode.lyf.dao;

import com.soecode.lyf.entity.MenuDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuDetailDao {

	/**
	 * 查询所有
	 * @param
	 * @return
	 */
	List<MenuDetail> queryMenuDetailAll();

	/**
	 * @param msId
	 * @return
	 */
	List<MenuDetail> queryMdByMsId(@Param("msId") long msId);

	/**
	 * @param mdName
	 * @return
	 */
	Integer addMenuDetail( @Param("msId") long msId, @Param("mdName") String mdName,
						   @Param("mdImg") String mdImg, @Param("mdNowprice") String mdNowprice,
						   @Param("mdPreprice") String mdPreprice, @Param("mdDescribe") String mdDescribe,
						   @Param("mdMonthsale") String mdMonthsale,@Param("mdPraise") String mdPraise);

	/**
	 * @param mdName
	 * @return
	 */
	Integer updateMenuDetail(@Param("msId") long msId, @Param("mdName") String mdName,
							 @Param("mdImg") String mdImg, @Param("mdNowprice") String mdNowprice,
							 @Param("mdPreprice") String mdPreprice, @Param("mdDescribe") String mdDescribe,
							 @Param("mdMonthsale") String mdMonthsale,@Param("mdPraise") String mdPraise);

}
