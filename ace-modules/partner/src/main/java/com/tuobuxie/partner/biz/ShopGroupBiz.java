package com.tuobuxie.partner.biz;

import com.github.wxiaoqi.security.common.biz.BaseBiz;
import com.tuobuxie.partner.entity.Shop;
import com.tuobuxie.partner.entity.ShopGroup;
import com.tuobuxie.partner.mapper.ShopGroupMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author Shaofeng Li
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ShopGroupBiz extends BaseBiz<ShopGroupMapper, ShopGroup> {
    @Override
    public void insert(ShopGroup entity) {
        Date date = new Date();
        entity.setCreateTime(date);
        super.insert(entity);
    }
}
