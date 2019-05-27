package com.travel.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScenicCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicCommentExample() {
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

        public Criteria andScenicCommentTimeIsNull() {
            addCriterion("scenic_comment_time is null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTimeIsNotNull() {
            addCriterion("scenic_comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTimeEqualTo(Date value) {
            addCriterion("scenic_comment_time =", value, "scenicCommentTime");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTimeNotEqualTo(Date value) {
            addCriterion("scenic_comment_time <>", value, "scenicCommentTime");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTimeGreaterThan(Date value) {
            addCriterion("scenic_comment_time >", value, "scenicCommentTime");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scenic_comment_time >=", value, "scenicCommentTime");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTimeLessThan(Date value) {
            addCriterion("scenic_comment_time <", value, "scenicCommentTime");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("scenic_comment_time <=", value, "scenicCommentTime");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTimeIn(List<Date> values) {
            addCriterion("scenic_comment_time in", values, "scenicCommentTime");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTimeNotIn(List<Date> values) {
            addCriterion("scenic_comment_time not in", values, "scenicCommentTime");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTimeBetween(Date value1, Date value2) {
            addCriterion("scenic_comment_time between", value1, value2, "scenicCommentTime");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("scenic_comment_time not between", value1, value2, "scenicCommentTime");
            return (Criteria) this;
        }

        public Criteria andScenicCommentImgIsNull() {
            addCriterion("scenic_comment_img is null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentImgIsNotNull() {
            addCriterion("scenic_comment_img is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentImgEqualTo(String value) {
            addCriterion("scenic_comment_img =", value, "scenicCommentImg");
            return (Criteria) this;
        }

        public Criteria andScenicCommentImgNotEqualTo(String value) {
            addCriterion("scenic_comment_img <>", value, "scenicCommentImg");
            return (Criteria) this;
        }

        public Criteria andScenicCommentImgGreaterThan(String value) {
            addCriterion("scenic_comment_img >", value, "scenicCommentImg");
            return (Criteria) this;
        }

        public Criteria andScenicCommentImgGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_comment_img >=", value, "scenicCommentImg");
            return (Criteria) this;
        }

        public Criteria andScenicCommentImgLessThan(String value) {
            addCriterion("scenic_comment_img <", value, "scenicCommentImg");
            return (Criteria) this;
        }

        public Criteria andScenicCommentImgLessThanOrEqualTo(String value) {
            addCriterion("scenic_comment_img <=", value, "scenicCommentImg");
            return (Criteria) this;
        }

        public Criteria andScenicCommentImgLike(String value) {
            addCriterion("scenic_comment_img like", value, "scenicCommentImg");
            return (Criteria) this;
        }

        public Criteria andScenicCommentImgNotLike(String value) {
            addCriterion("scenic_comment_img not like", value, "scenicCommentImg");
            return (Criteria) this;
        }

        public Criteria andScenicCommentImgIn(List<String> values) {
            addCriterion("scenic_comment_img in", values, "scenicCommentImg");
            return (Criteria) this;
        }

        public Criteria andScenicCommentImgNotIn(List<String> values) {
            addCriterion("scenic_comment_img not in", values, "scenicCommentImg");
            return (Criteria) this;
        }

        public Criteria andScenicCommentImgBetween(String value1, String value2) {
            addCriterion("scenic_comment_img between", value1, value2, "scenicCommentImg");
            return (Criteria) this;
        }

        public Criteria andScenicCommentImgNotBetween(String value1, String value2) {
            addCriterion("scenic_comment_img not between", value1, value2, "scenicCommentImg");
            return (Criteria) this;
        }

        public Criteria andScenicCommentContentIsNull() {
            addCriterion("scenic_comment_content is null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentContentIsNotNull() {
            addCriterion("scenic_comment_content is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentContentEqualTo(String value) {
            addCriterion("scenic_comment_content =", value, "scenicCommentContent");
            return (Criteria) this;
        }

        public Criteria andScenicCommentContentNotEqualTo(String value) {
            addCriterion("scenic_comment_content <>", value, "scenicCommentContent");
            return (Criteria) this;
        }

        public Criteria andScenicCommentContentGreaterThan(String value) {
            addCriterion("scenic_comment_content >", value, "scenicCommentContent");
            return (Criteria) this;
        }

        public Criteria andScenicCommentContentGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_comment_content >=", value, "scenicCommentContent");
            return (Criteria) this;
        }

        public Criteria andScenicCommentContentLessThan(String value) {
            addCriterion("scenic_comment_content <", value, "scenicCommentContent");
            return (Criteria) this;
        }

        public Criteria andScenicCommentContentLessThanOrEqualTo(String value) {
            addCriterion("scenic_comment_content <=", value, "scenicCommentContent");
            return (Criteria) this;
        }

        public Criteria andScenicCommentContentLike(String value) {
            addCriterion("scenic_comment_content like", value, "scenicCommentContent");
            return (Criteria) this;
        }

        public Criteria andScenicCommentContentNotLike(String value) {
            addCriterion("scenic_comment_content not like", value, "scenicCommentContent");
            return (Criteria) this;
        }

        public Criteria andScenicCommentContentIn(List<String> values) {
            addCriterion("scenic_comment_content in", values, "scenicCommentContent");
            return (Criteria) this;
        }

        public Criteria andScenicCommentContentNotIn(List<String> values) {
            addCriterion("scenic_comment_content not in", values, "scenicCommentContent");
            return (Criteria) this;
        }

        public Criteria andScenicCommentContentBetween(String value1, String value2) {
            addCriterion("scenic_comment_content between", value1, value2, "scenicCommentContent");
            return (Criteria) this;
        }

        public Criteria andScenicCommentContentNotBetween(String value1, String value2) {
            addCriterion("scenic_comment_content not between", value1, value2, "scenicCommentContent");
            return (Criteria) this;
        }

        public Criteria andScenicCommentLikeIsNull() {
            addCriterion("scenic_comment_like is null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentLikeIsNotNull() {
            addCriterion("scenic_comment_like is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentLikeEqualTo(Integer value) {
            addCriterion("scenic_comment_like =", value, "scenicCommentLike");
            return (Criteria) this;
        }

        public Criteria andScenicCommentLikeNotEqualTo(Integer value) {
            addCriterion("scenic_comment_like <>", value, "scenicCommentLike");
            return (Criteria) this;
        }

        public Criteria andScenicCommentLikeGreaterThan(Integer value) {
            addCriterion("scenic_comment_like >", value, "scenicCommentLike");
            return (Criteria) this;
        }

        public Criteria andScenicCommentLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_comment_like >=", value, "scenicCommentLike");
            return (Criteria) this;
        }

        public Criteria andScenicCommentLikeLessThan(Integer value) {
            addCriterion("scenic_comment_like <", value, "scenicCommentLike");
            return (Criteria) this;
        }

        public Criteria andScenicCommentLikeLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_comment_like <=", value, "scenicCommentLike");
            return (Criteria) this;
        }

        public Criteria andScenicCommentLikeIn(List<Integer> values) {
            addCriterion("scenic_comment_like in", values, "scenicCommentLike");
            return (Criteria) this;
        }

        public Criteria andScenicCommentLikeNotIn(List<Integer> values) {
            addCriterion("scenic_comment_like not in", values, "scenicCommentLike");
            return (Criteria) this;
        }

        public Criteria andScenicCommentLikeBetween(Integer value1, Integer value2) {
            addCriterion("scenic_comment_like between", value1, value2, "scenicCommentLike");
            return (Criteria) this;
        }

        public Criteria andScenicCommentLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_comment_like not between", value1, value2, "scenicCommentLike");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTypeIsNull() {
            addCriterion("scenic_comment_type is null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTypeIsNotNull() {
            addCriterion("scenic_comment_type is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTypeEqualTo(String value) {
            addCriterion("scenic_comment_type =", value, "scenicCommentType");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTypeNotEqualTo(String value) {
            addCriterion("scenic_comment_type <>", value, "scenicCommentType");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTypeGreaterThan(String value) {
            addCriterion("scenic_comment_type >", value, "scenicCommentType");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_comment_type >=", value, "scenicCommentType");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTypeLessThan(String value) {
            addCriterion("scenic_comment_type <", value, "scenicCommentType");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTypeLessThanOrEqualTo(String value) {
            addCriterion("scenic_comment_type <=", value, "scenicCommentType");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTypeLike(String value) {
            addCriterion("scenic_comment_type like", value, "scenicCommentType");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTypeNotLike(String value) {
            addCriterion("scenic_comment_type not like", value, "scenicCommentType");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTypeIn(List<String> values) {
            addCriterion("scenic_comment_type in", values, "scenicCommentType");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTypeNotIn(List<String> values) {
            addCriterion("scenic_comment_type not in", values, "scenicCommentType");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTypeBetween(String value1, String value2) {
            addCriterion("scenic_comment_type between", value1, value2, "scenicCommentType");
            return (Criteria) this;
        }

        public Criteria andScenicCommentTypeNotBetween(String value1, String value2) {
            addCriterion("scenic_comment_type not between", value1, value2, "scenicCommentType");
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

        public Criteria andScenicIdIsNull() {
            addCriterion("scenic_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNotNull() {
            addCriterion("scenic_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicIdEqualTo(Integer value) {
            addCriterion("scenic_id =", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotEqualTo(Integer value) {
            addCriterion("scenic_id <>", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThan(Integer value) {
            addCriterion("scenic_id >", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_id >=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThan(Integer value) {
            addCriterion("scenic_id <", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_id <=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdIn(List<Integer> values) {
            addCriterion("scenic_id in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotIn(List<Integer> values) {
            addCriterion("scenic_id not in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_id between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_id not between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrIsNull() {
            addCriterion("scenic_comment_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrIsNotNull() {
            addCriterion("scenic_comment_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrEqualTo(Integer value) {
            addCriterion("scenic_comment_intdescr =", value, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrNotEqualTo(Integer value) {
            addCriterion("scenic_comment_intdescr <>", value, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrGreaterThan(Integer value) {
            addCriterion("scenic_comment_intdescr >", value, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_comment_intdescr >=", value, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrLessThan(Integer value) {
            addCriterion("scenic_comment_intdescr <", value, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_comment_intdescr <=", value, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrIn(List<Integer> values) {
            addCriterion("scenic_comment_intdescr in", values, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrNotIn(List<Integer> values) {
            addCriterion("scenic_comment_intdescr not in", values, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("scenic_comment_intdescr between", value1, value2, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_comment_intdescr not between", value1, value2, "scenicCommentIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrIsNull() {
            addCriterion("scenic_comment_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrIsNotNull() {
            addCriterion("scenic_comment_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrEqualTo(String value) {
            addCriterion("scenic_comment_vardescr =", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrNotEqualTo(String value) {
            addCriterion("scenic_comment_vardescr <>", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrGreaterThan(String value) {
            addCriterion("scenic_comment_vardescr >", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_comment_vardescr >=", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrLessThan(String value) {
            addCriterion("scenic_comment_vardescr <", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrLessThanOrEqualTo(String value) {
            addCriterion("scenic_comment_vardescr <=", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrLike(String value) {
            addCriterion("scenic_comment_vardescr like", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrNotLike(String value) {
            addCriterion("scenic_comment_vardescr not like", value, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrIn(List<String> values) {
            addCriterion("scenic_comment_vardescr in", values, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrNotIn(List<String> values) {
            addCriterion("scenic_comment_vardescr not in", values, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrBetween(String value1, String value2) {
            addCriterion("scenic_comment_vardescr between", value1, value2, "scenicCommentVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicCommentVardescrNotBetween(String value1, String value2) {
            addCriterion("scenic_comment_vardescr not between", value1, value2, "scenicCommentVardescr");
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