package com.tuobuxie.partner.biz;

import com.tuobuxie.partner.entity.Product;
import org.springframework.stereotype.Service;

import com.tuobuxie.partner.entity.Shop;
import com.tuobuxie.partner.mapper.ShopMapper;
import com.github.wxiaoqi.security.common.biz.BaseBiz;

import java.util.Date;

/**
 * 
 *
 * @author Shaofeng Li
 * @email 396191970@qq.com
 * @date 2019-10-19 16:33:03
 */
@Service
public class ShopBiz extends BaseBiz<ShopMapper,Shop> {

    @Override
    public void insert(Shop entity) {
        Date date = new Date();
        entity.setCreateTime(date);
        super.insert(entity);
    }
}