package com.java.jt.service.server;

import com.java.jt.service.mapper.GoodsInfoMapper;
import com.java.jt.service.model.GoodsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by jt on 2019/10/25 10:13
 */
@Service
public class GoodService {
    @Autowired
    private GoodsInfoMapper goodsInfoMapper;

    public GoodsInfo show(@RequestParam(value = "goodsId") Long goodsId) {
        GoodsInfo goodsInfo = goodsInfoMapper.selectByPrimaryKey(goodsId);
        goodsInfo.setGoodsName("第一个Service");
        if (null != goodsInfo) {
            return goodsInfo;
        }
        return null;
    }
}
