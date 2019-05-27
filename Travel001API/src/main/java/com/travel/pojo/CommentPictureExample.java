package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class CommentPictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentPictureExample() {
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

        public Criteria andCommentPictureIdIsNull() {
            addCriterion("comment_picture_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIdIsNotNull() {
            addCriterion("comment_picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIdEqualTo(Integer value) {
            addCriterion("comment_picture_id =", value, "commentPictureId");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIdNotEqualTo(Integer value) {
            addCriterion("comment_picture_id <>", value, "commentPictureId");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIdGreaterThan(Integer value) {
            addCriterion("comment_picture_id >", value, "commentPictureId");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_picture_id >=", value, "commentPictureId");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIdLessThan(Integer value) {
            addCriterion("comment_picture_id <", value, "commentPictureId");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_picture_id <=", value, "commentPictureId");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIdIn(List<Integer> values) {
            addCriterion("comment_picture_id in", values, "commentPictureId");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIdNotIn(List<Integer> values) {
            addCriterion("comment_picture_id not in", values, "commentPictureId");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_picture_id between", value1, value2, "commentPictureId");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_picture_id not between", value1, value2, "commentPictureId");
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

        public Criteria andCommentPicturePathIsNull() {
            addCriterion("comment_picture_path is null");
            return (Criteria) this;
        }

        public Criteria andCommentPicturePathIsNotNull() {
            addCriterion("comment_picture_path is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPicturePathEqualTo(String value) {
            addCriterion("comment_picture_path =", value, "commentPicturePath");
            return (Criteria) this;
        }

        public Criteria andCommentPicturePathNotEqualTo(String value) {
            addCriterion("comment_picture_path <>", value, "commentPicturePath");
            return (Criteria) this;
        }

        public Criteria andCommentPicturePathGreaterThan(String value) {
            addCriterion("comment_picture_path >", value, "commentPicturePath");
            return (Criteria) this;
        }

        public Criteria andCommentPicturePathGreaterThanOrEqualTo(String value) {
            addCriterion("comment_picture_path >=", value, "commentPicturePath");
            return (Criteria) this;
        }

        public Criteria andCommentPicturePathLessThan(String value) {
            addCriterion("comment_picture_path <", value, "commentPicturePath");
            return (Criteria) this;
        }

        public Criteria andCommentPicturePathLessThanOrEqualTo(String value) {
            addCriterion("comment_picture_path <=", value, "commentPicturePath");
            return (Criteria) this;
        }

        public Criteria andCommentPicturePathLike(String value) {
            addCriterion("comment_picture_path like", value, "commentPicturePath");
            return (Criteria) this;
        }

        public Criteria andCommentPicturePathNotLike(String value) {
            addCriterion("comment_picture_path not like", value, "commentPicturePath");
            return (Criteria) this;
        }

        public Criteria andCommentPicturePathIn(List<String> values) {
            addCriterion("comment_picture_path in", values, "commentPicturePath");
            return (Criteria) this;
        }

        public Criteria andCommentPicturePathNotIn(List<String> values) {
            addCriterion("comment_picture_path not in", values, "commentPicturePath");
            return (Criteria) this;
        }

        public Criteria andCommentPicturePathBetween(String value1, String value2) {
            addCriterion("comment_picture_path between", value1, value2, "commentPicturePath");
            return (Criteria) this;
        }

        public Criteria andCommentPicturePathNotBetween(String value1, String value2) {
            addCriterion("comment_picture_path not between", value1, value2, "commentPicturePath");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIntdescrIsNull() {
            addCriterion("comment_picture_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIntdescrIsNotNull() {
            addCriterion("comment_picture_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIntdescrEqualTo(Integer value) {
            addCriterion("comment_picture_intdescr =", value, "commentPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIntdescrNotEqualTo(Integer value) {
            addCriterion("comment_picture_intdescr <>", value, "commentPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIntdescrGreaterThan(Integer value) {
            addCriterion("comment_picture_intdescr >", value, "commentPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_picture_intdescr >=", value, "commentPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIntdescrLessThan(Integer value) {
            addCriterion("comment_picture_intdescr <", value, "commentPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("comment_picture_intdescr <=", value, "commentPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIntdescrIn(List<Integer> values) {
            addCriterion("comment_picture_intdescr in", values, "commentPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIntdescrNotIn(List<Integer> values) {
            addCriterion("comment_picture_intdescr not in", values, "commentPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("comment_picture_intdescr between", value1, value2, "commentPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_picture_intdescr not between", value1, value2, "commentPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureVardescrIsNull() {
            addCriterion("comment_picture_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andCommentPictureVardescrIsNotNull() {
            addCriterion("comment_picture_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPictureVardescrEqualTo(String value) {
            addCriterion("comment_picture_vardescr =", value, "commentPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureVardescrNotEqualTo(String value) {
            addCriterion("comment_picture_vardescr <>", value, "commentPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureVardescrGreaterThan(String value) {
            addCriterion("comment_picture_vardescr >", value, "commentPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("comment_picture_vardescr >=", value, "commentPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureVardescrLessThan(String value) {
            addCriterion("comment_picture_vardescr <", value, "commentPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureVardescrLessThanOrEqualTo(String value) {
            addCriterion("comment_picture_vardescr <=", value, "commentPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureVardescrLike(String value) {
            addCriterion("comment_picture_vardescr like", value, "commentPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureVardescrNotLike(String value) {
            addCriterion("comment_picture_vardescr not like", value, "commentPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureVardescrIn(List<String> values) {
            addCriterion("comment_picture_vardescr in", values, "commentPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureVardescrNotIn(List<String> values) {
            addCriterion("comment_picture_vardescr not in", values, "commentPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureVardescrBetween(String value1, String value2) {
            addCriterion("comment_picture_vardescr between", value1, value2, "commentPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andCommentPictureVardescrNotBetween(String value1, String value2) {
            addCriterion("comment_picture_vardescr not between", value1, value2, "commentPictureVardescr");
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