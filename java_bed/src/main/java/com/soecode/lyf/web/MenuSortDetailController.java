package com.soecode.lyf.web;

import com.soecode.lyf.entity.MenuSortDetail;
import com.soecode.lyf.service.MenuSortDetailService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/menusortdetail") // url:/模块/资源/{id}/细分 /seckill/list
public class MenuSortDetailController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private MenuSortDetailService menuSortDetailService;
	@RequestMapping(value = "/queryMenuSortDetail", method = RequestMethod.POST)
	@ResponseBody
	private List<MenuSortDetail> list(@Param("userid") long userid) {
		List<MenuSortDetail> list= menuSortDetailService.queryMenuSortDetail(userid);
		return list;
	}
}
