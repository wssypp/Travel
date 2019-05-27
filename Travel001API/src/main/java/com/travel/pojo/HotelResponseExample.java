package com.travel.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelResponseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelResponseExample() {
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

        public Criteria andHotelResponseIdIsNull() {
            addCriterion("hotel_response_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelResponseIdIsNotNull() {
            addCriterion("hotel_response_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelResponseIdEqualTo(Integer value) {
            addCriterion("hotel_response_id =", value, "hotelResponseId");
            return (Criteria) this;
        }

        public Criteria andHotelResponseIdNotEqualTo(Integer value) {
            addCriterion("hotel_response_id <>", value, "hotelResponseId");
            return (Criteria) this;
        }

        public Criteria andHotelResponseIdGreaterThan(Integer value) {
            addCriterion("hotel_response_id >", value, "hotelResponseId");
            return (Criteria) this;
        }

        public Criteria andHotelResponseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_response_id >=", value, "hotelResponseId");
            return (Criteria) this;
        }

        public Criteria andHotelResponseIdLessThan(Integer value) {
            addCriterion("hotel_response_id <", value, "hotelResponseId");
            return (Criteria) this;
        }

        public Criteria andHotelResponseIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_response_id <=", value, "hotelResponseId");
            return (Criteria) this;
        }

        public Criteria andHotelResponseIdIn(List<Integer> values) {
            addCriterion("hotel_response_id in", values, "hotelResponseId");
            return (Criteria) this;
        }

        public Criteria andHotelResponseIdNotIn(List<Integer> values) {
            addCriterion("hotel_response_id not in", values, "hotelResponseId");
            return (Criteria) this;
        }

        public Criteria andHotelResponseIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_response_id between", value1, value2, "hotelResponseId");
            return (Criteria) this;
        }

        public Criteria andHotelResponseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_response_id not between", value1, value2, "hotelResponseId");
            return (Criteria) this;
        }

        public Criteria andHotelResponseTimeIsNull() {
            addCriterion("hotel_response_time is null");
            return (Criteria) this;
        }

        public Criteria andHotelResponseTimeIsNotNull() {
            addCriterion("hotel_response_time is not null");
            return (Criteria) this;
        }

        public Criteria andHotelResponseTimeEqualTo(Date value) {
            addCriterion("hotel_response_time =", value, "hotelResponseTime");
            return (Criteria) this;
        }

        public Criteria andHotelResponseTimeNotEqualTo(Date value) {
            addCriterion("hotel_response_time <>", value, "hotelResponseTime");
            return (Criteria) this;
        }

        public Criteria andHotelResponseTimeGreaterThan(Date value) {
            addCriterion("hotel_response_time >", value, "hotelResponseTime");
            return (Criteria) this;
        }

        public Criteria andHotelResponseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hotel_response_time >=", value, "hotelResponseTime");
            return (Criteria) this;
        }

        public Criteria andHotelResponseTimeLessThan(Date value) {
            addCriterion("hotel_response_time <", value, "hotelResponseTime");
            return (Criteria) this;
        }

        public Criteria andHotelResponseTimeLessThanOrEqualTo(Date value) {
            addCriterion("hotel_response_time <=", value, "hotelResponseTime");
            return (Criteria) this;
        }

        public Criteria andHotelResponseTimeIn(List<Date> values) {
            addCriterion("hotel_response_time in", values, "hotelResponseTime");
            return (Criteria) this;
        }

        public Criteria andHotelResponseTimeNotIn(List<Date> values) {
            addCriterion("hotel_response_time not in", values, "hotelResponseTime");
            return (Criteria) this;
        }

        public Criteria andHotelResponseTimeBetween(Date value1, Date value2) {
            addCriterion("hotel_response_time between", value1, value2, "hotelResponseTime");
            return (Criteria) this;
        }

        public Criteria andHotelResponseTimeNotBetween(Date value1, Date value2) {
            addCriterion("hotel_response_time not between", value1, value2, "hotelResponseTime");
            return (Criteria) this;
        }

        public Criteria andHotelResponseImgIsNull() {
            addCriterion("hotel_response_img is null");
            return (Criteria) this;
        }

        public Criteria andHotelResponseImgIsNotNull() {
            addCriterion("hotel_response_img is not null");
            return (Criteria) this;
        }

        public Criteria andHotelResponseImgEqualTo(String value) {
            addCriterion("hotel_response_img =", value, "hotelResponseImg");
            return (Criteria) this;
        }

        public Criteria andHotelResponseImgNotEqualTo(String value) {
            addCriterion("hotel_response_img <>", value, "hotelResponseImg");
            return (Criteria) this;
        }

        public Criteria andHotelResponseImgGreaterThan(String value) {
            addCriterion("hotel_response_img >", value, "hotelResponseImg");
            return (Criteria) this;
        }

        public Criteria andHotelResponseImgGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_response_img >=", value, "hotelResponseImg");
            return (Criteria) this;
        }

        public Criteria andHotelResponseImgLessThan(String value) {
            addCriterion("hotel_response_img <", value, "hotelResponseImg");
            return (Criteria) this;
        }

        public Criteria andHotelResponseImgLessThanOrEqualTo(String value) {
            addCriterion("hotel_response_img <=", value, "hotelResponseImg");
            return (Criteria) this;
        }

        public Criteria andHotelResponseImgLike(String value) {
            addCriterion("hotel_response_img like", value, "hotelResponseImg");
            return (Criteria) this;
        }

        public Criteria andHotelResponseImgNotLike(String value) {
            addCriterion("hotel_response_img not like", value, "hotelResponseImg");
            return (Criteria) this;
        }

        public Criteria andHotelResponseImgIn(List<String> values) {
            addCriterion("hotel_response_img in", values, "hotelResponseImg");
            return (Criteria) this;
        }

        public Criteria andHotelResponseImgNotIn(List<String> values) {
            addCriterion("hotel_response_img not in", values, "hotelResponseImg");
            return (Criteria) this;
        }

        public Criteria andHotelResponseImgBetween(String value1, String value2) {
            addCriterion("hotel_response_img between", value1, value2, "hotelResponseImg");
            return (Criteria) this;
        }

        public Criteria andHotelResponseImgNotBetween(String value1, String value2) {
            addCriterion("hotel_response_img not between", value1, value2, "hotelResponseImg");
            return (Criteria) this;
        }

        public Criteria andHotelResponseContenttIsNull() {
            addCriterion("hotel_response_contentt is null");
            return (Criteria) this;
        }

        public Criteria andHotelResponseContenttIsNotNull() {
            addCriterion("hotel_response_contentt is not null");
            return (Criteria) this;
        }

        public Criteria andHotelResponseContenttEqualTo(String value) {
            addCriterion("hotel_response_contentt =", value, "hotelResponseContentt");
            return (Criteria) this;
        }

        public Criteria andHotelResponseContenttNotEqualTo(String value) {
            addCriterion("hotel_response_contentt <>", value, "hotelResponseContentt");
            return (Criteria) this;
        }

        public Criteria andHotelResponseContenttGreaterThan(String value) {
            addCriterion("hotel_response_contentt >", value, "hotelResponseContentt");
            return (Criteria) this;
        }

        public Criteria andHotelResponseContenttGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_response_contentt >=", value, "hotelResponseContentt");
            return (Criteria) this;
        }

        public Criteria andHotelResponseContenttLessThan(String value) {
            addCriterion("hotel_response_contentt <", value, "hotelResponseContentt");
            return (Criteria) this;
        }

        public Criteria andHotelResponseContenttLessThanOrEqualTo(String value) {
            addCriterion("hotel_response_contentt <=", value, "hotelResponseContentt");
            return (Criteria) this;
        }

        public Criteria andHotelResponseContenttLike(String value) {
            addCriterion("hotel_response_contentt like", value, "hotelResponseContentt");
            return (Criteria) this;
        }

        public Criteria andHotelResponseContenttNotLike(String value) {
            addCriterion("hotel_response_contentt not like", value, "hotelResponseContentt");
            return (Criteria) this;
        }

        public Criteria andHotelResponseContenttIn(List<String> values) {
            addCriterion("hotel_response_contentt in", values, "hotelResponseContentt");
            return (Criteria) this;
        }

        public Criteria andHotelResponseContenttNotIn(List<String> values) {
            addCriterion("hotel_response_contentt not in", values, "hotelResponseContentt");
            return (Criteria) this;
        }

        public Criteria andHotelResponseContenttBetween(String value1, String value2) {
            addCriterion("hotel_response_contentt between", value1, value2, "hotelResponseContentt");
            return (Criteria) this;
        }

        public Criteria andHotelResponseContenttNotBetween(String value1, String value2) {
            addCriterion("hotel_response_contentt not between", value1, value2, "hotelResponseContentt");
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

        public Criteria andHotelCommentIdIsNull() {
            addCriterion("hotel_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelCommentIdIsNotNull() {
            addCriterion("hotel_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelCommentIdEqualTo(Integer value) {
            addCriterion("hotel_comment_id =", value, "hotelCommentId");
            return (Criteria) this;
        }

        public Criteria andHotelCommentIdNotEqualTo(Integer value) {
            addCriterion("hotel_comment_id <>", value, "hotelCommentId");
            return (Criteria) this;
        }

        public Criteria andHotelCommentIdGreaterThan(Integer value) {
            addCriterion("hotel_comment_id >", value, "hotelCommentId");
            return (Criteria) this;
        }

        public Criteria andHotelCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_comment_id >=", value, "hotelCommentId");
            return (Criteria) this;
        }

        public Criteria andHotelCommentIdLessThan(Integer value) {
            addCriterion("hotel_comment_id <", value, "hotelCommentId");
            return (Criteria) this;
        }

        public Criteria andHotelCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_comment_id <=", value, "hotelCommentId");
            return (Criteria) this;
        }

        public Criteria andHotelCommentIdIn(List<Integer> values) {
            addCriterion("hotel_comment_id in", values, "hotelCommentId");
            return (Criteria) this;
        }

        public Criteria andHotelCommentIdNotIn(List<Integer> values) {
            addCriterion("hotel_comment_id not in", values, "hotelCommentId");
            return (Criteria) this;
        }

        public Criteria andHotelCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_comment_id between", value1, value2, "hotelCommentId");
            return (Criteria) this;
        }

        public Criteria andHotelCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_comment_id not between", value1, value2, "hotelCommentId");
            return (Criteria) this;
        }

        public Criteria andCommentResponseIntdescrIsNull() {
            addCriterion("comment_response_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andCommentResponseIntdescrIsNotNull() {
            addCriterion("comment_response_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andCommentResponseIntdescrEqualTo(Integer value) {
            addCriterion("comment_response_intdescr =", value, "commentResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseIntdescrNotEqualTo(Integer value) {
            addCriterion("comment_response_intdescr <>", value, "commentResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseIntdescrGreaterThan(Integer value) {
            addCriterion("comment_response_intdescr >", value, "commentResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_response_intdescr >=", value, "commentResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseIntdescrLessThan(Integer value) {
            addCriterion("comment_response_intdescr <", value, "commentResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("comment_response_intdescr <=", value, "commentResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseIntdescrIn(List<Integer> values) {
            addCriterion("comment_response_intdescr in", values, "commentResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseIntdescrNotIn(List<Integer> values) {
            addCriterion("comment_response_intdescr not in", values, "commentResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("comment_response_intdescr between", value1, value2, "commentResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_response_intdescr not between", value1, value2, "commentResponseIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseVardescrIsNull() {
            addCriterion("comment_response_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andCommentResponseVardescrIsNotNull() {
            addCriterion("comment_response_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andCommentResponseVardescrEqualTo(String value) {
            addCriterion("comment_response_vardescr =", value, "commentResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseVardescrNotEqualTo(String value) {
            addCriterion("comment_response_vardescr <>", value, "commentResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseVardescrGreaterThan(String value) {
            addCriterion("comment_response_vardescr >", value, "commentResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("comment_response_vardescr >=", value, "commentResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseVardescrLessThan(String value) {
            addCriterion("comment_response_vardescr <", value, "commentResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseVardescrLessThanOrEqualTo(String value) {
            addCriterion("comment_response_vardescr <=", value, "commentResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseVardescrLike(String value) {
            addCriterion("comment_response_vardescr like", value, "commentResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseVardescrNotLike(String value) {
            addCriterion("comment_response_vardescr not like", value, "commentResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseVardescrIn(List<String> values) {
            addCriterion("comment_response_vardescr in", values, "commentResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseVardescrNotIn(List<String> values) {
            addCriterion("comment_response_vardescr not in", values, "commentResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseVardescrBetween(String value1, String value2) {
            addCriterion("comment_response_vardescr between", value1, value2, "commentResponseVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentResponseVardescrNotBetween(String value1, String value2) {
            addCriterion("comment_response_vardescr not between", value1, value2, "commentResponseVardescr");
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