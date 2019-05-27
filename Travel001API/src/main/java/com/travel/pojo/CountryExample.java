package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class CountryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CountryExample() {
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

        public Criteria andCountryIdIsNull() {
            addCriterion("country_id is null");
            return (Criteria) this;
        }

        public Criteria andCountryIdIsNotNull() {
            addCriterion("country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIdEqualTo(Integer value) {
            addCriterion("country_id =", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotEqualTo(Integer value) {
            addCriterion("country_id <>", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThan(Integer value) {
            addCriterion("country_id >", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_id >=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThan(Integer value) {
            addCriterion("country_id <", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("country_id <=", value, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdIn(List<Integer> values) {
            addCriterion("country_id in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotIn(List<Integer> values) {
            addCriterion("country_id not in", values, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("country_id between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("country_id not between", value1, value2, "countryId");
            return (Criteria) this;
        }

        public Criteria andCountryChinesenameIsNull() {
            addCriterion("country_chinesename is null");
            return (Criteria) this;
        }

        public Criteria andCountryChinesenameIsNotNull() {
            addCriterion("country_chinesename is not null");
            return (Criteria) this;
        }

        public Criteria andCountryChinesenameEqualTo(String value) {
            addCriterion("country_chinesename =", value, "countryChinesename");
            return (Criteria) this;
        }

        public Criteria andCountryChinesenameNotEqualTo(String value) {
            addCriterion("country_chinesename <>", value, "countryChinesename");
            return (Criteria) this;
        }

        public Criteria andCountryChinesenameGreaterThan(String value) {
            addCriterion("country_chinesename >", value, "countryChinesename");
            return (Criteria) this;
        }

        public Criteria andCountryChinesenameGreaterThanOrEqualTo(String value) {
            addCriterion("country_chinesename >=", value, "countryChinesename");
            return (Criteria) this;
        }

        public Criteria andCountryChinesenameLessThan(String value) {
            addCriterion("country_chinesename <", value, "countryChinesename");
            return (Criteria) this;
        }

        public Criteria andCountryChinesenameLessThanOrEqualTo(String value) {
            addCriterion("country_chinesename <=", value, "countryChinesename");
            return (Criteria) this;
        }

        public Criteria andCountryChinesenameLike(String value) {
            addCriterion("country_chinesename like", value, "countryChinesename");
            return (Criteria) this;
        }

        public Criteria andCountryChinesenameNotLike(String value) {
            addCriterion("country_chinesename not like", value, "countryChinesename");
            return (Criteria) this;
        }

        public Criteria andCountryChinesenameIn(List<String> values) {
            addCriterion("country_chinesename in", values, "countryChinesename");
            return (Criteria) this;
        }

        public Criteria andCountryChinesenameNotIn(List<String> values) {
            addCriterion("country_chinesename not in", values, "countryChinesename");
            return (Criteria) this;
        }

        public Criteria andCountryChinesenameBetween(String value1, String value2) {
            addCriterion("country_chinesename between", value1, value2, "countryChinesename");
            return (Criteria) this;
        }

        public Criteria andCountryChinesenameNotBetween(String value1, String value2) {
            addCriterion("country_chinesename not between", value1, value2, "countryChinesename");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishnameIsNull() {
            addCriterion("country_englishname is null");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishnameIsNotNull() {
            addCriterion("country_englishname is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishnameEqualTo(String value) {
            addCriterion("country_englishname =", value, "countryEnglishname");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishnameNotEqualTo(String value) {
            addCriterion("country_englishname <>", value, "countryEnglishname");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishnameGreaterThan(String value) {
            addCriterion("country_englishname >", value, "countryEnglishname");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishnameGreaterThanOrEqualTo(String value) {
            addCriterion("country_englishname >=", value, "countryEnglishname");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishnameLessThan(String value) {
            addCriterion("country_englishname <", value, "countryEnglishname");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishnameLessThanOrEqualTo(String value) {
            addCriterion("country_englishname <=", value, "countryEnglishname");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishnameLike(String value) {
            addCriterion("country_englishname like", value, "countryEnglishname");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishnameNotLike(String value) {
            addCriterion("country_englishname not like", value, "countryEnglishname");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishnameIn(List<String> values) {
            addCriterion("country_englishname in", values, "countryEnglishname");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishnameNotIn(List<String> values) {
            addCriterion("country_englishname not in", values, "countryEnglishname");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishnameBetween(String value1, String value2) {
            addCriterion("country_englishname between", value1, value2, "countryEnglishname");
            return (Criteria) this;
        }

        public Criteria andCountryEnglishnameNotBetween(String value1, String value2) {
            addCriterion("country_englishname not between", value1, value2, "countryEnglishname");
            return (Criteria) this;
        }

        public Criteria andCountryContinentIsNull() {
            addCriterion("country_continent is null");
            return (Criteria) this;
        }

        public Criteria andCountryContinentIsNotNull() {
            addCriterion("country_continent is not null");
            return (Criteria) this;
        }

        public Criteria andCountryContinentEqualTo(String value) {
            addCriterion("country_continent =", value, "countryContinent");
            return (Criteria) this;
        }

        public Criteria andCountryContinentNotEqualTo(String value) {
            addCriterion("country_continent <>", value, "countryContinent");
            return (Criteria) this;
        }

        public Criteria andCountryContinentGreaterThan(String value) {
            addCriterion("country_continent >", value, "countryContinent");
            return (Criteria) this;
        }

        public Criteria andCountryContinentGreaterThanOrEqualTo(String value) {
            addCriterion("country_continent >=", value, "countryContinent");
            return (Criteria) this;
        }

        public Criteria andCountryContinentLessThan(String value) {
            addCriterion("country_continent <", value, "countryContinent");
            return (Criteria) this;
        }

        public Criteria andCountryContinentLessThanOrEqualTo(String value) {
            addCriterion("country_continent <=", value, "countryContinent");
            return (Criteria) this;
        }

        public Criteria andCountryContinentLike(String value) {
            addCriterion("country_continent like", value, "countryContinent");
            return (Criteria) this;
        }

        public Criteria andCountryContinentNotLike(String value) {
            addCriterion("country_continent not like", value, "countryContinent");
            return (Criteria) this;
        }

        public Criteria andCountryContinentIn(List<String> values) {
            addCriterion("country_continent in", values, "countryContinent");
            return (Criteria) this;
        }

        public Criteria andCountryContinentNotIn(List<String> values) {
            addCriterion("country_continent not in", values, "countryContinent");
            return (Criteria) this;
        }

        public Criteria andCountryContinentBetween(String value1, String value2) {
            addCriterion("country_continent between", value1, value2, "countryContinent");
            return (Criteria) this;
        }

        public Criteria andCountryContinentNotBetween(String value1, String value2) {
            addCriterion("country_continent not between", value1, value2, "countryContinent");
            return (Criteria) this;
        }

        public Criteria andCountryFlagIsNull() {
            addCriterion("country_flag is null");
            return (Criteria) this;
        }

        public Criteria andCountryFlagIsNotNull() {
            addCriterion("country_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCountryFlagEqualTo(String value) {
            addCriterion("country_flag =", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagNotEqualTo(String value) {
            addCriterion("country_flag <>", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagGreaterThan(String value) {
            addCriterion("country_flag >", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagGreaterThanOrEqualTo(String value) {
            addCriterion("country_flag >=", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagLessThan(String value) {
            addCriterion("country_flag <", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagLessThanOrEqualTo(String value) {
            addCriterion("country_flag <=", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagLike(String value) {
            addCriterion("country_flag like", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagNotLike(String value) {
            addCriterion("country_flag not like", value, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagIn(List<String> values) {
            addCriterion("country_flag in", values, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagNotIn(List<String> values) {
            addCriterion("country_flag not in", values, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagBetween(String value1, String value2) {
            addCriterion("country_flag between", value1, value2, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryFlagNotBetween(String value1, String value2) {
            addCriterion("country_flag not between", value1, value2, "countryFlag");
            return (Criteria) this;
        }

        public Criteria andCountryIntdescrIsNull() {
            addCriterion("country_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andCountryIntdescrIsNotNull() {
            addCriterion("country_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andCountryIntdescrEqualTo(Integer value) {
            addCriterion("country_intdescr =", value, "countryIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountryIntdescrNotEqualTo(Integer value) {
            addCriterion("country_intdescr <>", value, "countryIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountryIntdescrGreaterThan(Integer value) {
            addCriterion("country_intdescr >", value, "countryIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountryIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("country_intdescr >=", value, "countryIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountryIntdescrLessThan(Integer value) {
            addCriterion("country_intdescr <", value, "countryIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountryIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("country_intdescr <=", value, "countryIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountryIntdescrIn(List<Integer> values) {
            addCriterion("country_intdescr in", values, "countryIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountryIntdescrNotIn(List<Integer> values) {
            addCriterion("country_intdescr not in", values, "countryIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountryIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("country_intdescr between", value1, value2, "countryIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountryIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("country_intdescr not between", value1, value2, "countryIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountryVardescrIsNull() {
            addCriterion("country_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andCountryVardescrIsNotNull() {
            addCriterion("country_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andCountryVardescrEqualTo(String value) {
            addCriterion("country_vardescr =", value, "countryVardescr");
            return (Criteria) this;
        }

        public Criteria andCountryVardescrNotEqualTo(String value) {
            addCriterion("country_vardescr <>", value, "countryVardescr");
            return (Criteria) this;
        }

        public Criteria andCountryVardescrGreaterThan(String value) {
            addCriterion("country_vardescr >", value, "countryVardescr");
            return (Criteria) this;
        }

        public Criteria andCountryVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("country_vardescr >=", value, "countryVardescr");
            return (Criteria) this;
        }

        public Criteria andCountryVardescrLessThan(String value) {
            addCriterion("country_vardescr <", value, "countryVardescr");
            return (Criteria) this;
        }

        public Criteria andCountryVardescrLessThanOrEqualTo(String value) {
            addCriterion("country_vardescr <=", value, "countryVardescr");
            return (Criteria) this;
        }

        public Criteria andCountryVardescrLike(String value) {
            addCriterion("country_vardescr like", value, "countryVardescr");
            return (Criteria) this;
        }

        public Criteria andCountryVardescrNotLike(String value) {
            addCriterion("country_vardescr not like", value, "countryVardescr");
            return (Criteria) this;
        }

        public Criteria andCountryVardescrIn(List<String> values) {
            addCriterion("country_vardescr in", values, "countryVardescr");
            return (Criteria) this;
        }

        public Criteria andCountryVardescrNotIn(List<String> values) {
            addCriterion("country_vardescr not in", values, "countryVardescr");
            return (Criteria) this;
        }

        public Criteria andCountryVardescrBetween(String value1, String value2) {
            addCriterion("country_vardescr between", value1, value2, "countryVardescr");
            return (Criteria) this;
        }

        public Criteria andCountryVardescrNotBetween(String value1, String value2) {
            addCriterion("country_vardescr not between", value1, value2, "countryVardescr");
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