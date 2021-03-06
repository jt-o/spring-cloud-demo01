package com.java.jt.service.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIsNull() {
            addCriterion("goods_title is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIsNotNull() {
            addCriterion("goods_title is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleEqualTo(String value) {
            addCriterion("goods_title =", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotEqualTo(String value) {
            addCriterion("goods_title <>", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleGreaterThan(String value) {
            addCriterion("goods_title >", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("goods_title >=", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLessThan(String value) {
            addCriterion("goods_title <", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLessThanOrEqualTo(String value) {
            addCriterion("goods_title <=", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleLike(String value) {
            addCriterion("goods_title like", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotLike(String value) {
            addCriterion("goods_title not like", value, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleIn(List<String> values) {
            addCriterion("goods_title in", values, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotIn(List<String> values) {
            addCriterion("goods_title not in", values, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleBetween(String value1, String value2) {
            addCriterion("goods_title between", value1, value2, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsTitleNotBetween(String value1, String value2) {
            addCriterion("goods_title not between", value1, value2, "goodsTitle");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNull() {
            addCriterion("goods_img is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIsNotNull() {
            addCriterion("goods_img is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImgEqualTo(String value) {
            addCriterion("goods_img =", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotEqualTo(String value) {
            addCriterion("goods_img <>", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThan(String value) {
            addCriterion("goods_img >", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgGreaterThanOrEqualTo(String value) {
            addCriterion("goods_img >=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThan(String value) {
            addCriterion("goods_img <", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLessThanOrEqualTo(String value) {
            addCriterion("goods_img <=", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgLike(String value) {
            addCriterion("goods_img like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotLike(String value) {
            addCriterion("goods_img not like", value, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgIn(List<String> values) {
            addCriterion("goods_img in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotIn(List<String> values) {
            addCriterion("goods_img not in", values, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgBetween(String value1, String value2) {
            addCriterion("goods_img between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsImgNotBetween(String value1, String value2) {
            addCriterion("goods_img not between", value1, value2, "goodsImg");
            return (Criteria) this;
        }

        public Criteria andGoodsKindIsNull() {
            addCriterion("goods_kind is null");
            return (Criteria) this;
        }

        public Criteria andGoodsKindIsNotNull() {
            addCriterion("goods_kind is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsKindEqualTo(Integer value) {
            addCriterion("goods_kind =", value, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindNotEqualTo(Integer value) {
            addCriterion("goods_kind <>", value, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindGreaterThan(Integer value) {
            addCriterion("goods_kind >", value, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_kind >=", value, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindLessThan(Integer value) {
            addCriterion("goods_kind <", value, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindLessThanOrEqualTo(Integer value) {
            addCriterion("goods_kind <=", value, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindIn(List<Integer> values) {
            addCriterion("goods_kind in", values, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindNotIn(List<Integer> values) {
            addCriterion("goods_kind not in", values, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindBetween(Integer value1, Integer value2) {
            addCriterion("goods_kind between", value1, value2, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsKindNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_kind not between", value1, value2, "goodsKind");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(Double value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(Double value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(Double value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(Double value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(Double value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<Double> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<Double> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(Double value1, Double value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(Double value1, Double value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsStockIsNull() {
            addCriterion("goods_stock is null");
            return (Criteria) this;
        }

        public Criteria andGoodsStockIsNotNull() {
            addCriterion("goods_stock is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsStockEqualTo(Integer value) {
            addCriterion("goods_stock =", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockNotEqualTo(Integer value) {
            addCriterion("goods_stock <>", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockGreaterThan(Integer value) {
            addCriterion("goods_stock >", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_stock >=", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockLessThan(Integer value) {
            addCriterion("goods_stock <", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockLessThanOrEqualTo(Integer value) {
            addCriterion("goods_stock <=", value, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockIn(List<Integer> values) {
            addCriterion("goods_stock in", values, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockNotIn(List<Integer> values) {
            addCriterion("goods_stock not in", values, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockBetween(Integer value1, Integer value2) {
            addCriterion("goods_stock between", value1, value2, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsStockNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_stock not between", value1, value2, "goodsStock");
            return (Criteria) this;
        }

        public Criteria andGoodsPraiseIsNull() {
            addCriterion("goods_praise is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPraiseIsNotNull() {
            addCriterion("goods_praise is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPraiseEqualTo(Double value) {
            addCriterion("goods_praise =", value, "goodsPraise");
            return (Criteria) this;
        }

        public Criteria andGoodsPraiseNotEqualTo(Double value) {
            addCriterion("goods_praise <>", value, "goodsPraise");
            return (Criteria) this;
        }

        public Criteria andGoodsPraiseGreaterThan(Double value) {
            addCriterion("goods_praise >", value, "goodsPraise");
            return (Criteria) this;
        }

        public Criteria andGoodsPraiseGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_praise >=", value, "goodsPraise");
            return (Criteria) this;
        }

        public Criteria andGoodsPraiseLessThan(Double value) {
            addCriterion("goods_praise <", value, "goodsPraise");
            return (Criteria) this;
        }

        public Criteria andGoodsPraiseLessThanOrEqualTo(Double value) {
            addCriterion("goods_praise <=", value, "goodsPraise");
            return (Criteria) this;
        }

        public Criteria andGoodsPraiseIn(List<Double> values) {
            addCriterion("goods_praise in", values, "goodsPraise");
            return (Criteria) this;
        }

        public Criteria andGoodsPraiseNotIn(List<Double> values) {
            addCriterion("goods_praise not in", values, "goodsPraise");
            return (Criteria) this;
        }

        public Criteria andGoodsPraiseBetween(Double value1, Double value2) {
            addCriterion("goods_praise between", value1, value2, "goodsPraise");
            return (Criteria) this;
        }

        public Criteria andGoodsPraiseNotBetween(Double value1, Double value2) {
            addCriterion("goods_praise not between", value1, value2, "goodsPraise");
            return (Criteria) this;
        }

        public Criteria andGoodsIsSeckillIsNull() {
            addCriterion("goods_is_seckill is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsSeckillIsNotNull() {
            addCriterion("goods_is_seckill is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsSeckillEqualTo(String value) {
            addCriterion("goods_is_seckill =", value, "goodsIsSeckill");
            return (Criteria) this;
        }

        public Criteria andGoodsIsSeckillNotEqualTo(String value) {
            addCriterion("goods_is_seckill <>", value, "goodsIsSeckill");
            return (Criteria) this;
        }

        public Criteria andGoodsIsSeckillGreaterThan(String value) {
            addCriterion("goods_is_seckill >", value, "goodsIsSeckill");
            return (Criteria) this;
        }

        public Criteria andGoodsIsSeckillGreaterThanOrEqualTo(String value) {
            addCriterion("goods_is_seckill >=", value, "goodsIsSeckill");
            return (Criteria) this;
        }

        public Criteria andGoodsIsSeckillLessThan(String value) {
            addCriterion("goods_is_seckill <", value, "goodsIsSeckill");
            return (Criteria) this;
        }

        public Criteria andGoodsIsSeckillLessThanOrEqualTo(String value) {
            addCriterion("goods_is_seckill <=", value, "goodsIsSeckill");
            return (Criteria) this;
        }

        public Criteria andGoodsIsSeckillLike(String value) {
            addCriterion("goods_is_seckill like", value, "goodsIsSeckill");
            return (Criteria) this;
        }

        public Criteria andGoodsIsSeckillNotLike(String value) {
            addCriterion("goods_is_seckill not like", value, "goodsIsSeckill");
            return (Criteria) this;
        }

        public Criteria andGoodsIsSeckillIn(List<String> values) {
            addCriterion("goods_is_seckill in", values, "goodsIsSeckill");
            return (Criteria) this;
        }

        public Criteria andGoodsIsSeckillNotIn(List<String> values) {
            addCriterion("goods_is_seckill not in", values, "goodsIsSeckill");
            return (Criteria) this;
        }

        public Criteria andGoodsIsSeckillBetween(String value1, String value2) {
            addCriterion("goods_is_seckill between", value1, value2, "goodsIsSeckill");
            return (Criteria) this;
        }

        public Criteria andGoodsIsSeckillNotBetween(String value1, String value2) {
            addCriterion("goods_is_seckill not between", value1, value2, "goodsIsSeckill");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIsNull() {
            addCriterion("goods_sales is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIsNotNull() {
            addCriterion("goods_sales is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesEqualTo(Integer value) {
            addCriterion("goods_sales =", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotEqualTo(Integer value) {
            addCriterion("goods_sales <>", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesGreaterThan(Integer value) {
            addCriterion("goods_sales >", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_sales >=", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesLessThan(Integer value) {
            addCriterion("goods_sales <", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesLessThanOrEqualTo(Integer value) {
            addCriterion("goods_sales <=", value, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesIn(List<Integer> values) {
            addCriterion("goods_sales in", values, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotIn(List<Integer> values) {
            addCriterion("goods_sales not in", values, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesBetween(Integer value1, Integer value2) {
            addCriterion("goods_sales between", value1, value2, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsSalesNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_sales not between", value1, value2, "goodsSales");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeIsNull() {
            addCriterion("goods_up_time is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeIsNotNull() {
            addCriterion("goods_up_time is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeEqualTo(Date value) {
            addCriterion("goods_up_time =", value, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeNotEqualTo(Date value) {
            addCriterion("goods_up_time <>", value, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeGreaterThan(Date value) {
            addCriterion("goods_up_time >", value, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("goods_up_time >=", value, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeLessThan(Date value) {
            addCriterion("goods_up_time <", value, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("goods_up_time <=", value, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeIn(List<Date> values) {
            addCriterion("goods_up_time in", values, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeNotIn(List<Date> values) {
            addCriterion("goods_up_time not in", values, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeBetween(Date value1, Date value2) {
            addCriterion("goods_up_time between", value1, value2, "goodsUpTime");
            return (Criteria) this;
        }

        public Criteria andGoodsUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("goods_up_time not between", value1, value2, "goodsUpTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}