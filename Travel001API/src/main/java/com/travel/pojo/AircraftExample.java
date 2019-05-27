package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class AircraftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AircraftExample() {
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

        public Criteria andAircompanyIdIsNull() {
            addCriterion("aircompany_id is null");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdIsNotNull() {
            addCriterion("aircompany_id is not null");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdEqualTo(Integer value) {
            addCriterion("aircompany_id =", value, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdNotEqualTo(Integer value) {
            addCriterion("aircompany_id <>", value, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdGreaterThan(Integer value) {
            addCriterion("aircompany_id >", value, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aircompany_id >=", value, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdLessThan(Integer value) {
            addCriterion("aircompany_id <", value, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("aircompany_id <=", value, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdIn(List<Integer> values) {
            addCriterion("aircompany_id in", values, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdNotIn(List<Integer> values) {
            addCriterion("aircompany_id not in", values, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("aircompany_id between", value1, value2, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aircompany_id not between", value1, value2, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircraftNameIsNull() {
            addCriterion("aircraft_name is null");
            return (Criteria) this;
        }

        public Criteria andAircraftNameIsNotNull() {
            addCriterion("aircraft_name is not null");
            return (Criteria) this;
        }

        public Criteria andAircraftNameEqualTo(String value) {
            addCriterion("aircraft_name =", value, "aircraftName");
            return (Criteria) this;
        }

        public Criteria andAircraftNameNotEqualTo(String value) {
            addCriterion("aircraft_name <>", value, "aircraftName");
            return (Criteria) this;
        }

        public Criteria andAircraftNameGreaterThan(String value) {
            addCriterion("aircraft_name >", value, "aircraftName");
            return (Criteria) this;
        }

        public Criteria andAircraftNameGreaterThanOrEqualTo(String value) {
            addCriterion("aircraft_name >=", value, "aircraftName");
            return (Criteria) this;
        }

        public Criteria andAircraftNameLessThan(String value) {
            addCriterion("aircraft_name <", value, "aircraftName");
            return (Criteria) this;
        }

        public Criteria andAircraftNameLessThanOrEqualTo(String value) {
            addCriterion("aircraft_name <=", value, "aircraftName");
            return (Criteria) this;
        }

        public Criteria andAircraftNameLike(String value) {
            addCriterion("aircraft_name like", value, "aircraftName");
            return (Criteria) this;
        }

        public Criteria andAircraftNameNotLike(String value) {
            addCriterion("aircraft_name not like", value, "aircraftName");
            return (Criteria) this;
        }

        public Criteria andAircraftNameIn(List<String> values) {
            addCriterion("aircraft_name in", values, "aircraftName");
            return (Criteria) this;
        }

        public Criteria andAircraftNameNotIn(List<String> values) {
            addCriterion("aircraft_name not in", values, "aircraftName");
            return (Criteria) this;
        }

        public Criteria andAircraftNameBetween(String value1, String value2) {
            addCriterion("aircraft_name between", value1, value2, "aircraftName");
            return (Criteria) this;
        }

        public Criteria andAircraftNameNotBetween(String value1, String value2) {
            addCriterion("aircraft_name not between", value1, value2, "aircraftName");
            return (Criteria) this;
        }

        public Criteria andAircraftTypeIsNull() {
            addCriterion("aircraft_type is null");
            return (Criteria) this;
        }

        public Criteria andAircraftTypeIsNotNull() {
            addCriterion("aircraft_type is not null");
            return (Criteria) this;
        }

        public Criteria andAircraftTypeEqualTo(String value) {
            addCriterion("aircraft_type =", value, "aircraftType");
            return (Criteria) this;
        }

        public Criteria andAircraftTypeNotEqualTo(String value) {
            addCriterion("aircraft_type <>", value, "aircraftType");
            return (Criteria) this;
        }

        public Criteria andAircraftTypeGreaterThan(String value) {
            addCriterion("aircraft_type >", value, "aircraftType");
            return (Criteria) this;
        }

        public Criteria andAircraftTypeGreaterThanOrEqualTo(String value) {
            addCriterion("aircraft_type >=", value, "aircraftType");
            return (Criteria) this;
        }

        public Criteria andAircraftTypeLessThan(String value) {
            addCriterion("aircraft_type <", value, "aircraftType");
            return (Criteria) this;
        }

        public Criteria andAircraftTypeLessThanOrEqualTo(String value) {
            addCriterion("aircraft_type <=", value, "aircraftType");
            return (Criteria) this;
        }

        public Criteria andAircraftTypeLike(String value) {
            addCriterion("aircraft_type like", value, "aircraftType");
            return (Criteria) this;
        }

        public Criteria andAircraftTypeNotLike(String value) {
            addCriterion("aircraft_type not like", value, "aircraftType");
            return (Criteria) this;
        }

        public Criteria andAircraftTypeIn(List<String> values) {
            addCriterion("aircraft_type in", values, "aircraftType");
            return (Criteria) this;
        }

        public Criteria andAircraftTypeNotIn(List<String> values) {
            addCriterion("aircraft_type not in", values, "aircraftType");
            return (Criteria) this;
        }

        public Criteria andAircraftTypeBetween(String value1, String value2) {
            addCriterion("aircraft_type between", value1, value2, "aircraftType");
            return (Criteria) this;
        }

        public Criteria andAircraftTypeNotBetween(String value1, String value2) {
            addCriterion("aircraft_type not between", value1, value2, "aircraftType");
            return (Criteria) this;
        }

        public Criteria andAircraftIntdescrIsNull() {
            addCriterion("aircraft_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andAircraftIntdescrIsNotNull() {
            addCriterion("aircraft_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andAircraftIntdescrEqualTo(Integer value) {
            addCriterion("aircraft_intdescr =", value, "aircraftIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftIntdescrNotEqualTo(Integer value) {
            addCriterion("aircraft_intdescr <>", value, "aircraftIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftIntdescrGreaterThan(Integer value) {
            addCriterion("aircraft_intdescr >", value, "aircraftIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("aircraft_intdescr >=", value, "aircraftIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftIntdescrLessThan(Integer value) {
            addCriterion("aircraft_intdescr <", value, "aircraftIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("aircraft_intdescr <=", value, "aircraftIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftIntdescrIn(List<Integer> values) {
            addCriterion("aircraft_intdescr in", values, "aircraftIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftIntdescrNotIn(List<Integer> values) {
            addCriterion("aircraft_intdescr not in", values, "aircraftIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("aircraft_intdescr between", value1, value2, "aircraftIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("aircraft_intdescr not between", value1, value2, "aircraftIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircraftVardescrIsNull() {
            addCriterion("aircraft_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andAircraftVardescrIsNotNull() {
            addCriterion("aircraft_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andAircraftVardescrEqualTo(String value) {
            addCriterion("aircraft_vardescr =", value, "aircraftVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftVardescrNotEqualTo(String value) {
            addCriterion("aircraft_vardescr <>", value, "aircraftVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftVardescrGreaterThan(String value) {
            addCriterion("aircraft_vardescr >", value, "aircraftVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("aircraft_vardescr >=", value, "aircraftVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftVardescrLessThan(String value) {
            addCriterion("aircraft_vardescr <", value, "aircraftVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftVardescrLessThanOrEqualTo(String value) {
            addCriterion("aircraft_vardescr <=", value, "aircraftVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftVardescrLike(String value) {
            addCriterion("aircraft_vardescr like", value, "aircraftVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftVardescrNotLike(String value) {
            addCriterion("aircraft_vardescr not like", value, "aircraftVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftVardescrIn(List<String> values) {
            addCriterion("aircraft_vardescr in", values, "aircraftVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftVardescrNotIn(List<String> values) {
            addCriterion("aircraft_vardescr not in", values, "aircraftVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftVardescrBetween(String value1, String value2) {
            addCriterion("aircraft_vardescr between", value1, value2, "aircraftVardescr");
            return (Criteria) this;
        }

        public Criteria andAircraftVardescrNotBetween(String value1, String value2) {
            addCriterion("aircraft_vardescr not between", value1, value2, "aircraftVardescr");
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