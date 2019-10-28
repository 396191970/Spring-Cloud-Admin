package com.tuobuxie.partner.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.tuobuxie.partner.biz.ShopGroupBiz;
import com.tuobuxie.partner.entity.ShopGroup;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("shopGroup")
public class ShopGroupController extends BaseController<ShopGroupBiz,ShopGroup> {

}