package com.java.jt.service.server;

import com.java.jt.service.mapper.GoodsInfoMapper;
import com.java.jt.service.model.GoodsInfo;
import com.java.jt.service.model.GoodsInfoExample;
import com.java.jt.service.utils.ExcelUtil;
import com.java.jt.service.utils.SendEmail2;
import com.java.jt.service.utils.SendMailContant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;

/**
 * Created by jt on 2019/10/25 10:13
 */
@Service
public class GoodService {
    @Autowired
    private GoodsInfoMapper goodsInfoMapper;

    @Autowired
    private SendEmail2 sendEmail2;


    public GoodsInfo show(@RequestParam(value = "goodsId") Long goodsId) {
        GoodsInfo goodsInfo = goodsInfoMapper.selectByPrimaryKey(goodsId);
        goodsInfo.setGoodsName("第一个Service");
        if (null != goodsInfo) {
            return goodsInfo;
        }
        return null;
    }

    public List<GoodsInfo> getGoods() {
        List<GoodsInfo> goodsInfos = goodsInfoMapper.selectByExample(new GoodsInfoExample());
        if (null != goodsInfos) {
            return goodsInfos;
        }
        return null;
    }

    public void createExcel() {
        String filePath = "C:/Users/jt/Desktop/jt-test.xlsx";
        List<GoodsInfo> goodsInfos = goodsInfoMapper.selectByExample(new GoodsInfoExample());
        List<List<Object>> data = new ArrayList<>();
        if (null != goodsInfos) {
            goodsInfos.forEach(goodsInfo -> {
                data.add(Arrays.asList(goodsInfo.getGoodsId(),
                        goodsInfo.getGoodsName(),
                        goodsInfo.getGoodsPrice(),
                        goodsInfo.getGoodsStock(),
                        goodsInfo.getGoodsSales()));
            });
            List<String> head = Arrays.asList("商品ID", "商品名称", "商品价格", "商品库存", "商品销量");
            ExcelUtil.writeBySimple(filePath, data, head);
        }
    }

    @Async
    public Future<String> sendMail(@RequestParam(value = "toEmailAddr") String toEmailAddr) throws Exception {
        long startTime = new Date().getTime();

        String suject = "jt-test";
        String content = "jt-test";
        String filePath = SendMailContant.FILEPATH;
        String sendMail = sendEmail2.sendMail(toEmailAddr, suject, content, filePath);

        long endTime = new Date().getTime();
        long sumTime = endTime - startTime;

        return new AsyncResult<>(sendMail + "耗时" + sumTime + "毫秒。");
    }

}
