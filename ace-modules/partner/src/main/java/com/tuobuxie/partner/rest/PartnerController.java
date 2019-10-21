package com.tuobuxie.partner.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.tuobuxie.partner.biz.PartnerBiz;
import com.tuobuxie.partner.entity.Partner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("partner")
public class PartnerController extends BaseController<PartnerBiz,Partner> {

}