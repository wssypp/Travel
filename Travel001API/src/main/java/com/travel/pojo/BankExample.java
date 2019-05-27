package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class BankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BankExample() {
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

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Integer value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Integer value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Integer value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Integer value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Integer> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Integer> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Integer value1, Integer value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
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

        public Criteria andBankDetailedaddressIsNull() {
            addCriterion("bank_detailedaddress is null");
            return (Criteria) this;
        }

        public Criteria andBankDetailedaddressIsNotNull() {
            addCriterion("bank_detailedaddress is not null");
            return (Criteria) this;
        }

        public Criteria andBankDetailedaddressEqualTo(String value) {
            addCriterion("bank_detailedaddress =", value, "bankDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andBankDetailedaddressNotEqualTo(String value) {
            addCriterion("bank_detailedaddress <>", value, "bankDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andBankDetailedaddressGreaterThan(String value) {
            addCriterion("bank_detailedaddress >", value, "bankDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andBankDetailedaddressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_detailedaddress >=", value, "bankDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andBankDetailedaddressLessThan(String value) {
            addCriterion("bank_detailedaddress <", value, "bankDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andBankDetailedaddressLessThanOrEqualTo(String value) {
            addCriterion("bank_detailedaddress <=", value, "bankDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andBankDetailedaddressLike(String value) {
            addCriterion("bank_detailedaddress like", value, "bankDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andBankDetailedaddressNotLike(String value) {
            addCriterion("bank_detailedaddress not like", value, "bankDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andBankDetailedaddressIn(List<String> values) {
            addCriterion("bank_detailedaddress in", values, "bankDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andBankDetailedaddressNotIn(List<String> values) {
            addCriterion("bank_detailedaddress not in", values, "bankDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andBankDetailedaddressBetween(String value1, String value2) {
            addCriterion("bank_detailedaddress between", value1, value2, "bankDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andBankDetailedaddressNotBetween(String value1, String value2) {
            addCriterion("bank_detailedaddress not between", value1, value2, "bankDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneIsNull() {
            addCriterion("bank_telephone is null");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneIsNotNull() {
            addCriterion("bank_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneEqualTo(String value) {
            addCriterion("bank_telephone =", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneNotEqualTo(String value) {
            addCriterion("bank_telephone <>", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneGreaterThan(String value) {
            addCriterion("bank_telephone >", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("bank_telephone >=", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneLessThan(String value) {
            addCriterion("bank_telephone <", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneLessThanOrEqualTo(String value) {
            addCriterion("bank_telephone <=", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneLike(String value) {
            addCriterion("bank_telephone like", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneNotLike(String value) {
            addCriterion("bank_telephone not like", value, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneIn(List<String> values) {
            addCriterion("bank_telephone in", values, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneNotIn(List<String> values) {
            addCriterion("bank_telephone not in", values, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneBetween(String value1, String value2) {
            addCriterion("bank_telephone between", value1, value2, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankTelephoneNotBetween(String value1, String value2) {
            addCriterion("bank_telephone not between", value1, value2, "bankTelephone");
            return (Criteria) this;
        }

        public Criteria andBankImgIsNull() {
            addCriterion("bank_img is null");
            return (Criteria) this;
        }

        public Criteria andBankImgIsNotNull() {
            addCriterion("bank_img is not null");
            return (Criteria) this;
        }

        public Criteria andBankImgEqualTo(String value) {
            addCriterion("bank_img =", value, "bankImg");
            return (Criteria) this;
        }

        public Criteria andBankImgNotEqualTo(String value) {
            addCriterion("bank_img <>", value, "bankImg");
            return (Criteria) this;
        }

        public Criteria andBankImgGreaterThan(String value) {
            addCriterion("bank_img >", value, "bankImg");
            return (Criteria) this;
        }

        public Criteria andBankImgGreaterThanOrEqualTo(String value) {
            addCriterion("bank_img >=", value, "bankImg");
            return (Criteria) this;
        }

        public Criteria andBankImgLessThan(String value) {
            addCriterion("bank_img <", value, "bankImg");
            return (Criteria) this;
        }

        public Criteria andBankImgLessThanOrEqualTo(String value) {
            addCriterion("bank_img <=", value, "bankImg");
            return (Criteria) this;
        }

        public Criteria andBankImgLike(String value) {
            addCriterion("bank_img like", value, "bankImg");
            return (Criteria) this;
        }

        public Criteria andBankImgNotLike(String value) {
            addCriterion("bank_img not like", value, "bankImg");
            return (Criteria) this;
        }

        public Criteria andBankImgIn(List<String> values) {
            addCriterion("bank_img in", values, "bankImg");
            return (Criteria) this;
        }

        public Criteria andBankImgNotIn(List<String> values) {
            addCriterion("bank_img not in", values, "bankImg");
            return (Criteria) this;
        }

        public Criteria andBankImgBetween(String value1, String value2) {
            addCriterion("bank_img between", value1, value2, "bankImg");
            return (Criteria) this;
        }

        public Criteria andBankImgNotBetween(String value1, String value2) {
            addCriterion("bank_img not between", value1, value2, "bankImg");
            return (Criteria) this;
        }

        public Criteria andBankIntdescrIsNull() {
            addCriterion("bank_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andBankIntdescrIsNotNull() {
            addCriterion("bank_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andBankIntdescrEqualTo(Integer value) {
            addCriterion("bank_intdescr =", value, "bankIntdescr");
            return (Criteria) this;
        }

        public Criteria andBankIntdescrNotEqualTo(Integer value) {
            addCriterion("bank_intdescr <>", value, "bankIntdescr");
            return (Criteria) this;
        }

        public Criteria andBankIntdescrGreaterThan(Integer value) {
            addCriterion("bank_intdescr >", value, "bankIntdescr");
            return (Criteria) this;
        }

        public Criteria andBankIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_intdescr >=", value, "bankIntdescr");
            return (Criteria) this;
        }

        public Criteria andBankIntdescrLessThan(Integer value) {
            addCriterion("bank_intdescr <", value, "bankIntdescr");
            return (Criteria) this;
        }

        public Criteria andBankIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("bank_intdescr <=", value, "bankIntdescr");
            return (Criteria) this;
        }

        public Criteria andBankIntdescrIn(List<Integer> values) {
            addCriterion("bank_intdescr in", values, "bankIntdescr");
            return (Criteria) this;
        }

        public Criteria andBankIntdescrNotIn(List<Integer> values) {
            addCriterion("bank_intdescr not in", values, "bankIntdescr");
            return (Criteria) this;
        }

        public Criteria andBankIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("bank_intdescr between", value1, value2, "bankIntdescr");
            return (Criteria) this;
        }

        public Criteria andBankIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_intdescr not between", value1, value2, "bankIntdescr");
            return (Criteria) this;
        }

        public Criteria andBankVardescrIsNull() {
            addCriterion("bank_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andBankVardescrIsNotNull() {
            addCriterion("bank_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andBankVardescrEqualTo(String value) {
            addCriterion("bank_vardescr =", value, "bankVardescr");
            return (Criteria) this;
        }

        public Criteria andBankVardescrNotEqualTo(String value) {
            addCriterion("bank_vardescr <>", value, "bankVardescr");
            return (Criteria) this;
        }

        public Criteria andBankVardescrGreaterThan(String value) {
            addCriterion("bank_vardescr >", value, "bankVardescr");
            return (Criteria) this;
        }

        public Criteria andBankVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("bank_vardescr >=", value, "bankVardescr");
            return (Criteria) this;
        }

        public Criteria andBankVardescrLessThan(String value) {
            addCriterion("bank_vardescr <", value, "bankVardescr");
            return (Criteria) this;
        }

        public Criteria andBankVardescrLessThanOrEqualTo(String value) {
            addCriterion("bank_vardescr <=", value, "bankVardescr");
            return (Criteria) this;
        }

        public Criteria andBankVardescrLike(String value) {
            addCriterion("bank_vardescr like", value, "bankVardescr");
            return (Criteria) this;
        }

        public Criteria andBankVardescrNotLike(String value) {
            addCriterion("bank_vardescr not like", value, "bankVardescr");
            return (Criteria) this;
        }

        public Criteria andBankVardescrIn(List<String> values) {
            addCriterion("bank_vardescr in", values, "bankVardescr");
            return (Criteria) this;
        }

        public Criteria andBankVardescrNotIn(List<String> values) {
            addCriterion("bank_vardescr not in", values, "bankVardescr");
            return (Criteria) this;
        }

        public Criteria andBankVardescrBetween(String value1, String value2) {
            addCriterion("bank_vardescr between", value1, value2, "bankVardescr");
            return (Criteria) this;
        }

        public Criteria andBankVardescrNotBetween(String value1, String value2) {
            addCriterion("bank_vardescr not between", value1, value2, "bankVardescr");
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