package com.garden.po;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectionExample() {
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

        public Criteria andCollUseridIsNull() {
            addCriterion("coll_userid is null");
            return (Criteria) this;
        }

        public Criteria andCollUseridIsNotNull() {
            addCriterion("coll_userid is not null");
            return (Criteria) this;
        }

        public Criteria andCollUseridEqualTo(String value) {
            addCriterion("coll_userid =", value, "collUserid");
            return (Criteria) this;
        }

        public Criteria andCollUseridNotEqualTo(String value) {
            addCriterion("coll_userid <>", value, "collUserid");
            return (Criteria) this;
        }

        public Criteria andCollUseridGreaterThan(String value) {
            addCriterion("coll_userid >", value, "collUserid");
            return (Criteria) this;
        }

        public Criteria andCollUseridGreaterThanOrEqualTo(String value) {
            addCriterion("coll_userid >=", value, "collUserid");
            return (Criteria) this;
        }

        public Criteria andCollUseridLessThan(String value) {
            addCriterion("coll_userid <", value, "collUserid");
            return (Criteria) this;
        }

        public Criteria andCollUseridLessThanOrEqualTo(String value) {
            addCriterion("coll_userid <=", value, "collUserid");
            return (Criteria) this;
        }

        public Criteria andCollUseridLike(String value) {
            addCriterion("coll_userid like", value, "collUserid");
            return (Criteria) this;
        }

        public Criteria andCollUseridNotLike(String value) {
            addCriterion("coll_userid not like", value, "collUserid");
            return (Criteria) this;
        }

        public Criteria andCollUseridIn(List<String> values) {
            addCriterion("coll_userid in", values, "collUserid");
            return (Criteria) this;
        }

        public Criteria andCollUseridNotIn(List<String> values) {
            addCriterion("coll_userid not in", values, "collUserid");
            return (Criteria) this;
        }

        public Criteria andCollUseridBetween(String value1, String value2) {
            addCriterion("coll_userid between", value1, value2, "collUserid");
            return (Criteria) this;
        }

        public Criteria andCollUseridNotBetween(String value1, String value2) {
            addCriterion("coll_userid not between", value1, value2, "collUserid");
            return (Criteria) this;
        }

        public Criteria andCollDynamicidIsNull() {
            addCriterion("coll_dynamicid is null");
            return (Criteria) this;
        }

        public Criteria andCollDynamicidIsNotNull() {
            addCriterion("coll_dynamicid is not null");
            return (Criteria) this;
        }

        public Criteria andCollDynamicidEqualTo(Integer value) {
            addCriterion("coll_dynamicid =", value, "collDynamicid");
            return (Criteria) this;
        }

        public Criteria andCollDynamicidNotEqualTo(Integer value) {
            addCriterion("coll_dynamicid <>", value, "collDynamicid");
            return (Criteria) this;
        }

        public Criteria andCollDynamicidGreaterThan(Integer value) {
            addCriterion("coll_dynamicid >", value, "collDynamicid");
            return (Criteria) this;
        }

        public Criteria andCollDynamicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("coll_dynamicid >=", value, "collDynamicid");
            return (Criteria) this;
        }

        public Criteria andCollDynamicidLessThan(Integer value) {
            addCriterion("coll_dynamicid <", value, "collDynamicid");
            return (Criteria) this;
        }

        public Criteria andCollDynamicidLessThanOrEqualTo(Integer value) {
            addCriterion("coll_dynamicid <=", value, "collDynamicid");
            return (Criteria) this;
        }

        public Criteria andCollDynamicidIn(List<Integer> values) {
            addCriterion("coll_dynamicid in", values, "collDynamicid");
            return (Criteria) this;
        }

        public Criteria andCollDynamicidNotIn(List<Integer> values) {
            addCriterion("coll_dynamicid not in", values, "collDynamicid");
            return (Criteria) this;
        }

        public Criteria andCollDynamicidBetween(Integer value1, Integer value2) {
            addCriterion("coll_dynamicid between", value1, value2, "collDynamicid");
            return (Criteria) this;
        }

        public Criteria andCollDynamicidNotBetween(Integer value1, Integer value2) {
            addCriterion("coll_dynamicid not between", value1, value2, "collDynamicid");
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