package com.travel.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlightinfoExample() {
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

        public Criteria andAirplaneIdIsNull() {
            addCriterion("airplane_id is null");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdIsNotNull() {
            addCriterion("airplane_id is not null");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdEqualTo(Integer value) {
            addCriterion("airplane_id =", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdNotEqualTo(Integer value) {
            addCriterion("airplane_id <>", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdGreaterThan(Integer value) {
            addCriterion("airplane_id >", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("airplane_id >=", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdLessThan(Integer value) {
            addCriterion("airplane_id <", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdLessThanOrEqualTo(Integer value) {
            addCriterion("airplane_id <=", value, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdIn(List<Integer> values) {
            addCriterion("airplane_id in", values, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdNotIn(List<Integer> values) {
            addCriterion("airplane_id not in", values, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdBetween(Integer value1, Integer value2) {
            addCriterion("airplane_id between", value1, value2, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andAirplaneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("airplane_id not between", value1, value2, "airplaneId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNull() {
            addCriterion("route_id is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("route_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(Integer value) {
            addCriterion("route_id =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(Integer value) {
            addCriterion("route_id <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(Integer value) {
            addCriterion("route_id >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("route_id >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(Integer value) {
            addCriterion("route_id <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(Integer value) {
            addCriterion("route_id <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<Integer> values) {
            addCriterion("route_id in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<Integer> values) {
            addCriterion("route_id not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(Integer value1, Integer value2) {
            addCriterion("route_id between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("route_id not between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andStartflyTimeIsNull() {
            addCriterion("startfly_time is null");
            return (Criteria) this;
        }

        public Criteria andStartflyTimeIsNotNull() {
            addCriterion("startfly_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartflyTimeEqualTo(Date value) {
            addCriterion("startfly_time =", value, "startflyTime");
            return (Criteria) this;
        }

        public Criteria andStartflyTimeNotEqualTo(Date value) {
            addCriterion("startfly_time <>", value, "startflyTime");
            return (Criteria) this;
        }

        public Criteria andStartflyTimeGreaterThan(Date value) {
            addCriterion("startfly_time >", value, "startflyTime");
            return (Criteria) this;
        }

        public Criteria andStartflyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startfly_time >=", value, "startflyTime");
            return (Criteria) this;
        }

        public Criteria andStartflyTimeLessThan(Date value) {
            addCriterion("startfly_time <", value, "startflyTime");
            return (Criteria) this;
        }

        public Criteria andStartflyTimeLessThanOrEqualTo(Date value) {
            addCriterion("startfly_time <=", value, "startflyTime");
            return (Criteria) this;
        }

        public Criteria andStartflyTimeIn(List<Date> values) {
            addCriterion("startfly_time in", values, "startflyTime");
            return (Criteria) this;
        }

        public Criteria andStartflyTimeNotIn(List<Date> values) {
            addCriterion("startfly_time not in", values, "startflyTime");
            return (Criteria) this;
        }

        public Criteria andStartflyTimeBetween(Date value1, Date value2) {
            addCriterion("startfly_time between", value1, value2, "startflyTime");
            return (Criteria) this;
        }

        public Criteria andStartflyTimeNotBetween(Date value1, Date value2) {
            addCriterion("startfly_time not between", value1, value2, "startflyTime");
            return (Criteria) this;
        }

        public Criteria andEndflyTimeIsNull() {
            addCriterion("endfly_time is null");
            return (Criteria) this;
        }

        public Criteria andEndflyTimeIsNotNull() {
            addCriterion("endfly_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndflyTimeEqualTo(Date value) {
            addCriterion("endfly_time =", value, "endflyTime");
            return (Criteria) this;
        }

        public Criteria andEndflyTimeNotEqualTo(Date value) {
            addCriterion("endfly_time <>", value, "endflyTime");
            return (Criteria) this;
        }

        public Criteria andEndflyTimeGreaterThan(Date value) {
            addCriterion("endfly_time >", value, "endflyTime");
            return (Criteria) this;
        }

        public Criteria andEndflyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endfly_time >=", value, "endflyTime");
            return (Criteria) this;
        }

        public Criteria andEndflyTimeLessThan(Date value) {
            addCriterion("endfly_time <", value, "endflyTime");
            return (Criteria) this;
        }

        public Criteria andEndflyTimeLessThanOrEqualTo(Date value) {
            addCriterion("endfly_time <=", value, "endflyTime");
            return (Criteria) this;
        }

        public Criteria andEndflyTimeIn(List<Date> values) {
            addCriterion("endfly_time in", values, "endflyTime");
            return (Criteria) this;
        }

        public Criteria andEndflyTimeNotIn(List<Date> values) {
            addCriterion("endfly_time not in", values, "endflyTime");
            return (Criteria) this;
        }

        public Criteria andEndflyTimeBetween(Date value1, Date value2) {
            addCriterion("endfly_time between", value1, value2, "endflyTime");
            return (Criteria) this;
        }

        public Criteria andEndflyTimeNotBetween(Date value1, Date value2) {
            addCriterion("endfly_time not between", value1, value2, "endflyTime");
            return (Criteria) this;
        }

        public Criteria andStartflyAirportIsNull() {
            addCriterion("startfly_airport is null");
            return (Criteria) this;
        }

        public Criteria andStartflyAirportIsNotNull() {
            addCriterion("startfly_airport is not null");
            return (Criteria) this;
        }

        public Criteria andStartflyAirportEqualTo(String value) {
            addCriterion("startfly_airport =", value, "startflyAirport");
            return (Criteria) this;
        }

        public Criteria andStartflyAirportNotEqualTo(String value) {
            addCriterion("startfly_airport <>", value, "startflyAirport");
            return (Criteria) this;
        }

        public Criteria andStartflyAirportGreaterThan(String value) {
            addCriterion("startfly_airport >", value, "startflyAirport");
            return (Criteria) this;
        }

        public Criteria andStartflyAirportGreaterThanOrEqualTo(String value) {
            addCriterion("startfly_airport >=", value, "startflyAirport");
            return (Criteria) this;
        }

        public Criteria andStartflyAirportLessThan(String value) {
            addCriterion("startfly_airport <", value, "startflyAirport");
            return (Criteria) this;
        }

        public Criteria andStartflyAirportLessThanOrEqualTo(String value) {
            addCriterion("startfly_airport <=", value, "startflyAirport");
            return (Criteria) this;
        }

        public Criteria andStartflyAirportLike(String value) {
            addCriterion("startfly_airport like", value, "startflyAirport");
            return (Criteria) this;
        }

        public Criteria andStartflyAirportNotLike(String value) {
            addCriterion("startfly_airport not like", value, "startflyAirport");
            return (Criteria) this;
        }

        public Criteria andStartflyAirportIn(List<String> values) {
            addCriterion("startfly_airport in", values, "startflyAirport");
            return (Criteria) this;
        }

        public Criteria andStartflyAirportNotIn(List<String> values) {
            addCriterion("startfly_airport not in", values, "startflyAirport");
            return (Criteria) this;
        }

        public Criteria andStartflyAirportBetween(String value1, String value2) {
            addCriterion("startfly_airport between", value1, value2, "startflyAirport");
            return (Criteria) this;
        }

        public Criteria andStartflyAirportNotBetween(String value1, String value2) {
            addCriterion("startfly_airport not between", value1, value2, "startflyAirport");
            return (Criteria) this;
        }

        public Criteria andEndflyAirportIsNull() {
            addCriterion("endfly_airport is null");
            return (Criteria) this;
        }

        public Criteria andEndflyAirportIsNotNull() {
            addCriterion("endfly_airport is not null");
            return (Criteria) this;
        }

        public Criteria andEndflyAirportEqualTo(String value) {
            addCriterion("endfly_airport =", value, "endflyAirport");
            return (Criteria) this;
        }

        public Criteria andEndflyAirportNotEqualTo(String value) {
            addCriterion("endfly_airport <>", value, "endflyAirport");
            return (Criteria) this;
        }

        public Criteria andEndflyAirportGreaterThan(String value) {
            addCriterion("endfly_airport >", value, "endflyAirport");
            return (Criteria) this;
        }

        public Criteria andEndflyAirportGreaterThanOrEqualTo(String value) {
            addCriterion("endfly_airport >=", value, "endflyAirport");
            return (Criteria) this;
        }

        public Criteria andEndflyAirportLessThan(String value) {
            addCriterion("endfly_airport <", value, "endflyAirport");
            return (Criteria) this;
        }

        public Criteria andEndflyAirportLessThanOrEqualTo(String value) {
            addCriterion("endfly_airport <=", value, "endflyAirport");
            return (Criteria) this;
        }

        public Criteria andEndflyAirportLike(String value) {
            addCriterion("endfly_airport like", value, "endflyAirport");
            return (Criteria) this;
        }

        public Criteria andEndflyAirportNotLike(String value) {
            addCriterion("endfly_airport not like", value, "endflyAirport");
            return (Criteria) this;
        }

        public Criteria andEndflyAirportIn(List<String> values) {
            addCriterion("endfly_airport in", values, "endflyAirport");
            return (Criteria) this;
        }

        public Criteria andEndflyAirportNotIn(List<String> values) {
            addCriterion("endfly_airport not in", values, "endflyAirport");
            return (Criteria) this;
        }

        public Criteria andEndflyAirportBetween(String value1, String value2) {
            addCriterion("endfly_airport between", value1, value2, "endflyAirport");
            return (Criteria) this;
        }

        public Criteria andEndflyAirportNotBetween(String value1, String value2) {
            addCriterion("endfly_airport not between", value1, value2, "endflyAirport");
            return (Criteria) this;
        }

        public Criteria andFlightinfoPriceIsNull() {
            addCriterion("flightinfo_price is null");
            return (Criteria) this;
        }

        public Criteria andFlightinfoPriceIsNotNull() {
            addCriterion("flightinfo_price is not null");
            return (Criteria) this;
        }

        public Criteria andFlightinfoPriceEqualTo(Double value) {
            addCriterion("flightinfo_price =", value, "flightinfoPrice");
            return (Criteria) this;
        }

        public Criteria andFlightinfoPriceNotEqualTo(Double value) {
            addCriterion("flightinfo_price <>", value, "flightinfoPrice");
            return (Criteria) this;
        }

        public Criteria andFlightinfoPriceGreaterThan(Double value) {
            addCriterion("flightinfo_price >", value, "flightinfoPrice");
            return (Criteria) this;
        }

        public Criteria andFlightinfoPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("flightinfo_price >=", value, "flightinfoPrice");
            return (Criteria) this;
        }

        public Criteria andFlightinfoPriceLessThan(Double value) {
            addCriterion("flightinfo_price <", value, "flightinfoPrice");
            return (Criteria) this;
        }

        public Criteria andFlightinfoPriceLessThanOrEqualTo(Double value) {
            addCriterion("flightinfo_price <=", value, "flightinfoPrice");
            return (Criteria) this;
        }

        public Criteria andFlightinfoPriceIn(List<Double> values) {
            addCriterion("flightinfo_price in", values, "flightinfoPrice");
            return (Criteria) this;
        }

        public Criteria andFlightinfoPriceNotIn(List<Double> values) {
            addCriterion("flightinfo_price not in", values, "flightinfoPrice");
            return (Criteria) this;
        }

        public Criteria andFlightinfoPriceBetween(Double value1, Double value2) {
            addCriterion("flightinfo_price between", value1, value2, "flightinfoPrice");
            return (Criteria) this;
        }

        public Criteria andFlightinfoPriceNotBetween(Double value1, Double value2) {
            addCriterion("flightinfo_price not between", value1, value2, "flightinfoPrice");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIntdescrIsNull() {
            addCriterion("flightinfo_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIntdescrIsNotNull() {
            addCriterion("flightinfo_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIntdescrEqualTo(Integer value) {
            addCriterion("flightinfo_intdescr =", value, "flightinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIntdescrNotEqualTo(Integer value) {
            addCriterion("flightinfo_intdescr <>", value, "flightinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIntdescrGreaterThan(Integer value) {
            addCriterion("flightinfo_intdescr >", value, "flightinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("flightinfo_intdescr >=", value, "flightinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIntdescrLessThan(Integer value) {
            addCriterion("flightinfo_intdescr <", value, "flightinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("flightinfo_intdescr <=", value, "flightinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIntdescrIn(List<Integer> values) {
            addCriterion("flightinfo_intdescr in", values, "flightinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIntdescrNotIn(List<Integer> values) {
            addCriterion("flightinfo_intdescr not in", values, "flightinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("flightinfo_intdescr between", value1, value2, "flightinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("flightinfo_intdescr not between", value1, value2, "flightinfoIntdescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoVardescrIsNull() {
            addCriterion("flightinfo_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andFlightinfoVardescrIsNotNull() {
            addCriterion("flightinfo_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andFlightinfoVardescrEqualTo(String value) {
            addCriterion("flightinfo_vardescr =", value, "flightinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoVardescrNotEqualTo(String value) {
            addCriterion("flightinfo_vardescr <>", value, "flightinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoVardescrGreaterThan(String value) {
            addCriterion("flightinfo_vardescr >", value, "flightinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("flightinfo_vardescr >=", value, "flightinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoVardescrLessThan(String value) {
            addCriterion("flightinfo_vardescr <", value, "flightinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoVardescrLessThanOrEqualTo(String value) {
            addCriterion("flightinfo_vardescr <=", value, "flightinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoVardescrLike(String value) {
            addCriterion("flightinfo_vardescr like", value, "flightinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoVardescrNotLike(String value) {
            addCriterion("flightinfo_vardescr not like", value, "flightinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoVardescrIn(List<String> values) {
            addCriterion("flightinfo_vardescr in", values, "flightinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoVardescrNotIn(List<String> values) {
            addCriterion("flightinfo_vardescr not in", values, "flightinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoVardescrBetween(String value1, String value2) {
            addCriterion("flightinfo_vardescr between", value1, value2, "flightinfoVardescr");
            return (Criteria) this;
        }

        public Criteria andFlightinfoVardescrNotBetween(String value1, String value2) {
            addCriterion("flightinfo_vardescr not between", value1, value2, "flightinfoVardescr");
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