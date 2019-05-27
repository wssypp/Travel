package com.travel.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScenicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicExample() {
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

        public Criteria andScenicNameIsNull() {
            addCriterion("scenic_name is null");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNotNull() {
            addCriterion("scenic_name is not null");
            return (Criteria) this;
        }

        public Criteria andScenicNameEqualTo(String value) {
            addCriterion("scenic_name =", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotEqualTo(String value) {
            addCriterion("scenic_name <>", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThan(String value) {
            addCriterion("scenic_name >", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_name >=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThan(String value) {
            addCriterion("scenic_name <", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThanOrEqualTo(String value) {
            addCriterion("scenic_name <=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLike(String value) {
            addCriterion("scenic_name like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotLike(String value) {
            addCriterion("scenic_name not like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameIn(List<String> values) {
            addCriterion("scenic_name in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotIn(List<String> values) {
            addCriterion("scenic_name not in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameBetween(String value1, String value2) {
            addCriterion("scenic_name between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotBetween(String value1, String value2) {
            addCriterion("scenic_name not between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicCommentvolumeIsNull() {
            addCriterion("scenic_commentvolume is null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentvolumeIsNotNull() {
            addCriterion("scenic_commentvolume is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCommentvolumeEqualTo(Integer value) {
            addCriterion("scenic_commentvolume =", value, "scenicCommentvolume");
            return (Criteria) this;
        }

        public Criteria andScenicCommentvolumeNotEqualTo(Integer value) {
            addCriterion("scenic_commentvolume <>", value, "scenicCommentvolume");
            return (Criteria) this;
        }

        public Criteria andScenicCommentvolumeGreaterThan(Integer value) {
            addCriterion("scenic_commentvolume >", value, "scenicCommentvolume");
            return (Criteria) this;
        }

        public Criteria andScenicCommentvolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_commentvolume >=", value, "scenicCommentvolume");
            return (Criteria) this;
        }

        public Criteria andScenicCommentvolumeLessThan(Integer value) {
            addCriterion("scenic_commentvolume <", value, "scenicCommentvolume");
            return (Criteria) this;
        }

        public Criteria andScenicCommentvolumeLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_commentvolume <=", value, "scenicCommentvolume");
            return (Criteria) this;
        }

        public Criteria andScenicCommentvolumeIn(List<Integer> values) {
            addCriterion("scenic_commentvolume in", values, "scenicCommentvolume");
            return (Criteria) this;
        }

        public Criteria andScenicCommentvolumeNotIn(List<Integer> values) {
            addCriterion("scenic_commentvolume not in", values, "scenicCommentvolume");
            return (Criteria) this;
        }

        public Criteria andScenicCommentvolumeBetween(Integer value1, Integer value2) {
            addCriterion("scenic_commentvolume between", value1, value2, "scenicCommentvolume");
            return (Criteria) this;
        }

        public Criteria andScenicCommentvolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_commentvolume not between", value1, value2, "scenicCommentvolume");
            return (Criteria) this;
        }

        public Criteria andScenicVisitationIsNull() {
            addCriterion("scenic_visitation is null");
            return (Criteria) this;
        }

        public Criteria andScenicVisitationIsNotNull() {
            addCriterion("scenic_visitation is not null");
            return (Criteria) this;
        }

        public Criteria andScenicVisitationEqualTo(Integer value) {
            addCriterion("scenic_visitation =", value, "scenicVisitation");
            return (Criteria) this;
        }

        public Criteria andScenicVisitationNotEqualTo(Integer value) {
            addCriterion("scenic_visitation <>", value, "scenicVisitation");
            return (Criteria) this;
        }

        public Criteria andScenicVisitationGreaterThan(Integer value) {
            addCriterion("scenic_visitation >", value, "scenicVisitation");
            return (Criteria) this;
        }

        public Criteria andScenicVisitationGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_visitation >=", value, "scenicVisitation");
            return (Criteria) this;
        }

        public Criteria andScenicVisitationLessThan(Integer value) {
            addCriterion("scenic_visitation <", value, "scenicVisitation");
            return (Criteria) this;
        }

        public Criteria andScenicVisitationLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_visitation <=", value, "scenicVisitation");
            return (Criteria) this;
        }

        public Criteria andScenicVisitationIn(List<Integer> values) {
            addCriterion("scenic_visitation in", values, "scenicVisitation");
            return (Criteria) this;
        }

        public Criteria andScenicVisitationNotIn(List<Integer> values) {
            addCriterion("scenic_visitation not in", values, "scenicVisitation");
            return (Criteria) this;
        }

        public Criteria andScenicVisitationBetween(Integer value1, Integer value2) {
            addCriterion("scenic_visitation between", value1, value2, "scenicVisitation");
            return (Criteria) this;
        }

        public Criteria andScenicVisitationNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_visitation not between", value1, value2, "scenicVisitation");
            return (Criteria) this;
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

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNull() {
            addCriterion("county_id is null");
            return (Criteria) this;
        }

        public Criteria andCountyIdIsNotNull() {
            addCriterion("county_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIdEqualTo(Integer value) {
            addCriterion("county_id =", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotEqualTo(Integer value) {
            addCriterion("county_id <>", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThan(Integer value) {
            addCriterion("county_id >", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("county_id >=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThan(Integer value) {
            addCriterion("county_id <", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdLessThanOrEqualTo(Integer value) {
            addCriterion("county_id <=", value, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdIn(List<Integer> values) {
            addCriterion("county_id in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotIn(List<Integer> values) {
            addCriterion("county_id not in", values, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdBetween(Integer value1, Integer value2) {
            addCriterion("county_id between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andCountyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("county_id not between", value1, value2, "countyId");
            return (Criteria) this;
        }

        public Criteria andScenicDetailedaddressIsNull() {
            addCriterion("scenic_detailedaddress is null");
            return (Criteria) this;
        }

        public Criteria andScenicDetailedaddressIsNotNull() {
            addCriterion("scenic_detailedaddress is not null");
            return (Criteria) this;
        }

        public Criteria andScenicDetailedaddressEqualTo(String value) {
            addCriterion("scenic_detailedaddress =", value, "scenicDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andScenicDetailedaddressNotEqualTo(String value) {
            addCriterion("scenic_detailedaddress <>", value, "scenicDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andScenicDetailedaddressGreaterThan(String value) {
            addCriterion("scenic_detailedaddress >", value, "scenicDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andScenicDetailedaddressGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_detailedaddress >=", value, "scenicDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andScenicDetailedaddressLessThan(String value) {
            addCriterion("scenic_detailedaddress <", value, "scenicDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andScenicDetailedaddressLessThanOrEqualTo(String value) {
            addCriterion("scenic_detailedaddress <=", value, "scenicDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andScenicDetailedaddressLike(String value) {
            addCriterion("scenic_detailedaddress like", value, "scenicDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andScenicDetailedaddressNotLike(String value) {
            addCriterion("scenic_detailedaddress not like", value, "scenicDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andScenicDetailedaddressIn(List<String> values) {
            addCriterion("scenic_detailedaddress in", values, "scenicDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andScenicDetailedaddressNotIn(List<String> values) {
            addCriterion("scenic_detailedaddress not in", values, "scenicDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andScenicDetailedaddressBetween(String value1, String value2) {
            addCriterion("scenic_detailedaddress between", value1, value2, "scenicDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andScenicDetailedaddressNotBetween(String value1, String value2) {
            addCriterion("scenic_detailedaddress not between", value1, value2, "scenicDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andScenicContactIsNull() {
            addCriterion("scenic_contact is null");
            return (Criteria) this;
        }

        public Criteria andScenicContactIsNotNull() {
            addCriterion("scenic_contact is not null");
            return (Criteria) this;
        }

        public Criteria andScenicContactEqualTo(String value) {
            addCriterion("scenic_contact =", value, "scenicContact");
            return (Criteria) this;
        }

        public Criteria andScenicContactNotEqualTo(String value) {
            addCriterion("scenic_contact <>", value, "scenicContact");
            return (Criteria) this;
        }

        public Criteria andScenicContactGreaterThan(String value) {
            addCriterion("scenic_contact >", value, "scenicContact");
            return (Criteria) this;
        }

        public Criteria andScenicContactGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_contact >=", value, "scenicContact");
            return (Criteria) this;
        }

        public Criteria andScenicContactLessThan(String value) {
            addCriterion("scenic_contact <", value, "scenicContact");
            return (Criteria) this;
        }

        public Criteria andScenicContactLessThanOrEqualTo(String value) {
            addCriterion("scenic_contact <=", value, "scenicContact");
            return (Criteria) this;
        }

        public Criteria andScenicContactLike(String value) {
            addCriterion("scenic_contact like", value, "scenicContact");
            return (Criteria) this;
        }

        public Criteria andScenicContactNotLike(String value) {
            addCriterion("scenic_contact not like", value, "scenicContact");
            return (Criteria) this;
        }

        public Criteria andScenicContactIn(List<String> values) {
            addCriterion("scenic_contact in", values, "scenicContact");
            return (Criteria) this;
        }

        public Criteria andScenicContactNotIn(List<String> values) {
            addCriterion("scenic_contact not in", values, "scenicContact");
            return (Criteria) this;
        }

        public Criteria andScenicContactBetween(String value1, String value2) {
            addCriterion("scenic_contact between", value1, value2, "scenicContact");
            return (Criteria) this;
        }

        public Criteria andScenicContactNotBetween(String value1, String value2) {
            addCriterion("scenic_contact not between", value1, value2, "scenicContact");
            return (Criteria) this;
        }

        public Criteria andScenicTelIsNull() {
            addCriterion("scenic_tel is null");
            return (Criteria) this;
        }

        public Criteria andScenicTelIsNotNull() {
            addCriterion("scenic_tel is not null");
            return (Criteria) this;
        }

        public Criteria andScenicTelEqualTo(String value) {
            addCriterion("scenic_tel =", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelNotEqualTo(String value) {
            addCriterion("scenic_tel <>", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelGreaterThan(String value) {
            addCriterion("scenic_tel >", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_tel >=", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelLessThan(String value) {
            addCriterion("scenic_tel <", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelLessThanOrEqualTo(String value) {
            addCriterion("scenic_tel <=", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelLike(String value) {
            addCriterion("scenic_tel like", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelNotLike(String value) {
            addCriterion("scenic_tel not like", value, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelIn(List<String> values) {
            addCriterion("scenic_tel in", values, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelNotIn(List<String> values) {
            addCriterion("scenic_tel not in", values, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelBetween(String value1, String value2) {
            addCriterion("scenic_tel between", value1, value2, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTelNotBetween(String value1, String value2) {
            addCriterion("scenic_tel not between", value1, value2, "scenicTel");
            return (Criteria) this;
        }

        public Criteria andScenicTypeIsNull() {
            addCriterion("scenic_type is null");
            return (Criteria) this;
        }

        public Criteria andScenicTypeIsNotNull() {
            addCriterion("scenic_type is not null");
            return (Criteria) this;
        }

        public Criteria andScenicTypeEqualTo(String value) {
            addCriterion("scenic_type =", value, "scenicType");
            return (Criteria) this;
        }

        public Criteria andScenicTypeNotEqualTo(String value) {
            addCriterion("scenic_type <>", value, "scenicType");
            return (Criteria) this;
        }

        public Criteria andScenicTypeGreaterThan(String value) {
            addCriterion("scenic_type >", value, "scenicType");
            return (Criteria) this;
        }

        public Criteria andScenicTypeGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_type >=", value, "scenicType");
            return (Criteria) this;
        }

        public Criteria andScenicTypeLessThan(String value) {
            addCriterion("scenic_type <", value, "scenicType");
            return (Criteria) this;
        }

        public Criteria andScenicTypeLessThanOrEqualTo(String value) {
            addCriterion("scenic_type <=", value, "scenicType");
            return (Criteria) this;
        }

        public Criteria andScenicTypeLike(String value) {
            addCriterion("scenic_type like", value, "scenicType");
            return (Criteria) this;
        }

        public Criteria andScenicTypeNotLike(String value) {
            addCriterion("scenic_type not like", value, "scenicType");
            return (Criteria) this;
        }

        public Criteria andScenicTypeIn(List<String> values) {
            addCriterion("scenic_type in", values, "scenicType");
            return (Criteria) this;
        }

        public Criteria andScenicTypeNotIn(List<String> values) {
            addCriterion("scenic_type not in", values, "scenicType");
            return (Criteria) this;
        }

        public Criteria andScenicTypeBetween(String value1, String value2) {
            addCriterion("scenic_type between", value1, value2, "scenicType");
            return (Criteria) this;
        }

        public Criteria andScenicTypeNotBetween(String value1, String value2) {
            addCriterion("scenic_type not between", value1, value2, "scenicType");
            return (Criteria) this;
        }

        public Criteria andScenicPictureIsNull() {
            addCriterion("scenic_picture is null");
            return (Criteria) this;
        }

        public Criteria andScenicPictureIsNotNull() {
            addCriterion("scenic_picture is not null");
            return (Criteria) this;
        }

        public Criteria andScenicPictureEqualTo(String value) {
            addCriterion("scenic_picture =", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureNotEqualTo(String value) {
            addCriterion("scenic_picture <>", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureGreaterThan(String value) {
            addCriterion("scenic_picture >", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_picture >=", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureLessThan(String value) {
            addCriterion("scenic_picture <", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureLessThanOrEqualTo(String value) {
            addCriterion("scenic_picture <=", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureLike(String value) {
            addCriterion("scenic_picture like", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureNotLike(String value) {
            addCriterion("scenic_picture not like", value, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureIn(List<String> values) {
            addCriterion("scenic_picture in", values, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureNotIn(List<String> values) {
            addCriterion("scenic_picture not in", values, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureBetween(String value1, String value2) {
            addCriterion("scenic_picture between", value1, value2, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicPictureNotBetween(String value1, String value2) {
            addCriterion("scenic_picture not between", value1, value2, "scenicPicture");
            return (Criteria) this;
        }

        public Criteria andScenicStarlevelIsNull() {
            addCriterion("scenic_starlevel is null");
            return (Criteria) this;
        }

        public Criteria andScenicStarlevelIsNotNull() {
            addCriterion("scenic_starlevel is not null");
            return (Criteria) this;
        }

        public Criteria andScenicStarlevelEqualTo(String value) {
            addCriterion("scenic_starlevel =", value, "scenicStarlevel");
            return (Criteria) this;
        }

        public Criteria andScenicStarlevelNotEqualTo(String value) {
            addCriterion("scenic_starlevel <>", value, "scenicStarlevel");
            return (Criteria) this;
        }

        public Criteria andScenicStarlevelGreaterThan(String value) {
            addCriterion("scenic_starlevel >", value, "scenicStarlevel");
            return (Criteria) this;
        }

        public Criteria andScenicStarlevelGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_starlevel >=", value, "scenicStarlevel");
            return (Criteria) this;
        }

        public Criteria andScenicStarlevelLessThan(String value) {
            addCriterion("scenic_starlevel <", value, "scenicStarlevel");
            return (Criteria) this;
        }

        public Criteria andScenicStarlevelLessThanOrEqualTo(String value) {
            addCriterion("scenic_starlevel <=", value, "scenicStarlevel");
            return (Criteria) this;
        }

        public Criteria andScenicStarlevelLike(String value) {
            addCriterion("scenic_starlevel like", value, "scenicStarlevel");
            return (Criteria) this;
        }

        public Criteria andScenicStarlevelNotLike(String value) {
            addCriterion("scenic_starlevel not like", value, "scenicStarlevel");
            return (Criteria) this;
        }

        public Criteria andScenicStarlevelIn(List<String> values) {
            addCriterion("scenic_starlevel in", values, "scenicStarlevel");
            return (Criteria) this;
        }

        public Criteria andScenicStarlevelNotIn(List<String> values) {
            addCriterion("scenic_starlevel not in", values, "scenicStarlevel");
            return (Criteria) this;
        }

        public Criteria andScenicStarlevelBetween(String value1, String value2) {
            addCriterion("scenic_starlevel between", value1, value2, "scenicStarlevel");
            return (Criteria) this;
        }

        public Criteria andScenicStarlevelNotBetween(String value1, String value2) {
            addCriterion("scenic_starlevel not between", value1, value2, "scenicStarlevel");
            return (Criteria) this;
        }

        public Criteria andScenicScoreIsNull() {
            addCriterion("scenic_score is null");
            return (Criteria) this;
        }

        public Criteria andScenicScoreIsNotNull() {
            addCriterion("scenic_score is not null");
            return (Criteria) this;
        }

        public Criteria andScenicScoreEqualTo(Double value) {
            addCriterion("scenic_score =", value, "scenicScore");
            return (Criteria) this;
        }

        public Criteria andScenicScoreNotEqualTo(Double value) {
            addCriterion("scenic_score <>", value, "scenicScore");
            return (Criteria) this;
        }

        public Criteria andScenicScoreGreaterThan(Double value) {
            addCriterion("scenic_score >", value, "scenicScore");
            return (Criteria) this;
        }

        public Criteria andScenicScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("scenic_score >=", value, "scenicScore");
            return (Criteria) this;
        }

        public Criteria andScenicScoreLessThan(Double value) {
            addCriterion("scenic_score <", value, "scenicScore");
            return (Criteria) this;
        }

        public Criteria andScenicScoreLessThanOrEqualTo(Double value) {
            addCriterion("scenic_score <=", value, "scenicScore");
            return (Criteria) this;
        }

        public Criteria andScenicScoreIn(List<Double> values) {
            addCriterion("scenic_score in", values, "scenicScore");
            return (Criteria) this;
        }

        public Criteria andScenicScoreNotIn(List<Double> values) {
            addCriterion("scenic_score not in", values, "scenicScore");
            return (Criteria) this;
        }

        public Criteria andScenicScoreBetween(Double value1, Double value2) {
            addCriterion("scenic_score between", value1, value2, "scenicScore");
            return (Criteria) this;
        }

        public Criteria andScenicScoreNotBetween(Double value1, Double value2) {
            addCriterion("scenic_score not between", value1, value2, "scenicScore");
            return (Criteria) this;
        }

        public Criteria andScenicNoticeIsNull() {
            addCriterion("scenic_notice is null");
            return (Criteria) this;
        }

        public Criteria andScenicNoticeIsNotNull() {
            addCriterion("scenic_notice is not null");
            return (Criteria) this;
        }

        public Criteria andScenicNoticeEqualTo(String value) {
            addCriterion("scenic_notice =", value, "scenicNotice");
            return (Criteria) this;
        }

        public Criteria andScenicNoticeNotEqualTo(String value) {
            addCriterion("scenic_notice <>", value, "scenicNotice");
            return (Criteria) this;
        }

        public Criteria andScenicNoticeGreaterThan(String value) {
            addCriterion("scenic_notice >", value, "scenicNotice");
            return (Criteria) this;
        }

        public Criteria andScenicNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_notice >=", value, "scenicNotice");
            return (Criteria) this;
        }

        public Criteria andScenicNoticeLessThan(String value) {
            addCriterion("scenic_notice <", value, "scenicNotice");
            return (Criteria) this;
        }

        public Criteria andScenicNoticeLessThanOrEqualTo(String value) {
            addCriterion("scenic_notice <=", value, "scenicNotice");
            return (Criteria) this;
        }

        public Criteria andScenicNoticeLike(String value) {
            addCriterion("scenic_notice like", value, "scenicNotice");
            return (Criteria) this;
        }

        public Criteria andScenicNoticeNotLike(String value) {
            addCriterion("scenic_notice not like", value, "scenicNotice");
            return (Criteria) this;
        }

        public Criteria andScenicNoticeIn(List<String> values) {
            addCriterion("scenic_notice in", values, "scenicNotice");
            return (Criteria) this;
        }

        public Criteria andScenicNoticeNotIn(List<String> values) {
            addCriterion("scenic_notice not in", values, "scenicNotice");
            return (Criteria) this;
        }

        public Criteria andScenicNoticeBetween(String value1, String value2) {
            addCriterion("scenic_notice between", value1, value2, "scenicNotice");
            return (Criteria) this;
        }

        public Criteria andScenicNoticeNotBetween(String value1, String value2) {
            addCriterion("scenic_notice not between", value1, value2, "scenicNotice");
            return (Criteria) this;
        }

        public Criteria andScenicLowseasonticketIsNull() {
            addCriterion("scenic_lowseasonticket is null");
            return (Criteria) this;
        }

        public Criteria andScenicLowseasonticketIsNotNull() {
            addCriterion("scenic_lowseasonticket is not null");
            return (Criteria) this;
        }

        public Criteria andScenicLowseasonticketEqualTo(Double value) {
            addCriterion("scenic_lowseasonticket =", value, "scenicLowseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicLowseasonticketNotEqualTo(Double value) {
            addCriterion("scenic_lowseasonticket <>", value, "scenicLowseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicLowseasonticketGreaterThan(Double value) {
            addCriterion("scenic_lowseasonticket >", value, "scenicLowseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicLowseasonticketGreaterThanOrEqualTo(Double value) {
            addCriterion("scenic_lowseasonticket >=", value, "scenicLowseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicLowseasonticketLessThan(Double value) {
            addCriterion("scenic_lowseasonticket <", value, "scenicLowseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicLowseasonticketLessThanOrEqualTo(Double value) {
            addCriterion("scenic_lowseasonticket <=", value, "scenicLowseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicLowseasonticketIn(List<Double> values) {
            addCriterion("scenic_lowseasonticket in", values, "scenicLowseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicLowseasonticketNotIn(List<Double> values) {
            addCriterion("scenic_lowseasonticket not in", values, "scenicLowseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicLowseasonticketBetween(Double value1, Double value2) {
            addCriterion("scenic_lowseasonticket between", value1, value2, "scenicLowseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicLowseasonticketNotBetween(Double value1, Double value2) {
            addCriterion("scenic_lowseasonticket not between", value1, value2, "scenicLowseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicHighseasonticketIsNull() {
            addCriterion("scenic_highseasonticket is null");
            return (Criteria) this;
        }

        public Criteria andScenicHighseasonticketIsNotNull() {
            addCriterion("scenic_highseasonticket is not null");
            return (Criteria) this;
        }

        public Criteria andScenicHighseasonticketEqualTo(Double value) {
            addCriterion("scenic_highseasonticket =", value, "scenicHighseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicHighseasonticketNotEqualTo(Double value) {
            addCriterion("scenic_highseasonticket <>", value, "scenicHighseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicHighseasonticketGreaterThan(Double value) {
            addCriterion("scenic_highseasonticket >", value, "scenicHighseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicHighseasonticketGreaterThanOrEqualTo(Double value) {
            addCriterion("scenic_highseasonticket >=", value, "scenicHighseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicHighseasonticketLessThan(Double value) {
            addCriterion("scenic_highseasonticket <", value, "scenicHighseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicHighseasonticketLessThanOrEqualTo(Double value) {
            addCriterion("scenic_highseasonticket <=", value, "scenicHighseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicHighseasonticketIn(List<Double> values) {
            addCriterion("scenic_highseasonticket in", values, "scenicHighseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicHighseasonticketNotIn(List<Double> values) {
            addCriterion("scenic_highseasonticket not in", values, "scenicHighseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicHighseasonticketBetween(Double value1, Double value2) {
            addCriterion("scenic_highseasonticket between", value1, value2, "scenicHighseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicHighseasonticketNotBetween(Double value1, Double value2) {
            addCriterion("scenic_highseasonticket not between", value1, value2, "scenicHighseasonticket");
            return (Criteria) this;
        }

        public Criteria andScenicTransportionIsNull() {
            addCriterion("scenic_transportion is null");
            return (Criteria) this;
        }

        public Criteria andScenicTransportionIsNotNull() {
            addCriterion("scenic_transportion is not null");
            return (Criteria) this;
        }

        public Criteria andScenicTransportionEqualTo(String value) {
            addCriterion("scenic_transportion =", value, "scenicTransportion");
            return (Criteria) this;
        }

        public Criteria andScenicTransportionNotEqualTo(String value) {
            addCriterion("scenic_transportion <>", value, "scenicTransportion");
            return (Criteria) this;
        }

        public Criteria andScenicTransportionGreaterThan(String value) {
            addCriterion("scenic_transportion >", value, "scenicTransportion");
            return (Criteria) this;
        }

        public Criteria andScenicTransportionGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_transportion >=", value, "scenicTransportion");
            return (Criteria) this;
        }

        public Criteria andScenicTransportionLessThan(String value) {
            addCriterion("scenic_transportion <", value, "scenicTransportion");
            return (Criteria) this;
        }

        public Criteria andScenicTransportionLessThanOrEqualTo(String value) {
            addCriterion("scenic_transportion <=", value, "scenicTransportion");
            return (Criteria) this;
        }

        public Criteria andScenicTransportionLike(String value) {
            addCriterion("scenic_transportion like", value, "scenicTransportion");
            return (Criteria) this;
        }

        public Criteria andScenicTransportionNotLike(String value) {
            addCriterion("scenic_transportion not like", value, "scenicTransportion");
            return (Criteria) this;
        }

        public Criteria andScenicTransportionIn(List<String> values) {
            addCriterion("scenic_transportion in", values, "scenicTransportion");
            return (Criteria) this;
        }

        public Criteria andScenicTransportionNotIn(List<String> values) {
            addCriterion("scenic_transportion not in", values, "scenicTransportion");
            return (Criteria) this;
        }

        public Criteria andScenicTransportionBetween(String value1, String value2) {
            addCriterion("scenic_transportion between", value1, value2, "scenicTransportion");
            return (Criteria) this;
        }

        public Criteria andScenicTransportionNotBetween(String value1, String value2) {
            addCriterion("scenic_transportion not between", value1, value2, "scenicTransportion");
            return (Criteria) this;
        }

        public Criteria andScenicOpentimeIsNull() {
            addCriterion("scenic_opentime is null");
            return (Criteria) this;
        }

        public Criteria andScenicOpentimeIsNotNull() {
            addCriterion("scenic_opentime is not null");
            return (Criteria) this;
        }

        public Criteria andScenicOpentimeEqualTo(Date value) {
            addCriterion("scenic_opentime =", value, "scenicOpentime");
            return (Criteria) this;
        }

        public Criteria andScenicOpentimeNotEqualTo(Date value) {
            addCriterion("scenic_opentime <>", value, "scenicOpentime");
            return (Criteria) this;
        }

        public Criteria andScenicOpentimeGreaterThan(Date value) {
            addCriterion("scenic_opentime >", value, "scenicOpentime");
            return (Criteria) this;
        }

        public Criteria andScenicOpentimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scenic_opentime >=", value, "scenicOpentime");
            return (Criteria) this;
        }

        public Criteria andScenicOpentimeLessThan(Date value) {
            addCriterion("scenic_opentime <", value, "scenicOpentime");
            return (Criteria) this;
        }

        public Criteria andScenicOpentimeLessThanOrEqualTo(Date value) {
            addCriterion("scenic_opentime <=", value, "scenicOpentime");
            return (Criteria) this;
        }

        public Criteria andScenicOpentimeIn(List<Date> values) {
            addCriterion("scenic_opentime in", values, "scenicOpentime");
            return (Criteria) this;
        }

        public Criteria andScenicOpentimeNotIn(List<Date> values) {
            addCriterion("scenic_opentime not in", values, "scenicOpentime");
            return (Criteria) this;
        }

        public Criteria andScenicOpentimeBetween(Date value1, Date value2) {
            addCriterion("scenic_opentime between", value1, value2, "scenicOpentime");
            return (Criteria) this;
        }

        public Criteria andScenicOpentimeNotBetween(Date value1, Date value2) {
            addCriterion("scenic_opentime not between", value1, value2, "scenicOpentime");
            return (Criteria) this;
        }

        public Criteria andScenicDescrIsNull() {
            addCriterion("scenic_descr is null");
            return (Criteria) this;
        }

        public Criteria andScenicDescrIsNotNull() {
            addCriterion("scenic_descr is not null");
            return (Criteria) this;
        }

        public Criteria andScenicDescrEqualTo(String value) {
            addCriterion("scenic_descr =", value, "scenicDescr");
            return (Criteria) this;
        }

        public Criteria andScenicDescrNotEqualTo(String value) {
            addCriterion("scenic_descr <>", value, "scenicDescr");
            return (Criteria) this;
        }

        public Criteria andScenicDescrGreaterThan(String value) {
            addCriterion("scenic_descr >", value, "scenicDescr");
            return (Criteria) this;
        }

        public Criteria andScenicDescrGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_descr >=", value, "scenicDescr");
            return (Criteria) this;
        }

        public Criteria andScenicDescrLessThan(String value) {
            addCriterion("scenic_descr <", value, "scenicDescr");
            return (Criteria) this;
        }

        public Criteria andScenicDescrLessThanOrEqualTo(String value) {
            addCriterion("scenic_descr <=", value, "scenicDescr");
            return (Criteria) this;
        }

        public Criteria andScenicDescrLike(String value) {
            addCriterion("scenic_descr like", value, "scenicDescr");
            return (Criteria) this;
        }

        public Criteria andScenicDescrNotLike(String value) {
            addCriterion("scenic_descr not like", value, "scenicDescr");
            return (Criteria) this;
        }

        public Criteria andScenicDescrIn(List<String> values) {
            addCriterion("scenic_descr in", values, "scenicDescr");
            return (Criteria) this;
        }

        public Criteria andScenicDescrNotIn(List<String> values) {
            addCriterion("scenic_descr not in", values, "scenicDescr");
            return (Criteria) this;
        }

        public Criteria andScenicDescrBetween(String value1, String value2) {
            addCriterion("scenic_descr between", value1, value2, "scenicDescr");
            return (Criteria) this;
        }

        public Criteria andScenicDescrNotBetween(String value1, String value2) {
            addCriterion("scenic_descr not between", value1, value2, "scenicDescr");
            return (Criteria) this;
        }

        public Criteria andScenicDistanceIsNull() {
            addCriterion("scenic_distance is null");
            return (Criteria) this;
        }

        public Criteria andScenicDistanceIsNotNull() {
            addCriterion("scenic_distance is not null");
            return (Criteria) this;
        }

        public Criteria andScenicDistanceEqualTo(Double value) {
            addCriterion("scenic_distance =", value, "scenicDistance");
            return (Criteria) this;
        }

        public Criteria andScenicDistanceNotEqualTo(Double value) {
            addCriterion("scenic_distance <>", value, "scenicDistance");
            return (Criteria) this;
        }

        public Criteria andScenicDistanceGreaterThan(Double value) {
            addCriterion("scenic_distance >", value, "scenicDistance");
            return (Criteria) this;
        }

        public Criteria andScenicDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("scenic_distance >=", value, "scenicDistance");
            return (Criteria) this;
        }

        public Criteria andScenicDistanceLessThan(Double value) {
            addCriterion("scenic_distance <", value, "scenicDistance");
            return (Criteria) this;
        }

        public Criteria andScenicDistanceLessThanOrEqualTo(Double value) {
            addCriterion("scenic_distance <=", value, "scenicDistance");
            return (Criteria) this;
        }

        public Criteria andScenicDistanceIn(List<Double> values) {
            addCriterion("scenic_distance in", values, "scenicDistance");
            return (Criteria) this;
        }

        public Criteria andScenicDistanceNotIn(List<Double> values) {
            addCriterion("scenic_distance not in", values, "scenicDistance");
            return (Criteria) this;
        }

        public Criteria andScenicDistanceBetween(Double value1, Double value2) {
            addCriterion("scenic_distance between", value1, value2, "scenicDistance");
            return (Criteria) this;
        }

        public Criteria andScenicDistanceNotBetween(Double value1, Double value2) {
            addCriterion("scenic_distance not between", value1, value2, "scenicDistance");
            return (Criteria) this;
        }

        public Criteria andCountyIntdescrIsNull() {
            addCriterion("county_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andCountyIntdescrIsNotNull() {
            addCriterion("county_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andCountyIntdescrEqualTo(Integer value) {
            addCriterion("county_intdescr =", value, "countyIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountyIntdescrNotEqualTo(Integer value) {
            addCriterion("county_intdescr <>", value, "countyIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountyIntdescrGreaterThan(Integer value) {
            addCriterion("county_intdescr >", value, "countyIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountyIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("county_intdescr >=", value, "countyIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountyIntdescrLessThan(Integer value) {
            addCriterion("county_intdescr <", value, "countyIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountyIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("county_intdescr <=", value, "countyIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountyIntdescrIn(List<Integer> values) {
            addCriterion("county_intdescr in", values, "countyIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountyIntdescrNotIn(List<Integer> values) {
            addCriterion("county_intdescr not in", values, "countyIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountyIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("county_intdescr between", value1, value2, "countyIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountyIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("county_intdescr not between", value1, value2, "countyIntdescr");
            return (Criteria) this;
        }

        public Criteria andCountyVardescrIsNull() {
            addCriterion("county_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andCountyVardescrIsNotNull() {
            addCriterion("county_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andCountyVardescrEqualTo(String value) {
            addCriterion("county_vardescr =", value, "countyVardescr");
            return (Criteria) this;
        }

        public Criteria andCountyVardescrNotEqualTo(String value) {
            addCriterion("county_vardescr <>", value, "countyVardescr");
            return (Criteria) this;
        }

        public Criteria andCountyVardescrGreaterThan(String value) {
            addCriterion("county_vardescr >", value, "countyVardescr");
            return (Criteria) this;
        }

        public Criteria andCountyVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("county_vardescr >=", value, "countyVardescr");
            return (Criteria) this;
        }

        public Criteria andCountyVardescrLessThan(String value) {
            addCriterion("county_vardescr <", value, "countyVardescr");
            return (Criteria) this;
        }

        public Criteria andCountyVardescrLessThanOrEqualTo(String value) {
            addCriterion("county_vardescr <=", value, "countyVardescr");
            return (Criteria) this;
        }

        public Criteria andCountyVardescrLike(String value) {
            addCriterion("county_vardescr like", value, "countyVardescr");
            return (Criteria) this;
        }

        public Criteria andCountyVardescrNotLike(String value) {
            addCriterion("county_vardescr not like", value, "countyVardescr");
            return (Criteria) this;
        }

        public Criteria andCountyVardescrIn(List<String> values) {
            addCriterion("county_vardescr in", values, "countyVardescr");
            return (Criteria) this;
        }

        public Criteria andCountyVardescrNotIn(List<String> values) {
            addCriterion("county_vardescr not in", values, "countyVardescr");
            return (Criteria) this;
        }

        public Criteria andCountyVardescrBetween(String value1, String value2) {
            addCriterion("county_vardescr between", value1, value2, "countyVardescr");
            return (Criteria) this;
        }

        public Criteria andCountyVardescrNotBetween(String value1, String value2) {
            addCriterion("county_vardescr not between", value1, value2, "countyVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicRegistetimeIsNull() {
            addCriterion("scenic_registetime is null");
            return (Criteria) this;
        }

        public Criteria andScenicRegistetimeIsNotNull() {
            addCriterion("scenic_registetime is not null");
            return (Criteria) this;
        }

        public Criteria andScenicRegistetimeEqualTo(Date value) {
            addCriterion("scenic_registetime =", value, "scenicRegistetime");
            return (Criteria) this;
        }

        public Criteria andScenicRegistetimeNotEqualTo(Date value) {
            addCriterion("scenic_registetime <>", value, "scenicRegistetime");
            return (Criteria) this;
        }

        public Criteria andScenicRegistetimeGreaterThan(Date value) {
            addCriterion("scenic_registetime >", value, "scenicRegistetime");
            return (Criteria) this;
        }

        public Criteria andScenicRegistetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scenic_registetime >=", value, "scenicRegistetime");
            return (Criteria) this;
        }

        public Criteria andScenicRegistetimeLessThan(Date value) {
            addCriterion("scenic_registetime <", value, "scenicRegistetime");
            return (Criteria) this;
        }

        public Criteria andScenicRegistetimeLessThanOrEqualTo(Date value) {
            addCriterion("scenic_registetime <=", value, "scenicRegistetime");
            return (Criteria) this;
        }

        public Criteria andScenicRegistetimeIn(List<Date> values) {
            addCriterion("scenic_registetime in", values, "scenicRegistetime");
            return (Criteria) this;
        }

        public Criteria andScenicRegistetimeNotIn(List<Date> values) {
            addCriterion("scenic_registetime not in", values, "scenicRegistetime");
            return (Criteria) this;
        }

        public Criteria andScenicRegistetimeBetween(Date value1, Date value2) {
            addCriterion("scenic_registetime between", value1, value2, "scenicRegistetime");
            return (Criteria) this;
        }

        public Criteria andScenicRegistetimeNotBetween(Date value1, Date value2) {
            addCriterion("scenic_registetime not between", value1, value2, "scenicRegistetime");
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