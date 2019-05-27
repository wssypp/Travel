package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class UsersRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersRoleExample() {
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

        public Criteria andUsersRoleIdIsNull() {
            addCriterion("users_role_id is null");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIdIsNotNull() {
            addCriterion("users_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIdEqualTo(Integer value) {
            addCriterion("users_role_id =", value, "usersRoleId");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIdNotEqualTo(Integer value) {
            addCriterion("users_role_id <>", value, "usersRoleId");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIdGreaterThan(Integer value) {
            addCriterion("users_role_id >", value, "usersRoleId");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("users_role_id >=", value, "usersRoleId");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIdLessThan(Integer value) {
            addCriterion("users_role_id <", value, "usersRoleId");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("users_role_id <=", value, "usersRoleId");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIdIn(List<Integer> values) {
            addCriterion("users_role_id in", values, "usersRoleId");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIdNotIn(List<Integer> values) {
            addCriterion("users_role_id not in", values, "usersRoleId");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("users_role_id between", value1, value2, "usersRoleId");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("users_role_id not between", value1, value2, "usersRoleId");
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

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIntdescrIsNull() {
            addCriterion("users_role_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIntdescrIsNotNull() {
            addCriterion("users_role_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIntdescrEqualTo(Integer value) {
            addCriterion("users_role_intdescr =", value, "usersRoleIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIntdescrNotEqualTo(Integer value) {
            addCriterion("users_role_intdescr <>", value, "usersRoleIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIntdescrGreaterThan(Integer value) {
            addCriterion("users_role_intdescr >", value, "usersRoleIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("users_role_intdescr >=", value, "usersRoleIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIntdescrLessThan(Integer value) {
            addCriterion("users_role_intdescr <", value, "usersRoleIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("users_role_intdescr <=", value, "usersRoleIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIntdescrIn(List<Integer> values) {
            addCriterion("users_role_intdescr in", values, "usersRoleIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIntdescrNotIn(List<Integer> values) {
            addCriterion("users_role_intdescr not in", values, "usersRoleIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("users_role_intdescr between", value1, value2, "usersRoleIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("users_role_intdescr not between", value1, value2, "usersRoleIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleVardescrIsNull() {
            addCriterion("users_role_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andUsersRoleVardescrIsNotNull() {
            addCriterion("users_role_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andUsersRoleVardescrEqualTo(String value) {
            addCriterion("users_role_vardescr =", value, "usersRoleVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleVardescrNotEqualTo(String value) {
            addCriterion("users_role_vardescr <>", value, "usersRoleVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleVardescrGreaterThan(String value) {
            addCriterion("users_role_vardescr >", value, "usersRoleVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("users_role_vardescr >=", value, "usersRoleVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleVardescrLessThan(String value) {
            addCriterion("users_role_vardescr <", value, "usersRoleVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleVardescrLessThanOrEqualTo(String value) {
            addCriterion("users_role_vardescr <=", value, "usersRoleVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleVardescrLike(String value) {
            addCriterion("users_role_vardescr like", value, "usersRoleVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleVardescrNotLike(String value) {
            addCriterion("users_role_vardescr not like", value, "usersRoleVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleVardescrIn(List<String> values) {
            addCriterion("users_role_vardescr in", values, "usersRoleVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleVardescrNotIn(List<String> values) {
            addCriterion("users_role_vardescr not in", values, "usersRoleVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleVardescrBetween(String value1, String value2) {
            addCriterion("users_role_vardescr between", value1, value2, "usersRoleVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersRoleVardescrNotBetween(String value1, String value2) {
            addCriterion("users_role_vardescr not between", value1, value2, "usersRoleVardescr");
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