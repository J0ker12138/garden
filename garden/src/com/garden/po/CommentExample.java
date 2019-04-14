package com.garden.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_id =", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_id <", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_id in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "commentId");
            return (Criteria) this;
        }

        public Criteria andCommentDynamicidIsNull() {
            addCriterion("comment_dynamicid is null");
            return (Criteria) this;
        }

        public Criteria andCommentDynamicidIsNotNull() {
            addCriterion("comment_dynamicid is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDynamicidEqualTo(Integer value) {
            addCriterion("comment_dynamicid =", value, "commentDynamicid");
            return (Criteria) this;
        }

        public Criteria andCommentDynamicidNotEqualTo(Integer value) {
            addCriterion("comment_dynamicid <>", value, "commentDynamicid");
            return (Criteria) this;
        }

        public Criteria andCommentDynamicidGreaterThan(Integer value) {
            addCriterion("comment_dynamicid >", value, "commentDynamicid");
            return (Criteria) this;
        }

        public Criteria andCommentDynamicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_dynamicid >=", value, "commentDynamicid");
            return (Criteria) this;
        }

        public Criteria andCommentDynamicidLessThan(Integer value) {
            addCriterion("comment_dynamicid <", value, "commentDynamicid");
            return (Criteria) this;
        }

        public Criteria andCommentDynamicidLessThanOrEqualTo(Integer value) {
            addCriterion("comment_dynamicid <=", value, "commentDynamicid");
            return (Criteria) this;
        }

        public Criteria andCommentDynamicidIn(List<Integer> values) {
            addCriterion("comment_dynamicid in", values, "commentDynamicid");
            return (Criteria) this;
        }

        public Criteria andCommentDynamicidNotIn(List<Integer> values) {
            addCriterion("comment_dynamicid not in", values, "commentDynamicid");
            return (Criteria) this;
        }

        public Criteria andCommentDynamicidBetween(Integer value1, Integer value2) {
            addCriterion("comment_dynamicid between", value1, value2, "commentDynamicid");
            return (Criteria) this;
        }

        public Criteria andCommentDynamicidNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_dynamicid not between", value1, value2, "commentDynamicid");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionIsNull() {
            addCriterion("comment_description is null");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionIsNotNull() {
            addCriterion("comment_description is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionEqualTo(String value) {
            addCriterion("comment_description =", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionNotEqualTo(String value) {
            addCriterion("comment_description <>", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionGreaterThan(String value) {
            addCriterion("comment_description >", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("comment_description >=", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionLessThan(String value) {
            addCriterion("comment_description <", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionLessThanOrEqualTo(String value) {
            addCriterion("comment_description <=", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionLike(String value) {
            addCriterion("comment_description like", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionNotLike(String value) {
            addCriterion("comment_description not like", value, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionIn(List<String> values) {
            addCriterion("comment_description in", values, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionNotIn(List<String> values) {
            addCriterion("comment_description not in", values, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionBetween(String value1, String value2) {
            addCriterion("comment_description between", value1, value2, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDescriptionNotBetween(String value1, String value2) {
            addCriterion("comment_description not between", value1, value2, "commentDescription");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNull() {
            addCriterion("comment_date is null");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNotNull() {
            addCriterion("comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDateEqualTo(Date value) {
            addCriterion("comment_date =", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotEqualTo(Date value) {
            addCriterion("comment_date <>", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThan(Date value) {
            addCriterion("comment_date >", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_date >=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThan(Date value) {
            addCriterion("comment_date <", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThanOrEqualTo(Date value) {
            addCriterion("comment_date <=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateIn(List<Date> values) {
            addCriterion("comment_date in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotIn(List<Date> values) {
            addCriterion("comment_date not in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateBetween(Date value1, Date value2) {
            addCriterion("comment_date between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotBetween(Date value1, Date value2) {
            addCriterion("comment_date not between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentPointnumIsNull() {
            addCriterion("comment_pointnum is null");
            return (Criteria) this;
        }

        public Criteria andCommentPointnumIsNotNull() {
            addCriterion("comment_pointnum is not null");
            return (Criteria) this;
        }

        public Criteria andCommentPointnumEqualTo(Integer value) {
            addCriterion("comment_pointnum =", value, "commentPointnum");
            return (Criteria) this;
        }

        public Criteria andCommentPointnumNotEqualTo(Integer value) {
            addCriterion("comment_pointnum <>", value, "commentPointnum");
            return (Criteria) this;
        }

        public Criteria andCommentPointnumGreaterThan(Integer value) {
            addCriterion("comment_pointnum >", value, "commentPointnum");
            return (Criteria) this;
        }

        public Criteria andCommentPointnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_pointnum >=", value, "commentPointnum");
            return (Criteria) this;
        }

        public Criteria andCommentPointnumLessThan(Integer value) {
            addCriterion("comment_pointnum <", value, "commentPointnum");
            return (Criteria) this;
        }

        public Criteria andCommentPointnumLessThanOrEqualTo(Integer value) {
            addCriterion("comment_pointnum <=", value, "commentPointnum");
            return (Criteria) this;
        }

        public Criteria andCommentPointnumIn(List<Integer> values) {
            addCriterion("comment_pointnum in", values, "commentPointnum");
            return (Criteria) this;
        }

        public Criteria andCommentPointnumNotIn(List<Integer> values) {
            addCriterion("comment_pointnum not in", values, "commentPointnum");
            return (Criteria) this;
        }

        public Criteria andCommentPointnumBetween(Integer value1, Integer value2) {
            addCriterion("comment_pointnum between", value1, value2, "commentPointnum");
            return (Criteria) this;
        }

        public Criteria andCommentPointnumNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_pointnum not between", value1, value2, "commentPointnum");
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