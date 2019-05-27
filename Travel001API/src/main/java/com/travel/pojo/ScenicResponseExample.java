package com.travel.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScenicResponseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicResponseExample() {
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

        public Criteria andScenicResponseIdIsNull() {
            addCriterion("scenic_response_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIdIsNotNull() {
            addCriterion("scenic_response_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIdEqualTo(Integer value) {
            addCriterion("scenic_response_id =", value, "scenicResponseId");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIdNotEqualTo(Integer value) {
            addCriterion("scenic_response_id <>", value, "scenicResponseId");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIdGreaterThan(Integer value) {
            addCriterion("scenic_response_id >", value, "scenicResponseId");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_response_id >=", value, "scenicResponseId");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIdLessThan(Integer value) {
            addCriterion("scenic_response_id <", value, "scenicResponseId");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_response_id <=", value, "scenicResponseId");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIdIn(List<Integer> values) {
            addCriterion("scenic_response_id in", values, "scenicResponseId");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIdNotIn(List<Integer> values) {
            addCriterion("scenic_response_id not in", values, "scenicResponseId");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_response_id between", value1, value2, "scenicResponseId");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_response_id not between", value1, value2, "scenicResponseId");
            return (Criteria) this;
        }

        public Criteria andScenicResponseTimeIsNull() {
            addCriterion("scenic_response_time is null");
            return (Criteria) this;
        }

        public Criteria andScenicResponseTimeIsNotNull() {
            addCriterion("scenic_response_time is not null");
            return (Criteria) this;
        }

        public Criteria andScenicResponseTimeEqualTo(Date value) {
            addCriterion("scenic_response_time =", value, "scenicResponseTime");
            return (Criteria) this;
        }

        public Criteria andScenicResponseTimeNotEqualTo(Date value) {
            addCriterion("scenic_response_time <>", value, "scenicResponseTime");
            return (Criteria) this;
        }

        public Criteria andScenicResponseTimeGreaterThan(Date value) {
            addCriterion("scenic_response_time >", value, "scenicResponseTime");
            return (Criteria) this;
        }

        public Criteria andScenicResponseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scenic_response_time >=", value, "scenicResponseTime");
            return (Criteria) this;
        }

        public Criteria andScenicResponseTimeLessThan(Date value) {
            addCriterion("scenic_response_time <", value, "scenicResponseTime");
            return (Criteria) this;
        }

        public Criteria andScenicResponseTimeLessThanOrEqualTo(Date value) {
            addCriterion("scenic_response_time <=", value, "scenicResponseTime");
            return (Criteria) this;
        }

        public Criteria andScenicResponseTimeIn(List<Date> values) {
            addCriterion("scenic_response_time in", values, "scenicResponseTime");
            return (Criteria) this;
        }

        public Criteria andScenicResponseTimeNotIn(List<Date> values) {
            addCriterion("scenic_response_time not in", values, "scenicResponseTime");
            return (Criteria) this;
        }

        public Criteria andScenicResponseTimeBetween(Date value1, Date value2) {
            addCriterion("scenic_response_time between", value1, value2, "scenicResponseTime");
            return (Criteria) this;
        }

        public Criteria andScenicResponseTimeNotBetween(Date value1, Date value2) {
            addCriterion("scenic_response_time not between", value1, value2, "scenicResponseTime");
            return (Criteria) this;
        }

        public Criteria andScenicResponseImgIsNull() {
            addCriterion("scenic_response_img is null");
            return (Criteria) this;
        }

        public Criteria andScenicResponseImgIsNotNull() {
            addCriterion("scenic_response_img is not null");
            return (Criteria) this;
        }

        public Criteria andScenicResponseImgEqualTo(String value) {
            addCriterion("scenic_response_img =", value, "scenicResponseImg");
            return (Criteria) this;
        }

        public Criteria andScenicResponseImgNotEqualTo(String value) {
            addCriterion("scenic_response_img <>", value, "scenicResponseImg");
            return (Criteria) this;
        }

        public Criteria andScenicResponseImgGreaterThan(String value) {
            addCriterion("scenic_response_img >", value, "scenicResponseImg");
            return (Criteria) this;
        }

        public Criteria andScenicResponseImgGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_response_img >=", value, "scenicResponseImg");
            return (Criteria) this;
        }

        public Criteria andScenicResponseImgLessThan(String value) {
            addCriterion("scenic_response_img <", value, "scenicResponseImg");
            return (Criteria) this;
        }

        public Criteria andScenicResponseImgLessThanOrEqualTo(String value) {
            addCriterion("scenic_response_img <=", value, "scenicResponseImg");
            return (Criteria) this;
        }

        public Criteria andScenicResponseImgLike(String value) {
            addCriterion("scenic_response_img like", value, "scenicResponseImg");
            return (Criteria) this;
        }

        public Criteria andScenicResponseImgNotLike(String value) {
            addCriterion("scenic_response_img not like", value, "scenicResponseImg");
            return (Criteria) this;
        }

        public Criteria andScenicResponseImgIn(List<String> values) {
            addCriterion("scenic_response_img in", values, "scenicResponseImg");
            return (Criteria) this;
        }

        public Criteria andScenicResponseImgNotIn(List<String> values) {
            addCriterion("scenic_response_img not in", values, "scenicResponseImg");
            return (Criteria) this;
        }

        public Criteria andScenicResponseImgBetween(String value1, String value2) {
            addCriterion("scenic_response_img between", value1, value2, "scenicResponseImg");
            return (Criteria) this;
        }

        public Criteria andScenicResponseImgNotBetween(String value1, String value2) {
            addCriterion("scenic_response_img not between", value1, value2, "scenicResponseImg");
            return (Criteria) this;
        }

        public Criteria andScenicResponseContentIsNull() {
            addCriterion("scenic_response_content is null");
            return (Criteria) this;
        }

        public Criteria andScenicResponseContentIsNotNull() {
            addCriterion("scenic_response_content is not null");
            return (Criteria) this;
        }

        public Criteria andScenicResponseContentEqualTo(String value) {
            addCriterion("scenic_response_content =", value, "scenicResponseContent");
            return (Criteria) this;
        }

        public Criteria andScenicResponseContentNotEqualTo(String value) {
            addCriterion("scenic_response_content <>", value, "scenicResponseContent");
            return (Criteria) this;
        }

        public Criteria andScenicResponseContentGreaterThan(String value) {
            addCriterion("scenic_response_content >", value, "scenicResponseContent");
            return (Criteria) this;
        }

        public Criteria andScenicResponseContentGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_response_content >=", value, "scenicResponseContent");
            return (Criteria) this;
        }

        public Criteria andScenicResponseContentLessThan(String value) {
            addCriterion("scenic_response_content <", value, "scenicResponseContent");
            return (Criteria) this;
        }

        public Criteria andScenicResponseContentLessThanOrEqualTo(String value) {
            addCriterion("scenic_response_content <=", value, "scenicResponseContent");
            return (Criteria) this;
        }

        public Criteria andScenicResponseContentLike(String value) {
            addCriterion("scenic_response_content like", value, "scenicResponseContent");
            return (Criteria) this;
        }

        public Criteria andScenicResponseContentNotLike(String value) {
            addCriterion("scenic_response_content not like", value, "scenicResponseContent");
            return (Criteria) this;
        }

        public Criteria andScenicResponseContentIn(List<String> values) {
            addCriterion("scenic_response_content in", values, "scenicResponseContent");
            return (Criteria) this;
        }

        public Criteria andScenicResponseContentNotIn(List<String> values) {
            addCriterion("scenic_response_content not in", values, "scenicResponseContent");
            return (Criteria) this;
        }

        public Criteria andScenicResponseContentBetween(String value1, String value2) {
            addCriterion("scenic_response_content between", value1, value2, "scenicResponseContent");
            return (Criteria) this;
        }

        public Criteria andScenicResponseContentNotBetween(String value1, String value2) {
            addCriterion("scenic_response_content not between", value1, value2, "scenicResponseContent");
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

        public Criteria andScenicCommentIdIsNull() {
            addCriterion("scenic_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIdIsNotNull() {
            addCriterion("scenic_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIdEqualTo(Integer value) {
            addCriterion("scenic_comment_id =", value, "scenicCommentId");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIdNotEqualTo(Integer value) {
            addCriterion("scenic_comment_id <>", value, "scenicCommentId");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIdGreaterThan(Integer value) {
            addCriterion("scenic_comment_id >", value, "scenicCommentId");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_comment_id >=", value, "scenicCommentId");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIdLessThan(Integer value) {
            addCriterion("scenic_comment_id <", value, "scenicCommentId");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_comment_id <=", value, "scenicCommentId");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIdIn(List<Integer> values) {
            addCriterion("scenic_comment_id in", values, "scenicCommentId");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIdNotIn(List<Integer> values) {
            addCriterion("scenic_comment_id not in", values, "scenicCommentId");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_comment_id between", value1, value2, "scenicCommentId");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_comment_id not between", value1, value2, "scenicCommentId");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIntdescrIsNull() {
            addCriterion("scenic_response_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIntdescrIsNotNull() {
            addCriterion("scenic_response_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIntdescrEqualTo(Integer value) {
            addCriterion("scenic_response_intdescr =", value, "scenicResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIntdescrNotEqualTo(Integer value) {
            addCriterion("scenic_response_intdescr <>", value, "scenicResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIntdescrGreaterThan(Integer value) {
            addCriterion("scenic_response_intdescr >", value, "scenicResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_response_intdescr >=", value, "scenicResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIntdescrLessThan(Integer value) {
            addCriterion("scenic_response_intdescr <", value, "scenicResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_response_intdescr <=", value, "scenicResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIntdescrIn(List<Integer> values) {
            addCriterion("scenic_response_intdescr in", values, "scenicResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIntdescrNotIn(List<Integer> values) {
            addCriterion("scenic_response_intdescr not in", values, "scenicResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("scenic_response_intdescr between", value1, value2, "scenicResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_response_intdescr not between", value1, value2, "scenicResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseVardescrIsNull() {
            addCriterion("scenic_response_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andScenicResponseVardescrIsNotNull() {
            addCriterion("scenic_response_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andScenicResponseVardescrEqualTo(String value) {
            addCriterion("scenic_response_vardescr =", value, "scenicResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseVardescrNotEqualTo(String value) {
            addCriterion("scenic_response_vardescr <>", value, "scenicResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseVardescrGreaterThan(String value) {
            addCriterion("scenic_response_vardescr >", value, "scenicResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_response_vardescr >=", value, "scenicResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseVardescrLessThan(String value) {
            addCriterion("scenic_response_vardescr <", value, "scenicResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseVardescrLessThanOrEqualTo(String value) {
            addCriterion("scenic_response_vardescr <=", value, "scenicResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseVardescrLike(String value) {
            addCriterion("scenic_response_vardescr like", value, "scenicResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseVardescrNotLike(String value) {
            addCriterion("scenic_response_vardescr not like", value, "scenicResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseVardescrIn(List<String> values) {
            addCriterion("scenic_response_vardescr in", values, "scenicResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseVardescrNotIn(List<String> values) {
            addCriterion("scenic_response_vardescr not in", values, "scenicResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseVardescrBetween(String value1, String value2) {
            addCriterion("scenic_response_vardescr between", value1, value2, "scenicResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicResponseVardescrNotBetween(String value1, String value2) {
            addCriterion("scenic_response_vardescr not between", value1, value2, "scenicResponseVardescr");
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