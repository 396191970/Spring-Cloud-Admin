package com.tuobuxie.partner.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.tuobuxie.partner.biz.PayListBiz;
import com.tuobuxie.partner.entity.PayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("payList")
public class PayListController extends BaseController<PayListBiz,PayList> {

}