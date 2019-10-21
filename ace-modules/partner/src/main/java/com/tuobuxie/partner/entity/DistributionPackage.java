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
@Table(name = "distribution_package")
public class DistributionPackage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //产品分销等级
    @Column(name = "product_level")
    private Integer productLevel;
	
	    //合伙人等级
    @Column(name = "partner_level")
    private Integer partnerLevel;
	
	    //分销比例
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
	 * 设置：产品分销等级
	 */
	public void setProductLevel(Integer productLevel) {
		this.productLevel = productLevel;
	}
	/**
	 * 获取：产品分销等级
	 */
	public Integer getProductLevel() {
		return productLevel;
	}
	/**
	 * 设置：合伙人等级
	 */
	public void setPartnerLevel(Integer partnerLevel) {
		this.partnerLevel = partnerLevel;
	}
	/**
	 * 获取：合伙人等级
	 */
	public Integer getPartnerLevel() {
		return partnerLevel;
	}
	/**
	 * 设置：分销比例
	 */
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	/**
	 * 获取：分销比例
	 */
	public Integer getRate() {
		return rate;
	}
}
