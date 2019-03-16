package com.soecode.lyf.dao;

import com.soecode.lyf.entity.MenuSortDetail;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MenuSortDetailDao {

	/**
	 * 查询
	 * @return
	 */
	List<MenuSortDetail> queryMenuSortDetail(@Param("userid") long userid);

}
