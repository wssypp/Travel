package com.travel.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WayPackageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WayPackageExample() {
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

        public Criteria andWayPackageIdIsNull() {
            addCriterion("way_package_id is null");
            return (Criteria) this;
        }

        public Criteria andWayPackageIdIsNotNull() {
            addCriterion("way_package_id is not null");
            return (Criteria) this;
        }

        public Criteria andWayPackageIdEqualTo(Integer value) {
            addCriterion("way_package_id =", value, "wayPackageId");
            return (Criteria) this;
        }

        public Criteria andWayPackageIdNotEqualTo(Integer value) {
            addCriterion("way_package_id <>", value, "wayPackageId");
            return (Criteria) this;
        }

        public Criteria andWayPackageIdGreaterThan(Integer value) {
            addCriterion("way_package_id >", value, "wayPackageId");
            return (Criteria) this;
        }

        public Criteria andWayPackageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("way_package_id >=", value, "wayPackageId");
            return (Criteria) this;
        }

        public Criteria andWayPackageIdLessThan(Integer value) {
            addCriterion("way_package_id <", value, "wayPackageId");
            return (Criteria) this;
        }

        public Criteria andWayPackageIdLessThanOrEqualTo(Integer value) {
            addCriterion("way_package_id <=", value, "wayPackageId");
            return (Criteria) this;
        }

        public Criteria andWayPackageIdIn(List<Integer> values) {
            addCriterion("way_package_id in", values, "wayPackageId");
            return (Criteria) this;
        }

        public Criteria andWayPackageIdNotIn(List<Integer> values) {
            addCriterion("way_package_id not in", values, "wayPackageId");
            return (Criteria) this;
        }

        public Criteria andWayPackageIdBetween(Integer value1, Integer value2) {
            addCriterion("way_package_id between", value1, value2, "wayPackageId");
            return (Criteria) this;
        }

        public Criteria andWayPackageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("way_package_id not between", value1, value2, "wayPackageId");
            return (Criteria) this;
        }

        public Criteria andWayPackageNameIsNull() {
            addCriterion("way_package_name is null");
            return (Criteria) this;
        }

        public Criteria andWayPackageNameIsNotNull() {
            addCriterion("way_package_name is not null");
            return (Criteria) this;
        }

        public Criteria andWayPackageNameEqualTo(String value) {
            addCriterion("way_package_name =", value, "wayPackageName");
            return (Criteria) this;
        }

        public Criteria andWayPackageNameNotEqualTo(String value) {
            addCriterion("way_package_name <>", value, "wayPackageName");
            return (Criteria) this;
        }

        public Criteria andWayPackageNameGreaterThan(String value) {
            addCriterion("way_package_name >", value, "wayPackageName");
            return (Criteria) this;
        }

        public Criteria andWayPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("way_package_name >=", value, "wayPackageName");
            return (Criteria) this;
        }

        public Criteria andWayPackageNameLessThan(String value) {
            addCriterion("way_package_name <", value, "wayPackageName");
            return (Criteria) this;
        }

        public Criteria andWayPackageNameLessThanOrEqualTo(String value) {
            addCriterion("way_package_name <=", value, "wayPackageName");
            return (Criteria) this;
        }

        public Criteria andWayPackageNameLike(String value) {
            addCriterion("way_package_name like", value, "wayPackageName");
            return (Criteria) this;
        }

        public Criteria andWayPackageNameNotLike(String value) {
            addCriterion("way_package_name not like", value, "wayPackageName");
            return (Criteria) this;
        }

        public Criteria andWayPackageNameIn(List<String> values) {
            addCriterion("way_package_name in", values, "wayPackageName");
            return (Criteria) this;
        }

        public Criteria andWayPackageNameNotIn(List<String> values) {
            addCriterion("way_package_name not in", values, "wayPackageName");
            return (Criteria) this;
        }

        public Criteria andWayPackageNameBetween(String value1, String value2) {
            addCriterion("way_package_name between", value1, value2, "wayPackageName");
            return (Criteria) this;
        }

        public Criteria andWayPackageNameNotBetween(String value1, String value2) {
            addCriterion("way_package_name not between", value1, value2, "wayPackageName");
            return (Criteria) this;
        }

        public Criteria andWayPackageContentIsNull() {
            addCriterion("way_package_content is null");
            return (Criteria) this;
        }

        public Criteria andWayPackageContentIsNotNull() {
            addCriterion("way_package_content is not null");
            return (Criteria) this;
        }

        public Criteria andWayPackageContentEqualTo(String value) {
            addCriterion("way_package_content =", value, "wayPackageContent");
            return (Criteria) this;
        }

        public Criteria andWayPackageContentNotEqualTo(String value) {
            addCriterion("way_package_content <>", value, "wayPackageContent");
            return (Criteria) this;
        }

        public Criteria andWayPackageContentGreaterThan(String value) {
            addCriterion("way_package_content >", value, "wayPackageContent");
            return (Criteria) this;
        }

        public Criteria andWayPackageContentGreaterThanOrEqualTo(String value) {
            addCriterion("way_package_content >=", value, "wayPackageContent");
            return (Criteria) this;
        }

        public Criteria andWayPackageContentLessThan(String value) {
            addCriterion("way_package_content <", value, "wayPackageContent");
            return (Criteria) this;
        }

        public Criteria andWayPackageContentLessThanOrEqualTo(String value) {
            addCriterion("way_package_content <=", value, "wayPackageContent");
            return (Criteria) this;
        }

        public Criteria andWayPackageContentLike(String value) {
            addCriterion("way_package_content like", value, "wayPackageContent");
            return (Criteria) this;
        }

        public Criteria andWayPackageContentNotLike(String value) {
            addCriterion("way_package_content not like", value, "wayPackageContent");
            return (Criteria) this;
        }

        public Criteria andWayPackageContentIn(List<String> values) {
            addCriterion("way_package_content in", values, "wayPackageContent");
            return (Criteria) this;
        }

        public Criteria andWayPackageContentNotIn(List<String> values) {
            addCriterion("way_package_content not in", values, "wayPackageContent");
            return (Criteria) this;
        }

        public Criteria andWayPackageContentBetween(String value1, String value2) {
            addCriterion("way_package_content between", value1, value2, "wayPackageContent");
            return (Criteria) this;
        }

        public Criteria andWayPackageContentNotBetween(String value1, String value2) {
            addCriterion("way_package_content not between", value1, value2, "wayPackageContent");
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

        public Criteria andWayPackagePriceIsNull() {
            addCriterion("way_package_price is null");
            return (Criteria) this;
        }

        public Criteria andWayPackagePriceIsNotNull() {
            addCriterion("way_package_price is not null");
            return (Criteria) this;
        }

        public Criteria andWayPackagePriceEqualTo(Double value) {
            addCriterion("way_package_price =", value, "wayPackagePrice");
            return (Criteria) this;
        }

        public Criteria andWayPackagePriceNotEqualTo(Double value) {
            addCriterion("way_package_price <>", value, "wayPackagePrice");
            return (Criteria) this;
        }

        public Criteria andWayPackagePriceGreaterThan(Double value) {
            addCriterion("way_package_price >", value, "wayPackagePrice");
            return (Criteria) this;
        }

        public Criteria andWayPackagePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("way_package_price >=", value, "wayPackagePrice");
            return (Criteria) this;
        }

        public Criteria andWayPackagePriceLessThan(Double value) {
            addCriterion("way_package_price <", value, "wayPackagePrice");
            return (Criteria) this;
        }

        public Criteria andWayPackagePriceLessThanOrEqualTo(Double value) {
            addCriterion("way_package_price <=", value, "wayPackagePrice");
            return (Criteria) this;
        }

        public Criteria andWayPackagePriceIn(List<Double> values) {
            addCriterion("way_package_price in", values, "wayPackagePrice");
            return (Criteria) this;
        }

        public Criteria andWayPackagePriceNotIn(List<Double> values) {
            addCriterion("way_package_price not in", values, "wayPackagePrice");
            return (Criteria) this;
        }

        public Criteria andWayPackagePriceBetween(Double value1, Double value2) {
            addCriterion("way_package_price between", value1, value2, "wayPackagePrice");
            return (Criteria) this;
        }

        public Criteria andWayPackagePriceNotBetween(Double value1, Double value2) {
            addCriterion("way_package_price not between", value1, value2, "wayPackagePrice");
            return (Criteria) this;
        }

        public Criteria andWayPackageIntdescrIsNull() {
            addCriterion("way_package_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andWayPackageIntdescrIsNotNull() {
            addCriterion("way_package_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andWayPackageIntdescrEqualTo(Integer value) {
            addCriterion("way_package_intdescr =", value, "wayPackageIntdescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageIntdescrNotEqualTo(Integer value) {
            addCriterion("way_package_intdescr <>", value, "wayPackageIntdescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageIntdescrGreaterThan(Integer value) {
            addCriterion("way_package_intdescr >", value, "wayPackageIntdescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("way_package_intdescr >=", value, "wayPackageIntdescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageIntdescrLessThan(Integer value) {
            addCriterion("way_package_intdescr <", value, "wayPackageIntdescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("way_package_intdescr <=", value, "wayPackageIntdescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageIntdescrIn(List<Integer> values) {
            addCriterion("way_package_intdescr in", values, "wayPackageIntdescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageIntdescrNotIn(List<Integer> values) {
            addCriterion("way_package_intdescr not in", values, "wayPackageIntdescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("way_package_intdescr between", value1, value2, "wayPackageIntdescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("way_package_intdescr not between", value1, value2, "wayPackageIntdescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageVardescrIsNull() {
            addCriterion("way_package_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andWayPackageVardescrIsNotNull() {
            addCriterion("way_package_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andWayPackageVardescrEqualTo(String value) {
            addCriterion("way_package_vardescr =", value, "wayPackageVardescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageVardescrNotEqualTo(String value) {
            addCriterion("way_package_vardescr <>", value, "wayPackageVardescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageVardescrGreaterThan(String value) {
            addCriterion("way_package_vardescr >", value, "wayPackageVardescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("way_package_vardescr >=", value, "wayPackageVardescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageVardescrLessThan(String value) {
            addCriterion("way_package_vardescr <", value, "wayPackageVardescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageVardescrLessThanOrEqualTo(String value) {
            addCriterion("way_package_vardescr <=", value, "wayPackageVardescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageVardescrLike(String value) {
            addCriterion("way_package_vardescr like", value, "wayPackageVardescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageVardescrNotLike(String value) {
            addCriterion("way_package_vardescr not like", value, "wayPackageVardescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageVardescrIn(List<String> values) {
            addCriterion("way_package_vardescr in", values, "wayPackageVardescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageVardescrNotIn(List<String> values) {
            addCriterion("way_package_vardescr not in", values, "wayPackageVardescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageVardescrBetween(String value1, String value2) {
            addCriterion("way_package_vardescr between", value1, value2, "wayPackageVardescr");
            return (Criteria) this;
        }

        public Criteria andWayPackageVardescrNotBetween(String value1, String value2) {
            addCriterion("way_package_vardescr not between", value1, value2, "wayPackageVardescr");
            return (Criteria) this;
        }

        public Criteria andWayPackagePublishtimeIsNull() {
            addCriterion("way_package_publishtime is null");
            return (Criteria) this;
        }

        public Criteria andWayPackagePublishtimeIsNotNull() {
            addCriterion("way_package_publishtime is not null");
            return (Criteria) this;
        }

        public Criteria andWayPackagePublishtimeEqualTo(Date value) {
            addCriterion("way_package_publishtime =", value, "wayPackagePublishtime");
            return (Criteria) this;
        }

        public Criteria andWayPackagePublishtimeNotEqualTo(Date value) {
            addCriterion("way_package_publishtime <>", value, "wayPackagePublishtime");
            return (Criteria) this;
        }

        public Criteria andWayPackagePublishtimeGreaterThan(Date value) {
            addCriterion("way_package_publishtime >", value, "wayPackagePublishtime");
            return (Criteria) this;
        }

        public Criteria andWayPackagePublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("way_package_publishtime >=", value, "wayPackagePublishtime");
            return (Criteria) this;
        }

        public Criteria andWayPackagePublishtimeLessThan(Date value) {
            addCriterion("way_package_publishtime <", value, "wayPackagePublishtime");
            return (Criteria) this;
        }

        public Criteria andWayPackagePublishtimeLessThanOrEqualTo(Date value) {
            addCriterion("way_package_publishtime <=", value, "wayPackagePublishtime");
            return (Criteria) this;
        }

        public Criteria andWayPackagePublishtimeIn(List<Date> values) {
            addCriterion("way_package_publishtime in", values, "wayPackagePublishtime");
            return (Criteria) this;
        }

        public Criteria andWayPackagePublishtimeNotIn(List<Date> values) {
            addCriterion("way_package_publishtime not in", values, "wayPackagePublishtime");
            return (Criteria) this;
        }

        public Criteria andWayPackagePublishtimeBetween(Date value1, Date value2) {
            addCriterion("way_package_publishtime between", value1, value2, "wayPackagePublishtime");
            return (Criteria) this;
        }

        public Criteria andWayPackagePublishtimeNotBetween(Date value1, Date value2) {
            addCriterion("way_package_publishtime not between", value1, value2, "wayPackagePublishtime");
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