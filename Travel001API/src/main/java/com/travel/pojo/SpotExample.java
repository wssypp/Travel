package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class SpotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpotExample() {
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

        public Criteria andSpotIdIsNull() {
            addCriterion("spot_id is null");
            return (Criteria) this;
        }

        public Criteria andSpotIdIsNotNull() {
            addCriterion("spot_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpotIdEqualTo(Integer value) {
            addCriterion("spot_id =", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdNotEqualTo(Integer value) {
            addCriterion("spot_id <>", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdGreaterThan(Integer value) {
            addCriterion("spot_id >", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spot_id >=", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdLessThan(Integer value) {
            addCriterion("spot_id <", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdLessThanOrEqualTo(Integer value) {
            addCriterion("spot_id <=", value, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdIn(List<Integer> values) {
            addCriterion("spot_id in", values, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdNotIn(List<Integer> values) {
            addCriterion("spot_id not in", values, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdBetween(Integer value1, Integer value2) {
            addCriterion("spot_id between", value1, value2, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spot_id not between", value1, value2, "spotId");
            return (Criteria) this;
        }

        public Criteria andSpotNameIsNull() {
            addCriterion("spot_name is null");
            return (Criteria) this;
        }

        public Criteria andSpotNameIsNotNull() {
            addCriterion("spot_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpotNameEqualTo(String value) {
            addCriterion("spot_name =", value, "spotName");
            return (Criteria) this;
        }

        public Criteria andSpotNameNotEqualTo(String value) {
            addCriterion("spot_name <>", value, "spotName");
            return (Criteria) this;
        }

        public Criteria andSpotNameGreaterThan(String value) {
            addCriterion("spot_name >", value, "spotName");
            return (Criteria) this;
        }

        public Criteria andSpotNameGreaterThanOrEqualTo(String value) {
            addCriterion("spot_name >=", value, "spotName");
            return (Criteria) this;
        }

        public Criteria andSpotNameLessThan(String value) {
            addCriterion("spot_name <", value, "spotName");
            return (Criteria) this;
        }

        public Criteria andSpotNameLessThanOrEqualTo(String value) {
            addCriterion("spot_name <=", value, "spotName");
            return (Criteria) this;
        }

        public Criteria andSpotNameLike(String value) {
            addCriterion("spot_name like", value, "spotName");
            return (Criteria) this;
        }

        public Criteria andSpotNameNotLike(String value) {
            addCriterion("spot_name not like", value, "spotName");
            return (Criteria) this;
        }

        public Criteria andSpotNameIn(List<String> values) {
            addCriterion("spot_name in", values, "spotName");
            return (Criteria) this;
        }

        public Criteria andSpotNameNotIn(List<String> values) {
            addCriterion("spot_name not in", values, "spotName");
            return (Criteria) this;
        }

        public Criteria andSpotNameBetween(String value1, String value2) {
            addCriterion("spot_name between", value1, value2, "spotName");
            return (Criteria) this;
        }

        public Criteria andSpotNameNotBetween(String value1, String value2) {
            addCriterion("spot_name not between", value1, value2, "spotName");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNull() {
            addCriterion("scenic_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNotNull() {
            addCriterion("scenic_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicIdEqualTo(Integer value) {
            addCriterion("scenic_id =", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotEqualTo(Integer value) {
            addCriterion("scenic_id <>", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThan(Integer value) {
            addCriterion("scenic_id >", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_id >=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThan(Integer value) {
            addCriterion("scenic_id <", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_id <=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdIn(List<Integer> values) {
            addCriterion("scenic_id in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotIn(List<Integer> values) {
            addCriterion("scenic_id not in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_id between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_id not between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andSpotDescrIsNull() {
            addCriterion("spot_descr is null");
            return (Criteria) this;
        }

        public Criteria andSpotDescrIsNotNull() {
            addCriterion("spot_descr is not null");
            return (Criteria) this;
        }

        public Criteria andSpotDescrEqualTo(Integer value) {
            addCriterion("spot_descr =", value, "spotDescr");
            return (Criteria) this;
        }

        public Criteria andSpotDescrNotEqualTo(Integer value) {
            addCriterion("spot_descr <>", value, "spotDescr");
            return (Criteria) this;
        }

        public Criteria andSpotDescrGreaterThan(Integer value) {
            addCriterion("spot_descr >", value, "spotDescr");
            return (Criteria) this;
        }

        public Criteria andSpotDescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("spot_descr >=", value, "spotDescr");
            return (Criteria) this;
        }

        public Criteria andSpotDescrLessThan(Integer value) {
            addCriterion("spot_descr <", value, "spotDescr");
            return (Criteria) this;
        }

        public Criteria andSpotDescrLessThanOrEqualTo(Integer value) {
            addCriterion("spot_descr <=", value, "spotDescr");
            return (Criteria) this;
        }

        public Criteria andSpotDescrIn(List<Integer> values) {
            addCriterion("spot_descr in", values, "spotDescr");
            return (Criteria) this;
        }

        public Criteria andSpotDescrNotIn(List<Integer> values) {
            addCriterion("spot_descr not in", values, "spotDescr");
            return (Criteria) this;
        }

        public Criteria andSpotDescrBetween(Integer value1, Integer value2) {
            addCriterion("spot_descr between", value1, value2, "spotDescr");
            return (Criteria) this;
        }

        public Criteria andSpotDescrNotBetween(Integer value1, Integer value2) {
            addCriterion("spot_descr not between", value1, value2, "spotDescr");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneIsNull() {
            addCriterion("bank_telephone is null");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneIsNotNull() {
            addCriterion("bank_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneEqualTo(String value) {
            addCriterion("bank_telephone =", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneNotEqualTo(String value) {
            addCriterion("bank_telephone <>", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneGreaterThan(String value) {
            addCriterion("bank_telephone >", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("bank_telephone >=", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneLessThan(String value) {
            addCriterion("bank_telephone <", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneLessThanOrEqualTo(String value) {
            addCriterion("bank_telephone <=", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneLike(String value) {
            addCriterion("bank_telephone like", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneNotLike(String value) {
            addCriterion("bank_telephone not like", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneIn(List<String> values) {
            addCriterion("bank_telephone in", values, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneNotIn(List<String> values) {
            addCriterion("bank_telephone not in", values, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneBetween(String value1, String value2) {
            addCriterion("bank_telephone between", value1, value2, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneNotBetween(String value1, String value2) {
            addCriterion("bank_telephone not between", value1, value2, "bankTelephone");
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