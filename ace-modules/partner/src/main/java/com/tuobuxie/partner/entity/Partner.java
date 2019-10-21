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
@Table(name = "partner")
public class Partner implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //合伙人姓名
    @Column(name = "name")
    private String name;
	
	    //身份证号
    @Column(name = "id_card")
    private String idCard;
	
	    //合伙人等级
    @Column(name = "level")
    private Integer level;
	
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
	 * 设置：合伙人姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：合伙人姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：身份证号
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	/**
	 * 获取：身份证号
	 */
	public String getIdCard() {
		return idCard;
	}
	/**
	 * 设置：合伙人等级
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}
	/**
	 * 获取：合伙人等级
	 */
	public Integer getLevel() {
		return level;
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
