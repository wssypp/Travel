package com.travel.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelExample() {
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

        public Criteria andHotelNameIsNull() {
            addCriterion("hotel_name is null");
            return (Criteria) this;
        }

        public Criteria andHotelNameIsNotNull() {
            addCriterion("hotel_name is not null");
            return (Criteria) this;
        }

        public Criteria andHotelNameEqualTo(String value) {
            addCriterion("hotel_name =", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotEqualTo(String value) {
            addCriterion("hotel_name <>", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThan(String value) {
            addCriterion("hotel_name >", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_name >=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThan(String value) {
            addCriterion("hotel_name <", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThanOrEqualTo(String value) {
            addCriterion("hotel_name <=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLike(String value) {
            addCriterion("hotel_name like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotLike(String value) {
            addCriterion("hotel_name not like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameIn(List<String> values) {
            addCriterion("hotel_name in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotIn(List<String> values) {
            addCriterion("hotel_name not in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameBetween(String value1, String value2) {
            addCriterion("hotel_name between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotBetween(String value1, String value2) {
            addCriterion("hotel_name not between", value1, value2, "hotelName");
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

        public Criteria andHotelTypeIsNull() {
            addCriterion("hotel_type is null");
            return (Criteria) this;
        }

        public Criteria andHotelTypeIsNotNull() {
            addCriterion("hotel_type is not null");
            return (Criteria) this;
        }

        public Criteria andHotelTypeEqualTo(String value) {
            addCriterion("hotel_type =", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeNotEqualTo(String value) {
            addCriterion("hotel_type <>", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeGreaterThan(String value) {
            addCriterion("hotel_type >", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_type >=", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeLessThan(String value) {
            addCriterion("hotel_type <", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeLessThanOrEqualTo(String value) {
            addCriterion("hotel_type <=", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeLike(String value) {
            addCriterion("hotel_type like", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeNotLike(String value) {
            addCriterion("hotel_type not like", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeIn(List<String> values) {
            addCriterion("hotel_type in", values, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeNotIn(List<String> values) {
            addCriterion("hotel_type not in", values, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeBetween(String value1, String value2) {
            addCriterion("hotel_type between", value1, value2, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeNotBetween(String value1, String value2) {
            addCriterion("hotel_type not between", value1, value2, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelRegistetimeIsNull() {
            addCriterion("hotel_registetime is null");
            return (Criteria) this;
        }

        public Criteria andHotelRegistetimeIsNotNull() {
            addCriterion("hotel_registetime is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRegistetimeEqualTo(Date value) {
            addCriterion("hotel_registetime =", value, "hotelRegistetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegistetimeNotEqualTo(Date value) {
            addCriterion("hotel_registetime <>", value, "hotelRegistetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegistetimeGreaterThan(Date value) {
            addCriterion("hotel_registetime >", value, "hotelRegistetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegistetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("hotel_registetime >=", value, "hotelRegistetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegistetimeLessThan(Date value) {
            addCriterion("hotel_registetime <", value, "hotelRegistetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegistetimeLessThanOrEqualTo(Date value) {
            addCriterion("hotel_registetime <=", value, "hotelRegistetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegistetimeIn(List<Date> values) {
            addCriterion("hotel_registetime in", values, "hotelRegistetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegistetimeNotIn(List<Date> values) {
            addCriterion("hotel_registetime not in", values, "hotelRegistetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegistetimeBetween(Date value1, Date value2) {
            addCriterion("hotel_registetime between", value1, value2, "hotelRegistetime");
            return (Criteria) this;
        }

        public Criteria andHotelRegistetimeNotBetween(Date value1, Date value2) {
            addCriterion("hotel_registetime not between", value1, value2, "hotelRegistetime");
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

        public Criteria andHotelDetailedaddressIsNull() {
            addCriterion("hotel_detailedaddress is null");
            return (Criteria) this;
        }

        public Criteria andHotelDetailedaddressIsNotNull() {
            addCriterion("hotel_detailedaddress is not null");
            return (Criteria) this;
        }

        public Criteria andHotelDetailedaddressEqualTo(String value) {
            addCriterion("hotel_detailedaddress =", value, "hotelDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHotelDetailedaddressNotEqualTo(String value) {
            addCriterion("hotel_detailedaddress <>", value, "hotelDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHotelDetailedaddressGreaterThan(String value) {
            addCriterion("hotel_detailedaddress >", value, "hotelDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHotelDetailedaddressGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_detailedaddress >=", value, "hotelDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHotelDetailedaddressLessThan(String value) {
            addCriterion("hotel_detailedaddress <", value, "hotelDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHotelDetailedaddressLessThanOrEqualTo(String value) {
            addCriterion("hotel_detailedaddress <=", value, "hotelDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHotelDetailedaddressLike(String value) {
            addCriterion("hotel_detailedaddress like", value, "hotelDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHotelDetailedaddressNotLike(String value) {
            addCriterion("hotel_detailedaddress not like", value, "hotelDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHotelDetailedaddressIn(List<String> values) {
            addCriterion("hotel_detailedaddress in", values, "hotelDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHotelDetailedaddressNotIn(List<String> values) {
            addCriterion("hotel_detailedaddress not in", values, "hotelDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHotelDetailedaddressBetween(String value1, String value2) {
            addCriterion("hotel_detailedaddress between", value1, value2, "hotelDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHotelDetailedaddressNotBetween(String value1, String value2) {
            addCriterion("hotel_detailedaddress not between", value1, value2, "hotelDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andHotelTelIsNull() {
            addCriterion("hotel_tel is null");
            return (Criteria) this;
        }

        public Criteria andHotelTelIsNotNull() {
            addCriterion("hotel_tel is not null");
            return (Criteria) this;
        }

        public Criteria andHotelTelEqualTo(String value) {
            addCriterion("hotel_tel =", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelNotEqualTo(String value) {
            addCriterion("hotel_tel <>", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelGreaterThan(String value) {
            addCriterion("hotel_tel >", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_tel >=", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelLessThan(String value) {
            addCriterion("hotel_tel <", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelLessThanOrEqualTo(String value) {
            addCriterion("hotel_tel <=", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelLike(String value) {
            addCriterion("hotel_tel like", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelNotLike(String value) {
            addCriterion("hotel_tel not like", value, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelIn(List<String> values) {
            addCriterion("hotel_tel in", values, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelNotIn(List<String> values) {
            addCriterion("hotel_tel not in", values, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelBetween(String value1, String value2) {
            addCriterion("hotel_tel between", value1, value2, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelTelNotBetween(String value1, String value2) {
            addCriterion("hotel_tel not between", value1, value2, "hotelTel");
            return (Criteria) this;
        }

        public Criteria andHotelContactIsNull() {
            addCriterion("hotel_contact is null");
            return (Criteria) this;
        }

        public Criteria andHotelContactIsNotNull() {
            addCriterion("hotel_contact is not null");
            return (Criteria) this;
        }

        public Criteria andHotelContactEqualTo(String value) {
            addCriterion("hotel_contact =", value, "hotelContact");
            return (Criteria) this;
        }

        public Criteria andHotelContactNotEqualTo(String value) {
            addCriterion("hotel_contact <>", value, "hotelContact");
            return (Criteria) this;
        }

        public Criteria andHotelContactGreaterThan(String value) {
            addCriterion("hotel_contact >", value, "hotelContact");
            return (Criteria) this;
        }

        public Criteria andHotelContactGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_contact >=", value, "hotelContact");
            return (Criteria) this;
        }

        public Criteria andHotelContactLessThan(String value) {
            addCriterion("hotel_contact <", value, "hotelContact");
            return (Criteria) this;
        }

        public Criteria andHotelContactLessThanOrEqualTo(String value) {
            addCriterion("hotel_contact <=", value, "hotelContact");
            return (Criteria) this;
        }

        public Criteria andHotelContactLike(String value) {
            addCriterion("hotel_contact like", value, "hotelContact");
            return (Criteria) this;
        }

        public Criteria andHotelContactNotLike(String value) {
            addCriterion("hotel_contact not like", value, "hotelContact");
            return (Criteria) this;
        }

        public Criteria andHotelContactIn(List<String> values) {
            addCriterion("hotel_contact in", values, "hotelContact");
            return (Criteria) this;
        }

        public Criteria andHotelContactNotIn(List<String> values) {
            addCriterion("hotel_contact not in", values, "hotelContact");
            return (Criteria) this;
        }

        public Criteria andHotelContactBetween(String value1, String value2) {
            addCriterion("hotel_contact between", value1, value2, "hotelContact");
            return (Criteria) this;
        }

        public Criteria andHotelContactNotBetween(String value1, String value2) {
            addCriterion("hotel_contact not between", value1, value2, "hotelContact");
            return (Criteria) this;
        }

        public Criteria andHotelImgIsNull() {
            addCriterion("hotel_img is null");
            return (Criteria) this;
        }

        public Criteria andHotelImgIsNotNull() {
            addCriterion("hotel_img is not null");
            return (Criteria) this;
        }

        public Criteria andHotelImgEqualTo(String value) {
            addCriterion("hotel_img =", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgNotEqualTo(String value) {
            addCriterion("hotel_img <>", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgGreaterThan(String value) {
            addCriterion("hotel_img >", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_img >=", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgLessThan(String value) {
            addCriterion("hotel_img <", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgLessThanOrEqualTo(String value) {
            addCriterion("hotel_img <=", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgLike(String value) {
            addCriterion("hotel_img like", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgNotLike(String value) {
            addCriterion("hotel_img not like", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgIn(List<String> values) {
            addCriterion("hotel_img in", values, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgNotIn(List<String> values) {
            addCriterion("hotel_img not in", values, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgBetween(String value1, String value2) {
            addCriterion("hotel_img between", value1, value2, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgNotBetween(String value1, String value2) {
            addCriterion("hotel_img not between", value1, value2, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelScoreIsNull() {
            addCriterion("hotel_score is null");
            return (Criteria) this;
        }

        public Criteria andHotelScoreIsNotNull() {
            addCriterion("hotel_score is not null");
            return (Criteria) this;
        }

        public Criteria andHotelScoreEqualTo(Double value) {
            addCriterion("hotel_score =", value, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreNotEqualTo(Double value) {
            addCriterion("hotel_score <>", value, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreGreaterThan(Double value) {
            addCriterion("hotel_score >", value, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("hotel_score >=", value, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreLessThan(Double value) {
            addCriterion("hotel_score <", value, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreLessThanOrEqualTo(Double value) {
            addCriterion("hotel_score <=", value, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreIn(List<Double> values) {
            addCriterion("hotel_score in", values, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreNotIn(List<Double> values) {
            addCriterion("hotel_score not in", values, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreBetween(Double value1, Double value2) {
            addCriterion("hotel_score between", value1, value2, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelScoreNotBetween(Double value1, Double value2) {
            addCriterion("hotel_score not between", value1, value2, "hotelScore");
            return (Criteria) this;
        }

        public Criteria andHotelCommentIsNull() {
            addCriterion("hotel_comment is null");
            return (Criteria) this;
        }

        public Criteria andHotelCommentIsNotNull() {
            addCriterion("hotel_comment is not null");
            return (Criteria) this;
        }

        public Criteria andHotelCommentEqualTo(Integer value) {
            addCriterion("hotel_comment =", value, "hotelComment");
            return (Criteria) this;
        }

        public Criteria andHotelCommentNotEqualTo(Integer value) {
            addCriterion("hotel_comment <>", value, "hotelComment");
            return (Criteria) this;
        }

        public Criteria andHotelCommentGreaterThan(Integer value) {
            addCriterion("hotel_comment >", value, "hotelComment");
            return (Criteria) this;
        }

        public Criteria andHotelCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_comment >=", value, "hotelComment");
            return (Criteria) this;
        }

        public Criteria andHotelCommentLessThan(Integer value) {
            addCriterion("hotel_comment <", value, "hotelComment");
            return (Criteria) this;
        }

        public Criteria andHotelCommentLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_comment <=", value, "hotelComment");
            return (Criteria) this;
        }

        public Criteria andHotelCommentIn(List<Integer> values) {
            addCriterion("hotel_comment in", values, "hotelComment");
            return (Criteria) this;
        }

        public Criteria andHotelCommentNotIn(List<Integer> values) {
            addCriterion("hotel_comment not in", values, "hotelComment");
            return (Criteria) this;
        }

        public Criteria andHotelCommentBetween(Integer value1, Integer value2) {
            addCriterion("hotel_comment between", value1, value2, "hotelComment");
            return (Criteria) this;
        }

        public Criteria andHotelCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_comment not between", value1, value2, "hotelComment");
            return (Criteria) this;
        }

        public Criteria andHotelLiveIsNull() {
            addCriterion("hotel_live is null");
            return (Criteria) this;
        }

        public Criteria andHotelLiveIsNotNull() {
            addCriterion("hotel_live is not null");
            return (Criteria) this;
        }

        public Criteria andHotelLiveEqualTo(Integer value) {
            addCriterion("hotel_live =", value, "hotelLive");
            return (Criteria) this;
        }

        public Criteria andHotelLiveNotEqualTo(Integer value) {
            addCriterion("hotel_live <>", value, "hotelLive");
            return (Criteria) this;
        }

        public Criteria andHotelLiveGreaterThan(Integer value) {
            addCriterion("hotel_live >", value, "hotelLive");
            return (Criteria) this;
        }

        public Criteria andHotelLiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_live >=", value, "hotelLive");
            return (Criteria) this;
        }

        public Criteria andHotelLiveLessThan(Integer value) {
            addCriterion("hotel_live <", value, "hotelLive");
            return (Criteria) this;
        }

        public Criteria andHotelLiveLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_live <=", value, "hotelLive");
            return (Criteria) this;
        }

        public Criteria andHotelLiveIn(List<Integer> values) {
            addCriterion("hotel_live in", values, "hotelLive");
            return (Criteria) this;
        }

        public Criteria andHotelLiveNotIn(List<Integer> values) {
            addCriterion("hotel_live not in", values, "hotelLive");
            return (Criteria) this;
        }

        public Criteria andHotelLiveBetween(Integer value1, Integer value2) {
            addCriterion("hotel_live between", value1, value2, "hotelLive");
            return (Criteria) this;
        }

        public Criteria andHotelLiveNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_live not between", value1, value2, "hotelLive");
            return (Criteria) this;
        }

        public Criteria andHotelIntdescrIsNull() {
            addCriterion("hotel_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andHotelIntdescrIsNotNull() {
            addCriterion("hotel_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andHotelIntdescrEqualTo(Integer value) {
            addCriterion("hotel_intdescr =", value, "hotelIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelIntdescrNotEqualTo(Integer value) {
            addCriterion("hotel_intdescr <>", value, "hotelIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelIntdescrGreaterThan(Integer value) {
            addCriterion("hotel_intdescr >", value, "hotelIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_intdescr >=", value, "hotelIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelIntdescrLessThan(Integer value) {
            addCriterion("hotel_intdescr <", value, "hotelIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_intdescr <=", value, "hotelIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelIntdescrIn(List<Integer> values) {
            addCriterion("hotel_intdescr in", values, "hotelIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelIntdescrNotIn(List<Integer> values) {
            addCriterion("hotel_intdescr not in", values, "hotelIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("hotel_intdescr between", value1, value2, "hotelIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_intdescr not between", value1, value2, "hotelIntdescr");
            return (Criteria) this;
        }

        public Criteria andHotelVardescrIsNull() {
            addCriterion("hotel_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andHotelVardescrIsNotNull() {
            addCriterion("hotel_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andHotelVardescrEqualTo(String value) {
            addCriterion("hotel_vardescr =", value, "hotelVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelVardescrNotEqualTo(String value) {
            addCriterion("hotel_vardescr <>", value, "hotelVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelVardescrGreaterThan(String value) {
            addCriterion("hotel_vardescr >", value, "hotelVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_vardescr >=", value, "hotelVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelVardescrLessThan(String value) {
            addCriterion("hotel_vardescr <", value, "hotelVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelVardescrLessThanOrEqualTo(String value) {
            addCriterion("hotel_vardescr <=", value, "hotelVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelVardescrLike(String value) {
            addCriterion("hotel_vardescr like", value, "hotelVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelVardescrNotLike(String value) {
            addCriterion("hotel_vardescr not like", value, "hotelVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelVardescrIn(List<String> values) {
            addCriterion("hotel_vardescr in", values, "hotelVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelVardescrNotIn(List<String> values) {
            addCriterion("hotel_vardescr not in", values, "hotelVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelVardescrBetween(String value1, String value2) {
            addCriterion("hotel_vardescr between", value1, value2, "hotelVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelVardescrNotBetween(String value1, String value2) {
            addCriterion("hotel_vardescr not between", value1, value2, "hotelVardescr");
            return (Criteria) this;
        }

        public Criteria andHotelDistanceIsNull() {
            addCriterion("hotel_distance is null");
            return (Criteria) this;
        }

        public Criteria andHotelDistanceIsNotNull() {
            addCriterion("hotel_distance is not null");
            return (Criteria) this;
        }

        public Criteria andHotelDistanceEqualTo(Float value) {
            addCriterion("hotel_distance =", value, "hotelDistance");
            return (Criteria) this;
        }

        public Criteria andHotelDistanceNotEqualTo(Float value) {
            addCriterion("hotel_distance <>", value, "hotelDistance");
            return (Criteria) this;
        }

        public Criteria andHotelDistanceGreaterThan(Float value) {
            addCriterion("hotel_distance >", value, "hotelDistance");
            return (Criteria) this;
        }

        public Criteria andHotelDistanceGreaterThanOrEqualTo(Float value) {
            addCriterion("hotel_distance >=", value, "hotelDistance");
            return (Criteria) this;
        }

        public Criteria andHotelDistanceLessThan(Float value) {
            addCriterion("hotel_distance <", value, "hotelDistance");
            return (Criteria) this;
        }

        public Criteria andHotelDistanceLessThanOrEqualTo(Float value) {
            addCriterion("hotel_distance <=", value, "hotelDistance");
            return (Criteria) this;
        }

        public Criteria andHotelDistanceIn(List<Float> values) {
            addCriterion("hotel_distance in", values, "hotelDistance");
            return (Criteria) this;
        }

        public Criteria andHotelDistanceNotIn(List<Float> values) {
            addCriterion("hotel_distance not in", values, "hotelDistance");
            return (Criteria) this;
        }

        public Criteria andHotelDistanceBetween(Float value1, Float value2) {
            addCriterion("hotel_distance between", value1, value2, "hotelDistance");
            return (Criteria) this;
        }

        public Criteria andHotelDistanceNotBetween(Float value1, Float value2) {
            addCriterion("hotel_distance not between", value1, value2, "hotelDistance");
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