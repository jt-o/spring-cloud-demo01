package com.java.jt.service.controller;

import com.java.jt.service.model.GoodsInfo;
import com.java.jt.service.server.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jt on 2019/10/25 10:44
 */
@RestController
@RequestMapping(value = "/api")
public class GoodController {
    @Autowired
    private GoodService goodService;

    @GetMapping(value = "/show")
    public GoodsInfo show(@RequestParam(value = "goodsId") Long goodsId) {
        return goodService.show(goodsId);
    }
}
