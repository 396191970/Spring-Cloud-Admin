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
@Table(name = "shop_partner_rel")
public class ShopRel implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //店铺id
    @Column(name = "shop_id")
    private Integer shopId;
	
	    //合伙人id
    @Column(name = "partner_id")
    private Integer partnerId;
	
	    //分销比例 万分之几
    @Column(name = "rate")
    private Integer rate;
	

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
	 * 设置：合伙人id
	 */
	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
	}
	/**
	 * 获取：合伙人id
	 */
	public Integer getPartnerId() {
		return partnerId;
	}
	/**
	 * 设置：分销比例 万分之几
	 */
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	/**
	 * 获取：分销比例 万分之几
	 */
	public Integer getRate() {
		return rate;
	}
}
