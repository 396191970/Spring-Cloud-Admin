package com.tuobuxie.partner.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.tuobuxie.partner.biz.DistributionPackageBiz;
import com.tuobuxie.partner.entity.DistributionPackage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("distributionPackage")
public class DistributionPackageController extends BaseController<DistributionPackageBiz,DistributionPackage> {

}