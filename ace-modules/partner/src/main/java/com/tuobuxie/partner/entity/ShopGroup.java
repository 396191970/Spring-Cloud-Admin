package com.tuobuxie.partner.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_group")
public class ShopGroup {
    @Id
    private Integer id;

    /**
     * 集团名称
     */
    private String name;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取集团名称
     *
     * @return name - 集团名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置集团名称
     *
     * @param name 集团名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}