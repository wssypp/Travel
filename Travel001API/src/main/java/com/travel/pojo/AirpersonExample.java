package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class AirpersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AirpersonExample() {
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

        public Criteria andAirpersonIdIsNull() {
            addCriterion("airperson_id is null");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdIsNotNull() {
            addCriterion("airperson_id is not null");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdEqualTo(Integer value) {
            addCriterion("airperson_id =", value, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdNotEqualTo(Integer value) {
            addCriterion("airperson_id <>", value, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdGreaterThan(Integer value) {
            addCriterion("airperson_id >", value, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("airperson_id >=", value, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdLessThan(Integer value) {
            addCriterion("airperson_id <", value, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("airperson_id <=", value, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdIn(List<Integer> values) {
            addCriterion("airperson_id in", values, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdNotIn(List<Integer> values) {
            addCriterion("airperson_id not in", values, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdBetween(Integer value1, Integer value2) {
            addCriterion("airperson_id between", value1, value2, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("airperson_id not between", value1, value2, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdIsNull() {
            addCriterion("airticketorder_id is null");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdIsNotNull() {
            addCriterion("airticketorder_id is not null");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdEqualTo(Integer value) {
            addCriterion("airticketorder_id =", value, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdNotEqualTo(Integer value) {
            addCriterion("airticketorder_id <>", value, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdGreaterThan(Integer value) {
            addCriterion("airticketorder_id >", value, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("airticketorder_id >=", value, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdLessThan(Integer value) {
            addCriterion("airticketorder_id <", value, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("airticketorder_id <=", value, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdIn(List<Integer> values) {
            addCriterion("airticketorder_id in", values, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdNotIn(List<Integer> values) {
            addCriterion("airticketorder_id not in", values, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdBetween(Integer value1, Integer value2) {
            addCriterion("airticketorder_id between", value1, value2, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("airticketorder_id not between", value1, value2, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirpersonTypeIsNull() {
            addCriterion("airperson_type is null");
            return (Criteria) this;
        }

        public Criteria andAirpersonTypeIsNotNull() {
            addCriterion("airperson_type is not null");
            return (Criteria) this;
        }

        public Criteria andAirpersonTypeEqualTo(String value) {
            addCriterion("airperson_type =", value, "airpersonType");
            return (Criteria) this;
        }

        public Criteria andAirpersonTypeNotEqualTo(String value) {
            addCriterion("airperson_type <>", value, "airpersonType");
            return (Criteria) this;
        }

        public Criteria andAirpersonTypeGreaterThan(String value) {
            addCriterion("airperson_type >", value, "airpersonType");
            return (Criteria) this;
        }

        public Criteria andAirpersonTypeGreaterThanOrEqualTo(String value) {
            addCriterion("airperson_type >=", value, "airpersonType");
            return (Criteria) this;
        }

        public Criteria andAirpersonTypeLessThan(String value) {
            addCriterion("airperson_type <", value, "airpersonType");
            return (Criteria) this;
        }

        public Criteria andAirpersonTypeLessThanOrEqualTo(String value) {
            addCriterion("airperson_type <=", value, "airpersonType");
            return (Criteria) this;
        }

        public Criteria andAirpersonTypeLike(String value) {
            addCriterion("airperson_type like", value, "airpersonType");
            return (Criteria) this;
        }

        public Criteria andAirpersonTypeNotLike(String value) {
            addCriterion("airperson_type not like", value, "airpersonType");
            return (Criteria) this;
        }

        public Criteria andAirpersonTypeIn(List<String> values) {
            addCriterion("airperson_type in", values, "airpersonType");
            return (Criteria) this;
        }

        public Criteria andAirpersonTypeNotIn(List<String> values) {
            addCriterion("airperson_type not in", values, "airpersonType");
            return (Criteria) this;
        }

        public Criteria andAirpersonTypeBetween(String value1, String value2) {
            addCriterion("airperson_type between", value1, value2, "airpersonType");
            return (Criteria) this;
        }

        public Criteria andAirpersonTypeNotBetween(String value1, String value2) {
            addCriterion("airperson_type not between", value1, value2, "airpersonType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeIsNull() {
            addCriterion("identify_type is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeIsNotNull() {
            addCriterion("identify_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeEqualTo(String value) {
            addCriterion("identify_type =", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeNotEqualTo(String value) {
            addCriterion("identify_type <>", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeGreaterThan(String value) {
            addCriterion("identify_type >", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("identify_type >=", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeLessThan(String value) {
            addCriterion("identify_type <", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeLessThanOrEqualTo(String value) {
            addCriterion("identify_type <=", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeLike(String value) {
            addCriterion("identify_type like", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeNotLike(String value) {
            addCriterion("identify_type not like", value, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeIn(List<String> values) {
            addCriterion("identify_type in", values, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeNotIn(List<String> values) {
            addCriterion("identify_type not in", values, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeBetween(String value1, String value2) {
            addCriterion("identify_type between", value1, value2, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyTypeNotBetween(String value1, String value2) {
            addCriterion("identify_type not between", value1, value2, "identifyType");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeIsNull() {
            addCriterion("identify_code is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeIsNotNull() {
            addCriterion("identify_code is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeEqualTo(String value) {
            addCriterion("identify_code =", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeNotEqualTo(String value) {
            addCriterion("identify_code <>", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeGreaterThan(String value) {
            addCriterion("identify_code >", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("identify_code >=", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeLessThan(String value) {
            addCriterion("identify_code <", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeLessThanOrEqualTo(String value) {
            addCriterion("identify_code <=", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeLike(String value) {
            addCriterion("identify_code like", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeNotLike(String value) {
            addCriterion("identify_code not like", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeIn(List<String> values) {
            addCriterion("identify_code in", values, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeNotIn(List<String> values) {
            addCriterion("identify_code not in", values, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeBetween(String value1, String value2) {
            addCriterion("identify_code between", value1, value2, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeNotBetween(String value1, String value2) {
            addCriterion("identify_code not between", value1, value2, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andAirpersonIntdescrIsNull() {
            addCriterion("airperson_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andAirpersonIntdescrIsNotNull() {
            addCriterion("airperson_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andAirpersonIntdescrEqualTo(Integer value) {
            addCriterion("airperson_intdescr =", value, "airpersonIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonIntdescrNotEqualTo(Integer value) {
            addCriterion("airperson_intdescr <>", value, "airpersonIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonIntdescrGreaterThan(Integer value) {
            addCriterion("airperson_intdescr >", value, "airpersonIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("airperson_intdescr >=", value, "airpersonIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonIntdescrLessThan(Integer value) {
            addCriterion("airperson_intdescr <", value, "airpersonIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("airperson_intdescr <=", value, "airpersonIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonIntdescrIn(List<Integer> values) {
            addCriterion("airperson_intdescr in", values, "airpersonIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonIntdescrNotIn(List<Integer> values) {
            addCriterion("airperson_intdescr not in", values, "airpersonIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("airperson_intdescr between", value1, value2, "airpersonIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("airperson_intdescr not between", value1, value2, "airpersonIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonVardescrIsNull() {
            addCriterion("airperson_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andAirpersonVardescrIsNotNull() {
            addCriterion("airperson_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andAirpersonVardescrEqualTo(String value) {
            addCriterion("airperson_vardescr =", value, "airpersonVardescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonVardescrNotEqualTo(String value) {
            addCriterion("airperson_vardescr <>", value, "airpersonVardescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonVardescrGreaterThan(String value) {
            addCriterion("airperson_vardescr >", value, "airpersonVardescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("airperson_vardescr >=", value, "airpersonVardescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonVardescrLessThan(String value) {
            addCriterion("airperson_vardescr <", value, "airpersonVardescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonVardescrLessThanOrEqualTo(String value) {
            addCriterion("airperson_vardescr <=", value, "airpersonVardescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonVardescrLike(String value) {
            addCriterion("airperson_vardescr like", value, "airpersonVardescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonVardescrNotLike(String value) {
            addCriterion("airperson_vardescr not like", value, "airpersonVardescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonVardescrIn(List<String> values) {
            addCriterion("airperson_vardescr in", values, "airpersonVardescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonVardescrNotIn(List<String> values) {
            addCriterion("airperson_vardescr not in", values, "airpersonVardescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonVardescrBetween(String value1, String value2) {
            addCriterion("airperson_vardescr between", value1, value2, "airpersonVardescr");
            return (Criteria) this;
        }

        public Criteria andAirpersonVardescrNotBetween(String value1, String value2) {
            addCriterion("airperson_vardescr not between", value1, value2, "airpersonVardescr");
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