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
@Table(name = "distribution_package")
public class DistributionPackage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //产品分销类别
    @Column(name = "product_level")
    private Integer productLevel;
	
	    //合伙人等级（用户角色）
    @Column(name = "partner_level")
    private Integer partnerLevel;
	
	    //分销比例
    @Column(name = "rate")
    private Integer rate;
	
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
	 * 设置：产品分销类别
	 */
	public void setProductLevel(Integer productLevel) {
		this.productLevel = productLevel;
	}
	/**
	 * 获取：产品分销类别
	 */
	public Integer getProductLevel() {
		return productLevel;
	}
	/**
	 * 设置：合伙人等级（用户角色）
	 */
	public void setPartnerLevel(Integer partnerLevel) {
		this.partnerLevel = partnerLevel;
	}
	/**
	 * 获取：合伙人等级（用户角色）
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
}
