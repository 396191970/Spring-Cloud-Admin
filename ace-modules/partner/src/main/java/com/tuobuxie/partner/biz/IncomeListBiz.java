package com.tuobuxie.partner.biz;

import org.springframework.stereotype.Service;

import com.tuobuxie.partner.entity.IncomeList;
import com.tuobuxie.partner.mapper.IncomeListMapper;
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
public class IncomeListBiz extends BaseBiz<IncomeListMapper,IncomeList> {

    @Override
    public void insert(IncomeList entity) {
        Date date = new Date();
        entity.setCreateTime(date);
        entity.setTradeTime(date);
        super.insert(entity);
    }
}