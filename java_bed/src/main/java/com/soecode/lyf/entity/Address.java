package com.soecode.lyf.entity;

/**
 * 图书实体
 */
public class Address {
	private long receiverAddressId;
	private long userId;
	private String receiverAddressUserName;
	private String receiverAddressUsertel;
	private String receiverAddressUseradr;

	public long getReceiverAddressId() {
		return receiverAddressId;
	}

	public void setReceiverAddressId(long receiverAddressId) {
		this.receiverAddressId = receiverAddressId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getReceiverAddressUserName() {
		return receiverAddressUserName;
	}

	public void setReceiverAddressUserName(String receiverAddressUserName) {
		this.receiverAddressUserName = receiverAddressUserName;
	}

	public String getReceiverAddressUsertel() {
		return receiverAddressUsertel;
	}

	public void setReceiverAddressUsertel(String receiverAddressUsertel) {
		this.receiverAddressUsertel = receiverAddressUsertel;
	}

	public String getReceiverAddressUseradr() {
		return receiverAddressUseradr;
	}

	public void setReceiverAddressUseradr(String receiverAddressUseradr) {
		this.receiverAddressUseradr = receiverAddressUseradr;
	}

	@Override
	public String toString() {
		return "Address{}";
	}

	public Address() {
	}
}
