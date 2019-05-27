package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class AirportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AirportExample() {
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

        public Criteria andAirportIdIsNull() {
            addCriterion("airport_id is null");
            return (Criteria) this;
        }

        public Criteria andAirportIdIsNotNull() {
            addCriterion("airport_id is not null");
            return (Criteria) this;
        }

        public Criteria andAirportIdEqualTo(Integer value) {
            addCriterion("airport_id =", value, "airportId");
            return (Criteria) this;
        }

        public Criteria andAirportIdNotEqualTo(Integer value) {
            addCriterion("airport_id <>", value, "airportId");
            return (Criteria) this;
        }

        public Criteria andAirportIdGreaterThan(Integer value) {
            addCriterion("airport_id >", value, "airportId");
            return (Criteria) this;
        }

        public Criteria andAirportIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("airport_id >=", value, "airportId");
            return (Criteria) this;
        }

        public Criteria andAirportIdLessThan(Integer value) {
            addCriterion("airport_id <", value, "airportId");
            return (Criteria) this;
        }

        public Criteria andAirportIdLessThanOrEqualTo(Integer value) {
            addCriterion("airport_id <=", value, "airportId");
            return (Criteria) this;
        }

        public Criteria andAirportIdIn(List<Integer> values) {
            addCriterion("airport_id in", values, "airportId");
            return (Criteria) this;
        }

        public Criteria andAirportIdNotIn(List<Integer> values) {
            addCriterion("airport_id not in", values, "airportId");
            return (Criteria) this;
        }

        public Criteria andAirportIdBetween(Integer value1, Integer value2) {
            addCriterion("airport_id between", value1, value2, "airportId");
            return (Criteria) this;
        }

        public Criteria andAirportIdNotBetween(Integer value1, Integer value2) {
            addCriterion("airport_id not between", value1, value2, "airportId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andAirportNameIsNull() {
            addCriterion("airport_name is null");
            return (Criteria) this;
        }

        public Criteria andAirportNameIsNotNull() {
            addCriterion("airport_name is not null");
            return (Criteria) this;
        }

        public Criteria andAirportNameEqualTo(String value) {
            addCriterion("airport_name =", value, "airportName");
            return (Criteria) this;
        }

        public Criteria andAirportNameNotEqualTo(String value) {
            addCriterion("airport_name <>", value, "airportName");
            return (Criteria) this;
        }

        public Criteria andAirportNameGreaterThan(String value) {
            addCriterion("airport_name >", value, "airportName");
            return (Criteria) this;
        }

        public Criteria andAirportNameGreaterThanOrEqualTo(String value) {
            addCriterion("airport_name >=", value, "airportName");
            return (Criteria) this;
        }

        public Criteria andAirportNameLessThan(String value) {
            addCriterion("airport_name <", value, "airportName");
            return (Criteria) this;
        }

        public Criteria andAirportNameLessThanOrEqualTo(String value) {
            addCriterion("airport_name <=", value, "airportName");
            return (Criteria) this;
        }

        public Criteria andAirportNameLike(String value) {
            addCriterion("airport_name like", value, "airportName");
            return (Criteria) this;
        }

        public Criteria andAirportNameNotLike(String value) {
            addCriterion("airport_name not like", value, "airportName");
            return (Criteria) this;
        }

        public Criteria andAirportNameIn(List<String> values) {
            addCriterion("airport_name in", values, "airportName");
            return (Criteria) this;
        }

        public Criteria andAirportNameNotIn(List<String> values) {
            addCriterion("airport_name not in", values, "airportName");
            return (Criteria) this;
        }

        public Criteria andAirportNameBetween(String value1, String value2) {
            addCriterion("airport_name between", value1, value2, "airportName");
            return (Criteria) this;
        }

        public Criteria andAirportNameNotBetween(String value1, String value2) {
            addCriterion("airport_name not between", value1, value2, "airportName");
            return (Criteria) this;
        }

        public Criteria andAirportDistanceIsNull() {
            addCriterion("airport_distance is null");
            return (Criteria) this;
        }

        public Criteria andAirportDistanceIsNotNull() {
            addCriterion("airport_distance is not null");
            return (Criteria) this;
        }

        public Criteria andAirportDistanceEqualTo(Float value) {
            addCriterion("airport_distance =", value, "airportDistance");
            return (Criteria) this;
        }

        public Criteria andAirportDistanceNotEqualTo(Float value) {
            addCriterion("airport_distance <>", value, "airportDistance");
            return (Criteria) this;
        }

        public Criteria andAirportDistanceGreaterThan(Float value) {
            addCriterion("airport_distance >", value, "airportDistance");
            return (Criteria) this;
        }

        public Criteria andAirportDistanceGreaterThanOrEqualTo(Float value) {
            addCriterion("airport_distance >=", value, "airportDistance");
            return (Criteria) this;
        }

        public Criteria andAirportDistanceLessThan(Float value) {
            addCriterion("airport_distance <", value, "airportDistance");
            return (Criteria) this;
        }

        public Criteria andAirportDistanceLessThanOrEqualTo(Float value) {
            addCriterion("airport_distance <=", value, "airportDistance");
            return (Criteria) this;
        }

        public Criteria andAirportDistanceIn(List<Float> values) {
            addCriterion("airport_distance in", values, "airportDistance");
            return (Criteria) this;
        }

        public Criteria andAirportDistanceNotIn(List<Float> values) {
            addCriterion("airport_distance not in", values, "airportDistance");
            return (Criteria) this;
        }

        public Criteria andAirportDistanceBetween(Float value1, Float value2) {
            addCriterion("airport_distance between", value1, value2, "airportDistance");
            return (Criteria) this;
        }

        public Criteria andAirportDistanceNotBetween(Float value1, Float value2) {
            addCriterion("airport_distance not between", value1, value2, "airportDistance");
            return (Criteria) this;
        }

        public Criteria andAirportDescrIsNull() {
            addCriterion("airport_descr is null");
            return (Criteria) this;
        }

        public Criteria andAirportDescrIsNotNull() {
            addCriterion("airport_descr is not null");
            return (Criteria) this;
        }

        public Criteria andAirportDescrEqualTo(String value) {
            addCriterion("airport_descr =", value, "airportDescr");
            return (Criteria) this;
        }

        public Criteria andAirportDescrNotEqualTo(String value) {
            addCriterion("airport_descr <>", value, "airportDescr");
            return (Criteria) this;
        }

        public Criteria andAirportDescrGreaterThan(String value) {
            addCriterion("airport_descr >", value, "airportDescr");
            return (Criteria) this;
        }

        public Criteria andAirportDescrGreaterThanOrEqualTo(String value) {
            addCriterion("airport_descr >=", value, "airportDescr");
            return (Criteria) this;
        }

        public Criteria andAirportDescrLessThan(String value) {
            addCriterion("airport_descr <", value, "airportDescr");
            return (Criteria) this;
        }

        public Criteria andAirportDescrLessThanOrEqualTo(String value) {
            addCriterion("airport_descr <=", value, "airportDescr");
            return (Criteria) this;
        }

        public Criteria andAirportDescrLike(String value) {
            addCriterion("airport_descr like", value, "airportDescr");
            return (Criteria) this;
        }

        public Criteria andAirportDescrNotLike(String value) {
            addCriterion("airport_descr not like", value, "airportDescr");
            return (Criteria) this;
        }

        public Criteria andAirportDescrIn(List<String> values) {
            addCriterion("airport_descr in", values, "airportDescr");
            return (Criteria) this;
        }

        public Criteria andAirportDescrNotIn(List<String> values) {
            addCriterion("airport_descr not in", values, "airportDescr");
            return (Criteria) this;
        }

        public Criteria andAirportDescrBetween(String value1, String value2) {
            addCriterion("airport_descr between", value1, value2, "airportDescr");
            return (Criteria) this;
        }

        public Criteria andAirportDescrNotBetween(String value1, String value2) {
            addCriterion("airport_descr not between", value1, value2, "airportDescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrIsNull() {
            addCriterion("aircompany_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrIsNotNull() {
            addCriterion("aircompany_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrEqualTo(Integer value) {
            addCriterion("aircompany_intdescr =", value, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrNotEqualTo(Integer value) {
            addCriterion("aircompany_intdescr <>", value, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrGreaterThan(Integer value) {
            addCriterion("aircompany_intdescr >", value, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("aircompany_intdescr >=", value, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrLessThan(Integer value) {
            addCriterion("aircompany_intdescr <", value, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("aircompany_intdescr <=", value, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrIn(List<Integer> values) {
            addCriterion("aircompany_intdescr in", values, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrNotIn(List<Integer> values) {
            addCriterion("aircompany_intdescr not in", values, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("aircompany_intdescr between", value1, value2, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("aircompany_intdescr not between", value1, value2, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrIsNull() {
            addCriterion("aircompany_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrIsNotNull() {
            addCriterion("aircompany_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrEqualTo(String value) {
            addCriterion("aircompany_vardescr =", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrNotEqualTo(String value) {
            addCriterion("aircompany_vardescr <>", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrGreaterThan(String value) {
            addCriterion("aircompany_vardescr >", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("aircompany_vardescr >=", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrLessThan(String value) {
            addCriterion("aircompany_vardescr <", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrLessThanOrEqualTo(String value) {
            addCriterion("aircompany_vardescr <=", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrLike(String value) {
            addCriterion("aircompany_vardescr like", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrNotLike(String value) {
            addCriterion("aircompany_vardescr not like", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrIn(List<String> values) {
            addCriterion("aircompany_vardescr in", values, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrNotIn(List<String> values) {
            addCriterion("aircompany_vardescr not in", values, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrBetween(String value1, String value2) {
            addCriterion("aircompany_vardescr between", value1, value2, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrNotBetween(String value1, String value2) {
            addCriterion("aircompany_vardescr not between", value1, value2, "aircompanyVardescr");
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