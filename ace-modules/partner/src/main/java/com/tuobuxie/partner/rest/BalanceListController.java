package com.tuobuxie.partner.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.tuobuxie.partner.biz.BalanceListBiz;
import com.tuobuxie.partner.entity.BalanceList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("balanceList")
public class BalanceListController extends BaseController<BalanceListBiz,BalanceList> {

}