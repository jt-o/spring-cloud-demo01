package com.java.jt.service.controller;

import com.java.jt.service.model.GoodsInfo;
import com.java.jt.service.server.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.Future;

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

    @GetMapping(value = "/showAll")
    public List<GoodsInfo> showAll() {
        return goodService.getGoods();
    }

    @GetMapping(value = "/createExcel")
    public void createExcel() {
        goodService.createExcel();
    }

    @GetMapping(value = "/sendMail")
    public String sendMail(@RequestParam(value = "toEmailAddr") String toEmailAddr) throws Exception {
        Future<String> future = goodService.sendMail(toEmailAddr);
        boolean b = true;
        while (b) {
            if (future.isDone()) {
                b = false;
                System.out.println(future.get());
                return future.get();
            }
        }
        return "还没执行完";
    }

}
