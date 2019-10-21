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
@Table(name = "product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //产品名称
    @Column(name = "name")
    private String name;
	
	    //描述
    @Column(name = "description")
    private String description;
	
	    //图片	
    @Column(name = "image_url")
    private String imageUrl;
	
	    //单价
    @Column(name = "price")
    private Integer price;
	
	    //分销等级
    @Column(name = "distribution_level")
    private Integer distributionLevel;
	
	    //
    @Column(name = "create_time")
    private Date createTime;
	

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
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：产品名称
	 */
	public String getName() {
		return name;
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
	 * 设置：图片	
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	/**
	 * 获取：图片	
	 */
	public String getImageUrl() {
		return imageUrl;
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
	 * 设置：分销等级
	 */
	public void setDistributionLevel(Integer distributionLevel) {
		this.distributionLevel = distributionLevel;
	}
	/**
	 * 获取：分销等级
	 */
	public Integer getDistributionLevel() {
		return distributionLevel;
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
}
