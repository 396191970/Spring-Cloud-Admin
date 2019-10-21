package com.tuobuxie.partner.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.tuobuxie.partner.biz.ShopRelBiz;
import com.tuobuxie.partner.entity.ShopRel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("shopRel")
public class ShopRelController extends BaseController<ShopRelBiz,ShopRel> {

}