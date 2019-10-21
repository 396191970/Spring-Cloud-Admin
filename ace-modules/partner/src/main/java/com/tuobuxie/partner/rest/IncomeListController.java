package com.tuobuxie.partner.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.tuobuxie.partner.biz.IncomeListBiz;
import com.tuobuxie.partner.entity.IncomeList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("incomeList")
public class IncomeListController extends BaseController<IncomeListBiz,IncomeList> {

}