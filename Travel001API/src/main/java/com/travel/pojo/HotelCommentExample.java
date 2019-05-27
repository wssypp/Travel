package com.travel.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelCommentExample() {
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

        public Criteria andHotelCommenttContentIsNull() {
            addCriterion("hotel_commentt_content is null");
            return (Criteria) this;
        }

        public Criteria andHotelCommenttContentIsNotNull() {
            addCriterion("hotel_commentt_content is not null");
            return (Criteria) this;
        }

        public Criteria andHotelCommenttContentEqualTo(String value) {
            addCriterion("hotel_commentt_content =", value, "hotelCommenttContent");
            return (Criteria) this;
        }

        public Criteria andHotelCommenttContentNotEqualTo(String value) {
            addCriterion("hotel_commentt_content <>", value, "hotelCommenttContent");
            return (Criteria) this;
        }

        public Criteria andHotelCommenttContentGreaterThan(String value) {
            addCriterion("hotel_commentt_content >", value, "hotelCommenttContent");
            return (Criteria) this;
        }

        public Criteria andHotelCommenttContentGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_commentt_content >=", value, "hotelCommenttContent");
            return (Criteria) this;
        }

        public Criteria andHotelCommenttContentLessThan(String value) {
            addCriterion("hotel_commentt_content <", value, "hotelCommenttContent");
            return (Criteria) this;
        }

        public Criteria andHotelCommenttContentLessThanOrEqualTo(String value) {
            addCriterion("hotel_commentt_content <=", value, "hotelCommenttContent");
            return (Criteria) this;
        }

        public Criteria andHotelCommenttContentLike(String value) {
            addCriterion("hotel_commentt_content like", value, "hotelCommenttContent");
            return (Criteria) this;
        }

        public Criteria andHotelCommenttContentNotLike(String value) {
            addCriterion("hotel_commentt_content not like", value, "hotelCommenttContent");
            return (Criteria) this;
        }

        public Criteria andHotelCommenttContentIn(List<String> values) {
            addCriterion("hotel_commentt_content in", values, "hotelCommenttContent");
            return (Criteria) this;
        }

        public Criteria andHotelCommenttContentNotIn(List<String> values) {
            addCriterion("hotel_commentt_content not in", values, "hotelCommenttContent");
            return (Criteria) this;
        }

        public Criteria andHotelCommenttContentBetween(String value1, String value2) {
            addCriterion("hotel_commentt_content between", value1, value2, "hotelCommenttContent");
            return (Criteria) this;
        }

        public Criteria andHotelCommenttContentNotBetween(String value1, String value2) {
            addCriterion("hotel_commentt_content not between", value1, value2, "hotelCommenttContent");
            return (Criteria) this;
        }

        public Criteria andHotelCommentTimeIsNull() {
            addCriterion("hotel_comment_time is null");
            return (Criteria) this;
        }

        public Criteria andHotelCommentTimeIsNotNull() {
            addCriterion("hotel_comment_time is not null");
            return (Criteria) this;
        }

        public Criteria andHotelCommentTimeEqualTo(Date value) {
            addCriterion("hotel_comment_time =", value, "hotelCommentTime");
            return (Criteria) this;
        }

        public Criteria andHotelCommentTimeNotEqualTo(Date value) {
            addCriterion("hotel_comment_time <>", value, "hotelCommentTime");
            return (Criteria) this;
        }

        public Criteria andHotelCommentTimeGreaterThan(Date value) {
            addCriterion("hotel_comment_time >", value, "hotelCommentTime");
            return (Criteria) this;
        }

        public Criteria andHotelCommentTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hotel_comment_time >=", value, "hotelCommentTime");
            return (Criteria) this;
        }

        public Criteria andHotelCommentTimeLessThan(Date value) {
            addCriterion("hotel_comment_time <", value, "hotelCommentTime");
            return (Criteria) this;
        }

        public Criteria andHotelCommentTimeLessThanOrEqualTo(Date value) {
            addCriterion("hotel_comment_time <=", value, "hotelCommentTime");
            return (Criteria) this;
        }

        public Criteria andHotelCommentTimeIn(List<Date> values) {
            addCriterion("hotel_comment_time in", values, "hotelCommentTime");
            return (Criteria) this;
        }

        public Criteria andHotelCommentTimeNotIn(List<Date> values) {
            addCriterion("hotel_comment_time not in", values, "hotelCommentTime");
            return (Criteria) this;
        }

        public Criteria andHotelCommentTimeBetween(Date value1, Date value2) {
            addCriterion("hotel_comment_time between", value1, value2, "hotelCommentTime");
            return (Criteria) this;
        }

        public Criteria andHotelCommentTimeNotBetween(Date value1, Date value2) {
            addCriterion("hotel_comment_time not between", value1, value2, "hotelCommentTime");
            return (Criteria) this;
        }

        public Criteria andHotelCommentImgIsNull() {
            addCriterion("hotel_comment_img is null");
            return (Criteria) this;
        }

        public Criteria andHotelCommentImgIsNotNull() {
            addCriterion("hotel_comment_img is not null");
            return (Criteria) this;
        }

        public Criteria andHotelCommentImgEqualTo(String value) {
            addCriterion("hotel_comment_img =", value, "hotelCommentImg");
            return (Criteria) this;
        }

        public Criteria andHotelCommentImgNotEqualTo(String value) {
            addCriterion("hotel_comment_img <>", value, "hotelCommentImg");
            return (Criteria) this;
        }

        public Criteria andHotelCommentImgGreaterThan(String value) {
            addCriterion("hotel_comment_img >", value, "hotelCommentImg");
            return (Criteria) this;
        }

        public Criteria andHotelCommentImgGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_comment_img >=", value, "hotelCommentImg");
            return (Criteria) this;
        }

        public Criteria andHotelCommentImgLessThan(String value) {
            addCriterion("hotel_comment_img <", value, "hotelCommentImg");
            return (Criteria) this;
        }

        public Criteria andHotelCommentImgLessThanOrEqualTo(String value) {
            addCriterion("hotel_comment_img <=", value, "hotelCommentImg");
            return (Criteria) this;
        }

        public Criteria andHotelCommentImgLike(String value) {
            addCriterion("hotel_comment_img like", value, "hotelCommentImg");
            return (Criteria) this;
        }

        public Criteria andHotelCommentImgNotLike(String value) {
            addCriterion("hotel_comment_img not like", value, "hotelCommentImg");
            return (Criteria) this;
        }

        public Criteria andHotelCommentImgIn(List<String> values) {
            addCriterion("hotel_comment_img in", values, "hotelCommentImg");
            return (Criteria) this;
        }

        public Criteria andHotelCommentImgNotIn(List<String> values) {
            addCriterion("hotel_comment_img not in", values, "hotelCommentImg");
            return (Criteria) this;
        }

        public Criteria andHotelCommentImgBetween(String value1, String value2) {
            addCriterion("hotel_comment_img between", value1, value2, "hotelCommentImg");
            return (Criteria) this;
        }

        public Criteria andHotelCommentImgNotBetween(String value1, String value2) {
            addCriterion("hotel_comment_img not between", value1, value2, "hotelCommentImg");
            return (Criteria) this;
        }

        public Criteria andHotelCommentLikeIsNull() {
            addCriterion("hotel_comment_like is null");
            return (Criteria) this;
        }

        public Criteria andHotelCommentLikeIsNotNull() {
            addCriterion("hotel_comment_like is not null");
            return (Criteria) this;
        }

        public Criteria andHotelCommentLikeEqualTo(Integer value) {
            addCriterion("hotel_comment_like =", value, "hotelCommentLike");
            return (Criteria) this;
        }

        public Criteria andHotelCommentLikeNotEqualTo(Integer value) {
            addCriterion("hotel_comment_like <>", value, "hotelCommentLike");
            return (Criteria) this;
        }

        public Criteria andHotelCommentLikeGreaterThan(Integer value) {
            addCriterion("hotel_comment_like >", value, "hotelCommentLike");
            return (Criteria) this;
        }

        public Criteria andHotelCommentLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_comment_like >=", value, "hotelCommentLike");
            return (Criteria) this;
        }

        public Criteria andHotelCommentLikeLessThan(Integer value) {
            addCriterion("hotel_comment_like <", value, "hotelCommentLike");
            return (Criteria) this;
        }

        public Criteria andHotelCommentLikeLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_comment_like <=", value, "hotelCommentLike");
            return (Criteria) this;
        }

        public Criteria andHotelCommentLikeIn(List<Integer> values) {
            addCriterion("hotel_comment_like in", values, "hotelCommentLike");
            return (Criteria) this;
        }

        public Criteria andHotelCommentLikeNotIn(List<Integer> values) {
            addCriterion("hotel_comment_like not in", values, "hotelCommentLike");
            return (Criteria) this;
        }

        public Criteria andHotelCommentLikeBetween(Integer value1, Integer value2) {
            addCriterion("hotel_comment_like between", value1, value2, "hotelCommentLike");
            return (Criteria) this;
        }

        public Criteria andHotelCommentLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_comment_like not between", value1, value2, "hotelCommentLike");
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

        public Criteria andHotelIdIsNull() {
            addCriterion("hotel_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNotNull() {
            addCriterion("hotel_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelIdEqualTo(Integer value) {
            addCriterion("hotel_id =", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotEqualTo(Integer value) {
            addCriterion("hotel_id <>", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThan(Integer value) {
            addCriterion("hotel_id >", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_id >=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThan(Integer value) {
            addCriterion("hotel_id <", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_id <=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIn(List<Integer> values) {
            addCriterion("hotel_id in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotIn(List<Integer> values) {
            addCriterion("hotel_id not in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id not between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelCommentScoreIsNull() {
            addCriterion("hotel_comment_score is null");
            return (Criteria) this;
        }

        public Criteria andHotelCommentScoreIsNotNull() {
            addCriterion("hotel_comment_score is not null");
            return (Criteria) this;
        }

        public Criteria andHotelCommentScoreEqualTo(Double value) {
            addCriterion("hotel_comment_score =", value, "hotelCommentScore");
            return (Criteria) this;
        }

        public Criteria andHotelCommentScoreNotEqualTo(Double value) {
            addCriterion("hotel_comment_score <>", value, "hotelCommentScore");
            return (Criteria) this;
        }

        public Criteria andHotelCommentScoreGreaterThan(Double value) {
            addCriterion("hotel_comment_score >", value, "hotelCommentScore");
            return (Criteria) this;
        }

        public Criteria andHotelCommentScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("hotel_comment_score >=", value, "hotelCommentScore");
            return (Criteria) this;
        }

        public Criteria andHotelCommentScoreLessThan(Double value) {
            addCriterion("hotel_comment_score <", value, "hotelCommentScore");
            return (Criteria) this;
        }

        public Criteria andHotelCommentScoreLessThanOrEqualTo(Double value) {
            addCriterion("hotel_comment_score <=", value, "hotelCommentScore");
            return (Criteria) this;
        }

        public Criteria andHotelCommentScoreIn(List<Double> values) {
            addCriterion("hotel_comment_score in", values, "hotelCommentScore");
            return (Criteria) this;
        }

        public Criteria andHotelCommentScoreNotIn(List<Double> values) {
            addCriterion("hotel_comment_score not in", values, "hotelCommentScore");
            return (Criteria) this;
        }

        public Criteria andHotelCommentScoreBetween(Double value1, Double value2) {
            addCriterion("hotel_comment_score between", value1, value2, "hotelCommentScore");
            return (Criteria) this;
        }

        public Criteria andHotelCommentScoreNotBetween(Double value1, Double value2) {
            addCriterion("hotel_comment_score not between", value1, value2, "hotelCommentScore");
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