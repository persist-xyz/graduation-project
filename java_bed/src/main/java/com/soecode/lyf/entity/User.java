package com.soecode.lyf.entity;

/**
 * 图书实体
 */
public class User {

	private long userId;
	private String userName;
	private String userPwd;
	private String userTel;
	private String userAdr;

	private String userType;

	private String userSellerName;
	private String userAvatar;
	private String userMonthSale;
	private String userSendPay;
	private String userDistributionPay;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserAdr() {
		return userAdr;
	}

	public void setUserAdr(String userAdr) {
		this.userAdr = userAdr;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserSellerName() {
		return userSellerName;
	}

	public void setUserSellerName(String userSellerName) {
		this.userSellerName = userSellerName;
	}


	public String getUserAvatar() {
		return userAvatar;
	}

	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}

	public String getUserMonthSale() {
		return userMonthSale;
	}

	public void setUserMonthSale(String userMonthSale) {
		this.userMonthSale = userMonthSale;
	}

	public String getUserSendPay() {
		return userSendPay;
	}

	public void setUserSendPay(String userSendPay) {
		this.userSendPay = userSendPay;
	}

	public String getUserDistributionPay() {
		return userDistributionPay;
	}

	public void setUserDistributionPay(String userDistributionPay) {
		this.userDistributionPay = userDistributionPay;
	}

	public User() {
	}

	@Override
	public String toString() {
		return getUserName();
	}
}
