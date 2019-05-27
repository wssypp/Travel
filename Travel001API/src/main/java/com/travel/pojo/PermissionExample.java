package com.travel.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
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

        public Criteria andPermissionIdIsNull() {
            addCriterion("permission_id is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(Integer value) {
            addCriterion("permission_id =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(Integer value) {
            addCriterion("permission_id <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(Integer value) {
            addCriterion("permission_id >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("permission_id >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(Integer value) {
            addCriterion("permission_id <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(Integer value) {
            addCriterion("permission_id <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<Integer> values) {
            addCriterion("permission_id in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<Integer> values) {
            addCriterion("permission_id not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(Integer value1, Integer value2) {
            addCriterion("permission_id between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("permission_id not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNull() {
            addCriterion("permission_name is null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNotNull() {
            addCriterion("permission_name is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameEqualTo(String value) {
            addCriterion("permission_name =", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotEqualTo(String value) {
            addCriterion("permission_name <>", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThan(String value) {
            addCriterion("permission_name >", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("permission_name >=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThan(String value) {
            addCriterion("permission_name <", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThanOrEqualTo(String value) {
            addCriterion("permission_name <=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLike(String value) {
            addCriterion("permission_name like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotLike(String value) {
            addCriterion("permission_name not like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIn(List<String> values) {
            addCriterion("permission_name in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotIn(List<String> values) {
            addCriterion("permission_name not in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameBetween(String value1, String value2) {
            addCriterion("permission_name between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotBetween(String value1, String value2) {
            addCriterion("permission_name not between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionCreatetimeIsNull() {
            addCriterion("permission_createtime is null");
            return (Criteria) this;
        }

        public Criteria andPermissionCreatetimeIsNotNull() {
            addCriterion("permission_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionCreatetimeEqualTo(Date value) {
            addCriterion("permission_createtime =", value, "permissionCreatetime");
            return (Criteria) this;
        }

        public Criteria andPermissionCreatetimeNotEqualTo(Date value) {
            addCriterion("permission_createtime <>", value, "permissionCreatetime");
            return (Criteria) this;
        }

        public Criteria andPermissionCreatetimeGreaterThan(Date value) {
            addCriterion("permission_createtime >", value, "permissionCreatetime");
            return (Criteria) this;
        }

        public Criteria andPermissionCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("permission_createtime >=", value, "permissionCreatetime");
            return (Criteria) this;
        }

        public Criteria andPermissionCreatetimeLessThan(Date value) {
            addCriterion("permission_createtime <", value, "permissionCreatetime");
            return (Criteria) this;
        }

        public Criteria andPermissionCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("permission_createtime <=", value, "permissionCreatetime");
            return (Criteria) this;
        }

        public Criteria andPermissionCreatetimeIn(List<Date> values) {
            addCriterion("permission_createtime in", values, "permissionCreatetime");
            return (Criteria) this;
        }

        public Criteria andPermissionCreatetimeNotIn(List<Date> values) {
            addCriterion("permission_createtime not in", values, "permissionCreatetime");
            return (Criteria) this;
        }

        public Criteria andPermissionCreatetimeBetween(Date value1, Date value2) {
            addCriterion("permission_createtime between", value1, value2, "permissionCreatetime");
            return (Criteria) this;
        }

        public Criteria andPermissionCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("permission_createtime not between", value1, value2, "permissionCreatetime");
            return (Criteria) this;
        }

        public Criteria andPermissionIntdescrIsNull() {
            addCriterion("permission_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIntdescrIsNotNull() {
            addCriterion("permission_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIntdescrEqualTo(Integer value) {
            addCriterion("permission_intdescr =", value, "permissionIntdescr");
            return (Criteria) this;
        }

        public Criteria andPermissionIntdescrNotEqualTo(Integer value) {
            addCriterion("permission_intdescr <>", value, "permissionIntdescr");
            return (Criteria) this;
        }

        public Criteria andPermissionIntdescrGreaterThan(Integer value) {
            addCriterion("permission_intdescr >", value, "permissionIntdescr");
            return (Criteria) this;
        }

        public Criteria andPermissionIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("permission_intdescr >=", value, "permissionIntdescr");
            return (Criteria) this;
        }

        public Criteria andPermissionIntdescrLessThan(Integer value) {
            addCriterion("permission_intdescr <", value, "permissionIntdescr");
            return (Criteria) this;
        }

        public Criteria andPermissionIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("permission_intdescr <=", value, "permissionIntdescr");
            return (Criteria) this;
        }

        public Criteria andPermissionIntdescrIn(List<Integer> values) {
            addCriterion("permission_intdescr in", values, "permissionIntdescr");
            return (Criteria) this;
        }

        public Criteria andPermissionIntdescrNotIn(List<Integer> values) {
            addCriterion("permission_intdescr not in", values, "permissionIntdescr");
            return (Criteria) this;
        }

        public Criteria andPermissionIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("permission_intdescr between", value1, value2, "permissionIntdescr");
            return (Criteria) this;
        }

        public Criteria andPermissionIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("permission_intdescr not between", value1, value2, "permissionIntdescr");
            return (Criteria) this;
        }

        public Criteria andPermissionVardescrIsNull() {
            addCriterion("permission_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andPermissionVardescrIsNotNull() {
            addCriterion("permission_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionVardescrEqualTo(String value) {
            addCriterion("permission_vardescr =", value, "permissionVardescr");
            return (Criteria) this;
        }

        public Criteria andPermissionVardescrNotEqualTo(String value) {
            addCriterion("permission_vardescr <>", value, "permissionVardescr");
            return (Criteria) this;
        }

        public Criteria andPermissionVardescrGreaterThan(String value) {
            addCriterion("permission_vardescr >", value, "permissionVardescr");
            return (Criteria) this;
        }

        public Criteria andPermissionVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("permission_vardescr >=", value, "permissionVardescr");
            return (Criteria) this;
        }

        public Criteria andPermissionVardescrLessThan(String value) {
            addCriterion("permission_vardescr <", value, "permissionVardescr");
            return (Criteria) this;
        }

        public Criteria andPermissionVardescrLessThanOrEqualTo(String value) {
            addCriterion("permission_vardescr <=", value, "permissionVardescr");
            return (Criteria) this;
        }

        public Criteria andPermissionVardescrLike(String value) {
            addCriterion("permission_vardescr like", value, "permissionVardescr");
            return (Criteria) this;
        }

        public Criteria andPermissionVardescrNotLike(String value) {
            addCriterion("permission_vardescr not like", value, "permissionVardescr");
            return (Criteria) this;
        }

        public Criteria andPermissionVardescrIn(List<String> values) {
            addCriterion("permission_vardescr in", values, "permissionVardescr");
            return (Criteria) this;
        }

        public Criteria andPermissionVardescrNotIn(List<String> values) {
            addCriterion("permission_vardescr not in", values, "permissionVardescr");
            return (Criteria) this;
        }

        public Criteria andPermissionVardescrBetween(String value1, String value2) {
            addCriterion("permission_vardescr between", value1, value2, "permissionVardescr");
            return (Criteria) this;
        }

        public Criteria andPermissionVardescrNotBetween(String value1, String value2) {
            addCriterion("permission_vardescr not between", value1, value2, "permissionVardescr");
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