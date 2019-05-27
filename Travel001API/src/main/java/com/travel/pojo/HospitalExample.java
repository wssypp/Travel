package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class HospitalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HospitalExample() {
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

        public Criteria andHospitalIdIsNull() {
            addCriterion("hospital_id is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNotNull() {
            addCriterion("hospital_id is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdEqualTo(Integer value) {
            addCriterion("hospital_id =", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotEqualTo(Integer value) {
            addCriterion("hospital_id <>", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThan(Integer value) {
            addCriterion("hospital_id >", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospital_id >=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThan(Integer value) {
            addCriterion("hospital_id <", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThanOrEqualTo(Integer value) {
            addCriterion("hospital_id <=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIn(List<Integer> values) {
            addCriterion("hospital_id in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotIn(List<Integer> values) {
            addCriterion("hospital_id not in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdBetween(Integer value1, Integer value2) {
            addCriterion("hospital_id between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hospital_id not between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIsNull() {
            addCriterion("hospital_name is null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIsNotNull() {
            addCriterion("hospital_name is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameEqualTo(String value) {
            addCriterion("hospital_name =", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotEqualTo(String value) {
            addCriterion("hospital_name <>", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThan(String value) {
            addCriterion("hospital_name >", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_name >=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThan(String value) {
            addCriterion("hospital_name <", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThanOrEqualTo(String value) {
            addCriterion("hospital_name <=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLike(String value) {
            addCriterion("hospital_name like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotLike(String value) {
            addCriterion("hospital_name not like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIn(List<String> values) {
            addCriterion("hospital_name in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotIn(List<String> values) {
            addCriterion("hospital_name not in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameBetween(String value1, String value2) {
            addCriterion("hospital_name between", value1, value2, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotBetween(String value1, String value2) {
            addCriterion("hospital_name not between", value1, value2, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andBelongTypeIsNull() {
            addCriterion("belong_type is null");
            return (Criteria) this;
        }

        public Criteria andBelongTypeIsNotNull() {
            addCriterion("belong_type is not null");
            return (Criteria) this;
        }

        public Criteria andBelongTypeEqualTo(String value) {
            addCriterion("belong_type =", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeNotEqualTo(String value) {
            addCriterion("belong_type <>", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeGreaterThan(String value) {
            addCriterion("belong_type >", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeGreaterThanOrEqualTo(String value) {
            addCriterion("belong_type >=", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeLessThan(String value) {
            addCriterion("belong_type <", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeLessThanOrEqualTo(String value) {
            addCriterion("belong_type <=", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeLike(String value) {
            addCriterion("belong_type like", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeNotLike(String value) {
            addCriterion("belong_type not like", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeIn(List<String> values) {
            addCriterion("belong_type in", values, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeNotIn(List<String> values) {
            addCriterion("belong_type not in", values, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeBetween(String value1, String value2) {
            addCriterion("belong_type between", value1, value2, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeNotBetween(String value1, String value2) {
            addCriterion("belong_type not between", value1, value2, "belongType");
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

        public Criteria andHospitalDetailedaddressIsNull() {
            addCriterion("hospital_detailedaddress is null");
            return (Criteria) this;
        }

        public Criteria andHospitalDetailedaddressIsNotNull() {
            addCriterion("hospital_detailedaddress is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalDetailedaddressEqualTo(String value) {
            addCriterion("hospital_detailedaddress =", value, "hospitalDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHospitalDetailedaddressNotEqualTo(String value) {
            addCriterion("hospital_detailedaddress <>", value, "hospitalDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHospitalDetailedaddressGreaterThan(String value) {
            addCriterion("hospital_detailedaddress >", value, "hospitalDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHospitalDetailedaddressGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_detailedaddress >=", value, "hospitalDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHospitalDetailedaddressLessThan(String value) {
            addCriterion("hospital_detailedaddress <", value, "hospitalDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHospitalDetailedaddressLessThanOrEqualTo(String value) {
            addCriterion("hospital_detailedaddress <=", value, "hospitalDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHospitalDetailedaddressLike(String value) {
            addCriterion("hospital_detailedaddress like", value, "hospitalDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHospitalDetailedaddressNotLike(String value) {
            addCriterion("hospital_detailedaddress not like", value, "hospitalDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHospitalDetailedaddressIn(List<String> values) {
            addCriterion("hospital_detailedaddress in", values, "hospitalDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHospitalDetailedaddressNotIn(List<String> values) {
            addCriterion("hospital_detailedaddress not in", values, "hospitalDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHospitalDetailedaddressBetween(String value1, String value2) {
            addCriterion("hospital_detailedaddress between", value1, value2, "hospitalDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHospitalDetailedaddressNotBetween(String value1, String value2) {
            addCriterion("hospital_detailedaddress not between", value1, value2, "hospitalDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneIsNull() {
            addCriterion("hospital_telephone is null");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneIsNotNull() {
            addCriterion("hospital_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneEqualTo(String value) {
            addCriterion("hospital_telephone =", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneNotEqualTo(String value) {
            addCriterion("hospital_telephone <>", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneGreaterThan(String value) {
            addCriterion("hospital_telephone >", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_telephone >=", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneLessThan(String value) {
            addCriterion("hospital_telephone <", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneLessThanOrEqualTo(String value) {
            addCriterion("hospital_telephone <=", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneLike(String value) {
            addCriterion("hospital_telephone like", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneNotLike(String value) {
            addCriterion("hospital_telephone not like", value, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneIn(List<String> values) {
            addCriterion("hospital_telephone in", values, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneNotIn(List<String> values) {
            addCriterion("hospital_telephone not in", values, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneBetween(String value1, String value2) {
            addCriterion("hospital_telephone between", value1, value2, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalTelephoneNotBetween(String value1, String value2) {
            addCriterion("hospital_telephone not between", value1, value2, "hospitalTelephone");
            return (Criteria) this;
        }

        public Criteria andHospitalImgIsNull() {
            addCriterion("hospital_img is null");
            return (Criteria) this;
        }

        public Criteria andHospitalImgIsNotNull() {
            addCriterion("hospital_img is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalImgEqualTo(String value) {
            addCriterion("hospital_img =", value, "hospitalImg");
            return (Criteria) this;
        }

        public Criteria andHospitalImgNotEqualTo(String value) {
            addCriterion("hospital_img <>", value, "hospitalImg");
            return (Criteria) this;
        }

        public Criteria andHospitalImgGreaterThan(String value) {
            addCriterion("hospital_img >", value, "hospitalImg");
            return (Criteria) this;
        }

        public Criteria andHospitalImgGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_img >=", value, "hospitalImg");
            return (Criteria) this;
        }

        public Criteria andHospitalImgLessThan(String value) {
            addCriterion("hospital_img <", value, "hospitalImg");
            return (Criteria) this;
        }

        public Criteria andHospitalImgLessThanOrEqualTo(String value) {
            addCriterion("hospital_img <=", value, "hospitalImg");
            return (Criteria) this;
        }

        public Criteria andHospitalImgLike(String value) {
            addCriterion("hospital_img like", value, "hospitalImg");
            return (Criteria) this;
        }

        public Criteria andHospitalImgNotLike(String value) {
            addCriterion("hospital_img not like", value, "hospitalImg");
            return (Criteria) this;
        }

        public Criteria andHospitalImgIn(List<String> values) {
            addCriterion("hospital_img in", values, "hospitalImg");
            return (Criteria) this;
        }

        public Criteria andHospitalImgNotIn(List<String> values) {
            addCriterion("hospital_img not in", values, "hospitalImg");
            return (Criteria) this;
        }

        public Criteria andHospitalImgBetween(String value1, String value2) {
            addCriterion("hospital_img between", value1, value2, "hospitalImg");
            return (Criteria) this;
        }

        public Criteria andHospitalImgNotBetween(String value1, String value2) {
            addCriterion("hospital_img not between", value1, value2, "hospitalImg");
            return (Criteria) this;
        }

        public Criteria andHospitalIntdescrIsNull() {
            addCriterion("hospital_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIntdescrIsNotNull() {
            addCriterion("hospital_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalIntdescrEqualTo(Integer value) {
            addCriterion("hospital_intdescr =", value, "hospitalIntdescr");
            return (Criteria) this;
        }

        public Criteria andHospitalIntdescrNotEqualTo(Integer value) {
            addCriterion("hospital_intdescr <>", value, "hospitalIntdescr");
            return (Criteria) this;
        }

        public Criteria andHospitalIntdescrGreaterThan(Integer value) {
            addCriterion("hospital_intdescr >", value, "hospitalIntdescr");
            return (Criteria) this;
        }

        public Criteria andHospitalIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("hospital_intdescr >=", value, "hospitalIntdescr");
            return (Criteria) this;
        }

        public Criteria andHospitalIntdescrLessThan(Integer value) {
            addCriterion("hospital_intdescr <", value, "hospitalIntdescr");
            return (Criteria) this;
        }

        public Criteria andHospitalIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("hospital_intdescr <=", value, "hospitalIntdescr");
            return (Criteria) this;
        }

        public Criteria andHospitalIntdescrIn(List<Integer> values) {
            addCriterion("hospital_intdescr in", values, "hospitalIntdescr");
            return (Criteria) this;
        }

        public Criteria andHospitalIntdescrNotIn(List<Integer> values) {
            addCriterion("hospital_intdescr not in", values, "hospitalIntdescr");
            return (Criteria) this;
        }

        public Criteria andHospitalIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("hospital_intdescr between", value1, value2, "hospitalIntdescr");
            return (Criteria) this;
        }

        public Criteria andHospitalIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("hospital_intdescr not between", value1, value2, "hospitalIntdescr");
            return (Criteria) this;
        }

        public Criteria andHospitalVardescrIsNull() {
            addCriterion("hospital_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andHospitalVardescrIsNotNull() {
            addCriterion("hospital_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalVardescrEqualTo(String value) {
            addCriterion("hospital_vardescr =", value, "hospitalVardescr");
            return (Criteria) this;
        }

        public Criteria andHospitalVardescrNotEqualTo(String value) {
            addCriterion("hospital_vardescr <>", value, "hospitalVardescr");
            return (Criteria) this;
        }

        public Criteria andHospitalVardescrGreaterThan(String value) {
            addCriterion("hospital_vardescr >", value, "hospitalVardescr");
            return (Criteria) this;
        }

        public Criteria andHospitalVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("hospital_vardescr >=", value, "hospitalVardescr");
            return (Criteria) this;
        }

        public Criteria andHospitalVardescrLessThan(String value) {
            addCriterion("hospital_vardescr <", value, "hospitalVardescr");
            return (Criteria) this;
        }

        public Criteria andHospitalVardescrLessThanOrEqualTo(String value) {
            addCriterion("hospital_vardescr <=", value, "hospitalVardescr");
            return (Criteria) this;
        }

        public Criteria andHospitalVardescrLike(String value) {
            addCriterion("hospital_vardescr like", value, "hospitalVardescr");
            return (Criteria) this;
        }

        public Criteria andHospitalVardescrNotLike(String value) {
            addCriterion("hospital_vardescr not like", value, "hospitalVardescr");
            return (Criteria) this;
        }

        public Criteria andHospitalVardescrIn(List<String> values) {
            addCriterion("hospital_vardescr in", values, "hospitalVardescr");
            return (Criteria) this;
        }

        public Criteria andHospitalVardescrNotIn(List<String> values) {
            addCriterion("hospital_vardescr not in", values, "hospitalVardescr");
            return (Criteria) this;
        }

        public Criteria andHospitalVardescrBetween(String value1, String value2) {
            addCriterion("hospital_vardescr between", value1, value2, "hospitalVardescr");
            return (Criteria) this;
        }

        public Criteria andHospitalVardescrNotBetween(String value1, String value2) {
            addCriterion("hospital_vardescr not between", value1, value2, "hospitalVardescr");
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