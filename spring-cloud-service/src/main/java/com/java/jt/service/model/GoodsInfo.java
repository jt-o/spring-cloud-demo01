package com.java.jt.service.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class GoodsInfo implements Serializable {

    private static final long serialVersionUID = 994351673175874683L;

    private Long goodsId;

    private String goodsName;

    private String goodsTitle;

    private String goodsImg;

    private Integer goodsKind;

    private Double goodsPrice;

    private Integer goodsStock;

    private Double goodsPraise;

    private String goodsIsSeckill;

    private Integer goodsSales;

    private Date goodsUpTime;

}