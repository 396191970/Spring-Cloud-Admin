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
@Table(name = "distribution_user")
public class DistributionUser implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //
    @Id
    private Integer id;
	
	    //用户名称
    @Column(name = "user_name")
    private String userName;
	
	    //用户id
    @Column(name = "user_id")
    private Integer userId;
	
	    //推广码
    @Column(name = "code")
    private String code;
	

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
	 * 设置：用户名称
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * 获取：用户名称
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
	/**
	 * 设置：推广码
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：推广码
	 */
	public String getCode() {
		return code;
	}
}
