package com.java.jt.web.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class GoodsInfo implements Serializable {

    private static final long serialVersionUID = -4456522784552430920L;

    @ApiModelProperty(value = "商品id")
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