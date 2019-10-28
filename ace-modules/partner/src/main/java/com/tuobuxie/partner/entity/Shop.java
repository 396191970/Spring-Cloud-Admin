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
@Table(name = "shop")
public class Shop implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //店铺名称
    @Column(name = "name")
    private String name;
	
	    //店铺地址
    @Column(name = "address")
    private String address;
	
	    //所属集团
    @Column(name = "shop_group_id")
    private Integer shopGroupId;
	
	    //创建时间
    @Column(name = "crt_time")
    private Date crtTime;
	
	    //所属集团
    @Column(name = "shop_group_name")
    private String shopGroupName;
	

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
	 * 设置：店铺名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：店铺名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：店铺地址
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * 获取：店铺地址
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 设置：所属集团
	 */
	public void setShopGroupId(Integer shopGroupId) {
		this.shopGroupId = shopGroupId;
	}
	/**
	 * 获取：所属集团
	 */
	public Integer getShopGroupId() {
		return shopGroupId;
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
	 * 设置：所属集团
	 */
	public void setShopGroupName(String shopGroupName) {
		this.shopGroupName = shopGroupName;
	}
	/**
	 * 获取：所属集团
	 */
	public String getShopGroupName() {
		return shopGroupName;
	}
}
