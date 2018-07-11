package com.gvt.sas.backend.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 个人积分
 * @author Administrator
 *
 */
@Data
public class Integral implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 积分PK
	 */
	private String integralpk;
	
	/**
	 * 会员号（手机号）
	 */
	private String  phone;
	
	
	/**
	 * 微信id
	 */
	private String weChatID;
	
	/**
	 * 支付宝id
	 */
	private String ailID;
	
	/**
	 * 积分
	 */
	private Integer integral;
	
	
	/**
	 * 包裹数
	 */
	public Integer packageNum;
	

	public int count; 

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWeChatID() {
		return weChatID;
	}

	public void setWeChatID(String weChatID) {
		this.weChatID = weChatID;
	}

	public String getAilID() {
		return ailID;
	}

	public void setAilID(String ailID) {
		this.ailID = ailID;
	}


	public Integer getPackageNum() {
		return packageNum;
	}

	public void setPackageNum(Integer packageNum) {
		this.packageNum = packageNum;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public String getIntegralpk() {
		return integralpk;
	}

	public void setIntegralpk(String integralpk) {
		this.integralpk = integralpk;
	}

	/** 
	 * 获取count 
	 * @return count count 
	 */
	public int getCount() {
		return count;
	}

	/** 
	 * 设置count 
	 * @param count count 
	 */
	public void setCount(int count) {
		this.count = count;
	}

}
