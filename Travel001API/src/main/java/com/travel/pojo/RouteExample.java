package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class RouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RouteExample() {
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

        public Criteria andRouteIdIsNull() {
            addCriterion("route_id is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("route_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(Integer value) {
            addCriterion("route_id =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(Integer value) {
            addCriterion("route_id <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(Integer value) {
            addCriterion("route_id >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("route_id >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(Integer value) {
            addCriterion("route_id <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(Integer value) {
            addCriterion("route_id <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<Integer> values) {
            addCriterion("route_id in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<Integer> values) {
            addCriterion("route_id not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(Integer value1, Integer value2) {
            addCriterion("route_id between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("route_id not between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteStartIsNull() {
            addCriterion("route_start is null");
            return (Criteria) this;
        }

        public Criteria andRouteStartIsNotNull() {
            addCriterion("route_start is not null");
            return (Criteria) this;
        }

        public Criteria andRouteStartEqualTo(String value) {
            addCriterion("route_start =", value, "routeStart");
            return (Criteria) this;
        }

        public Criteria andRouteStartNotEqualTo(String value) {
            addCriterion("route_start <>", value, "routeStart");
            return (Criteria) this;
        }

        public Criteria andRouteStartGreaterThan(String value) {
            addCriterion("route_start >", value, "routeStart");
            return (Criteria) this;
        }

        public Criteria andRouteStartGreaterThanOrEqualTo(String value) {
            addCriterion("route_start >=", value, "routeStart");
            return (Criteria) this;
        }

        public Criteria andRouteStartLessThan(String value) {
            addCriterion("route_start <", value, "routeStart");
            return (Criteria) this;
        }

        public Criteria andRouteStartLessThanOrEqualTo(String value) {
            addCriterion("route_start <=", value, "routeStart");
            return (Criteria) this;
        }

        public Criteria andRouteStartLike(String value) {
            addCriterion("route_start like", value, "routeStart");
            return (Criteria) this;
        }

        public Criteria andRouteStartNotLike(String value) {
            addCriterion("route_start not like", value, "routeStart");
            return (Criteria) this;
        }

        public Criteria andRouteStartIn(List<String> values) {
            addCriterion("route_start in", values, "routeStart");
            return (Criteria) this;
        }

        public Criteria andRouteStartNotIn(List<String> values) {
            addCriterion("route_start not in", values, "routeStart");
            return (Criteria) this;
        }

        public Criteria andRouteStartBetween(String value1, String value2) {
            addCriterion("route_start between", value1, value2, "routeStart");
            return (Criteria) this;
        }

        public Criteria andRouteStartNotBetween(String value1, String value2) {
            addCriterion("route_start not between", value1, value2, "routeStart");
            return (Criteria) this;
        }

        public Criteria andRouteEndIsNull() {
            addCriterion("route_end is null");
            return (Criteria) this;
        }

        public Criteria andRouteEndIsNotNull() {
            addCriterion("route_end is not null");
            return (Criteria) this;
        }

        public Criteria andRouteEndEqualTo(String value) {
            addCriterion("route_end =", value, "routeEnd");
            return (Criteria) this;
        }

        public Criteria andRouteEndNotEqualTo(String value) {
            addCriterion("route_end <>", value, "routeEnd");
            return (Criteria) this;
        }

        public Criteria andRouteEndGreaterThan(String value) {
            addCriterion("route_end >", value, "routeEnd");
            return (Criteria) this;
        }

        public Criteria andRouteEndGreaterThanOrEqualTo(String value) {
            addCriterion("route_end >=", value, "routeEnd");
            return (Criteria) this;
        }

        public Criteria andRouteEndLessThan(String value) {
            addCriterion("route_end <", value, "routeEnd");
            return (Criteria) this;
        }

        public Criteria andRouteEndLessThanOrEqualTo(String value) {
            addCriterion("route_end <=", value, "routeEnd");
            return (Criteria) this;
        }

        public Criteria andRouteEndLike(String value) {
            addCriterion("route_end like", value, "routeEnd");
            return (Criteria) this;
        }

        public Criteria andRouteEndNotLike(String value) {
            addCriterion("route_end not like", value, "routeEnd");
            return (Criteria) this;
        }

        public Criteria andRouteEndIn(List<String> values) {
            addCriterion("route_end in", values, "routeEnd");
            return (Criteria) this;
        }

        public Criteria andRouteEndNotIn(List<String> values) {
            addCriterion("route_end not in", values, "routeEnd");
            return (Criteria) this;
        }

        public Criteria andRouteEndBetween(String value1, String value2) {
            addCriterion("route_end between", value1, value2, "routeEnd");
            return (Criteria) this;
        }

        public Criteria andRouteEndNotBetween(String value1, String value2) {
            addCriterion("route_end not between", value1, value2, "routeEnd");
            return (Criteria) this;
        }

        public Criteria andRouteIntdescrIsNull() {
            addCriterion("route_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andRouteIntdescrIsNotNull() {
            addCriterion("route_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIntdescrEqualTo(Integer value) {
            addCriterion("route_intdescr =", value, "routeIntdescr");
            return (Criteria) this;
        }

        public Criteria andRouteIntdescrNotEqualTo(Integer value) {
            addCriterion("route_intdescr <>", value, "routeIntdescr");
            return (Criteria) this;
        }

        public Criteria andRouteIntdescrGreaterThan(Integer value) {
            addCriterion("route_intdescr >", value, "routeIntdescr");
            return (Criteria) this;
        }

        public Criteria andRouteIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("route_intdescr >=", value, "routeIntdescr");
            return (Criteria) this;
        }

        public Criteria andRouteIntdescrLessThan(Integer value) {
            addCriterion("route_intdescr <", value, "routeIntdescr");
            return (Criteria) this;
        }

        public Criteria andRouteIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("route_intdescr <=", value, "routeIntdescr");
            return (Criteria) this;
        }

        public Criteria andRouteIntdescrIn(List<Integer> values) {
            addCriterion("route_intdescr in", values, "routeIntdescr");
            return (Criteria) this;
        }

        public Criteria andRouteIntdescrNotIn(List<Integer> values) {
            addCriterion("route_intdescr not in", values, "routeIntdescr");
            return (Criteria) this;
        }

        public Criteria andRouteIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("route_intdescr between", value1, value2, "routeIntdescr");
            return (Criteria) this;
        }

        public Criteria andRouteIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("route_intdescr not between", value1, value2, "routeIntdescr");
            return (Criteria) this;
        }

        public Criteria andRouteVardescrIsNull() {
            addCriterion("route_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andRouteVardescrIsNotNull() {
            addCriterion("route_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andRouteVardescrEqualTo(String value) {
            addCriterion("route_vardescr =", value, "routeVardescr");
            return (Criteria) this;
        }

        public Criteria andRouteVardescrNotEqualTo(String value) {
            addCriterion("route_vardescr <>", value, "routeVardescr");
            return (Criteria) this;
        }

        public Criteria andRouteVardescrGreaterThan(String value) {
            addCriterion("route_vardescr >", value, "routeVardescr");
            return (Criteria) this;
        }

        public Criteria andRouteVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("route_vardescr >=", value, "routeVardescr");
            return (Criteria) this;
        }

        public Criteria andRouteVardescrLessThan(String value) {
            addCriterion("route_vardescr <", value, "routeVardescr");
            return (Criteria) this;
        }

        public Criteria andRouteVardescrLessThanOrEqualTo(String value) {
            addCriterion("route_vardescr <=", value, "routeVardescr");
            return (Criteria) this;
        }

        public Criteria andRouteVardescrLike(String value) {
            addCriterion("route_vardescr like", value, "routeVardescr");
            return (Criteria) this;
        }

        public Criteria andRouteVardescrNotLike(String value) {
            addCriterion("route_vardescr not like", value, "routeVardescr");
            return (Criteria) this;
        }

        public Criteria andRouteVardescrIn(List<String> values) {
            addCriterion("route_vardescr in", values, "routeVardescr");
            return (Criteria) this;
        }

        public Criteria andRouteVardescrNotIn(List<String> values) {
            addCriterion("route_vardescr not in", values, "routeVardescr");
            return (Criteria) this;
        }

        public Criteria andRouteVardescrBetween(String value1, String value2) {
            addCriterion("route_vardescr between", value1, value2, "routeVardescr");
            return (Criteria) this;
        }

        public Criteria andRouteVardescrNotBetween(String value1, String value2) {
            addCriterion("route_vardescr not between", value1, value2, "routeVardescr");
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