package com.soecode.lyf.web;

import com.soecode.lyf.entity.MenuDetail;
import com.soecode.lyf.service.MenuDetailService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/menudetail") // url:/模块/资源/{id}/细分 /seckill/list
public class MenuDetailController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private MenuDetailService menudetailService;

	@RequestMapping(value = "/queryMenuDetailAll", method = RequestMethod.GET)
	@ResponseBody
	private List<MenuDetail> list() {
		List<MenuDetail> list = menudetailService.queryMenuDetailAll();
		return list;
	}

	@RequestMapping(value = "/queryMdByMsId", method = RequestMethod.POST)
	@ResponseBody
	private List<MenuDetail> queryMdByMsId(@Param("msId") long msId) {
		List<MenuDetail> menudetail = menudetailService.queryMdByMsId(msId);
		return menudetail;
	}

	@RequestMapping(value = "/addMenuDetail", method = RequestMethod.POST)
	@ResponseBody
	private String addMenuDetail(@RequestParam("msId") long msId, @RequestParam("mdName") String mdName,@RequestParam("mdNowprice") String mdNowprice,
								 @RequestParam("mdPreprice") String mdPreprice, @RequestParam("mdDescribe") String mdDescribe,
								 @RequestParam("mdMonthsale") String mdMonthsale,@RequestParam("mdPraise") String mdPraise,@RequestParam("mdImg") String mdImg) {

		Integer addList = menudetailService.addMenuDetail(msId, mdName,mdImg, mdNowprice,
				mdPreprice, mdDescribe, mdMonthsale, mdPraise);
		System.out.print("--------------------------------");
		System.out.print(mdPraise);
		return Integer.toString(addList);
	}

	@RequestMapping(value = "/updateMenuDetail", method = RequestMethod.GET)
	@ResponseBody
	private String updateMenuDetail(@Param("msId") long msId, @Param("mdName") String mdName,
									@Param("mdImg") String mdImg, @Param("mdNowprice") String mdNowprice,
									@Param("mdPreprice") String mdPreprice, @Param("mdDescribe") String mdDescribe,
									@Param("mdMonthsale") String mdMonthsale,@Param("mdPraise") String mdPraise) {
		Integer updateMenuDetail = menudetailService.updateMenuDetail(msId, mdName, mdImg, mdNowprice,
				mdPreprice, mdDescribe, mdMonthsale, mdPraise);
		return updateMenuDetail.toString();
	}
}
