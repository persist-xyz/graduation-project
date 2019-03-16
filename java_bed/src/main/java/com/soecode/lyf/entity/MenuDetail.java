package com.soecode.lyf.entity;

/**
 * 实体
 */
public class MenuDetail {

	private long mdId;
	private long msId;

	private String mdName;

	private String mdImg;
	private String mdNowprice;
	private String mdPreprice;
	private String mdDecribe;
	private String mdMonthsale;
	private String mdPraise;

	public long getMdId() {
		return mdId;
	}

	public void setMdId(long mdId) {
		this.mdId = mdId;
	}

	public long getMsId() {
		return msId;
	}

	public void setMsId(long msId) {
		this.msId = msId;
	}

	public String getMdName() {
		return mdName;
	}

	public void setMdName(String mdName) {
		this.mdName = mdName;
	}

	public String getMdImg() {
		return mdImg;
	}

	public void setMdImg(String mdImg) {
		this.mdImg = mdImg;
	}

	public String getMdNowprice() {
		return mdNowprice;
	}

	public void setMdNowprice(String mdNowprice) {
		this.mdNowprice = mdNowprice;
	}

	public String getMdPreprice() {
		return mdPreprice;
	}

	public void setMdPreprice(String mdPreprice) {
		this.mdPreprice = mdPreprice;
	}

	public String getMdDecribe() {
		return mdDecribe;
	}

	public void setMdDecribe(String mdDecribe) {
		this.mdDecribe = mdDecribe;
	}

	public String getMdMonthsale() {
		return mdMonthsale;
	}

	public void setMdMonthsale(String mdMonthsale) {
		this.mdMonthsale = mdMonthsale;
	}

	public String getMdPraise() {
		return mdPraise;
	}

	public void setMdPraise(String mdPraise) {
		this.mdPraise = mdPraise;
	}

	@Override
	public String toString() {
		return "MenuDetail{}";
	}
}
