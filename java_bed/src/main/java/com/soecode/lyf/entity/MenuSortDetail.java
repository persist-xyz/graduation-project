package com.soecode.lyf.entity;

import java.util.List;

/**
 * 实体
 */
public class MenuSortDetail {

	private long msId;
	private long userId;
	private String msName;

	private List<MenuDetail> menuDetail;

	public long getMsId() {
		return msId;
	}

	public void setMsId(long msId) {
		this.msId = msId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getMsName() {
		return msName;
	}

	public void setMsName(String msName) {
		this.msName = msName;
	}

	public List<MenuDetail> getMenuDetail() {
		return menuDetail;
	}

	public void setMenuDetail(List<MenuDetail> menuDetail) {
		this.menuDetail = menuDetail;
	}

	@Override
	public String toString() {
		return "MenuSortDetail{}";
	}
}
