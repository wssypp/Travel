package com.travel.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScenicOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicOrderExample() {
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

        public Criteria andScenicOrderIdIsNull() {
            addCriterion("scenic_order_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdIsNotNull() {
            addCriterion("scenic_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdEqualTo(Integer value) {
            addCriterion("scenic_order_id =", value, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdNotEqualTo(Integer value) {
            addCriterion("scenic_order_id <>", value, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdGreaterThan(Integer value) {
            addCriterion("scenic_order_id >", value, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_order_id >=", value, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdLessThan(Integer value) {
            addCriterion("scenic_order_id <", value, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_order_id <=", value, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdIn(List<Integer> values) {
            addCriterion("scenic_order_id in", values, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdNotIn(List<Integer> values) {
            addCriterion("scenic_order_id not in", values, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_order_id between", value1, value2, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_order_id not between", value1, value2, "scenicOrderId");
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

        public Criteria andScenicOrderSubmittimeIsNull() {
            addCriterion("scenic_order_submittime is null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderSubmittimeIsNotNull() {
            addCriterion("scenic_order_submittime is not null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderSubmittimeEqualTo(Date value) {
            addCriterion("scenic_order_submittime =", value, "scenicOrderSubmittime");
            return (Criteria) this;
        }

        public Criteria andScenicOrderSubmittimeNotEqualTo(Date value) {
            addCriterion("scenic_order_submittime <>", value, "scenicOrderSubmittime");
            return (Criteria) this;
        }

        public Criteria andScenicOrderSubmittimeGreaterThan(Date value) {
            addCriterion("scenic_order_submittime >", value, "scenicOrderSubmittime");
            return (Criteria) this;
        }

        public Criteria andScenicOrderSubmittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scenic_order_submittime >=", value, "scenicOrderSubmittime");
            return (Criteria) this;
        }

        public Criteria andScenicOrderSubmittimeLessThan(Date value) {
            addCriterion("scenic_order_submittime <", value, "scenicOrderSubmittime");
            return (Criteria) this;
        }

        public Criteria andScenicOrderSubmittimeLessThanOrEqualTo(Date value) {
            addCriterion("scenic_order_submittime <=", value, "scenicOrderSubmittime");
            return (Criteria) this;
        }

        public Criteria andScenicOrderSubmittimeIn(List<Date> values) {
            addCriterion("scenic_order_submittime in", values, "scenicOrderSubmittime");
            return (Criteria) this;
        }

        public Criteria andScenicOrderSubmittimeNotIn(List<Date> values) {
            addCriterion("scenic_order_submittime not in", values, "scenicOrderSubmittime");
            return (Criteria) this;
        }

        public Criteria andScenicOrderSubmittimeBetween(Date value1, Date value2) {
            addCriterion("scenic_order_submittime between", value1, value2, "scenicOrderSubmittime");
            return (Criteria) this;
        }

        public Criteria andScenicOrderSubmittimeNotBetween(Date value1, Date value2) {
            addCriterion("scenic_order_submittime not between", value1, value2, "scenicOrderSubmittime");
            return (Criteria) this;
        }

        public Criteria andScenicOrderNumberIsNull() {
            addCriterion("scenic_order_number is null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderNumberIsNotNull() {
            addCriterion("scenic_order_number is not null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderNumberEqualTo(Integer value) {
            addCriterion("scenic_order_number =", value, "scenicOrderNumber");
            return (Criteria) this;
        }

        public Criteria andScenicOrderNumberNotEqualTo(Integer value) {
            addCriterion("scenic_order_number <>", value, "scenicOrderNumber");
            return (Criteria) this;
        }

        public Criteria andScenicOrderNumberGreaterThan(Integer value) {
            addCriterion("scenic_order_number >", value, "scenicOrderNumber");
            return (Criteria) this;
        }

        public Criteria andScenicOrderNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_order_number >=", value, "scenicOrderNumber");
            return (Criteria) this;
        }

        public Criteria andScenicOrderNumberLessThan(Integer value) {
            addCriterion("scenic_order_number <", value, "scenicOrderNumber");
            return (Criteria) this;
        }

        public Criteria andScenicOrderNumberLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_order_number <=", value, "scenicOrderNumber");
            return (Criteria) this;
        }

        public Criteria andScenicOrderNumberIn(List<Integer> values) {
            addCriterion("scenic_order_number in", values, "scenicOrderNumber");
            return (Criteria) this;
        }

        public Criteria andScenicOrderNumberNotIn(List<Integer> values) {
            addCriterion("scenic_order_number not in", values, "scenicOrderNumber");
            return (Criteria) this;
        }

        public Criteria andScenicOrderNumberBetween(Integer value1, Integer value2) {
            addCriterion("scenic_order_number between", value1, value2, "scenicOrderNumber");
            return (Criteria) this;
        }

        public Criteria andScenicOrderNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_order_number not between", value1, value2, "scenicOrderNumber");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTiceketCountIsNull() {
            addCriterion("scenic_order_ticeket_count is null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTiceketCountIsNotNull() {
            addCriterion("scenic_order_ticeket_count is not null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTiceketCountEqualTo(Integer value) {
            addCriterion("scenic_order_ticeket_count =", value, "scenicOrderTiceketCount");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTiceketCountNotEqualTo(Integer value) {
            addCriterion("scenic_order_ticeket_count <>", value, "scenicOrderTiceketCount");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTiceketCountGreaterThan(Integer value) {
            addCriterion("scenic_order_ticeket_count >", value, "scenicOrderTiceketCount");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTiceketCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_order_ticeket_count >=", value, "scenicOrderTiceketCount");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTiceketCountLessThan(Integer value) {
            addCriterion("scenic_order_ticeket_count <", value, "scenicOrderTiceketCount");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTiceketCountLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_order_ticeket_count <=", value, "scenicOrderTiceketCount");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTiceketCountIn(List<Integer> values) {
            addCriterion("scenic_order_ticeket_count in", values, "scenicOrderTiceketCount");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTiceketCountNotIn(List<Integer> values) {
            addCriterion("scenic_order_ticeket_count not in", values, "scenicOrderTiceketCount");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTiceketCountBetween(Integer value1, Integer value2) {
            addCriterion("scenic_order_ticeket_count between", value1, value2, "scenicOrderTiceketCount");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTiceketCountNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_order_ticeket_count not between", value1, value2, "scenicOrderTiceketCount");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTotalpriceIsNull() {
            addCriterion("scenic_order_totalprice is null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTotalpriceIsNotNull() {
            addCriterion("scenic_order_totalprice is not null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTotalpriceEqualTo(Double value) {
            addCriterion("scenic_order_totalprice =", value, "scenicOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTotalpriceNotEqualTo(Double value) {
            addCriterion("scenic_order_totalprice <>", value, "scenicOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTotalpriceGreaterThan(Double value) {
            addCriterion("scenic_order_totalprice >", value, "scenicOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTotalpriceGreaterThanOrEqualTo(Double value) {
            addCriterion("scenic_order_totalprice >=", value, "scenicOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTotalpriceLessThan(Double value) {
            addCriterion("scenic_order_totalprice <", value, "scenicOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTotalpriceLessThanOrEqualTo(Double value) {
            addCriterion("scenic_order_totalprice <=", value, "scenicOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTotalpriceIn(List<Double> values) {
            addCriterion("scenic_order_totalprice in", values, "scenicOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTotalpriceNotIn(List<Double> values) {
            addCriterion("scenic_order_totalprice not in", values, "scenicOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTotalpriceBetween(Double value1, Double value2) {
            addCriterion("scenic_order_totalprice between", value1, value2, "scenicOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andScenicOrderTotalpriceNotBetween(Double value1, Double value2) {
            addCriterion("scenic_order_totalprice not between", value1, value2, "scenicOrderTotalprice");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIntdescrIsNull() {
            addCriterion("scenic_order_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIntdescrIsNotNull() {
            addCriterion("scenic_order_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIntdescrEqualTo(Integer value) {
            addCriterion("scenic_order_intdescr =", value, "scenicOrderIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIntdescrNotEqualTo(Integer value) {
            addCriterion("scenic_order_intdescr <>", value, "scenicOrderIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIntdescrGreaterThan(Integer value) {
            addCriterion("scenic_order_intdescr >", value, "scenicOrderIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_order_intdescr >=", value, "scenicOrderIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIntdescrLessThan(Integer value) {
            addCriterion("scenic_order_intdescr <", value, "scenicOrderIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_order_intdescr <=", value, "scenicOrderIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIntdescrIn(List<Integer> values) {
            addCriterion("scenic_order_intdescr in", values, "scenicOrderIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIntdescrNotIn(List<Integer> values) {
            addCriterion("scenic_order_intdescr not in", values, "scenicOrderIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("scenic_order_intdescr between", value1, value2, "scenicOrderIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_order_intdescr not between", value1, value2, "scenicOrderIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderVardescrIsNull() {
            addCriterion("scenic_order_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderVardescrIsNotNull() {
            addCriterion("scenic_order_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderVardescrEqualTo(String value) {
            addCriterion("scenic_order_vardescr =", value, "scenicOrderVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderVardescrNotEqualTo(String value) {
            addCriterion("scenic_order_vardescr <>", value, "scenicOrderVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderVardescrGreaterThan(String value) {
            addCriterion("scenic_order_vardescr >", value, "scenicOrderVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_order_vardescr >=", value, "scenicOrderVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderVardescrLessThan(String value) {
            addCriterion("scenic_order_vardescr <", value, "scenicOrderVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderVardescrLessThanOrEqualTo(String value) {
            addCriterion("scenic_order_vardescr <=", value, "scenicOrderVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderVardescrLike(String value) {
            addCriterion("scenic_order_vardescr like", value, "scenicOrderVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderVardescrNotLike(String value) {
            addCriterion("scenic_order_vardescr not like", value, "scenicOrderVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderVardescrIn(List<String> values) {
            addCriterion("scenic_order_vardescr in", values, "scenicOrderVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderVardescrNotIn(List<String> values) {
            addCriterion("scenic_order_vardescr not in", values, "scenicOrderVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderVardescrBetween(String value1, String value2) {
            addCriterion("scenic_order_vardescr between", value1, value2, "scenicOrderVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicOrderVardescrNotBetween(String value1, String value2) {
            addCriterion("scenic_order_vardescr not between", value1, value2, "scenicOrderVardescr");
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