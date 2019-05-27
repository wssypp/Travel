package com.travel.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScenicEntranceTicketExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicEntranceTicketExample() {
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

        public Criteria andScenicEntranceTicketIdIsNull() {
            addCriterion("scenic_entrance_ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIdIsNotNull() {
            addCriterion("scenic_entrance_ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIdEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_id =", value, "scenicEntranceTicketId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIdNotEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_id <>", value, "scenicEntranceTicketId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIdGreaterThan(Integer value) {
            addCriterion("scenic_entrance_ticket_id >", value, "scenicEntranceTicketId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_id >=", value, "scenicEntranceTicketId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIdLessThan(Integer value) {
            addCriterion("scenic_entrance_ticket_id <", value, "scenicEntranceTicketId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_id <=", value, "scenicEntranceTicketId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIdIn(List<Integer> values) {
            addCriterion("scenic_entrance_ticket_id in", values, "scenicEntranceTicketId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIdNotIn(List<Integer> values) {
            addCriterion("scenic_entrance_ticket_id not in", values, "scenicEntranceTicketId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_entrance_ticket_id between", value1, value2, "scenicEntranceTicketId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_entrance_ticket_id not between", value1, value2, "scenicEntranceTicketId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNameIsNull() {
            addCriterion("scenic_entrance_ticket_name is null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNameIsNotNull() {
            addCriterion("scenic_entrance_ticket_name is not null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNameEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_name =", value, "scenicEntranceTicketName");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNameNotEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_name <>", value, "scenicEntranceTicketName");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNameGreaterThan(String value) {
            addCriterion("scenic_entrance_ticket_name >", value, "scenicEntranceTicketName");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNameGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_name >=", value, "scenicEntranceTicketName");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNameLessThan(String value) {
            addCriterion("scenic_entrance_ticket_name <", value, "scenicEntranceTicketName");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNameLessThanOrEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_name <=", value, "scenicEntranceTicketName");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNameLike(String value) {
            addCriterion("scenic_entrance_ticket_name like", value, "scenicEntranceTicketName");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNameNotLike(String value) {
            addCriterion("scenic_entrance_ticket_name not like", value, "scenicEntranceTicketName");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNameIn(List<String> values) {
            addCriterion("scenic_entrance_ticket_name in", values, "scenicEntranceTicketName");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNameNotIn(List<String> values) {
            addCriterion("scenic_entrance_ticket_name not in", values, "scenicEntranceTicketName");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNameBetween(String value1, String value2) {
            addCriterion("scenic_entrance_ticket_name between", value1, value2, "scenicEntranceTicketName");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNameNotBetween(String value1, String value2) {
            addCriterion("scenic_entrance_ticket_name not between", value1, value2, "scenicEntranceTicketName");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTimeIsNull() {
            addCriterion("scenic_entrance_ticket_time is null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTimeIsNotNull() {
            addCriterion("scenic_entrance_ticket_time is not null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTimeEqualTo(Date value) {
            addCriterion("scenic_entrance_ticket_time =", value, "scenicEntranceTicketTime");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTimeNotEqualTo(Date value) {
            addCriterion("scenic_entrance_ticket_time <>", value, "scenicEntranceTicketTime");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTimeGreaterThan(Date value) {
            addCriterion("scenic_entrance_ticket_time >", value, "scenicEntranceTicketTime");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scenic_entrance_ticket_time >=", value, "scenicEntranceTicketTime");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTimeLessThan(Date value) {
            addCriterion("scenic_entrance_ticket_time <", value, "scenicEntranceTicketTime");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTimeLessThanOrEqualTo(Date value) {
            addCriterion("scenic_entrance_ticket_time <=", value, "scenicEntranceTicketTime");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTimeIn(List<Date> values) {
            addCriterion("scenic_entrance_ticket_time in", values, "scenicEntranceTicketTime");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTimeNotIn(List<Date> values) {
            addCriterion("scenic_entrance_ticket_time not in", values, "scenicEntranceTicketTime");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTimeBetween(Date value1, Date value2) {
            addCriterion("scenic_entrance_ticket_time between", value1, value2, "scenicEntranceTicketTime");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTimeNotBetween(Date value1, Date value2) {
            addCriterion("scenic_entrance_ticket_time not between", value1, value2, "scenicEntranceTicketTime");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNoticeIsNull() {
            addCriterion("scenic_entrance_ticket_notice is null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNoticeIsNotNull() {
            addCriterion("scenic_entrance_ticket_notice is not null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNoticeEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_notice =", value, "scenicEntranceTicketNotice");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNoticeNotEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_notice <>", value, "scenicEntranceTicketNotice");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNoticeGreaterThan(String value) {
            addCriterion("scenic_entrance_ticket_notice >", value, "scenicEntranceTicketNotice");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_notice >=", value, "scenicEntranceTicketNotice");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNoticeLessThan(String value) {
            addCriterion("scenic_entrance_ticket_notice <", value, "scenicEntranceTicketNotice");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNoticeLessThanOrEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_notice <=", value, "scenicEntranceTicketNotice");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNoticeLike(String value) {
            addCriterion("scenic_entrance_ticket_notice like", value, "scenicEntranceTicketNotice");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNoticeNotLike(String value) {
            addCriterion("scenic_entrance_ticket_notice not like", value, "scenicEntranceTicketNotice");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNoticeIn(List<String> values) {
            addCriterion("scenic_entrance_ticket_notice in", values, "scenicEntranceTicketNotice");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNoticeNotIn(List<String> values) {
            addCriterion("scenic_entrance_ticket_notice not in", values, "scenicEntranceTicketNotice");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNoticeBetween(String value1, String value2) {
            addCriterion("scenic_entrance_ticket_notice between", value1, value2, "scenicEntranceTicketNotice");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketNoticeNotBetween(String value1, String value2) {
            addCriterion("scenic_entrance_ticket_notice not between", value1, value2, "scenicEntranceTicketNotice");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTypeIdIsNull() {
            addCriterion("scenic_entrance_ticket_type_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTypeIdIsNotNull() {
            addCriterion("scenic_entrance_ticket_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTypeIdEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_type_id =", value, "scenicEntranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTypeIdNotEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_type_id <>", value, "scenicEntranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTypeIdGreaterThan(Integer value) {
            addCriterion("scenic_entrance_ticket_type_id >", value, "scenicEntranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_type_id >=", value, "scenicEntranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTypeIdLessThan(Integer value) {
            addCriterion("scenic_entrance_ticket_type_id <", value, "scenicEntranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_type_id <=", value, "scenicEntranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTypeIdIn(List<Integer> values) {
            addCriterion("scenic_entrance_ticket_type_id in", values, "scenicEntranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTypeIdNotIn(List<Integer> values) {
            addCriterion("scenic_entrance_ticket_type_id not in", values, "scenicEntranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_entrance_ticket_type_id between", value1, value2, "scenicEntranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_entrance_ticket_type_id not between", value1, value2, "scenicEntranceTicketTypeId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdIsNull() {
            addCriterion("scenic_order_id is null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdIsNotNull() {
            addCriterion("scenic_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdEqualTo(Integer value) {
            addCriterion("scenic_order_id =", value, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdNotEqualTo(Integer value) {
            addCriterion("scenic_order_id <>", value, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdGreaterThan(Integer value) {
            addCriterion("scenic_order_id >", value, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_order_id >=", value, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdLessThan(Integer value) {
            addCriterion("scenic_order_id <", value, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_order_id <=", value, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdIn(List<Integer> values) {
            addCriterion("scenic_order_id in", values, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdNotIn(List<Integer> values) {
            addCriterion("scenic_order_id not in", values, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("scenic_order_id between", value1, value2, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_order_id not between", value1, value2, "scenicOrderId");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketCountIsNull() {
            addCriterion("scenic_entrance_ticket_count is null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketCountIsNotNull() {
            addCriterion("scenic_entrance_ticket_count is not null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketCountEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_count =", value, "scenicEntranceTicketCount");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketCountNotEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_count <>", value, "scenicEntranceTicketCount");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketCountGreaterThan(Integer value) {
            addCriterion("scenic_entrance_ticket_count >", value, "scenicEntranceTicketCount");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_count >=", value, "scenicEntranceTicketCount");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketCountLessThan(Integer value) {
            addCriterion("scenic_entrance_ticket_count <", value, "scenicEntranceTicketCount");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketCountLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_count <=", value, "scenicEntranceTicketCount");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketCountIn(List<Integer> values) {
            addCriterion("scenic_entrance_ticket_count in", values, "scenicEntranceTicketCount");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketCountNotIn(List<Integer> values) {
            addCriterion("scenic_entrance_ticket_count not in", values, "scenicEntranceTicketCount");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketCountBetween(Integer value1, Integer value2) {
            addCriterion("scenic_entrance_ticket_count between", value1, value2, "scenicEntranceTicketCount");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketCountNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_entrance_ticket_count not between", value1, value2, "scenicEntranceTicketCount");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketImgIsNull() {
            addCriterion("scenic_entrance_ticket_img is null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketImgIsNotNull() {
            addCriterion("scenic_entrance_ticket_img is not null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketImgEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_img =", value, "scenicEntranceTicketImg");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketImgNotEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_img <>", value, "scenicEntranceTicketImg");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketImgGreaterThan(String value) {
            addCriterion("scenic_entrance_ticket_img >", value, "scenicEntranceTicketImg");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketImgGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_img >=", value, "scenicEntranceTicketImg");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketImgLessThan(String value) {
            addCriterion("scenic_entrance_ticket_img <", value, "scenicEntranceTicketImg");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketImgLessThanOrEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_img <=", value, "scenicEntranceTicketImg");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketImgLike(String value) {
            addCriterion("scenic_entrance_ticket_img like", value, "scenicEntranceTicketImg");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketImgNotLike(String value) {
            addCriterion("scenic_entrance_ticket_img not like", value, "scenicEntranceTicketImg");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketImgIn(List<String> values) {
            addCriterion("scenic_entrance_ticket_img in", values, "scenicEntranceTicketImg");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketImgNotIn(List<String> values) {
            addCriterion("scenic_entrance_ticket_img not in", values, "scenicEntranceTicketImg");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketImgBetween(String value1, String value2) {
            addCriterion("scenic_entrance_ticket_img between", value1, value2, "scenicEntranceTicketImg");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketImgNotBetween(String value1, String value2) {
            addCriterion("scenic_entrance_ticket_img not between", value1, value2, "scenicEntranceTicketImg");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIntdescrIsNull() {
            addCriterion("scenic_entrance_ticket_intdescr is null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIntdescrIsNotNull() {
            addCriterion("scenic_entrance_ticket_intdescr is not null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIntdescrEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_intdescr =", value, "scenicEntranceTicketIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIntdescrNotEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_intdescr <>", value, "scenicEntranceTicketIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIntdescrGreaterThan(Integer value) {
            addCriterion("scenic_entrance_ticket_intdescr >", value, "scenicEntranceTicketIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIntdescrGreaterThanOrEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_intdescr >=", value, "scenicEntranceTicketIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIntdescrLessThan(Integer value) {
            addCriterion("scenic_entrance_ticket_intdescr <", value, "scenicEntranceTicketIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIntdescrLessThanOrEqualTo(Integer value) {
            addCriterion("scenic_entrance_ticket_intdescr <=", value, "scenicEntranceTicketIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIntdescrIn(List<Integer> values) {
            addCriterion("scenic_entrance_ticket_intdescr in", values, "scenicEntranceTicketIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIntdescrNotIn(List<Integer> values) {
            addCriterion("scenic_entrance_ticket_intdescr not in", values, "scenicEntranceTicketIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIntdescrBetween(Integer value1, Integer value2) {
            addCriterion("scenic_entrance_ticket_intdescr between", value1, value2, "scenicEntranceTicketIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketIntdescrNotBetween(Integer value1, Integer value2) {
            addCriterion("scenic_entrance_ticket_intdescr not between", value1, value2, "scenicEntranceTicketIntdescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketVardescrIsNull() {
            addCriterion("scenic_entrance_ticket_vardescr is null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketVardescrIsNotNull() {
            addCriterion("scenic_entrance_ticket_vardescr is not null");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketVardescrEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_vardescr =", value, "scenicEntranceTicketVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketVardescrNotEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_vardescr <>", value, "scenicEntranceTicketVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketVardescrGreaterThan(String value) {
            addCriterion("scenic_entrance_ticket_vardescr >", value, "scenicEntranceTicketVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketVardescrGreaterThanOrEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_vardescr >=", value, "scenicEntranceTicketVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketVardescrLessThan(String value) {
            addCriterion("scenic_entrance_ticket_vardescr <", value, "scenicEntranceTicketVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketVardescrLessThanOrEqualTo(String value) {
            addCriterion("scenic_entrance_ticket_vardescr <=", value, "scenicEntranceTicketVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketVardescrLike(String value) {
            addCriterion("scenic_entrance_ticket_vardescr like", value, "scenicEntranceTicketVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketVardescrNotLike(String value) {
            addCriterion("scenic_entrance_ticket_vardescr not like", value, "scenicEntranceTicketVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketVardescrIn(List<String> values) {
            addCriterion("scenic_entrance_ticket_vardescr in", values, "scenicEntranceTicketVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketVardescrNotIn(List<String> values) {
            addCriterion("scenic_entrance_ticket_vardescr not in", values, "scenicEntranceTicketVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketVardescrBetween(String value1, String value2) {
            addCriterion("scenic_entrance_ticket_vardescr between", value1, value2, "scenicEntranceTicketVardescr");
            return (Criteria) this;
        }

        public Criteria andScenicEntranceTicketVardescrNotBetween(String value1, String value2) {
            addCriterion("scenic_entrance_ticket_vardescr not between", value1, value2, "scenicEntranceTicketVardescr");
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