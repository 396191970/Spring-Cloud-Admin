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
@Table(name = "income_list")
public class IncomeList implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //产品名称
    @Column(name = "product_name")
    private String productName;
	
	    //产品id
    @Column(name = "product_id")
    private Integer productId;
	
	    //描述
    @Column(name = "description")
    private String description;
	
	    //单价
    @Column(name = "price")
    private Integer price;
	
	    //折扣金额
    @Column(name = "discount")
    private Integer discount;
	
	    //数量
    @Column(name = "quantity")
    private Integer quantity;
	
	    //总价
    @Column(name = "total_price")
    private Integer totalPrice;
	
	    //推广人
    @Column(name = "popularize_user_id")
    private Integer popularizeUserId;
	
	    //推广码
    @Column(name = "popularize_code")
    private String popularizeCode;
	
	    //
    @Column(name = "create_time")
    private Date createTime;
	
	    //
    @Column(name = "trade_time")
    private Date tradeTime;
	
	    //是否分销 0 没有 1有
    @Column(name = "is_distribution")
    private Integer isDistribution;
	

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
	 * 设置：产品名称
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * 获取：产品名称
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * 设置：产品id
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	/**
	 * 获取：产品id
	 */
	public Integer getProductId() {
		return productId;
	}
	/**
	 * 设置：描述
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * 获取：描述
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 设置：单价
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	/**
	 * 获取：单价
	 */
	public Integer getPrice() {
		return price;
	}
	/**
	 * 设置：折扣金额
	 */
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	/**
	 * 获取：折扣金额
	 */
	public Integer getDiscount() {
		return discount;
	}
	/**
	 * 设置：数量
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	/**
	 * 获取：数量
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * 设置：总价
	 */
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
	/**
	 * 获取：总价
	 */
	public Integer getTotalPrice() {
		return totalPrice;
	}
	/**
	 * 设置：推广人
	 */
	public void setPopularizeUserId(Integer popularizeUserId) {
		this.popularizeUserId = popularizeUserId;
	}
	/**
	 * 获取：推广人
	 */
	public Integer getPopularizeUserId() {
		return popularizeUserId;
	}
	/**
	 * 设置：推广码
	 */
	public void setPopularizeCode(String popularizeCode) {
		this.popularizeCode = popularizeCode;
	}
	/**
	 * 获取：推广码
	 */
	public String getPopularizeCode() {
		return popularizeCode;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
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
	 * 设置：是否分销 0 没有 1有
	 */
	public void setIsDistribution(Integer isDistribution) {
		this.isDistribution = isDistribution;
	}
	/**
	 * 获取：是否分销 0 没有 1有
	 */
	public Integer getIsDistribution() {
		return isDistribution;
	}
}
