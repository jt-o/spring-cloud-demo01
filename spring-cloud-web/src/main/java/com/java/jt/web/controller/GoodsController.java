package com.java.jt.web.controller;

import com.java.jt.web.dto.GoodsInfo;
import com.java.jt.web.feign.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jt on 2019/10/25 10:47
 */
@Api(tags = "商品")
@RestController
@RequestMapping(value = "/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @ApiOperation(value = "商品展示")
    @GetMapping(value = "/show")
    public GoodsInfo show(@RequestParam(value = "goodsId") Long goodsId) {
        return goodsService.show(goodsId);
    }
}
