package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class HotelServiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelServiceExample() {
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

        public Criteria andHotelServiceIdIsNull() {
            addCriterion("hotel_service_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelServiceIdIsNotNull() {
            addCriterion("hotel_service_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelServiceIdEqualTo(Integer value) {
            addCriterion("hotel_service_id =", value, "hotelServiceId");
            return (Criteria) this;
        }

        public Criteria andHotelServiceIdNotEqualTo(Integer value) {
            addCriterion("hotel_service_id <>", value, "hotelServiceId");
            return (Criteria) this;
        }

        public Criteria andHotelServiceIdGreaterThan(Integer value) {
            addCriterion("hotel_service_id >", value, "hotelServiceId");
            return (Criteria) this;
        }

        public Criteria andHotelServiceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_service_id >=", value, "hotelServiceId");
            return (Criteria) this;
        }

        public Criteria andHotelServiceIdLessThan(Integer value) {
            addCriterion("hotel_service_id <", value, "hotelServiceId");
            return (Criteria) this;
        }

        public Criteria andHotelServiceIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_service_id <=", value, "hotelServiceId");
            return (Criteria) this;
        }

        public Criteria andHotelServiceIdIn(List<Integer> values) {
            addCriterion("hotel_service_id in", values, "hotelServiceId");
            return (Criteria) this;
        }

        public Criteria andHotelServiceIdNotIn(List<Integer> values) {
            addCriterion("hotel_service_id not in", values, "hotelServiceId");
            return (Criteria) this;
        }

        public Criteria andHotelServiceIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_service_id between", value1, value2, "hotelServiceId");
            return (Criteria) this;
        }

        public Criteria andHotelServiceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_service_id not between", value1, value2, "hotelServiceId");
            return (Criteria) this;
        }

        public Criteria andHotelServiceNameIsNull() {
            addCriterion("hotel_service_name is null");
            return (Criteria) this;
        }

        public Criteria andHotelServiceNameIsNotNull() {
            addCriterion("hotel_service_name is not null");
            return (Criteria) this;
        }

        public Criteria andHotelServiceNameEqualTo(String value) {
            addCriterion("hotel_service_name =", value, "hotelServiceName");
            return (Criteria) this;
        }

        public Criteria andHotelServiceNameNotEqualTo(String value) {
            addCriterion("hotel_service_name <>", value, "hotelServiceName");
            return (Criteria) this;
        }

        public Criteria andHotelServiceNameGreaterThan(String value) {
            addCriterion("hotel_service_name >", value, "hotelServiceName");
            return (Criteria) this;
        }

        public Criteria andHotelServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_service_name >=", value, "hotelServiceName");
            return (Criteria) this;
        }

        public Criteria andHotelServiceNameLessThan(String value) {
            addCriterion("hotel_service_name <", value, "hotelServiceName");
            return (Criteria) this;
        }

        public Criteria andHotelServiceNameLessThanOrEqualTo(String value) {
            addCriterion("hotel_service_name <=", value, "hotelServiceName");
            return (Criteria) this;
        }

        public Criteria andHotelServiceNameLike(String value) {
            addCriterion("hotel_service_name like", value, "hotelServiceName");
            return (Criteria) this;
        }

        public Criteria andHotelServiceNameNotLike(String value) {
            addCriterion("hotel_service_name not like", value, "hotelServiceName");
            return (Criteria) this;
        }

        public Criteria andHotelServiceNameIn(List<String> values) {
            addCriterion("hotel_service_name in", values, "hotelServiceName");
            return (Criteria) this;
        }

        public Criteria andHotelServiceNameNotIn(List<String> values) {
            addCriterion("hotel_service_name not in", values, "hotelServiceName");
            return (Criteria) this;
        }

        public Criteria andHotelServiceNameBetween(String value1, String value2) {
            addCriterion("hotel_service_name between", value1, value2, "hotelServiceName");
            return (Criteria) this;
        }

        public Criteria andHotelServiceNameNotBetween(String value1, String value2) {
            addCriterion("hotel_service_name not between", value1, value2, "hotelServiceName");
            return (Criteria) this;
        }

        public Criteria andHotelServiceTypeIsNull() {
            addCriterion("hotel_service_type is null");
            return (Criteria) this;
        }

        public Criteria andHotelServiceTypeIsNotNull() {
            addCriterion("hotel_service_type is not null");
            return (Criteria) this;
        }

        public Criteria andHotelServiceTypeEqualTo(String value) {
            addCriterion("hotel_service_type =", value, "hotelServiceType");
            return (Criteria) this;
        }

        public Criteria andHotelServiceTypeNotEqualTo(String value) {
            addCriterion("hotel_service_type <>", value, "hotelServiceType");
            return (Criteria) this;
        }

        public Criteria andHotelServiceTypeGreaterThan(String value) {
            addCriterion("hotel_service_type >", value, "hotelServiceType");
            return (Criteria) this;
        }

        public Criteria andHotelServiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_service_type >=", value, "hotelServiceType");
            return (Criteria) this;
        }

        public Criteria andHotelServiceTypeLessThan(String value) {
            addCriterion("hotel_service_type <", value, "hotelServiceType");
            return (Criteria) this;
        }

        public Criteria andHotelServiceTypeLessThanOrEqualTo(String value) {
            addCriterion("hotel_service_type <=", value, "hotelServiceType");
            return (Criteria) this;
        }

        public Criteria andHotelServiceTypeLike(String value) {
            addCriterion("hotel_service_type like", value, "hotelServiceType");
            return (Criteria) this;
        }

        public Criteria andHotelServiceTypeNotLike(String value) {
            addCriterion("hotel_service_type not like", value, "hotelServiceType");
            return (Criteria) this;
        }

        public Criteria andHotelServiceTypeIn(List<String> values) {
            addCriterion("hotel_service_type in", values, "hotelServiceType");
            return (Criteria) this;
        }

        public Criteria andHotelServiceTypeNotIn(List<String> values) {
            addCriterion("hotel_service_type not in", values, "hotelServiceType");
            return (Criteria) this;
        }

        public Criteria andHotelServiceTypeBetween(String value1, String value2) {
            addCriterion("hotel_service_type between", value1, value2, "hotelServiceType");
            return (Criteria) this;
        }

        public Criteria andHotelServiceTypeNotBetween(String value1, String value2) {
            addCriterion("hotel_service_type not between", value1, value2, "hotelServiceType");
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