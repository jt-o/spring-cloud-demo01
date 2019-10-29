package com.java.jt.service2.server;

import com.java.jt.service2.mapper.GoodsInfoMapper;
import com.java.jt.service2.model.GoodsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
        goodsInfo.setGoodsName("第二个Service");
        if (null != goodsInfo) {
            return goodsInfo;
        }
        return null;
    }
}
