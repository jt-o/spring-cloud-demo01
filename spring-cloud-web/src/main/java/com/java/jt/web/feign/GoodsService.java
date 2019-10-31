package com.java.jt.web.feign;

import com.java.jt.web.dto.GoodsInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by jt on 2019/10/25 10:49
 */
@FeignClient(name = "kgc-springcloud-service", fallback = GoodsService.GoodsServiceHystrix.class)//这里的name是你想调用服务的name
public interface GoodsService {
    //这里的请求方式是根据你想请求的接口的类型来定义的 这里的value是你想请求接口的uri
    @GetMapping(value = "api/show")
    GoodsInfo show(@RequestParam(value = "goodsId") Long goodsId);

    @GetMapping(value = "api/showAll")
    List<GoodsInfo> showAll();

    @GetMapping(value = "api/createExcel")
    String createExcel();

    @GetMapping(value = "api/sendMail")
    String sendMail(@RequestParam(value = "toEmailAddr") String toEmailAddr);

    @Component
    class GoodsServiceHystrix implements GoodsService {
        @Override
        public GoodsInfo show(Long goodsId) {
            GoodsInfo goodsInfo = new GoodsInfo();
            goodsInfo.setGoodsName("默认商品");
            return goodsInfo;
        }

        @Override
        public List<GoodsInfo> showAll() {
            return null;
        }

        @Override
        public String createExcel() {
            return null;
        }

        @Override
        public String sendMail(String toEmailAddr) {
            return "容错回调";
        }
    }

}
