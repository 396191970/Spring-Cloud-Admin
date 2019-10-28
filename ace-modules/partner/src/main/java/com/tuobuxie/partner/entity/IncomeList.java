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
	
	    //是否分销 0 没有 1有
    @Column(name = "is_distribution")
    private Integer isDistribution;
	
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
	
	    //店铺id
    @Column(name = "shop_id")
    private Integer shopId;
	
	    //店铺名称
    @Column(name = "shop_name")
    private String shopName;
	

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
	 * 设置：店铺id
	 */
	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}
	/**
	 * 获取：店铺id
	 */
	public Integer getShopId() {
		return shopId;
	}
	/**
	 * 设置：店铺名称
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * 获取：店铺名称
	 */
	public String getShopName() {
		return shopName;
	}
}
