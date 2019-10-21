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
	
	    //
    @Column(name = "trade_time")
    private Date tradeTime;
	
	    //订单号
    @Column(name = "order_id")
    private Integer orderId;
	

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
	 * 设置：
	 */
	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}
	/**
	 * 获取：
	 */
	public Date getTradeTime() {
		return tradeTime;
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
}
