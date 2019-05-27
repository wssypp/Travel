package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class AircompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AircompanyExample() {
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

        public Criteria andAircompanyIdIsNull() {
            addCriterion("aircompany_id is null");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdIsNotNull() {
            addCriterion("aircompany_id is not null");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdEqualTo(Integer value) {
            addCriterion("aircompany_id =", value, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdNotEqualTo(Integer value) {
            addCriterion("aircompany_id <>", value, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdGreaterThan(Integer value) {
            addCriterion("aircompany_id >", value, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aircompany_id >=", value, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdLessThan(Integer value) {
            addCriterion("aircompany_id <", value, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("aircompany_id <=", value, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdIn(List<Integer> values) {
            addCriterion("aircompany_id in", values, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdNotIn(List<Integer> values) {
            addCriterion("aircompany_id not in", values, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("aircompany_id between", value1, value2, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aircompany_id not between", value1, value2, "aircompanyId");
            return (Criteria) this;
        }

        public Criteria andAircompanyNameIsNull() {
            addCriterion("aircompany_name is null");
            return (Criteria) this;
        }

        public Criteria andAircompanyNameIsNotNull() {
            addCriterion("aircompany_name is not null");
            return (Criteria) this;
        }

        public Criteria andAircompanyNameEqualTo(String value) {
            addCriterion("aircompany_name =", value, "aircompanyName");
            return (Criteria) this;
        }

        public Criteria andAircompanyNameNotEqualTo(String value) {
            addCriterion("aircompany_name <>", value, "aircompanyName");
            return (Criteria) this;
        }

        public Criteria andAircompanyNameGreaterThan(String value) {
            addCriterion("aircompany_name >", value, "aircompanyName");
            return (Criteria) this;
        }

        public Criteria andAircompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("aircompany_name >=", value, "aircompanyName");
            return (Criteria) this;
        }

        public Criteria andAircompanyNameLessThan(String value) {
            addCriterion("aircompany_name <", value, "aircompanyName");
            return (Criteria) this;
        }

        public Criteria andAircompanyNameLessThanOrEqualTo(String value) {
            addCriterion("aircompany_name <=", value, "aircompanyName");
            return (Criteria) this;
        }

        public Criteria andAircompanyNameLike(String value) {
            addCriterion("aircompany_name like", value, "aircompanyName");
            return (Criteria) this;
        }

        public Criteria andAircompanyNameNotLike(String value) {
            addCriterion("aircompany_name not like", value, "aircompanyName");
            return (Criteria) this;
        }

        public Criteria andAircompanyNameIn(List<String> values) {
            addCriterion("aircompany_name in", values, "aircompanyName");
            return (Criteria) this;
        }

        public Criteria andAircompanyNameNotIn(List<String> values) {
            addCriterion("aircompany_name not in", values, "aircompanyName");
            return (Criteria) this;
        }

        public Criteria andAircompanyNameBetween(String value1, String value2) {
            addCriterion("aircompany_name between", value1, value2, "aircompanyName");
            return (Criteria) this;
        }

        public Criteria andAircompanyNameNotBetween(String value1, String value2) {
            addCriterion("aircompany_name not between", value1, value2, "aircompanyName");
            return (Criteria) this;
        }

        public Criteria andAircompanyNumberIsNull() {
            addCriterion("aircompany_number is null");
            return (Criteria) this;
        }

        public Criteria andAircompanyNumberIsNotNull() {
            addCriterion("aircompany_number is not null");
            return (Criteria) this;
        }

        public Criteria andAircompanyNumberEqualTo(Integer value) {
            addCriterion("aircompany_number =", value, "aircompanyNumber");
            return (Criteria) this;
        }

        public Criteria andAircompanyNumberNotEqualTo(Integer value) {
            addCriterion("aircompany_number <>", value, "aircompanyNumber");
            return (Criteria) this;
        }

        public Criteria andAircompanyNumberGreaterThan(Integer value) {
            addCriterion("aircompany_number >", value, "aircompanyNumber");
            return (Criteria) this;
        }

        public Criteria andAircompanyNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("aircompany_number >=", value, "aircompanyNumber");
            return (Criteria) this;
        }

        public Criteria andAircompanyNumberLessThan(Integer value) {
            addCriterion("aircompany_number <", value, "aircompanyNumber");
            return (Criteria) this;
        }

        public Criteria andAircompanyNumberLessThanOrEqualTo(Integer value) {
            addCriterion("aircompany_number <=", value, "aircompanyNumber");
            return (Criteria) this;
        }

        public Criteria andAircompanyNumberIn(List<Integer> values) {
            addCriterion("aircompany_number in", values, "aircompanyNumber");
            return (Criteria) this;
        }

        public Criteria andAircompanyNumberNotIn(List<Integer> values) {
            addCriterion("aircompany_number not in", values, "aircompanyNumber");
            return (Criteria) this;
        }

        public Criteria andAircompanyNumberBetween(Integer value1, Integer value2) {
            addCriterion("aircompany_number between", value1, value2, "aircompanyNumber");
            return (Criteria) this;
        }

        public Criteria andAircompanyNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("aircompany_number not between", value1, value2, "aircompanyNumber");
            return (Criteria) this;
        }

        public Criteria andAircompanyImgIsNull() {
            addCriterion("aircompany_img is null");
            return (Criteria) this;
        }

        public Criteria andAircompanyImgIsNotNull() {
            addCriterion("aircompany_img is not null");
            return (Criteria) this;
        }

        public Criteria andAircompanyImgEqualTo(String value) {
            addCriterion("aircompany_img =", value, "aircompanyImg");
            return (Criteria) this;
        }

        public Criteria andAircompanyImgNotEqualTo(String value) {
            addCriterion("aircompany_img <>", value, "aircompanyImg");
            return (Criteria) this;
        }

        public Criteria andAircompanyImgGreaterThan(String value) {
            addCriterion("aircompany_img >", value, "aircompanyImg");
            return (Criteria) this;
        }

        public Criteria andAircompanyImgGreaterThanOrEqualTo(String value) {
            addCriterion("aircompany_img >=", value, "aircompanyImg");
            return (Criteria) this;
        }

        public Criteria andAircompanyImgLessThan(String value) {
            addCriterion("aircompany_img <", value, "aircompanyImg");
            return (Criteria) this;
        }

        public Criteria andAircompanyImgLessThanOrEqualTo(String value) {
            addCriterion("aircompany_img <=", value, "aircompanyImg");
            return (Criteria) this;
        }

        public Criteria andAircompanyImgLike(String value) {
            addCriterion("aircompany_img like", value, "aircompanyImg");
            return (Criteria) this;
        }

        public Criteria andAircompanyImgNotLike(String value) {
            addCriterion("aircompany_img not like", value, "aircompanyImg");
            return (Criteria) this;
        }

        public Criteria andAircompanyImgIn(List<String> values) {
            addCriterion("aircompany_img in", values, "aircompanyImg");
            return (Criteria) this;
        }

        public Criteria andAircompanyImgNotIn(List<String> values) {
            addCriterion("aircompany_img not in", values, "aircompanyImg");
            return (Criteria) this;
        }

        public Criteria andAircompanyImgBetween(String value1, String value2) {
            addCriterion("aircompany_img between", value1, value2, "aircompanyImg");
            return (Criteria) this;
        }

        public Criteria andAircompanyImgNotBetween(String value1, String value2) {
            addCriterion("aircompany_img not between", value1, value2, "aircompanyImg");
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

        public Criteria andAircompanyDetailedaddressIsNull() {
            addCriterion("aircompany_detailedaddress is null");
            return (Criteria) this;
        }

        public Criteria andAircompanyDetailedaddressIsNotNull() {
            addCriterion("aircompany_detailedaddress is not null");
            return (Criteria) this;
        }

        public Criteria andAircompanyDetailedaddressEqualTo(String value) {
            addCriterion("aircompany_detailedaddress =", value, "aircompanyDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andAircompanyDetailedaddressNotEqualTo(String value) {
            addCriterion("aircompany_detailedaddress <>", value, "aircompanyDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andAircompanyDetailedaddressGreaterThan(String value) {
            addCriterion("aircompany_detailedaddress >", value, "aircompanyDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andAircompanyDetailedaddressGreaterThanOrEqualTo(String value) {
            addCriterion("aircompany_detailedaddress >=", value, "aircompanyDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andAircompanyDetailedaddressLessThan(String value) {
            addCriterion("aircompany_detailedaddress <", value, "aircompanyDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andAircompanyDetailedaddressLessThanOrEqualTo(String value) {
            addCriterion("aircompany_detailedaddress <=", value, "aircompanyDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andAircompanyDetailedaddressLike(String value) {
            addCriterion("aircompany_detailedaddress like", value, "aircompanyDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andAircompanyDetailedaddressNotLike(String value) {
            addCriterion("aircompany_detailedaddress not like", value, "aircompanyDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andAircompanyDetailedaddressIn(List<String> values) {
            addCriterion("aircompany_detailedaddress in", values, "aircompanyDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andAircompanyDetailedaddressNotIn(List<String> values) {
            addCriterion("aircompany_detailedaddress not in", values, "aircompanyDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andAircompanyDetailedaddressBetween(String value1, String value2) {
            addCriterion("aircompany_detailedaddress between", value1, value2, "aircompanyDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andAircompanyDetailedaddressNotBetween(String value1, String value2) {
            addCriterion("aircompany_detailedaddress not between", value1, value2, "aircompanyDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andAircompanyDescrIsNull() {
            addCriterion("aircompany_descr is null");
            return (Criteria) this;
        }

        public Criteria andAircompanyDescrIsNotNull() {
            addCriterion("aircompany_descr is not null");
            return (Criteria) this;
        }

        public Criteria andAircompanyDescrEqualTo(String value) {
            addCriterion("aircompany_descr =", value, "aircompanyDescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyDescrNotEqualTo(String value) {
            addCriterion("aircompany_descr <>", value, "aircompanyDescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyDescrGreaterThan(String value) {
            addCriterion("aircompany_descr >", value, "aircompanyDescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyDescrGreaterThanOrEqualTo(String value) {
            addCriterion("aircompany_descr >=", value, "aircompanyDescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyDescrLessThan(String value) {
            addCriterion("aircompany_descr <", value, "aircompanyDescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyDescrLessThanOrEqualTo(String value) {
            addCriterion("aircompany_descr <=", value, "aircompanyDescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyDescrLike(String value) {
            addCriterion("aircompany_descr like", value, "aircompanyDescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyDescrNotLike(String value) {
            addCriterion("aircompany_descr not like", value, "aircompanyDescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyDescrIn(List<String> values) {
            addCriterion("aircompany_descr in", values, "aircompanyDescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyDescrNotIn(List<String> values) {
            addCriterion("aircompany_descr not in", values, "aircompanyDescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyDescrBetween(String value1, String value2) {
            addCriterion("aircompany_descr between", value1, value2, "aircompanyDescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyDescrNotBetween(String value1, String value2) {
            addCriterion("aircompany_descr not between", value1, value2, "aircompanyDescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrIsNull() {
            addCriterion("aircompany_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrIsNotNull() {
            addCriterion("aircompany_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrEqualTo(Integer value) {
            addCriterion("aircompany_intdescr =", value, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrNotEqualTo(Integer value) {
            addCriterion("aircompany_intdescr <>", value, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrGreaterThan(Integer value) {
            addCriterion("aircompany_intdescr >", value, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("aircompany_intdescr >=", value, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrLessThan(Integer value) {
            addCriterion("aircompany_intdescr <", value, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("aircompany_intdescr <=", value, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrIn(List<Integer> values) {
            addCriterion("aircompany_intdescr in", values, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrNotIn(List<Integer> values) {
            addCriterion("aircompany_intdescr not in", values, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("aircompany_intdescr between", value1, value2, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("aircompany_intdescr not between", value1, value2, "aircompanyIntdescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrIsNull() {
            addCriterion("aircompany_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrIsNotNull() {
            addCriterion("aircompany_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrEqualTo(String value) {
            addCriterion("aircompany_vardescr =", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrNotEqualTo(String value) {
            addCriterion("aircompany_vardescr <>", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrGreaterThan(String value) {
            addCriterion("aircompany_vardescr >", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("aircompany_vardescr >=", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrLessThan(String value) {
            addCriterion("aircompany_vardescr <", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrLessThanOrEqualTo(String value) {
            addCriterion("aircompany_vardescr <=", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrLike(String value) {
            addCriterion("aircompany_vardescr like", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrNotLike(String value) {
            addCriterion("aircompany_vardescr not like", value, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrIn(List<String> values) {
            addCriterion("aircompany_vardescr in", values, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrNotIn(List<String> values) {
            addCriterion("aircompany_vardescr not in", values, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrBetween(String value1, String value2) {
            addCriterion("aircompany_vardescr between", value1, value2, "aircompanyVardescr");
            return (Criteria) this;
        }

        public Criteria andAircompanyVardescrNotBetween(String value1, String value2) {
            addCriterion("aircompany_vardescr not between", value1, value2, "aircompanyVardescr");
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