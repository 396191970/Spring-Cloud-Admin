package com.tuobuxie.partner.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.tuobuxie.partner.biz.DistributionUserBiz;
import com.tuobuxie.partner.entity.DistributionUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("distributionUser")
public class DistributionUserController extends BaseController<DistributionUserBiz,DistributionUser> {

}