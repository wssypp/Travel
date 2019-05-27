package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class AircrainfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AircrainfoExample() {
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

        public Criteria andAircrainfoIdIsNull() {
            addCriterion("aircrainfo_id is null");
            return (Criteria) this;
        }

        public Criteria andAircrainfoIdIsNotNull() {
            addCriterion("aircrainfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andAircrainfoIdEqualTo(Integer value) {
            addCriterion("aircrainfo_id =", value, "aircrainfoId");
            return (Criteria) this;
        }

        public Criteria andAircrainfoIdNotEqualTo(Integer value) {
            addCriterion("aircrainfo_id <>", value, "aircrainfoId");
            return (Criteria) this;
        }

        public Criteria andAircrainfoIdGreaterThan(Integer value) {
            addCriterion("aircrainfo_id >", value, "aircrainfoId");
            return (Criteria) this;
        }

        public Criteria andAircrainfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aircrainfo_id >=", value, "aircrainfoId");
            return (Criteria) this;
        }

        public Criteria andAircrainfoIdLessThan(Integer value) {
            addCriterion("aircrainfo_id <", value, "aircrainfoId");
            return (Criteria) this;
        }

        public Criteria andAircrainfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("aircrainfo_id <=", value, "aircrainfoId");
            return (Criteria) this;
        }

        public Criteria andAircrainfoIdIn(List<Integer> values) {
            addCriterion("aircrainfo_id in", values, "aircrainfoId");
            return (Criteria) this;
        }

        public Criteria andAircrainfoIdNotIn(List<Integer> values) {
            addCriterion("aircrainfo_id not in", values, "aircrainfoId");
            return (Criteria) this;
        }

        public Criteria andAircrainfoIdBetween(Integer value1, Integer value2) {
            addCriterion("aircrainfo_id between", value1, value2, "aircrainfoId");
            return (Criteria) this;
        }

        public Criteria andAircrainfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aircrainfo_id not between", value1, value2, "aircrainfoId");
            return (Criteria) this;
        }

        public Criteria andAircraftIdIsNull() {
            addCriterion("aircraft_id is null");
            return (Criteria) this;
        }

        public Criteria andAircraftIdIsNotNull() {
            addCriterion("aircraft_id is not null");
            return (Criteria) this;
        }

        public Criteria andAircraftIdEqualTo(Integer value) {
            addCriterion("aircraft_id =", value, "aircraftId");
            return (Criteria) this;
        }

        public Criteria andAircraftIdNotEqualTo(Integer value) {
            addCriterion("aircraft_id <>", value, "aircraftId");
            return (Criteria) this;
        }

        public Criteria andAircraftIdGreaterThan(Integer value) {
            addCriterion("aircraft_id >", value, "aircraftId");
            return (Criteria) this;
        }

        public Criteria andAircraftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aircraft_id >=", value, "aircraftId");
            return (Criteria) this;
        }

        public Criteria andAircraftIdLessThan(Integer value) {
            addCriterion("aircraft_id <", value, "aircraftId");
            return (Criteria) this;
        }

        public Criteria andAircraftIdLessThanOrEqualTo(Integer value) {
            addCriterion("aircraft_id <=", value, "aircraftId");
            return (Criteria) this;
        }

        public Criteria andAircraftIdIn(List<Integer> values) {
            addCriterion("aircraft_id in", values, "aircraftId");
            return (Criteria) this;
        }

        public Criteria andAircraftIdNotIn(List<Integer> values) {
            addCriterion("aircraft_id not in", values, "aircraftId");
            return (Criteria) this;
        }

        public Criteria andAircraftIdBetween(Integer value1, Integer value2) {
            addCriterion("aircraft_id between", value1, value2, "aircraftId");
            return (Criteria) this;
        }

        public Criteria andAircraftIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aircraft_id not between", value1, value2, "aircraftId");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiIsNull() {
            addCriterion("aircraftinfo_cangwei is null");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiIsNotNull() {
            addCriterion("aircraftinfo_cangwei is not null");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiEqualTo(String value) {
            addCriterion("aircraftinfo_cangwei =", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiNotEqualTo(String value) {
            addCriterion("aircraftinfo_cangwei <>", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiGreaterThan(String value) {
            addCriterion("aircraftinfo_cangwei >", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiGreaterThanOrEqualTo(String value) {
            addCriterion("aircraftinfo_cangwei >=", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiLessThan(String value) {
            addCriterion("aircraftinfo_cangwei <", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiLessThanOrEqualTo(String value) {
            addCriterion("aircraftinfo_cangwei <=", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiLike(String value) {
            addCriterion("aircraftinfo_cangwei like", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiNotLike(String value) {
            addCriterion("aircraftinfo_cangwei not like", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiIn(List<String> values) {
            addCriterion("aircraftinfo_cangwei in", values, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiNotIn(List<String> values) {
            addCriterion("aircraftinfo_cangwei not in", values, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiBetween(String value1, String value2) {
            addCriterion("aircraftinfo_cangwei between", value1, value2, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiNotBetween(String value1, String value2) {
            addCriterion("aircraftinfo_cangwei not between", value1, value2, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceIsNull() {
            addCriterion("aircraftinfo_price is null");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceIsNotNull() {
            addCriterion("aircraftinfo_price is not null");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceEqualTo(Double value) {
            addCriterion("aircraftinfo_price =", value, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceNotEqualTo(Double value) {
            addCriterion("aircraftinfo_price <>", value, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceGreaterThan(Double value) {
            addCriterion("aircraftinfo_price >", value, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("aircraftinfo_price >=", value, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceLessThan(Double value) {
            addCriterion("aircraftinfo_price <", value, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceLessThanOrEqualTo(Double value) {
            addCriterion("aircraftinfo_price <=", value, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceIn(List<Double> values) {
            addCriterion("aircraftinfo_price in", values, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceNotIn(List<Double> values) {
            addCriterion("aircraftinfo_price not in", values, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceBetween(Double value1, Double value2) {
            addCriterion("aircraftinfo_price between", value1, value2, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceNotBetween(Double value1, Double value2) {
            addCriterion("aircraftinfo_price not between", value1, value2, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoIntdescrIsNull() {
            addCriterion("aircraftinfo_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoIntdescrIsNotNull() {
            addCriterion("aircraftinfo_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoIntdescrEqualTo(Integer value) {
            addCriterion("aircraftinfo_intdescr =", value, "aircraftinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoIntdescrNotEqualTo(Integer value) {
            addCriterion("aircraftinfo_intdescr <>", value, "aircraftinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoIntdescrGreaterThan(Integer value) {
            addCriterion("aircraftinfo_intdescr >", value, "aircraftinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("aircraftinfo_intdescr >=", value, "aircraftinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoIntdescrLessThan(Integer value) {
            addCriterion("aircraftinfo_intdescr <", value, "aircraftinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("aircraftinfo_intdescr <=", value, "aircraftinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoIntdescrIn(List<Integer> values) {
            addCriterion("aircraftinfo_intdescr in", values, "aircraftinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoIntdescrNotIn(List<Integer> values) {
            addCriterion("aircraftinfo_intdescr not in", values, "aircraftinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("aircraftinfo_intdescr between", value1, value2, "aircraftinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("aircraftinfo_intdescr not between", value1, value2, "aircraftinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoVardescrIsNull() {
            addCriterion("aircraftinfo_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoVardescrIsNotNull() {
            addCriterion("aircraftinfo_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoVardescrEqualTo(String value) {
            addCriterion("aircraftinfo_vardescr =", value, "aircraftinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoVardescrNotEqualTo(String value) {
            addCriterion("aircraftinfo_vardescr <>", value, "aircraftinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoVardescrGreaterThan(String value) {
            addCriterion("aircraftinfo_vardescr >", value, "aircraftinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("aircraftinfo_vardescr >=", value, "aircraftinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoVardescrLessThan(String value) {
            addCriterion("aircraftinfo_vardescr <", value, "aircraftinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoVardescrLessThanOrEqualTo(String value) {
            addCriterion("aircraftinfo_vardescr <=", value, "aircraftinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoVardescrLike(String value) {
            addCriterion("aircraftinfo_vardescr like", value, "aircraftinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoVardescrNotLike(String value) {
            addCriterion("aircraftinfo_vardescr not like", value, "aircraftinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoVardescrIn(List<String> values) {
            addCriterion("aircraftinfo_vardescr in", values, "aircraftinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoVardescrNotIn(List<String> values) {
            addCriterion("aircraftinfo_vardescr not in", values, "aircraftinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoVardescrBetween(String value1, String value2) {
            addCriterion("aircraftinfo_vardescr between", value1, value2, "aircraftinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoVardescrNotBetween(String value1, String value2) {
            addCriterion("aircraftinfo_vardescr not between", value1, value2, "aircraftinfoVardescr");
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