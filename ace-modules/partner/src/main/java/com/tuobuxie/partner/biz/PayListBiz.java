package com.tuobuxie.partner.biz;

import com.tuobuxie.partner.entity.Partner;
import org.springframework.stereotype.Service;

import com.tuobuxie.partner.entity.PayList;
import com.tuobuxie.partner.mapper.PayListMapper;
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
public class PayListBiz extends BaseBiz<PayListMapper,PayList> {

    @Override
    public void insert(PayList entity) {
        Date date = new Date();
        entity.setCreateTime(date);
        entity.setTradeTime(date);
        super.insert(entity);
    }
}