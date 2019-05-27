package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class HotelFacilityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelFacilityExample() {
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

        public Criteria andHotelFacilityIdIsNull() {
            addCriterion("hotel_facility_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityIdIsNotNull() {
            addCriterion("hotel_facility_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityIdEqualTo(Integer value) {
            addCriterion("hotel_facility_id =", value, "hotelFacilityId");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityIdNotEqualTo(Integer value) {
            addCriterion("hotel_facility_id <>", value, "hotelFacilityId");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityIdGreaterThan(Integer value) {
            addCriterion("hotel_facility_id >", value, "hotelFacilityId");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_facility_id >=", value, "hotelFacilityId");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityIdLessThan(Integer value) {
            addCriterion("hotel_facility_id <", value, "hotelFacilityId");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_facility_id <=", value, "hotelFacilityId");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityIdIn(List<Integer> values) {
            addCriterion("hotel_facility_id in", values, "hotelFacilityId");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityIdNotIn(List<Integer> values) {
            addCriterion("hotel_facility_id not in", values, "hotelFacilityId");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_facility_id between", value1, value2, "hotelFacilityId");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_facility_id not between", value1, value2, "hotelFacilityId");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityNameIsNull() {
            addCriterion("hotel_facility_name is null");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityNameIsNotNull() {
            addCriterion("hotel_facility_name is not null");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityNameEqualTo(String value) {
            addCriterion("hotel_facility_name =", value, "hotelFacilityName");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityNameNotEqualTo(String value) {
            addCriterion("hotel_facility_name <>", value, "hotelFacilityName");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityNameGreaterThan(String value) {
            addCriterion("hotel_facility_name >", value, "hotelFacilityName");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityNameGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_facility_name >=", value, "hotelFacilityName");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityNameLessThan(String value) {
            addCriterion("hotel_facility_name <", value, "hotelFacilityName");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityNameLessThanOrEqualTo(String value) {
            addCriterion("hotel_facility_name <=", value, "hotelFacilityName");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityNameLike(String value) {
            addCriterion("hotel_facility_name like", value, "hotelFacilityName");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityNameNotLike(String value) {
            addCriterion("hotel_facility_name not like", value, "hotelFacilityName");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityNameIn(List<String> values) {
            addCriterion("hotel_facility_name in", values, "hotelFacilityName");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityNameNotIn(List<String> values) {
            addCriterion("hotel_facility_name not in", values, "hotelFacilityName");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityNameBetween(String value1, String value2) {
            addCriterion("hotel_facility_name between", value1, value2, "hotelFacilityName");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityNameNotBetween(String value1, String value2) {
            addCriterion("hotel_facility_name not between", value1, value2, "hotelFacilityName");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityTypeIsNull() {
            addCriterion("hotel_facility_type is null");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityTypeIsNotNull() {
            addCriterion("hotel_facility_type is not null");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityTypeEqualTo(String value) {
            addCriterion("hotel_facility_type =", value, "hotelFacilityType");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityTypeNotEqualTo(String value) {
            addCriterion("hotel_facility_type <>", value, "hotelFacilityType");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityTypeGreaterThan(String value) {
            addCriterion("hotel_facility_type >", value, "hotelFacilityType");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_facility_type >=", value, "hotelFacilityType");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityTypeLessThan(String value) {
            addCriterion("hotel_facility_type <", value, "hotelFacilityType");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityTypeLessThanOrEqualTo(String value) {
            addCriterion("hotel_facility_type <=", value, "hotelFacilityType");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityTypeLike(String value) {
            addCriterion("hotel_facility_type like", value, "hotelFacilityType");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityTypeNotLike(String value) {
            addCriterion("hotel_facility_type not like", value, "hotelFacilityType");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityTypeIn(List<String> values) {
            addCriterion("hotel_facility_type in", values, "hotelFacilityType");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityTypeNotIn(List<String> values) {
            addCriterion("hotel_facility_type not in", values, "hotelFacilityType");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityTypeBetween(String value1, String value2) {
            addCriterion("hotel_facility_type between", value1, value2, "hotelFacilityType");
            return (Criteria) this;
        }

        public Criteria andHotelFacilityTypeNotBetween(String value1, String value2) {
            addCriterion("hotel_facility_type not between", value1, value2, "hotelFacilityType");
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