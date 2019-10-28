package com.tuobuxie.partner.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Shaofeng Li
 * @email 396191970@qq.com
 * @date 2019-10-27 22:33:04
 */
@Table(name = "balance_list")
public class BalanceList implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //业务类型
    @Column(name = "business_type")
    private String businessType;
	
	    //变更金额
    @Column(name = "change_amount")
    private Integer changeAmount;
	
	    //变更前余额
    @Column(name = "before_balance")
    private Integer beforeBalance;
	
	    //变更后余额
    @Column(name = "after_balance")
    private Integer afterBalance;
	
	    //备注
    @Column(name = "description")
    private String description;
	
	    //订单号
    @Column(name = "order_id")
    private Integer orderId;
	
	    //更新时间
    @Column(name = "upd_time")
    private Date updTime;
	
	    //更新用户id
    @Column(name = "upd_user")
    private String updUser;
	
	    //更新用户名
    @Column(name = "upd_name")
    private String updName;
	
	    //更新ip
    @Column(name = "upd_host")
    private String updHost;
	
	    //创建时间
    @Column(name = "crt_time")
    private Date crtTime;
	
	    //创建用户id
    @Column(name = "crt_user")
    private String crtUser;
	
	    //创建用户名
    @Column(name = "crt_name")
    private String crtName;
	
	    //创建ip
    @Column(name = "crt_host")
    private String crtHost;
	
	    //用户姓名
    @Column(name = "user_name")
    private String userName;
	
	    //用户id
    @Column(name = "user_id")
    private Integer userId;
	

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
	 * 设置：业务类型
	 */
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	/**
	 * 获取：业务类型
	 */
	public String getBusinessType() {
		return businessType;
	}
	/**
	 * 设置：变更金额
	 */
	public void setChangeAmount(Integer changeAmount) {
		this.changeAmount = changeAmount;
	}
	/**
	 * 获取：变更金额
	 */
	public Integer getChangeAmount() {
		return changeAmount;
	}
	/**
	 * 设置：变更前余额
	 */
	public void setBeforeBalance(Integer beforeBalance) {
		this.beforeBalance = beforeBalance;
	}
	/**
	 * 获取：变更前余额
	 */
	public Integer getBeforeBalance() {
		return beforeBalance;
	}
	/**
	 * 设置：变更后余额
	 */
	public void setAfterBalance(Integer afterBalance) {
		this.afterBalance = afterBalance;
	}
	/**
	 * 获取：变更后余额
	 */
	public Integer getAfterBalance() {
		return afterBalance;
	}
	/**
	 * 设置：备注
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：备注
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：订单号
	 */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：订单号
	 */
	public Integer getOrderId() {
		return orderId;
	}
	/**
	 * 设置：更新时间
	 */
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getUpdTime() {
		return updTime;
	}
	/**
	 * 设置：更新用户id
	 */
	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}
	/**
	 * 获取：更新用户id
	 */
	public String getUpdUser() {
		return updUser;
	}
	/**
	 * 设置：更新用户名
	 */
	public void setUpdName(String updName) {
		this.updName = updName;
	}
	/**
	 * 获取：更新用户名
	 */
	public String getUpdName() {
		return updName;
	}
	/**
	 * 设置：更新ip
	 */
	public void setUpdHost(String updHost) {
		this.updHost = updHost;
	}
	/**
	 * 获取：更新ip
	 */
	public String getUpdHost() {
		return updHost;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCrtTime() {
		return crtTime;
	}
	/**
	 * 设置：创建用户id
	 */
	public void setCrtUser(String crtUser) {
		this.crtUser = crtUser;
	}
	/**
	 * 获取：创建用户id
	 */
	public String getCrtUser() {
		return crtUser;
	}
	/**
	 * 设置：创建用户名
	 */
	public void setCrtName(String crtName) {
		this.crtName = crtName;
	}
	/**
	 * 获取：创建用户名
	 */
	public String getCrtName() {
		return crtName;
	}
	/**
	 * 设置：创建ip
	 */
	public void setCrtHost(String crtHost) {
		this.crtHost = crtHost;
	}
	/**
	 * 获取：创建ip
	 */
	public String getCrtHost() {
		return crtHost;
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
}
