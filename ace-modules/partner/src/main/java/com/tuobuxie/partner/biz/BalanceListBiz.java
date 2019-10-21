package com.tuobuxie.partner.biz;

import com.tuobuxie.partner.entity.IncomeList;
import org.springframework.stereotype.Service;

import com.tuobuxie.partner.entity.BalanceList;
import com.tuobuxie.partner.mapper.BalanceListMapper;
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
public class BalanceListBiz extends BaseBiz<BalanceListMapper,BalanceList> {


    @Override
    public void insert(BalanceList entity) {
        Date date = new Date();
        entity.setTradeTime(date);
        super.insert(entity);
    }
}