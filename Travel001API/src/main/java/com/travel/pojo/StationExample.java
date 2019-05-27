package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class StationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StationExample() {
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

        public Criteria andStationIdIsNull() {
            addCriterion("station_id is null");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNotNull() {
            addCriterion("station_id is not null");
            return (Criteria) this;
        }

        public Criteria andStationIdEqualTo(Integer value) {
            addCriterion("station_id =", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotEqualTo(Integer value) {
            addCriterion("station_id <>", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThan(Integer value) {
            addCriterion("station_id >", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("station_id >=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThan(Integer value) {
            addCriterion("station_id <", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("station_id <=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdIn(List<Integer> values) {
            addCriterion("station_id in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotIn(List<Integer> values) {
            addCriterion("station_id not in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdBetween(Integer value1, Integer value2) {
            addCriterion("station_id between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("station_id not between", value1, value2, "stationId");
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

        public Criteria andStationNameIsNull() {
            addCriterion("station_name is null");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNotNull() {
            addCriterion("station_name is not null");
            return (Criteria) this;
        }

        public Criteria andStationNameEqualTo(String value) {
            addCriterion("station_name =", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotEqualTo(String value) {
            addCriterion("station_name <>", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThan(String value) {
            addCriterion("station_name >", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("station_name >=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThan(String value) {
            addCriterion("station_name <", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThanOrEqualTo(String value) {
            addCriterion("station_name <=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLike(String value) {
            addCriterion("station_name like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotLike(String value) {
            addCriterion("station_name not like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameIn(List<String> values) {
            addCriterion("station_name in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotIn(List<String> values) {
            addCriterion("station_name not in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameBetween(String value1, String value2) {
            addCriterion("station_name between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotBetween(String value1, String value2) {
            addCriterion("station_name not between", value1, value2, "stationName");
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

        public Criteria andStationDetailedaddressIsNull() {
            addCriterion("station_detailedaddress is null");
            return (Criteria) this;
        }

        public Criteria andStationDetailedaddressIsNotNull() {
            addCriterion("station_detailedaddress is not null");
            return (Criteria) this;
        }

        public Criteria andStationDetailedaddressEqualTo(String value) {
            addCriterion("station_detailedaddress =", value, "stationDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andStationDetailedaddressNotEqualTo(String value) {
            addCriterion("station_detailedaddress <>", value, "stationDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andStationDetailedaddressGreaterThan(String value) {
            addCriterion("station_detailedaddress >", value, "stationDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andStationDetailedaddressGreaterThanOrEqualTo(String value) {
            addCriterion("station_detailedaddress >=", value, "stationDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andStationDetailedaddressLessThan(String value) {
            addCriterion("station_detailedaddress <", value, "stationDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andStationDetailedaddressLessThanOrEqualTo(String value) {
            addCriterion("station_detailedaddress <=", value, "stationDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andStationDetailedaddressLike(String value) {
            addCriterion("station_detailedaddress like", value, "stationDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andStationDetailedaddressNotLike(String value) {
            addCriterion("station_detailedaddress not like", value, "stationDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andStationDetailedaddressIn(List<String> values) {
            addCriterion("station_detailedaddress in", values, "stationDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andStationDetailedaddressNotIn(List<String> values) {
            addCriterion("station_detailedaddress not in", values, "stationDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andStationDetailedaddressBetween(String value1, String value2) {
            addCriterion("station_detailedaddress between", value1, value2, "stationDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andStationDetailedaddressNotBetween(String value1, String value2) {
            addCriterion("station_detailedaddress not between", value1, value2, "stationDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andStationTelephoneIsNull() {
            addCriterion("station_telephone is null");
            return (Criteria) this;
        }

        public Criteria andStationTelephoneIsNotNull() {
            addCriterion("station_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andStationTelephoneEqualTo(String value) {
            addCriterion("station_telephone =", value, "stationTelephone");
            return (Criteria) this;
        }

        public Criteria andStationTelephoneNotEqualTo(String value) {
            addCriterion("station_telephone <>", value, "stationTelephone");
            return (Criteria) this;
        }

        public Criteria andStationTelephoneGreaterThan(String value) {
            addCriterion("station_telephone >", value, "stationTelephone");
            return (Criteria) this;
        }

        public Criteria andStationTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("station_telephone >=", value, "stationTelephone");
            return (Criteria) this;
        }

        public Criteria andStationTelephoneLessThan(String value) {
            addCriterion("station_telephone <", value, "stationTelephone");
            return (Criteria) this;
        }

        public Criteria andStationTelephoneLessThanOrEqualTo(String value) {
            addCriterion("station_telephone <=", value, "stationTelephone");
            return (Criteria) this;
        }

        public Criteria andStationTelephoneLike(String value) {
            addCriterion("station_telephone like", value, "stationTelephone");
            return (Criteria) this;
        }

        public Criteria andStationTelephoneNotLike(String value) {
            addCriterion("station_telephone not like", value, "stationTelephone");
            return (Criteria) this;
        }

        public Criteria andStationTelephoneIn(List<String> values) {
            addCriterion("station_telephone in", values, "stationTelephone");
            return (Criteria) this;
        }

        public Criteria andStationTelephoneNotIn(List<String> values) {
            addCriterion("station_telephone not in", values, "stationTelephone");
            return (Criteria) this;
        }

        public Criteria andStationTelephoneBetween(String value1, String value2) {
            addCriterion("station_telephone between", value1, value2, "stationTelephone");
            return (Criteria) this;
        }

        public Criteria andStationTelephoneNotBetween(String value1, String value2) {
            addCriterion("station_telephone not between", value1, value2, "stationTelephone");
            return (Criteria) this;
        }

        public Criteria andStationImgIsNull() {
            addCriterion("station_img is null");
            return (Criteria) this;
        }

        public Criteria andStationImgIsNotNull() {
            addCriterion("station_img is not null");
            return (Criteria) this;
        }

        public Criteria andStationImgEqualTo(String value) {
            addCriterion("station_img =", value, "stationImg");
            return (Criteria) this;
        }

        public Criteria andStationImgNotEqualTo(String value) {
            addCriterion("station_img <>", value, "stationImg");
            return (Criteria) this;
        }

        public Criteria andStationImgGreaterThan(String value) {
            addCriterion("station_img >", value, "stationImg");
            return (Criteria) this;
        }

        public Criteria andStationImgGreaterThanOrEqualTo(String value) {
            addCriterion("station_img >=", value, "stationImg");
            return (Criteria) this;
        }

        public Criteria andStationImgLessThan(String value) {
            addCriterion("station_img <", value, "stationImg");
            return (Criteria) this;
        }

        public Criteria andStationImgLessThanOrEqualTo(String value) {
            addCriterion("station_img <=", value, "stationImg");
            return (Criteria) this;
        }

        public Criteria andStationImgLike(String value) {
            addCriterion("station_img like", value, "stationImg");
            return (Criteria) this;
        }

        public Criteria andStationImgNotLike(String value) {
            addCriterion("station_img not like", value, "stationImg");
            return (Criteria) this;
        }

        public Criteria andStationImgIn(List<String> values) {
            addCriterion("station_img in", values, "stationImg");
            return (Criteria) this;
        }

        public Criteria andStationImgNotIn(List<String> values) {
            addCriterion("station_img not in", values, "stationImg");
            return (Criteria) this;
        }

        public Criteria andStationImgBetween(String value1, String value2) {
            addCriterion("station_img between", value1, value2, "stationImg");
            return (Criteria) this;
        }

        public Criteria andStationImgNotBetween(String value1, String value2) {
            addCriterion("station_img not between", value1, value2, "stationImg");
            return (Criteria) this;
        }

        public Criteria andStationIntdescrIsNull() {
            addCriterion("station_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andStationIntdescrIsNotNull() {
            addCriterion("station_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andStationIntdescrEqualTo(Integer value) {
            addCriterion("station_intdescr =", value, "stationIntdescr");
            return (Criteria) this;
        }

        public Criteria andStationIntdescrNotEqualTo(Integer value) {
            addCriterion("station_intdescr <>", value, "stationIntdescr");
            return (Criteria) this;
        }

        public Criteria andStationIntdescrGreaterThan(Integer value) {
            addCriterion("station_intdescr >", value, "stationIntdescr");
            return (Criteria) this;
        }

        public Criteria andStationIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("station_intdescr >=", value, "stationIntdescr");
            return (Criteria) this;
        }

        public Criteria andStationIntdescrLessThan(Integer value) {
            addCriterion("station_intdescr <", value, "stationIntdescr");
            return (Criteria) this;
        }

        public Criteria andStationIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("station_intdescr <=", value, "stationIntdescr");
            return (Criteria) this;
        }

        public Criteria andStationIntdescrIn(List<Integer> values) {
            addCriterion("station_intdescr in", values, "stationIntdescr");
            return (Criteria) this;
        }

        public Criteria andStationIntdescrNotIn(List<Integer> values) {
            addCriterion("station_intdescr not in", values, "stationIntdescr");
            return (Criteria) this;
        }

        public Criteria andStationIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("station_intdescr between", value1, value2, "stationIntdescr");
            return (Criteria) this;
        }

        public Criteria andStationIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("station_intdescr not between", value1, value2, "stationIntdescr");
            return (Criteria) this;
        }

        public Criteria andStationlVardescrIsNull() {
            addCriterion("stationl_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andStationlVardescrIsNotNull() {
            addCriterion("stationl_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andStationlVardescrEqualTo(String value) {
            addCriterion("stationl_vardescr =", value, "stationlVardescr");
            return (Criteria) this;
        }

        public Criteria andStationlVardescrNotEqualTo(String value) {
            addCriterion("stationl_vardescr <>", value, "stationlVardescr");
            return (Criteria) this;
        }

        public Criteria andStationlVardescrGreaterThan(String value) {
            addCriterion("stationl_vardescr >", value, "stationlVardescr");
            return (Criteria) this;
        }

        public Criteria andStationlVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("stationl_vardescr >=", value, "stationlVardescr");
            return (Criteria) this;
        }

        public Criteria andStationlVardescrLessThan(String value) {
            addCriterion("stationl_vardescr <", value, "stationlVardescr");
            return (Criteria) this;
        }

        public Criteria andStationlVardescrLessThanOrEqualTo(String value) {
            addCriterion("stationl_vardescr <=", value, "stationlVardescr");
            return (Criteria) this;
        }

        public Criteria andStationlVardescrLike(String value) {
            addCriterion("stationl_vardescr like", value, "stationlVardescr");
            return (Criteria) this;
        }

        public Criteria andStationlVardescrNotLike(String value) {
            addCriterion("stationl_vardescr not like", value, "stationlVardescr");
            return (Criteria) this;
        }

        public Criteria andStationlVardescrIn(List<String> values) {
            addCriterion("stationl_vardescr in", values, "stationlVardescr");
            return (Criteria) this;
        }

        public Criteria andStationlVardescrNotIn(List<String> values) {
            addCriterion("stationl_vardescr not in", values, "stationlVardescr");
            return (Criteria) this;
        }

        public Criteria andStationlVardescrBetween(String value1, String value2) {
            addCriterion("stationl_vardescr between", value1, value2, "stationlVardescr");
            return (Criteria) this;
        }

        public Criteria andStationlVardescrNotBetween(String value1, String value2) {
            addCriterion("stationl_vardescr not between", value1, value2, "stationlVardescr");
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