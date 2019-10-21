package com.tuobuxie.partner.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.tuobuxie.partner.biz.BalanceBiz;
import com.tuobuxie.partner.entity.Balance;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("balance")
public class BalanceController extends BaseController<BalanceBiz,Balance> {

}