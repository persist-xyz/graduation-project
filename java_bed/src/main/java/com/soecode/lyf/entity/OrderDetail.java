package com.soecode.lyf.entity;

import java.util.List;

/**
 * 实体
 */
public class OrderDetail {

	private int userId;
	private String userName;
	private int sellerId;
	private int mdId;
	private int orderStatus;
	private int orderSingleNumber;
	private String orderNumber;
	private String mdName;
	private String mdNowprice;

	private String userSellername;
	private String userAvatar;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public int getMdId() {
		return mdId;
	}

	public void setMdId(int mdId) {
		this.mdId = mdId;
	}

	public int getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getOrderSingleNumber() {
		return orderSingleNumber;
	}

	public void setOrderSingleNumber(int orderSingleNumber) {
		this.orderSingleNumber = orderSingleNumber;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getMdName() {
		return mdName;
	}

	public void setMdName(String mdName) {
		this.mdName = mdName;
	}

	public String getMdNowprice() {
		return mdNowprice;
	}

	public void setMdNowprice(String mdNowprice) {
		this.mdNowprice = mdNowprice;
	}

	public String getUserSellername() {
		return userSellername;
	}

	public void setUserSellername(String userSellername) {
		this.userSellername = userSellername;
	}

	public String getUserAvatar() {
		return userAvatar;
	}

	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}

	@Override
	public String toString() {
		return "OrderDetail{}";
	}

	public OrderDetail() {
	}
}
