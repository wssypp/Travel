package com.travel.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelOrderExample() {
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

        public Criteria andHotelOrderIdIsNull() {
            addCriterion("hotel_order_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelOrderIdIsNotNull() {
            addCriterion("hotel_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelOrderIdEqualTo(Integer value) {
            addCriterion("hotel_order_id =", value, "hotelOrderId");
            return (Criteria) this;
        }

        public Criteria andHotelOrderIdNotEqualTo(Integer value) {
            addCriterion("hotel_order_id <>", value, "hotelOrderId");
            return (Criteria) this;
        }

        public Criteria andHotelOrderIdGreaterThan(Integer value) {
            addCriterion("hotel_order_id >", value, "hotelOrderId");
            return (Criteria) this;
        }

        public Criteria andHotelOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_order_id >=", value, "hotelOrderId");
            return (Criteria) this;
        }

        public Criteria andHotelOrderIdLessThan(Integer value) {
            addCriterion("hotel_order_id <", value, "hotelOrderId");
            return (Criteria) this;
        }

        public Criteria andHotelOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_order_id <=", value, "hotelOrderId");
            return (Criteria) this;
        }

        public Criteria andHotelOrderIdIn(List<Integer> values) {
            addCriterion("hotel_order_id in", values, "hotelOrderId");
            return (Criteria) this;
        }

        public Criteria andHotelOrderIdNotIn(List<Integer> values) {
            addCriterion("hotel_order_id not in", values, "hotelOrderId");
            return (Criteria) this;
        }

        public Criteria andHotelOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_order_id between", value1, value2, "hotelOrderId");
            return (Criteria) this;
        }

        public Criteria andHotelOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_order_id not between", value1, value2, "hotelOrderId");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTimeIsNull() {
            addCriterion("hotel_order_time is null");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTimeIsNotNull() {
            addCriterion("hotel_order_time is not null");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTimeEqualTo(Date value) {
            addCriterion("hotel_order_time =", value, "hotelOrderTime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTimeNotEqualTo(Date value) {
            addCriterion("hotel_order_time <>", value, "hotelOrderTime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTimeGreaterThan(Date value) {
            addCriterion("hotel_order_time >", value, "hotelOrderTime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hotel_order_time >=", value, "hotelOrderTime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTimeLessThan(Date value) {
            addCriterion("hotel_order_time <", value, "hotelOrderTime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("hotel_order_time <=", value, "hotelOrderTime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTimeIn(List<Date> values) {
            addCriterion("hotel_order_time in", values, "hotelOrderTime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTimeNotIn(List<Date> values) {
            addCriterion("hotel_order_time not in", values, "hotelOrderTime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTimeBetween(Date value1, Date value2) {
            addCriterion("hotel_order_time between", value1, value2, "hotelOrderTime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("hotel_order_time not between", value1, value2, "hotelOrderTime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderChecktimeIsNull() {
            addCriterion("hotel_order_checktime is null");
            return (Criteria) this;
        }

        public Criteria andHotelOrderChecktimeIsNotNull() {
            addCriterion("hotel_order_checktime is not null");
            return (Criteria) this;
        }

        public Criteria andHotelOrderChecktimeEqualTo(Date value) {
            addCriterion("hotel_order_checktime =", value, "hotelOrderChecktime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderChecktimeNotEqualTo(Date value) {
            addCriterion("hotel_order_checktime <>", value, "hotelOrderChecktime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderChecktimeGreaterThan(Date value) {
            addCriterion("hotel_order_checktime >", value, "hotelOrderChecktime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hotel_order_checktime >=", value, "hotelOrderChecktime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderChecktimeLessThan(Date value) {
            addCriterion("hotel_order_checktime <", value, "hotelOrderChecktime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("hotel_order_checktime <=", value, "hotelOrderChecktime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderChecktimeIn(List<Date> values) {
            addCriterion("hotel_order_checktime in", values, "hotelOrderChecktime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderChecktimeNotIn(List<Date> values) {
            addCriterion("hotel_order_checktime not in", values, "hotelOrderChecktime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderChecktimeBetween(Date value1, Date value2) {
            addCriterion("hotel_order_checktime between", value1, value2, "hotelOrderChecktime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("hotel_order_checktime not between", value1, value2, "hotelOrderChecktime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderLeavetimeIsNull() {
            addCriterion("hotel_order_leavetime is null");
            return (Criteria) this;
        }

        public Criteria andHotelOrderLeavetimeIsNotNull() {
            addCriterion("hotel_order_leavetime is not null");
            return (Criteria) this;
        }

        public Criteria andHotelOrderLeavetimeEqualTo(Date value) {
            addCriterion("hotel_order_leavetime =", value, "hotelOrderLeavetime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderLeavetimeNotEqualTo(Date value) {
            addCriterion("hotel_order_leavetime <>", value, "hotelOrderLeavetime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderLeavetimeGreaterThan(Date value) {
            addCriterion("hotel_order_leavetime >", value, "hotelOrderLeavetime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderLeavetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hotel_order_leavetime >=", value, "hotelOrderLeavetime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderLeavetimeLessThan(Date value) {
            addCriterion("hotel_order_leavetime <", value, "hotelOrderLeavetime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderLeavetimeLessThanOrEqualTo(Date value) {
            addCriterion("hotel_order_leavetime <=", value, "hotelOrderLeavetime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderLeavetimeIn(List<Date> values) {
            addCriterion("hotel_order_leavetime in", values, "hotelOrderLeavetime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderLeavetimeNotIn(List<Date> values) {
            addCriterion("hotel_order_leavetime not in", values, "hotelOrderLeavetime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderLeavetimeBetween(Date value1, Date value2) {
            addCriterion("hotel_order_leavetime between", value1, value2, "hotelOrderLeavetime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderLeavetimeNotBetween(Date value1, Date value2) {
            addCriterion("hotel_order_leavetime not between", value1, value2, "hotelOrderLeavetime");
            return (Criteria) this;
        }

        public Criteria andHotelOrderNumberIsNull() {
            addCriterion("hotel_order_number is null");
            return (Criteria) this;
        }

        public Criteria andHotelOrderNumberIsNotNull() {
            addCriterion("hotel_order_number is not null");
            return (Criteria) this;
        }

        public Criteria andHotelOrderNumberEqualTo(Integer value) {
            addCriterion("hotel_order_number =", value, "hotelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andHotelOrderNumberNotEqualTo(Integer value) {
            addCriterion("hotel_order_number <>", value, "hotelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andHotelOrderNumberGreaterThan(Integer value) {
            addCriterion("hotel_order_number >", value, "hotelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andHotelOrderNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_order_number >=", value, "hotelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andHotelOrderNumberLessThan(Integer value) {
            addCriterion("hotel_order_number <", value, "hotelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andHotelOrderNumberLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_order_number <=", value, "hotelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andHotelOrderNumberIn(List<Integer> values) {
            addCriterion("hotel_order_number in", values, "hotelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andHotelOrderNumberNotIn(List<Integer> values) {
            addCriterion("hotel_order_number not in", values, "hotelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andHotelOrderNumberBetween(Integer value1, Integer value2) {
            addCriterion("hotel_order_number between", value1, value2, "hotelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andHotelOrderNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_order_number not between", value1, value2, "hotelOrderNumber");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNull() {
            addCriterion("users_id is null");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNotNull() {
            addCriterion("users_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIdEqualTo(Integer value) {
            addCriterion("users_id =", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotEqualTo(Integer value) {
            addCriterion("users_id <>", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThan(Integer value) {
            addCriterion("users_id >", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("users_id >=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThan(Integer value) {
            addCriterion("users_id <", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThanOrEqualTo(Integer value) {
            addCriterion("users_id <=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIn(List<Integer> values) {
            addCriterion("users_id in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotIn(List<Integer> values) {
            addCriterion("users_id not in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdBetween(Integer value1, Integer value2) {
            addCriterion("users_id between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("users_id not between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNull() {
            addCriterion("hotel_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNotNull() {
            addCriterion("hotel_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelIdEqualTo(Integer value) {
            addCriterion("hotel_id =", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotEqualTo(Integer value) {
            addCriterion("hotel_id <>", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThan(Integer value) {
            addCriterion("hotel_id >", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_id >=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThan(Integer value) {
            addCriterion("hotel_id <", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_id <=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIn(List<Integer> values) {
            addCriterion("hotel_id in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotIn(List<Integer> values) {
            addCriterion("hotel_id not in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id not between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTotalpriceIsNull() {
            addCriterion("hotel_order_totalprice is null");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTotalpriceIsNotNull() {
            addCriterion("hotel_order_totalprice is not null");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTotalpriceEqualTo(Double value) {
            addCriterion("hotel_order_totalprice =", value, "hotelOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTotalpriceNotEqualTo(Double value) {
            addCriterion("hotel_order_totalprice <>", value, "hotelOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTotalpriceGreaterThan(Double value) {
            addCriterion("hotel_order_totalprice >", value, "hotelOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTotalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("hotel_order_totalprice >=", value, "hotelOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTotalpriceLessThan(Double value) {
            addCriterion("hotel_order_totalprice <", value, "hotelOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTotalpriceLessThanOrEqualTo(Double value) {
            addCriterion("hotel_order_totalprice <=", value, "hotelOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTotalpriceIn(List<Double> values) {
            addCriterion("hotel_order_totalprice in", values, "hotelOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTotalpriceNotIn(List<Double> values) {
            addCriterion("hotel_order_totalprice not in", values, "hotelOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTotalpriceBetween(Double value1, Double value2) {
            addCriterion("hotel_order_totalprice between", value1, value2, "hotelOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andHotelOrderTotalpriceNotBetween(Double value1, Double value2) {
            addCriterion("hotel_order_totalprice not between", value1, value2, "hotelOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrIsNull() {
            addCriterion("scenic_comment_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrIsNotNull() {
            addCriterion("scenic_comment_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrEqualTo(Integer value) {
            addCriterion("scenic_comment_intdescr =", value, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrNotEqualTo(Integer value) {
            addCriterion("scenic_comment_intdescr <>", value, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrGreaterThan(Integer value) {
            addCriterion("scenic_comment_intdescr >", value, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_comment_intdescr >=", value, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrLessThan(Integer value) {
            addCriterion("scenic_comment_intdescr <", value, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_comment_intdescr <=", value, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrIn(List<Integer> values) {
            addCriterion("scenic_comment_intdescr in", values, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrNotIn(List<Integer> values) {
            addCriterion("scenic_comment_intdescr not in", values, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("scenic_comment_intdescr between", value1, value2, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_comment_intdescr not between", value1, value2, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrIsNull() {
            addCriterion("scenic_comment_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrIsNotNull() {
            addCriterion("scenic_comment_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrEqualTo(String value) {
            addCriterion("scenic_comment_vardescr =", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrNotEqualTo(String value) {
            addCriterion("scenic_comment_vardescr <>", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrGreaterThan(String value) {
            addCriterion("scenic_comment_vardescr >", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_comment_vardescr >=", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrLessThan(String value) {
            addCriterion("scenic_comment_vardescr <", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrLessThanOrEqualTo(String value) {
            addCriterion("scenic_comment_vardescr <=", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrLike(String value) {
            addCriterion("scenic_comment_vardescr like", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrNotLike(String value) {
            addCriterion("scenic_comment_vardescr not like", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrIn(List<String> values) {
            addCriterion("scenic_comment_vardescr in", values, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrNotIn(List<String> values) {
            addCriterion("scenic_comment_vardescr not in", values, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrBetween(String value1, String value2) {
            addCriterion("scenic_comment_vardescr between", value1, value2, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrNotBetween(String value1, String value2) {
            addCriterion("scenic_comment_vardescr not between", value1, value2, "scenicCommentVardescr");
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