package com.tuobuxie.partner.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Shaofeng Li
 * @email 396191970@qq.com
 * @date 2019-10-19 16:33:03
 */
@Table(name = "balance")
public class Balance implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //用户姓名
    @Column(name = "user_name")
    private String userName;
	
	    //用户id
    @Column(name = "user_id")
    private Integer userId;
	
	    //可用余额
    @Column(name = "available_balance")
    private Integer availableBalance;
	
	    //冻结余额
    @Column(name = "frozen_balance")
    private Integer frozenBalance;
	
	    //总余额
    @Column(name = "total_balance")
    private Integer totalBalance;
	

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * 设置：可用余额
	 */
	public void setAvailableBalance(Integer availableBalance) {
		this.availableBalance = availableBalance;
	}
	/**
	 * 获取：可用余额
	 */
	public Integer getAvailableBalance() {
		return availableBalance;
	}
	/**
	 * 设置：冻结余额
	 */
	public void setFrozenBalance(Integer frozenBalance) {
		this.frozenBalance = frozenBalance;
	}
	/**
	 * 获取：冻结余额
	 */
	public Integer getFrozenBalance() {
		return frozenBalance;
	}
	/**
	 * 设置：总余额
	 */
	public void setTotalBalance(Integer totalBalance) {
		this.totalBalance = totalBalance;
	}
	/**
	 * 获取：总余额
	 */
	public Integer getTotalBalance() {
		return totalBalance;
	}
}
