package com.soecode.lyf.entity;

/**
 * 实体
 */
public class MenuSort {

	private long msId;
	private long sellerId;
	private String msName;

	public long getMsId() {
		return msId;
	}

	public void setMsId(long msId) {
		this.msId = msId;
	}

	public long getSellerId() {
		return sellerId;
	}

	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}

	public String getMsName() {
		return msName;
	}

	public void setMsName(String msName) {
		this.msName = msName;
	}

	public MenuSort() {
	}

	@Override
	public String toString() {
		return "MenuSort{}";
	}
}
