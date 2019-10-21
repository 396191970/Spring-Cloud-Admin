package com.tuobuxie.partner.biz;

import com.tuobuxie.partner.entity.PayList;
import org.springframework.stereotype.Service;

import com.tuobuxie.partner.entity.Product;
import com.tuobuxie.partner.mapper.ProductMapper;
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
public class ProductBiz extends BaseBiz<ProductMapper,Product> {

    @Override
    public void insert(Product entity) {
        Date date = new Date();
        entity.setCreateTime(date);
        super.insert(entity);
    }
}