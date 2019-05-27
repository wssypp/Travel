package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class HotelPictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelPictureExample() {
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

        public Criteria andHotelPictureIdIsNull() {
            addCriterion("hotel_picture_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelPictureIdIsNotNull() {
            addCriterion("hotel_picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelPictureIdEqualTo(Integer value) {
            addCriterion("hotel_picture_id =", value, "hotelPictureId");
            return (Criteria) this;
        }

        public Criteria andHotelPictureIdNotEqualTo(Integer value) {
            addCriterion("hotel_picture_id <>", value, "hotelPictureId");
            return (Criteria) this;
        }

        public Criteria andHotelPictureIdGreaterThan(Integer value) {
            addCriterion("hotel_picture_id >", value, "hotelPictureId");
            return (Criteria) this;
        }

        public Criteria andHotelPictureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_picture_id >=", value, "hotelPictureId");
            return (Criteria) this;
        }

        public Criteria andHotelPictureIdLessThan(Integer value) {
            addCriterion("hotel_picture_id <", value, "hotelPictureId");
            return (Criteria) this;
        }

        public Criteria andHotelPictureIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_picture_id <=", value, "hotelPictureId");
            return (Criteria) this;
        }

        public Criteria andHotelPictureIdIn(List<Integer> values) {
            addCriterion("hotel_picture_id in", values, "hotelPictureId");
            return (Criteria) this;
        }

        public Criteria andHotelPictureIdNotIn(List<Integer> values) {
            addCriterion("hotel_picture_id not in", values, "hotelPictureId");
            return (Criteria) this;
        }

        public Criteria andHotelPictureIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_picture_id between", value1, value2, "hotelPictureId");
            return (Criteria) this;
        }

        public Criteria andHotelPictureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_picture_id not between", value1, value2, "hotelPictureId");
            return (Criteria) this;
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

        public Criteria andHotelPicturePathIsNull() {
            addCriterion("hotel_picture_path is null");
            return (Criteria) this;
        }

        public Criteria andHotelPicturePathIsNotNull() {
            addCriterion("hotel_picture_path is not null");
            return (Criteria) this;
        }

        public Criteria andHotelPicturePathEqualTo(String value) {
            addCriterion("hotel_picture_path =", value, "hotelPicturePath");
            return (Criteria) this;
        }

        public Criteria andHotelPicturePathNotEqualTo(String value) {
            addCriterion("hotel_picture_path <>", value, "hotelPicturePath");
            return (Criteria) this;
        }

        public Criteria andHotelPicturePathGreaterThan(String value) {
            addCriterion("hotel_picture_path >", value, "hotelPicturePath");
            return (Criteria) this;
        }

        public Criteria andHotelPicturePathGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_picture_path >=", value, "hotelPicturePath");
            return (Criteria) this;
        }

        public Criteria andHotelPicturePathLessThan(String value) {
            addCriterion("hotel_picture_path <", value, "hotelPicturePath");
            return (Criteria) this;
        }

        public Criteria andHotelPicturePathLessThanOrEqualTo(String value) {
            addCriterion("hotel_picture_path <=", value, "hotelPicturePath");
            return (Criteria) this;
        }

        public Criteria andHotelPicturePathLike(String value) {
            addCriterion("hotel_picture_path like", value, "hotelPicturePath");
            return (Criteria) this;
        }

        public Criteria andHotelPicturePathNotLike(String value) {
            addCriterion("hotel_picture_path not like", value, "hotelPicturePath");
            return (Criteria) this;
        }

        public Criteria andHotelPicturePathIn(List<String> values) {
            addCriterion("hotel_picture_path in", values, "hotelPicturePath");
            return (Criteria) this;
        }

        public Criteria andHotelPicturePathNotIn(List<String> values) {
            addCriterion("hotel_picture_path not in", values, "hotelPicturePath");
            return (Criteria) this;
        }

        public Criteria andHotelPicturePathBetween(String value1, String value2) {
            addCriterion("hotel_picture_path between", value1, value2, "hotelPicturePath");
            return (Criteria) this;
        }

        public Criteria andHotelPicturePathNotBetween(String value1, String value2) {
            addCriterion("hotel_picture_path not between", value1, value2, "hotelPicturePath");
            return (Criteria) this;
        }

        public Criteria andSpotIntdescrIsNull() {
            addCriterion("spot_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andSpotIntdescrIsNotNull() {
            addCriterion("spot_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andSpotIntdescrEqualTo(Integer value) {
            addCriterion("spot_intdescr =", value, "spotIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotIntdescrNotEqualTo(Integer value) {
            addCriterion("spot_intdescr <>", value, "spotIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotIntdescrGreaterThan(Integer value) {
            addCriterion("spot_intdescr >", value, "spotIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("spot_intdescr >=", value, "spotIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotIntdescrLessThan(Integer value) {
            addCriterion("spot_intdescr <", value, "spotIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("spot_intdescr <=", value, "spotIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotIntdescrIn(List<Integer> values) {
            addCriterion("spot_intdescr in", values, "spotIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotIntdescrNotIn(List<Integer> values) {
            addCriterion("spot_intdescr not in", values, "spotIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("spot_intdescr between", value1, value2, "spotIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("spot_intdescr not between", value1, value2, "spotIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotVardescrIsNull() {
            addCriterion("spot_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andSpotVardescrIsNotNull() {
            addCriterion("spot_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andSpotVardescrEqualTo(String value) {
            addCriterion("spot_vardescr =", value, "spotVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotVardescrNotEqualTo(String value) {
            addCriterion("spot_vardescr <>", value, "spotVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotVardescrGreaterThan(String value) {
            addCriterion("spot_vardescr >", value, "spotVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("spot_vardescr >=", value, "spotVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotVardescrLessThan(String value) {
            addCriterion("spot_vardescr <", value, "spotVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotVardescrLessThanOrEqualTo(String value) {
            addCriterion("spot_vardescr <=", value, "spotVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotVardescrLike(String value) {
            addCriterion("spot_vardescr like", value, "spotVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotVardescrNotLike(String value) {
            addCriterion("spot_vardescr not like", value, "spotVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotVardescrIn(List<String> values) {
            addCriterion("spot_vardescr in", values, "spotVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotVardescrNotIn(List<String> values) {
            addCriterion("spot_vardescr not in", values, "spotVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotVardescrBetween(String value1, String value2) {
            addCriterion("spot_vardescr between", value1, value2, "spotVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotVardescrNotBetween(String value1, String value2) {
            addCriterion("spot_vardescr not between", value1, value2, "spotVardescr");
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