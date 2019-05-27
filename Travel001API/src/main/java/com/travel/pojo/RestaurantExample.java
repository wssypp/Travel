package com.travel.pojo;

import java.util.ArrayList;
import java.util.List;

public class RestaurantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RestaurantExample() {
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

        public Criteria andRestaurantIdIsNull() {
            addCriterion("restaurant_id is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdIsNotNull() {
            addCriterion("restaurant_id is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdEqualTo(Integer value) {
            addCriterion("restaurant_id =", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdNotEqualTo(Integer value) {
            addCriterion("restaurant_id <>", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdGreaterThan(Integer value) {
            addCriterion("restaurant_id >", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("restaurant_id >=", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdLessThan(Integer value) {
            addCriterion("restaurant_id <", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdLessThanOrEqualTo(Integer value) {
            addCriterion("restaurant_id <=", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdIn(List<Integer> values) {
            addCriterion("restaurant_id in", values, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdNotIn(List<Integer> values) {
            addCriterion("restaurant_id not in", values, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_id between", value1, value2, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_id not between", value1, value2, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameIsNull() {
            addCriterion("restaurant_name is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameIsNotNull() {
            addCriterion("restaurant_name is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameEqualTo(String value) {
            addCriterion("restaurant_name =", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotEqualTo(String value) {
            addCriterion("restaurant_name <>", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameGreaterThan(String value) {
            addCriterion("restaurant_name >", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameGreaterThanOrEqualTo(String value) {
            addCriterion("restaurant_name >=", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameLessThan(String value) {
            addCriterion("restaurant_name <", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameLessThanOrEqualTo(String value) {
            addCriterion("restaurant_name <=", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameLike(String value) {
            addCriterion("restaurant_name like", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotLike(String value) {
            addCriterion("restaurant_name not like", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameIn(List<String> values) {
            addCriterion("restaurant_name in", values, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotIn(List<String> values) {
            addCriterion("restaurant_name not in", values, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameBetween(String value1, String value2) {
            addCriterion("restaurant_name between", value1, value2, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotBetween(String value1, String value2) {
            addCriterion("restaurant_name not between", value1, value2, "restaurantName");
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

        public Criteria andRestaurantDetailedaddressIsNull() {
            addCriterion("restaurant_detailedaddress is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailedaddressIsNotNull() {
            addCriterion("restaurant_detailedaddress is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailedaddressEqualTo(String value) {
            addCriterion("restaurant_detailedaddress =", value, "restaurantDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailedaddressNotEqualTo(String value) {
            addCriterion("restaurant_detailedaddress <>", value, "restaurantDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailedaddressGreaterThan(String value) {
            addCriterion("restaurant_detailedaddress >", value, "restaurantDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailedaddressGreaterThanOrEqualTo(String value) {
            addCriterion("restaurant_detailedaddress >=", value, "restaurantDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailedaddressLessThan(String value) {
            addCriterion("restaurant_detailedaddress <", value, "restaurantDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailedaddressLessThanOrEqualTo(String value) {
            addCriterion("restaurant_detailedaddress <=", value, "restaurantDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailedaddressLike(String value) {
            addCriterion("restaurant_detailedaddress like", value, "restaurantDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailedaddressNotLike(String value) {
            addCriterion("restaurant_detailedaddress not like", value, "restaurantDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailedaddressIn(List<String> values) {
            addCriterion("restaurant_detailedaddress in", values, "restaurantDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailedaddressNotIn(List<String> values) {
            addCriterion("restaurant_detailedaddress not in", values, "restaurantDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailedaddressBetween(String value1, String value2) {
            addCriterion("restaurant_detailedaddress between", value1, value2, "restaurantDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantDetailedaddressNotBetween(String value1, String value2) {
            addCriterion("restaurant_detailedaddress not between", value1, value2, "restaurantDetailedaddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantkTelephoneIsNull() {
            addCriterion("restaurantk_telephone is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantkTelephoneIsNotNull() {
            addCriterion("restaurantk_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantkTelephoneEqualTo(String value) {
            addCriterion("restaurantk_telephone =", value, "restaurantkTelephone");
            return (Criteria) this;
        }

        public Criteria andRestaurantkTelephoneNotEqualTo(String value) {
            addCriterion("restaurantk_telephone <>", value, "restaurantkTelephone");
            return (Criteria) this;
        }

        public Criteria andRestaurantkTelephoneGreaterThan(String value) {
            addCriterion("restaurantk_telephone >", value, "restaurantkTelephone");
            return (Criteria) this;
        }

        public Criteria andRestaurantkTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("restaurantk_telephone >=", value, "restaurantkTelephone");
            return (Criteria) this;
        }

        public Criteria andRestaurantkTelephoneLessThan(String value) {
            addCriterion("restaurantk_telephone <", value, "restaurantkTelephone");
            return (Criteria) this;
        }

        public Criteria andRestaurantkTelephoneLessThanOrEqualTo(String value) {
            addCriterion("restaurantk_telephone <=", value, "restaurantkTelephone");
            return (Criteria) this;
        }

        public Criteria andRestaurantkTelephoneLike(String value) {
            addCriterion("restaurantk_telephone like", value, "restaurantkTelephone");
            return (Criteria) this;
        }

        public Criteria andRestaurantkTelephoneNotLike(String value) {
            addCriterion("restaurantk_telephone not like", value, "restaurantkTelephone");
            return (Criteria) this;
        }

        public Criteria andRestaurantkTelephoneIn(List<String> values) {
            addCriterion("restaurantk_telephone in", values, "restaurantkTelephone");
            return (Criteria) this;
        }

        public Criteria andRestaurantkTelephoneNotIn(List<String> values) {
            addCriterion("restaurantk_telephone not in", values, "restaurantkTelephone");
            return (Criteria) this;
        }

        public Criteria andRestaurantkTelephoneBetween(String value1, String value2) {
            addCriterion("restaurantk_telephone between", value1, value2, "restaurantkTelephone");
            return (Criteria) this;
        }

        public Criteria andRestaurantkTelephoneNotBetween(String value1, String value2) {
            addCriterion("restaurantk_telephone not between", value1, value2, "restaurantkTelephone");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgIsNull() {
            addCriterion("restaurant_img is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgIsNotNull() {
            addCriterion("restaurant_img is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgEqualTo(String value) {
            addCriterion("restaurant_img =", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgNotEqualTo(String value) {
            addCriterion("restaurant_img <>", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgGreaterThan(String value) {
            addCriterion("restaurant_img >", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgGreaterThanOrEqualTo(String value) {
            addCriterion("restaurant_img >=", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgLessThan(String value) {
            addCriterion("restaurant_img <", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgLessThanOrEqualTo(String value) {
            addCriterion("restaurant_img <=", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgLike(String value) {
            addCriterion("restaurant_img like", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgNotLike(String value) {
            addCriterion("restaurant_img not like", value, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgIn(List<String> values) {
            addCriterion("restaurant_img in", values, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgNotIn(List<String> values) {
            addCriterion("restaurant_img not in", values, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgBetween(String value1, String value2) {
            addCriterion("restaurant_img between", value1, value2, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantImgNotBetween(String value1, String value2) {
            addCriterion("restaurant_img not between", value1, value2, "restaurantImg");
            return (Criteria) this;
        }

        public Criteria andRestaurantIntdescrIsNull() {
            addCriterion("restaurant_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantIntdescrIsNotNull() {
            addCriterion("restaurant_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantIntdescrEqualTo(Integer value) {
            addCriterion("restaurant_intdescr =", value, "restaurantIntdescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantIntdescrNotEqualTo(Integer value) {
            addCriterion("restaurant_intdescr <>", value, "restaurantIntdescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantIntdescrGreaterThan(Integer value) {
            addCriterion("restaurant_intdescr >", value, "restaurantIntdescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("restaurant_intdescr >=", value, "restaurantIntdescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantIntdescrLessThan(Integer value) {
            addCriterion("restaurant_intdescr <", value, "restaurantIntdescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("restaurant_intdescr <=", value, "restaurantIntdescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantIntdescrIn(List<Integer> values) {
            addCriterion("restaurant_intdescr in", values, "restaurantIntdescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantIntdescrNotIn(List<Integer> values) {
            addCriterion("restaurant_intdescr not in", values, "restaurantIntdescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_intdescr between", value1, value2, "restaurantIntdescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_intdescr not between", value1, value2, "restaurantIntdescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantVardescrIsNull() {
            addCriterion("restaurant_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantVardescrIsNotNull() {
            addCriterion("restaurant_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantVardescrEqualTo(String value) {
            addCriterion("restaurant_vardescr =", value, "restaurantVardescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantVardescrNotEqualTo(String value) {
            addCriterion("restaurant_vardescr <>", value, "restaurantVardescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantVardescrGreaterThan(String value) {
            addCriterion("restaurant_vardescr >", value, "restaurantVardescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("restaurant_vardescr >=", value, "restaurantVardescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantVardescrLessThan(String value) {
            addCriterion("restaurant_vardescr <", value, "restaurantVardescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantVardescrLessThanOrEqualTo(String value) {
            addCriterion("restaurant_vardescr <=", value, "restaurantVardescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantVardescrLike(String value) {
            addCriterion("restaurant_vardescr like", value, "restaurantVardescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantVardescrNotLike(String value) {
            addCriterion("restaurant_vardescr not like", value, "restaurantVardescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantVardescrIn(List<String> values) {
            addCriterion("restaurant_vardescr in", values, "restaurantVardescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantVardescrNotIn(List<String> values) {
            addCriterion("restaurant_vardescr not in", values, "restaurantVardescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantVardescrBetween(String value1, String value2) {
            addCriterion("restaurant_vardescr between", value1, value2, "restaurantVardescr");
            return (Criteria) this;
        }

        public Criteria andRestaurantVardescrNotBetween(String value1, String value2) {
            addCriterion("restaurant_vardescr not between", value1, value2, "restaurantVardescr");
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