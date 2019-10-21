package com.tuobuxie.partner.rest;

import com.github.wxiaoqi.security.common.rest.BaseController;
import com.tuobuxie.partner.biz.ProductBiz;
import com.tuobuxie.partner.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("product")
public class ProductController extends BaseController<ProductBiz,Product> {

}