package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class SpotPictureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpotPictureExample() {
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

        public Criteria andSpotPictureIdIsNull() {
            addCriterion("spot_picture_id is null");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIdIsNotNull() {
            addCriterion("spot_picture_id is not null");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIdEqualTo(Integer value) {
            addCriterion("spot_picture_id =", value, "spotPictureId");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIdNotEqualTo(Integer value) {
            addCriterion("spot_picture_id <>", value, "spotPictureId");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIdGreaterThan(Integer value) {
            addCriterion("spot_picture_id >", value, "spotPictureId");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("spot_picture_id >=", value, "spotPictureId");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIdLessThan(Integer value) {
            addCriterion("spot_picture_id <", value, "spotPictureId");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIdLessThanOrEqualTo(Integer value) {
            addCriterion("spot_picture_id <=", value, "spotPictureId");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIdIn(List<Integer> values) {
            addCriterion("spot_picture_id in", values, "spotPictureId");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIdNotIn(List<Integer> values) {
            addCriterion("spot_picture_id not in", values, "spotPictureId");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIdBetween(Integer value1, Integer value2) {
            addCriterion("spot_picture_id between", value1, value2, "spotPictureId");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("spot_picture_id not between", value1, value2, "spotPictureId");
            return (Criteria) this;
        }

        public Criteria andSpotPicturePathIsNull() {
            addCriterion("spot_picture_path is null");
            return (Criteria) this;
        }

        public Criteria andSpotPicturePathIsNotNull() {
            addCriterion("spot_picture_path is not null");
            return (Criteria) this;
        }

        public Criteria andSpotPicturePathEqualTo(String value) {
            addCriterion("spot_picture_path =", value, "spotPicturePath");
            return (Criteria) this;
        }

        public Criteria andSpotPicturePathNotEqualTo(String value) {
            addCriterion("spot_picture_path <>", value, "spotPicturePath");
            return (Criteria) this;
        }

        public Criteria andSpotPicturePathGreaterThan(String value) {
            addCriterion("spot_picture_path >", value, "spotPicturePath");
            return (Criteria) this;
        }

        public Criteria andSpotPicturePathGreaterThanOrEqualTo(String value) {
            addCriterion("spot_picture_path >=", value, "spotPicturePath");
            return (Criteria) this;
        }

        public Criteria andSpotPicturePathLessThan(String value) {
            addCriterion("spot_picture_path <", value, "spotPicturePath");
            return (Criteria) this;
        }

        public Criteria andSpotPicturePathLessThanOrEqualTo(String value) {
            addCriterion("spot_picture_path <=", value, "spotPicturePath");
            return (Criteria) this;
        }

        public Criteria andSpotPicturePathLike(String value) {
            addCriterion("spot_picture_path like", value, "spotPicturePath");
            return (Criteria) this;
        }

        public Criteria andSpotPicturePathNotLike(String value) {
            addCriterion("spot_picture_path not like", value, "spotPicturePath");
            return (Criteria) this;
        }

        public Criteria andSpotPicturePathIn(List<String> values) {
            addCriterion("spot_picture_path in", values, "spotPicturePath");
            return (Criteria) this;
        }

        public Criteria andSpotPicturePathNotIn(List<String> values) {
            addCriterion("spot_picture_path not in", values, "spotPicturePath");
            return (Criteria) this;
        }

        public Criteria andSpotPicturePathBetween(String value1, String value2) {
            addCriterion("spot_picture_path between", value1, value2, "spotPicturePath");
            return (Criteria) this;
        }

        public Criteria andSpotPicturePathNotBetween(String value1, String value2) {
            addCriterion("spot_picture_path not between", value1, value2, "spotPicturePath");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIntdescrIsNull() {
            addCriterion("spot_picture_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIntdescrIsNotNull() {
            addCriterion("spot_picture_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIntdescrEqualTo(Integer value) {
            addCriterion("spot_picture_intdescr =", value, "spotPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIntdescrNotEqualTo(Integer value) {
            addCriterion("spot_picture_intdescr <>", value, "spotPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIntdescrGreaterThan(Integer value) {
            addCriterion("spot_picture_intdescr >", value, "spotPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("spot_picture_intdescr >=", value, "spotPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIntdescrLessThan(Integer value) {
            addCriterion("spot_picture_intdescr <", value, "spotPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("spot_picture_intdescr <=", value, "spotPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIntdescrIn(List<Integer> values) {
            addCriterion("spot_picture_intdescr in", values, "spotPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIntdescrNotIn(List<Integer> values) {
            addCriterion("spot_picture_intdescr not in", values, "spotPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("spot_picture_intdescr between", value1, value2, "spotPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("spot_picture_intdescr not between", value1, value2, "spotPictureIntdescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureVardescrIsNull() {
            addCriterion("spot_picture_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andSpotPictureVardescrIsNotNull() {
            addCriterion("spot_picture_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andSpotPictureVardescrEqualTo(String value) {
            addCriterion("spot_picture_vardescr =", value, "spotPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureVardescrNotEqualTo(String value) {
            addCriterion("spot_picture_vardescr <>", value, "spotPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureVardescrGreaterThan(String value) {
            addCriterion("spot_picture_vardescr >", value, "spotPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("spot_picture_vardescr >=", value, "spotPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureVardescrLessThan(String value) {
            addCriterion("spot_picture_vardescr <", value, "spotPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureVardescrLessThanOrEqualTo(String value) {
            addCriterion("spot_picture_vardescr <=", value, "spotPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureVardescrLike(String value) {
            addCriterion("spot_picture_vardescr like", value, "spotPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureVardescrNotLike(String value) {
            addCriterion("spot_picture_vardescr not like", value, "spotPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureVardescrIn(List<String> values) {
            addCriterion("spot_picture_vardescr in", values, "spotPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureVardescrNotIn(List<String> values) {
            addCriterion("spot_picture_vardescr not in", values, "spotPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureVardescrBetween(String value1, String value2) {
            addCriterion("spot_picture_vardescr between", value1, value2, "spotPictureVardescr");
            return (Criteria) this;
        }

        public Criteria andSpotPictureVardescrNotBetween(String value1, String value2) {
            addCriterion("spot_picture_vardescr not between", value1, value2, "spotPictureVardescr");
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