package com.tuobuxie.partner.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.tuobuxie.partner.biz.ShopGroupBiz;
import com.tuobuxie.partner.entity.ShopGroup;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author Shaofeng Li
 */
@Controller
@RequestMapping("shopGroup")
@Api("集团模块")

public class ShopGroupController extends BaseController<ShopGroupBiz, ShopGroup> {


}
