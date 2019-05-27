package com.travel.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUsersNameIsNull() {
            addCriterion("users_name is null");
            return (Criteria) this;
        }

        public Criteria andUsersNameIsNotNull() {
            addCriterion("users_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsersNameEqualTo(String value) {
            addCriterion("users_name =", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotEqualTo(String value) {
            addCriterion("users_name <>", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameGreaterThan(String value) {
            addCriterion("users_name >", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameGreaterThanOrEqualTo(String value) {
            addCriterion("users_name >=", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLessThan(String value) {
            addCriterion("users_name <", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLessThanOrEqualTo(String value) {
            addCriterion("users_name <=", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLike(String value) {
            addCriterion("users_name like", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotLike(String value) {
            addCriterion("users_name not like", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameIn(List<String> values) {
            addCriterion("users_name in", values, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotIn(List<String> values) {
            addCriterion("users_name not in", values, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameBetween(String value1, String value2) {
            addCriterion("users_name between", value1, value2, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotBetween(String value1, String value2) {
            addCriterion("users_name not between", value1, value2, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersPassIsNull() {
            addCriterion("users_pass is null");
            return (Criteria) this;
        }

        public Criteria andUsersPassIsNotNull() {
            addCriterion("users_pass is not null");
            return (Criteria) this;
        }

        public Criteria andUsersPassEqualTo(String value) {
            addCriterion("users_pass =", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassNotEqualTo(String value) {
            addCriterion("users_pass <>", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassGreaterThan(String value) {
            addCriterion("users_pass >", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassGreaterThanOrEqualTo(String value) {
            addCriterion("users_pass >=", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassLessThan(String value) {
            addCriterion("users_pass <", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassLessThanOrEqualTo(String value) {
            addCriterion("users_pass <=", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassLike(String value) {
            addCriterion("users_pass like", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassNotLike(String value) {
            addCriterion("users_pass not like", value, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassIn(List<String> values) {
            addCriterion("users_pass in", values, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassNotIn(List<String> values) {
            addCriterion("users_pass not in", values, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassBetween(String value1, String value2) {
            addCriterion("users_pass between", value1, value2, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersPassNotBetween(String value1, String value2) {
            addCriterion("users_pass not between", value1, value2, "usersPass");
            return (Criteria) this;
        }

        public Criteria andUsersImgIsNull() {
            addCriterion("users_img is null");
            return (Criteria) this;
        }

        public Criteria andUsersImgIsNotNull() {
            addCriterion("users_img is not null");
            return (Criteria) this;
        }

        public Criteria andUsersImgEqualTo(String value) {
            addCriterion("users_img =", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgNotEqualTo(String value) {
            addCriterion("users_img <>", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgGreaterThan(String value) {
            addCriterion("users_img >", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgGreaterThanOrEqualTo(String value) {
            addCriterion("users_img >=", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgLessThan(String value) {
            addCriterion("users_img <", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgLessThanOrEqualTo(String value) {
            addCriterion("users_img <=", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgLike(String value) {
            addCriterion("users_img like", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgNotLike(String value) {
            addCriterion("users_img not like", value, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgIn(List<String> values) {
            addCriterion("users_img in", values, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgNotIn(List<String> values) {
            addCriterion("users_img not in", values, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgBetween(String value1, String value2) {
            addCriterion("users_img between", value1, value2, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersImgNotBetween(String value1, String value2) {
            addCriterion("users_img not between", value1, value2, "usersImg");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceIsNull() {
            addCriterion("users_introduce is null");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceIsNotNull() {
            addCriterion("users_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceEqualTo(String value) {
            addCriterion("users_introduce =", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceNotEqualTo(String value) {
            addCriterion("users_introduce <>", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceGreaterThan(String value) {
            addCriterion("users_introduce >", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("users_introduce >=", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceLessThan(String value) {
            addCriterion("users_introduce <", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceLessThanOrEqualTo(String value) {
            addCriterion("users_introduce <=", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceLike(String value) {
            addCriterion("users_introduce like", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceNotLike(String value) {
            addCriterion("users_introduce not like", value, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceIn(List<String> values) {
            addCriterion("users_introduce in", values, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceNotIn(List<String> values) {
            addCriterion("users_introduce not in", values, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceBetween(String value1, String value2) {
            addCriterion("users_introduce between", value1, value2, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersIntroduceNotBetween(String value1, String value2) {
            addCriterion("users_introduce not between", value1, value2, "usersIntroduce");
            return (Criteria) this;
        }

        public Criteria andUsersCreatetimeIsNull() {
            addCriterion("users_createtime is null");
            return (Criteria) this;
        }

        public Criteria andUsersCreatetimeIsNotNull() {
            addCriterion("users_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andUsersCreatetimeEqualTo(Date value) {
            addCriterion("users_createtime =", value, "usersCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsersCreatetimeNotEqualTo(Date value) {
            addCriterion("users_createtime <>", value, "usersCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsersCreatetimeGreaterThan(Date value) {
            addCriterion("users_createtime >", value, "usersCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsersCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("users_createtime >=", value, "usersCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsersCreatetimeLessThan(Date value) {
            addCriterion("users_createtime <", value, "usersCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsersCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("users_createtime <=", value, "usersCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsersCreatetimeIn(List<Date> values) {
            addCriterion("users_createtime in", values, "usersCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsersCreatetimeNotIn(List<Date> values) {
            addCriterion("users_createtime not in", values, "usersCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsersCreatetimeBetween(Date value1, Date value2) {
            addCriterion("users_createtime between", value1, value2, "usersCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsersCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("users_createtime not between", value1, value2, "usersCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsersIntdescrIsNull() {
            addCriterion("users_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andUsersIntdescrIsNotNull() {
            addCriterion("users_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIntdescrEqualTo(Integer value) {
            addCriterion("users_intdescr =", value, "usersIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersIntdescrNotEqualTo(Integer value) {
            addCriterion("users_intdescr <>", value, "usersIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersIntdescrGreaterThan(Integer value) {
            addCriterion("users_intdescr >", value, "usersIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("users_intdescr >=", value, "usersIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersIntdescrLessThan(Integer value) {
            addCriterion("users_intdescr <", value, "usersIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("users_intdescr <=", value, "usersIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersIntdescrIn(List<Integer> values) {
            addCriterion("users_intdescr in", values, "usersIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersIntdescrNotIn(List<Integer> values) {
            addCriterion("users_intdescr not in", values, "usersIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("users_intdescr between", value1, value2, "usersIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("users_intdescr not between", value1, value2, "usersIntdescr");
            return (Criteria) this;
        }

        public Criteria andUsersVardescrIsNull() {
            addCriterion("users_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andUsersVardescrIsNotNull() {
            addCriterion("users_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andUsersVardescrEqualTo(String value) {
            addCriterion("users_vardescr =", value, "usersVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersVardescrNotEqualTo(String value) {
            addCriterion("users_vardescr <>", value, "usersVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersVardescrGreaterThan(String value) {
            addCriterion("users_vardescr >", value, "usersVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("users_vardescr >=", value, "usersVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersVardescrLessThan(String value) {
            addCriterion("users_vardescr <", value, "usersVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersVardescrLessThanOrEqualTo(String value) {
            addCriterion("users_vardescr <=", value, "usersVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersVardescrLike(String value) {
            addCriterion("users_vardescr like", value, "usersVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersVardescrNotLike(String value) {
            addCriterion("users_vardescr not like", value, "usersVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersVardescrIn(List<String> values) {
            addCriterion("users_vardescr in", values, "usersVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersVardescrNotIn(List<String> values) {
            addCriterion("users_vardescr not in", values, "usersVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersVardescrBetween(String value1, String value2) {
            addCriterion("users_vardescr between", value1, value2, "usersVardescr");
            return (Criteria) this;
        }

        public Criteria andUsersVardescrNotBetween(String value1, String value2) {
            addCriterion("users_vardescr not between", value1, value2, "usersVardescr");
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