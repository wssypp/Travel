package com.travel.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirticketorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AirticketorderExample() {
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

        public Criteria andAirticketorderIdIsNull() {
            addCriterion("airticketorder_id is null");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdIsNotNull() {
            addCriterion("airticketorder_id is not null");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdEqualTo(Integer value) {
            addCriterion("airticketorder_id =", value, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdNotEqualTo(Integer value) {
            addCriterion("airticketorder_id <>", value, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdGreaterThan(Integer value) {
            addCriterion("airticketorder_id >", value, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("airticketorder_id >=", value, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdLessThan(Integer value) {
            addCriterion("airticketorder_id <", value, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("airticketorder_id <=", value, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdIn(List<Integer> values) {
            addCriterion("airticketorder_id in", values, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdNotIn(List<Integer> values) {
            addCriterion("airticketorder_id not in", values, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdBetween(Integer value1, Integer value2) {
            addCriterion("airticketorder_id between", value1, value2, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("airticketorder_id not between", value1, value2, "airticketorderId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNull() {
            addCriterion("users_id is null");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNotNull() {
            addCriterion("users_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIdEqualTo(Integer value) {
            addCriterion("users_id =", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotEqualTo(Integer value) {
            addCriterion("users_id <>", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThan(Integer value) {
            addCriterion("users_id >", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("users_id >=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThan(Integer value) {
            addCriterion("users_id <", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThanOrEqualTo(Integer value) {
            addCriterion("users_id <=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIn(List<Integer> values) {
            addCriterion("users_id in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotIn(List<Integer> values) {
            addCriterion("users_id not in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdBetween(Integer value1, Integer value2) {
            addCriterion("users_id between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("users_id not between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderDateIsNull() {
            addCriterion("airticketorder_date is null");
            return (Criteria) this;
        }

        public Criteria andAirticketorderDateIsNotNull() {
            addCriterion("airticketorder_date is not null");
            return (Criteria) this;
        }

        public Criteria andAirticketorderDateEqualTo(Date value) {
            addCriterion("airticketorder_date =", value, "airticketorderDate");
            return (Criteria) this;
        }

        public Criteria andAirticketorderDateNotEqualTo(Date value) {
            addCriterion("airticketorder_date <>", value, "airticketorderDate");
            return (Criteria) this;
        }

        public Criteria andAirticketorderDateGreaterThan(Date value) {
            addCriterion("airticketorder_date >", value, "airticketorderDate");
            return (Criteria) this;
        }

        public Criteria andAirticketorderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("airticketorder_date >=", value, "airticketorderDate");
            return (Criteria) this;
        }

        public Criteria andAirticketorderDateLessThan(Date value) {
            addCriterion("airticketorder_date <", value, "airticketorderDate");
            return (Criteria) this;
        }

        public Criteria andAirticketorderDateLessThanOrEqualTo(Date value) {
            addCriterion("airticketorder_date <=", value, "airticketorderDate");
            return (Criteria) this;
        }

        public Criteria andAirticketorderDateIn(List<Date> values) {
            addCriterion("airticketorder_date in", values, "airticketorderDate");
            return (Criteria) this;
        }

        public Criteria andAirticketorderDateNotIn(List<Date> values) {
            addCriterion("airticketorder_date not in", values, "airticketorderDate");
            return (Criteria) this;
        }

        public Criteria andAirticketorderDateBetween(Date value1, Date value2) {
            addCriterion("airticketorder_date between", value1, value2, "airticketorderDate");
            return (Criteria) this;
        }

        public Criteria andAirticketorderDateNotBetween(Date value1, Date value2) {
            addCriterion("airticketorder_date not between", value1, value2, "airticketorderDate");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIdIsNull() {
            addCriterion("flightinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIdIsNotNull() {
            addCriterion("flightinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIdEqualTo(Integer value) {
            addCriterion("flightinfo_id =", value, "flightinfoId");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIdNotEqualTo(Integer value) {
            addCriterion("flightinfo_id <>", value, "flightinfoId");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIdGreaterThan(Integer value) {
            addCriterion("flightinfo_id >", value, "flightinfoId");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("flightinfo_id >=", value, "flightinfoId");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIdLessThan(Integer value) {
            addCriterion("flightinfo_id <", value, "flightinfoId");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("flightinfo_id <=", value, "flightinfoId");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIdIn(List<Integer> values) {
            addCriterion("flightinfo_id in", values, "flightinfoId");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIdNotIn(List<Integer> values) {
            addCriterion("flightinfo_id not in", values, "flightinfoId");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("flightinfo_id between", value1, value2, "flightinfoId");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("flightinfo_id not between", value1, value2, "flightinfoId");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceIsNull() {
            addCriterion("aircraftinfo_price is null");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceIsNotNull() {
            addCriterion("aircraftinfo_price is not null");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceEqualTo(Double value) {
            addCriterion("aircraftinfo_price =", value, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceNotEqualTo(Double value) {
            addCriterion("aircraftinfo_price <>", value, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceGreaterThan(Double value) {
            addCriterion("aircraftinfo_price >", value, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("aircraftinfo_price >=", value, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceLessThan(Double value) {
            addCriterion("aircraftinfo_price <", value, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceLessThanOrEqualTo(Double value) {
            addCriterion("aircraftinfo_price <=", value, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceIn(List<Double> values) {
            addCriterion("aircraftinfo_price in", values, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceNotIn(List<Double> values) {
            addCriterion("aircraftinfo_price not in", values, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceBetween(Double value1, Double value2) {
            addCriterion("aircraftinfo_price between", value1, value2, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoPriceNotBetween(Double value1, Double value2) {
            addCriterion("aircraftinfo_price not between", value1, value2, "aircraftinfoPrice");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiIsNull() {
            addCriterion("aircraftinfo_cangwei is null");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiIsNotNull() {
            addCriterion("aircraftinfo_cangwei is not null");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiEqualTo(String value) {
            addCriterion("aircraftinfo_cangwei =", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiNotEqualTo(String value) {
            addCriterion("aircraftinfo_cangwei <>", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiGreaterThan(String value) {
            addCriterion("aircraftinfo_cangwei >", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiGreaterThanOrEqualTo(String value) {
            addCriterion("aircraftinfo_cangwei >=", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiLessThan(String value) {
            addCriterion("aircraftinfo_cangwei <", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiLessThanOrEqualTo(String value) {
            addCriterion("aircraftinfo_cangwei <=", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiLike(String value) {
            addCriterion("aircraftinfo_cangwei like", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiNotLike(String value) {
            addCriterion("aircraftinfo_cangwei not like", value, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiIn(List<String> values) {
            addCriterion("aircraftinfo_cangwei in", values, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiNotIn(List<String> values) {
            addCriterion("aircraftinfo_cangwei not in", values, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiBetween(String value1, String value2) {
            addCriterion("aircraftinfo_cangwei between", value1, value2, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAircraftinfoCangweiNotBetween(String value1, String value2) {
            addCriterion("aircraftinfo_cangwei not between", value1, value2, "aircraftinfoCangwei");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdIsNull() {
            addCriterion("airperson_id is null");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdIsNotNull() {
            addCriterion("airperson_id is not null");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdEqualTo(Integer value) {
            addCriterion("airperson_id =", value, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdNotEqualTo(Integer value) {
            addCriterion("airperson_id <>", value, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdGreaterThan(Integer value) {
            addCriterion("airperson_id >", value, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("airperson_id >=", value, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdLessThan(Integer value) {
            addCriterion("airperson_id <", value, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("airperson_id <=", value, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdIn(List<Integer> values) {
            addCriterion("airperson_id in", values, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdNotIn(List<Integer> values) {
            addCriterion("airperson_id not in", values, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdBetween(Integer value1, Integer value2) {
            addCriterion("airperson_id between", value1, value2, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirpersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("airperson_id not between", value1, value2, "airpersonId");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPersonIsNull() {
            addCriterion("airticketorder_person is null");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPersonIsNotNull() {
            addCriterion("airticketorder_person is not null");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPersonEqualTo(String value) {
            addCriterion("airticketorder_person =", value, "airticketorderPerson");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPersonNotEqualTo(String value) {
            addCriterion("airticketorder_person <>", value, "airticketorderPerson");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPersonGreaterThan(String value) {
            addCriterion("airticketorder_person >", value, "airticketorderPerson");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPersonGreaterThanOrEqualTo(String value) {
            addCriterion("airticketorder_person >=", value, "airticketorderPerson");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPersonLessThan(String value) {
            addCriterion("airticketorder_person <", value, "airticketorderPerson");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPersonLessThanOrEqualTo(String value) {
            addCriterion("airticketorder_person <=", value, "airticketorderPerson");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPersonLike(String value) {
            addCriterion("airticketorder_person like", value, "airticketorderPerson");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPersonNotLike(String value) {
            addCriterion("airticketorder_person not like", value, "airticketorderPerson");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPersonIn(List<String> values) {
            addCriterion("airticketorder_person in", values, "airticketorderPerson");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPersonNotIn(List<String> values) {
            addCriterion("airticketorder_person not in", values, "airticketorderPerson");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPersonBetween(String value1, String value2) {
            addCriterion("airticketorder_person between", value1, value2, "airticketorderPerson");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPersonNotBetween(String value1, String value2) {
            addCriterion("airticketorder_person not between", value1, value2, "airticketorderPerson");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPhoneIsNull() {
            addCriterion("airticketorder_phone is null");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPhoneIsNotNull() {
            addCriterion("airticketorder_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPhoneEqualTo(String value) {
            addCriterion("airticketorder_phone =", value, "airticketorderPhone");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPhoneNotEqualTo(String value) {
            addCriterion("airticketorder_phone <>", value, "airticketorderPhone");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPhoneGreaterThan(String value) {
            addCriterion("airticketorder_phone >", value, "airticketorderPhone");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("airticketorder_phone >=", value, "airticketorderPhone");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPhoneLessThan(String value) {
            addCriterion("airticketorder_phone <", value, "airticketorderPhone");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPhoneLessThanOrEqualTo(String value) {
            addCriterion("airticketorder_phone <=", value, "airticketorderPhone");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPhoneLike(String value) {
            addCriterion("airticketorder_phone like", value, "airticketorderPhone");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPhoneNotLike(String value) {
            addCriterion("airticketorder_phone not like", value, "airticketorderPhone");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPhoneIn(List<String> values) {
            addCriterion("airticketorder_phone in", values, "airticketorderPhone");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPhoneNotIn(List<String> values) {
            addCriterion("airticketorder_phone not in", values, "airticketorderPhone");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPhoneBetween(String value1, String value2) {
            addCriterion("airticketorder_phone between", value1, value2, "airticketorderPhone");
            return (Criteria) this;
        }

        public Criteria andAirticketorderPhoneNotBetween(String value1, String value2) {
            addCriterion("airticketorder_phone not between", value1, value2, "airticketorderPhone");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIntdescrIsNull() {
            addCriterion("airticketorder_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIntdescrIsNotNull() {
            addCriterion("airticketorder_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIntdescrEqualTo(String value) {
            addCriterion("airticketorder_intdescr =", value, "airticketorderIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIntdescrNotEqualTo(String value) {
            addCriterion("airticketorder_intdescr <>", value, "airticketorderIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIntdescrGreaterThan(String value) {
            addCriterion("airticketorder_intdescr >", value, "airticketorderIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIntdescrGreaterThanOrEqualTo(String value) {
            addCriterion("airticketorder_intdescr >=", value, "airticketorderIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIntdescrLessThan(String value) {
            addCriterion("airticketorder_intdescr <", value, "airticketorderIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIntdescrLessThanOrEqualTo(String value) {
            addCriterion("airticketorder_intdescr <=", value, "airticketorderIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIntdescrLike(String value) {
            addCriterion("airticketorder_intdescr like", value, "airticketorderIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIntdescrNotLike(String value) {
            addCriterion("airticketorder_intdescr not like", value, "airticketorderIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIntdescrIn(List<String> values) {
            addCriterion("airticketorder_intdescr in", values, "airticketorderIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIntdescrNotIn(List<String> values) {
            addCriterion("airticketorder_intdescr not in", values, "airticketorderIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIntdescrBetween(String value1, String value2) {
            addCriterion("airticketorder_intdescr between", value1, value2, "airticketorderIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderIntdescrNotBetween(String value1, String value2) {
            addCriterion("airticketorder_intdescr not between", value1, value2, "airticketorderIntdescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderVardescrIsNull() {
            addCriterion("airticketorder_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andAirticketorderVardescrIsNotNull() {
            addCriterion("airticketorder_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andAirticketorderVardescrEqualTo(Integer value) {
            addCriterion("airticketorder_vardescr =", value, "airticketorderVardescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderVardescrNotEqualTo(Integer value) {
            addCriterion("airticketorder_vardescr <>", value, "airticketorderVardescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderVardescrGreaterThan(Integer value) {
            addCriterion("airticketorder_vardescr >", value, "airticketorderVardescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderVardescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("airticketorder_vardescr >=", value, "airticketorderVardescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderVardescrLessThan(Integer value) {
            addCriterion("airticketorder_vardescr <", value, "airticketorderVardescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderVardescrLessThanOrEqualTo(Integer value) {
            addCriterion("airticketorder_vardescr <=", value, "airticketorderVardescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderVardescrIn(List<Integer> values) {
            addCriterion("airticketorder_vardescr in", values, "airticketorderVardescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderVardescrNotIn(List<Integer> values) {
            addCriterion("airticketorder_vardescr not in", values, "airticketorderVardescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderVardescrBetween(Integer value1, Integer value2) {
            addCriterion("airticketorder_vardescr between", value1, value2, "airticketorderVardescr");
            return (Criteria) this;
        }

        public Criteria andAirticketorderVardescrNotBetween(Integer value1, Integer value2) {
            addCriterion("airticketorder_vardescr not between", value1, value2, "airticketorderVardescr");
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