package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class EntranceTicketTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EntranceTicketTypeExample() {
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

        public Criteria andEntranceTicketTypeIdIsNull() {
            addCriterion("entrance_ticket_type_id is null");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIdIsNotNull() {
            addCriterion("entrance_ticket_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIdEqualTo(Integer value) {
            addCriterion("entrance_ticket_type_id =", value, "entranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIdNotEqualTo(Integer value) {
            addCriterion("entrance_ticket_type_id <>", value, "entranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIdGreaterThan(Integer value) {
            addCriterion("entrance_ticket_type_id >", value, "entranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("entrance_ticket_type_id >=", value, "entranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIdLessThan(Integer value) {
            addCriterion("entrance_ticket_type_id <", value, "entranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("entrance_ticket_type_id <=", value, "entranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIdIn(List<Integer> values) {
            addCriterion("entrance_ticket_type_id in", values, "entranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIdNotIn(List<Integer> values) {
            addCriterion("entrance_ticket_type_id not in", values, "entranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("entrance_ticket_type_id between", value1, value2, "entranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("entrance_ticket_type_id not between", value1, value2, "entranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeNameIsNull() {
            addCriterion("entrance_ticket_type_name is null");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeNameIsNotNull() {
            addCriterion("entrance_ticket_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeNameEqualTo(String value) {
            addCriterion("entrance_ticket_type_name =", value, "entranceTicketTypeName");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeNameNotEqualTo(String value) {
            addCriterion("entrance_ticket_type_name <>", value, "entranceTicketTypeName");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeNameGreaterThan(String value) {
            addCriterion("entrance_ticket_type_name >", value, "entranceTicketTypeName");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("entrance_ticket_type_name >=", value, "entranceTicketTypeName");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeNameLessThan(String value) {
            addCriterion("entrance_ticket_type_name <", value, "entranceTicketTypeName");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeNameLessThanOrEqualTo(String value) {
            addCriterion("entrance_ticket_type_name <=", value, "entranceTicketTypeName");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeNameLike(String value) {
            addCriterion("entrance_ticket_type_name like", value, "entranceTicketTypeName");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeNameNotLike(String value) {
            addCriterion("entrance_ticket_type_name not like", value, "entranceTicketTypeName");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeNameIn(List<String> values) {
            addCriterion("entrance_ticket_type_name in", values, "entranceTicketTypeName");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeNameNotIn(List<String> values) {
            addCriterion("entrance_ticket_type_name not in", values, "entranceTicketTypeName");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeNameBetween(String value1, String value2) {
            addCriterion("entrance_ticket_type_name between", value1, value2, "entranceTicketTypeName");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeNameNotBetween(String value1, String value2) {
            addCriterion("entrance_ticket_type_name not between", value1, value2, "entranceTicketTypeName");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypePriceIsNull() {
            addCriterion("entrance_ticket_type_price is null");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypePriceIsNotNull() {
            addCriterion("entrance_ticket_type_price is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypePriceEqualTo(Double value) {
            addCriterion("entrance_ticket_type_price =", value, "entranceTicketTypePrice");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypePriceNotEqualTo(Double value) {
            addCriterion("entrance_ticket_type_price <>", value, "entranceTicketTypePrice");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypePriceGreaterThan(Double value) {
            addCriterion("entrance_ticket_type_price >", value, "entranceTicketTypePrice");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("entrance_ticket_type_price >=", value, "entranceTicketTypePrice");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypePriceLessThan(Double value) {
            addCriterion("entrance_ticket_type_price <", value, "entranceTicketTypePrice");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypePriceLessThanOrEqualTo(Double value) {
            addCriterion("entrance_ticket_type_price <=", value, "entranceTicketTypePrice");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypePriceIn(List<Double> values) {
            addCriterion("entrance_ticket_type_price in", values, "entranceTicketTypePrice");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypePriceNotIn(List<Double> values) {
            addCriterion("entrance_ticket_type_price not in", values, "entranceTicketTypePrice");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypePriceBetween(Double value1, Double value2) {
            addCriterion("entrance_ticket_type_price between", value1, value2, "entranceTicketTypePrice");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypePriceNotBetween(Double value1, Double value2) {
            addCriterion("entrance_ticket_type_price not between", value1, value2, "entranceTicketTypePrice");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketIdIsNull() {
            addCriterion("entrance_ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketIdIsNotNull() {
            addCriterion("entrance_ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketIdEqualTo(Integer value) {
            addCriterion("entrance_ticket_id =", value, "entranceTicketId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketIdNotEqualTo(Integer value) {
            addCriterion("entrance_ticket_id <>", value, "entranceTicketId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketIdGreaterThan(Integer value) {
            addCriterion("entrance_ticket_id >", value, "entranceTicketId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("entrance_ticket_id >=", value, "entranceTicketId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketIdLessThan(Integer value) {
            addCriterion("entrance_ticket_id <", value, "entranceTicketId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketIdLessThanOrEqualTo(Integer value) {
            addCriterion("entrance_ticket_id <=", value, "entranceTicketId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketIdIn(List<Integer> values) {
            addCriterion("entrance_ticket_id in", values, "entranceTicketId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketIdNotIn(List<Integer> values) {
            addCriterion("entrance_ticket_id not in", values, "entranceTicketId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketIdBetween(Integer value1, Integer value2) {
            addCriterion("entrance_ticket_id between", value1, value2, "entranceTicketId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketIdNotBetween(Integer value1, Integer value2) {
            addCriterion("entrance_ticket_id not between", value1, value2, "entranceTicketId");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeVardescrIsNull() {
            addCriterion("entrance_ticket_type_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeVardescrIsNotNull() {
            addCriterion("entrance_ticket_type_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeVardescrEqualTo(String value) {
            addCriterion("entrance_ticket_type_vardescr =", value, "entranceTicketTypeVardescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeVardescrNotEqualTo(String value) {
            addCriterion("entrance_ticket_type_vardescr <>", value, "entranceTicketTypeVardescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeVardescrGreaterThan(String value) {
            addCriterion("entrance_ticket_type_vardescr >", value, "entranceTicketTypeVardescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("entrance_ticket_type_vardescr >=", value, "entranceTicketTypeVardescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeVardescrLessThan(String value) {
            addCriterion("entrance_ticket_type_vardescr <", value, "entranceTicketTypeVardescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeVardescrLessThanOrEqualTo(String value) {
            addCriterion("entrance_ticket_type_vardescr <=", value, "entranceTicketTypeVardescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeVardescrLike(String value) {
            addCriterion("entrance_ticket_type_vardescr like", value, "entranceTicketTypeVardescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeVardescrNotLike(String value) {
            addCriterion("entrance_ticket_type_vardescr not like", value, "entranceTicketTypeVardescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeVardescrIn(List<String> values) {
            addCriterion("entrance_ticket_type_vardescr in", values, "entranceTicketTypeVardescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeVardescrNotIn(List<String> values) {
            addCriterion("entrance_ticket_type_vardescr not in", values, "entranceTicketTypeVardescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeVardescrBetween(String value1, String value2) {
            addCriterion("entrance_ticket_type_vardescr between", value1, value2, "entranceTicketTypeVardescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeVardescrNotBetween(String value1, String value2) {
            addCriterion("entrance_ticket_type_vardescr not between", value1, value2, "entranceTicketTypeVardescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIntdescrIsNull() {
            addCriterion("entrance_ticket_type_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIntdescrIsNotNull() {
            addCriterion("entrance_ticket_type_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIntdescrEqualTo(Integer value) {
            addCriterion("entrance_ticket_type_intdescr =", value, "entranceTicketTypeIntdescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIntdescrNotEqualTo(Integer value) {
            addCriterion("entrance_ticket_type_intdescr <>", value, "entranceTicketTypeIntdescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIntdescrGreaterThan(Integer value) {
            addCriterion("entrance_ticket_type_intdescr >", value, "entranceTicketTypeIntdescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("entrance_ticket_type_intdescr >=", value, "entranceTicketTypeIntdescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIntdescrLessThan(Integer value) {
            addCriterion("entrance_ticket_type_intdescr <", value, "entranceTicketTypeIntdescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("entrance_ticket_type_intdescr <=", value, "entranceTicketTypeIntdescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIntdescrIn(List<Integer> values) {
            addCriterion("entrance_ticket_type_intdescr in", values, "entranceTicketTypeIntdescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIntdescrNotIn(List<Integer> values) {
            addCriterion("entrance_ticket_type_intdescr not in", values, "entranceTicketTypeIntdescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("entrance_ticket_type_intdescr between", value1, value2, "entranceTicketTypeIntdescr");
            return (Criteria) this;
        }

        public Criteria andEntranceTicketTypeIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("entrance_ticket_type_intdescr not between", value1, value2, "entranceTicketTypeIntdescr");
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