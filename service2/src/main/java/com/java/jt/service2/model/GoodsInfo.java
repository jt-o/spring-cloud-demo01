package com.java.jt.service2.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class GoodsInfo implements Serializable {
    private static final long serialVersionUID = -6830785310561381920L;
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