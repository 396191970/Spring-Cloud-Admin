package com.tuobuxie.partner.biz;

import com.tuobuxie.partner.entity.BalanceList;
import org.springframework.stereotype.Service;

import com.tuobuxie.partner.entity.Partner;
import com.tuobuxie.partner.mapper.PartnerMapper;
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
public class PartnerBiz extends BaseBiz<PartnerMapper,Partner> {

    @Override
    public void insert(Partner entity) {
        Date date = new Date();
        entity.setCreateTime(date);
        super.insert(entity);
    }
}