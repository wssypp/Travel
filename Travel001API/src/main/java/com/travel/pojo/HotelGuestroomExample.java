package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class HotelGuestroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelGuestroomExample() {
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

        public Criteria andHotelGuestroomIdIsNull() {
            addCriterion("hotel_guestroom_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIdIsNotNull() {
            addCriterion("hotel_guestroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIdEqualTo(Integer value) {
            addCriterion("hotel_guestroom_id =", value, "hotelGuestroomId");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIdNotEqualTo(Integer value) {
            addCriterion("hotel_guestroom_id <>", value, "hotelGuestroomId");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIdGreaterThan(Integer value) {
            addCriterion("hotel_guestroom_id >", value, "hotelGuestroomId");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_guestroom_id >=", value, "hotelGuestroomId");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIdLessThan(Integer value) {
            addCriterion("hotel_guestroom_id <", value, "hotelGuestroomId");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_guestroom_id <=", value, "hotelGuestroomId");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIdIn(List<Integer> values) {
            addCriterion("hotel_guestroom_id in", values, "hotelGuestroomId");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIdNotIn(List<Integer> values) {
            addCriterion("hotel_guestroom_id not in", values, "hotelGuestroomId");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_guestroom_id between", value1, value2, "hotelGuestroomId");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_guestroom_id not between", value1, value2, "hotelGuestroomId");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomNameIsNull() {
            addCriterion("hotel_guestroom_name is null");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomNameIsNotNull() {
            addCriterion("hotel_guestroom_name is not null");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomNameEqualTo(String value) {
            addCriterion("hotel_guestroom_name =", value, "hotelGuestroomName");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomNameNotEqualTo(String value) {
            addCriterion("hotel_guestroom_name <>", value, "hotelGuestroomName");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomNameGreaterThan(String value) {
            addCriterion("hotel_guestroom_name >", value, "hotelGuestroomName");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomNameGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_guestroom_name >=", value, "hotelGuestroomName");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomNameLessThan(String value) {
            addCriterion("hotel_guestroom_name <", value, "hotelGuestroomName");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomNameLessThanOrEqualTo(String value) {
            addCriterion("hotel_guestroom_name <=", value, "hotelGuestroomName");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomNameLike(String value) {
            addCriterion("hotel_guestroom_name like", value, "hotelGuestroomName");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomNameNotLike(String value) {
            addCriterion("hotel_guestroom_name not like", value, "hotelGuestroomName");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomNameIn(List<String> values) {
            addCriterion("hotel_guestroom_name in", values, "hotelGuestroomName");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomNameNotIn(List<String> values) {
            addCriterion("hotel_guestroom_name not in", values, "hotelGuestroomName");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomNameBetween(String value1, String value2) {
            addCriterion("hotel_guestroom_name between", value1, value2, "hotelGuestroomName");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomNameNotBetween(String value1, String value2) {
            addCriterion("hotel_guestroom_name not between", value1, value2, "hotelGuestroomName");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomStatusIsNull() {
            addCriterion("hotel_guestroom_status is null");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomStatusIsNotNull() {
            addCriterion("hotel_guestroom_status is not null");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomStatusEqualTo(String value) {
            addCriterion("hotel_guestroom_status =", value, "hotelGuestroomStatus");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomStatusNotEqualTo(String value) {
            addCriterion("hotel_guestroom_status <>", value, "hotelGuestroomStatus");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomStatusGreaterThan(String value) {
            addCriterion("hotel_guestroom_status >", value, "hotelGuestroomStatus");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomStatusGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_guestroom_status >=", value, "hotelGuestroomStatus");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomStatusLessThan(String value) {
            addCriterion("hotel_guestroom_status <", value, "hotelGuestroomStatus");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomStatusLessThanOrEqualTo(String value) {
            addCriterion("hotel_guestroom_status <=", value, "hotelGuestroomStatus");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomStatusLike(String value) {
            addCriterion("hotel_guestroom_status like", value, "hotelGuestroomStatus");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomStatusNotLike(String value) {
            addCriterion("hotel_guestroom_status not like", value, "hotelGuestroomStatus");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomStatusIn(List<String> values) {
            addCriterion("hotel_guestroom_status in", values, "hotelGuestroomStatus");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomStatusNotIn(List<String> values) {
            addCriterion("hotel_guestroom_status not in", values, "hotelGuestroomStatus");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomStatusBetween(String value1, String value2) {
            addCriterion("hotel_guestroom_status between", value1, value2, "hotelGuestroomStatus");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomStatusNotBetween(String value1, String value2) {
            addCriterion("hotel_guestroom_status not between", value1, value2, "hotelGuestroomStatus");
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

        public Criteria andHotelGuestroomPriceIsNull() {
            addCriterion("hotel_guestroom_price is null");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomPriceIsNotNull() {
            addCriterion("hotel_guestroom_price is not null");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomPriceEqualTo(Double value) {
            addCriterion("hotel_guestroom_price =", value, "hotelGuestroomPrice");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomPriceNotEqualTo(Double value) {
            addCriterion("hotel_guestroom_price <>", value, "hotelGuestroomPrice");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomPriceGreaterThan(Double value) {
            addCriterion("hotel_guestroom_price >", value, "hotelGuestroomPrice");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("hotel_guestroom_price >=", value, "hotelGuestroomPrice");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomPriceLessThan(Double value) {
            addCriterion("hotel_guestroom_price <", value, "hotelGuestroomPrice");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomPriceLessThanOrEqualTo(Double value) {
            addCriterion("hotel_guestroom_price <=", value, "hotelGuestroomPrice");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomPriceIn(List<Double> values) {
            addCriterion("hotel_guestroom_price in", values, "hotelGuestroomPrice");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomPriceNotIn(List<Double> values) {
            addCriterion("hotel_guestroom_price not in", values, "hotelGuestroomPrice");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomPriceBetween(Double value1, Double value2) {
            addCriterion("hotel_guestroom_price between", value1, value2, "hotelGuestroomPrice");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomPriceNotBetween(Double value1, Double value2) {
            addCriterion("hotel_guestroom_price not between", value1, value2, "hotelGuestroomPrice");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomDescrIsNull() {
            addCriterion("hotel_guestroom_descr is null");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomDescrIsNotNull() {
            addCriterion("hotel_guestroom_descr is not null");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomDescrEqualTo(String value) {
            addCriterion("hotel_guestroom_descr =", value, "hotelGuestroomDescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomDescrNotEqualTo(String value) {
            addCriterion("hotel_guestroom_descr <>", value, "hotelGuestroomDescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomDescrGreaterThan(String value) {
            addCriterion("hotel_guestroom_descr >", value, "hotelGuestroomDescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomDescrGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_guestroom_descr >=", value, "hotelGuestroomDescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomDescrLessThan(String value) {
            addCriterion("hotel_guestroom_descr <", value, "hotelGuestroomDescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomDescrLessThanOrEqualTo(String value) {
            addCriterion("hotel_guestroom_descr <=", value, "hotelGuestroomDescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomDescrLike(String value) {
            addCriterion("hotel_guestroom_descr like", value, "hotelGuestroomDescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomDescrNotLike(String value) {
            addCriterion("hotel_guestroom_descr not like", value, "hotelGuestroomDescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomDescrIn(List<String> values) {
            addCriterion("hotel_guestroom_descr in", values, "hotelGuestroomDescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomDescrNotIn(List<String> values) {
            addCriterion("hotel_guestroom_descr not in", values, "hotelGuestroomDescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomDescrBetween(String value1, String value2) {
            addCriterion("hotel_guestroom_descr between", value1, value2, "hotelGuestroomDescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomDescrNotBetween(String value1, String value2) {
            addCriterion("hotel_guestroom_descr not between", value1, value2, "hotelGuestroomDescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIntdescrIsNull() {
            addCriterion("hotel_guestroom_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIntdescrIsNotNull() {
            addCriterion("hotel_guestroom_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIntdescrEqualTo(Integer value) {
            addCriterion("hotel_guestroom_intdescr =", value, "hotelGuestroomIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIntdescrNotEqualTo(Integer value) {
            addCriterion("hotel_guestroom_intdescr <>", value, "hotelGuestroomIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIntdescrGreaterThan(Integer value) {
            addCriterion("hotel_guestroom_intdescr >", value, "hotelGuestroomIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_guestroom_intdescr >=", value, "hotelGuestroomIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIntdescrLessThan(Integer value) {
            addCriterion("hotel_guestroom_intdescr <", value, "hotelGuestroomIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_guestroom_intdescr <=", value, "hotelGuestroomIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIntdescrIn(List<Integer> values) {
            addCriterion("hotel_guestroom_intdescr in", values, "hotelGuestroomIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIntdescrNotIn(List<Integer> values) {
            addCriterion("hotel_guestroom_intdescr not in", values, "hotelGuestroomIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("hotel_guestroom_intdescr between", value1, value2, "hotelGuestroomIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_guestroom_intdescr not between", value1, value2, "hotelGuestroomIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomVardescrIsNull() {
            addCriterion("hotel_guestroom_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomVardescrIsNotNull() {
            addCriterion("hotel_guestroom_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomVardescrEqualTo(String value) {
            addCriterion("hotel_guestroom_vardescr =", value, "hotelGuestroomVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomVardescrNotEqualTo(String value) {
            addCriterion("hotel_guestroom_vardescr <>", value, "hotelGuestroomVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomVardescrGreaterThan(String value) {
            addCriterion("hotel_guestroom_vardescr >", value, "hotelGuestroomVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_guestroom_vardescr >=", value, "hotelGuestroomVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomVardescrLessThan(String value) {
            addCriterion("hotel_guestroom_vardescr <", value, "hotelGuestroomVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomVardescrLessThanOrEqualTo(String value) {
            addCriterion("hotel_guestroom_vardescr <=", value, "hotelGuestroomVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomVardescrLike(String value) {
            addCriterion("hotel_guestroom_vardescr like", value, "hotelGuestroomVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomVardescrNotLike(String value) {
            addCriterion("hotel_guestroom_vardescr not like", value, "hotelGuestroomVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomVardescrIn(List<String> values) {
            addCriterion("hotel_guestroom_vardescr in", values, "hotelGuestroomVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomVardescrNotIn(List<String> values) {
            addCriterion("hotel_guestroom_vardescr not in", values, "hotelGuestroomVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomVardescrBetween(String value1, String value2) {
            addCriterion("hotel_guestroom_vardescr between", value1, value2, "hotelGuestroomVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelGuestroomVardescrNotBetween(String value1, String value2) {
            addCriterion("hotel_guestroom_vardescr not between", value1, value2, "hotelGuestroomVardescr");
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