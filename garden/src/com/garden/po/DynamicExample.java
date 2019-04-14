package com.garden.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DynamicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DynamicExample() {
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

        public Criteria andDynamicIdIsNull() {
            addCriterion("dynamic_id is null");
            return (Criteria) this;
        }

        public Criteria andDynamicIdIsNotNull() {
            addCriterion("dynamic_id is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicIdEqualTo(Integer value) {
            addCriterion("dynamic_id =", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotEqualTo(Integer value) {
            addCriterion("dynamic_id <>", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdGreaterThan(Integer value) {
            addCriterion("dynamic_id >", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dynamic_id >=", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdLessThan(Integer value) {
            addCriterion("dynamic_id <", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdLessThanOrEqualTo(Integer value) {
            addCriterion("dynamic_id <=", value, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdIn(List<Integer> values) {
            addCriterion("dynamic_id in", values, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotIn(List<Integer> values) {
            addCriterion("dynamic_id not in", values, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdBetween(Integer value1, Integer value2) {
            addCriterion("dynamic_id between", value1, value2, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dynamic_id not between", value1, value2, "dynamicId");
            return (Criteria) this;
        }

        public Criteria andDynamicUseridIsNull() {
            addCriterion("dynamic_userid is null");
            return (Criteria) this;
        }

        public Criteria andDynamicUseridIsNotNull() {
            addCriterion("dynamic_userid is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicUseridEqualTo(String value) {
            addCriterion("dynamic_userid =", value, "dynamicUserid");
            return (Criteria) this;
        }

        public Criteria andDynamicUseridNotEqualTo(String value) {
            addCriterion("dynamic_userid <>", value, "dynamicUserid");
            return (Criteria) this;
        }

        public Criteria andDynamicUseridGreaterThan(String value) {
            addCriterion("dynamic_userid >", value, "dynamicUserid");
            return (Criteria) this;
        }

        public Criteria andDynamicUseridGreaterThanOrEqualTo(String value) {
            addCriterion("dynamic_userid >=", value, "dynamicUserid");
            return (Criteria) this;
        }

        public Criteria andDynamicUseridLessThan(String value) {
            addCriterion("dynamic_userid <", value, "dynamicUserid");
            return (Criteria) this;
        }

        public Criteria andDynamicUseridLessThanOrEqualTo(String value) {
            addCriterion("dynamic_userid <=", value, "dynamicUserid");
            return (Criteria) this;
        }

        public Criteria andDynamicUseridLike(String value) {
            addCriterion("dynamic_userid like", value, "dynamicUserid");
            return (Criteria) this;
        }

        public Criteria andDynamicUseridNotLike(String value) {
            addCriterion("dynamic_userid not like", value, "dynamicUserid");
            return (Criteria) this;
        }

        public Criteria andDynamicUseridIn(List<String> values) {
            addCriterion("dynamic_userid in", values, "dynamicUserid");
            return (Criteria) this;
        }

        public Criteria andDynamicUseridNotIn(List<String> values) {
            addCriterion("dynamic_userid not in", values, "dynamicUserid");
            return (Criteria) this;
        }

        public Criteria andDynamicUseridBetween(String value1, String value2) {
            addCriterion("dynamic_userid between", value1, value2, "dynamicUserid");
            return (Criteria) this;
        }

        public Criteria andDynamicUseridNotBetween(String value1, String value2) {
            addCriterion("dynamic_userid not between", value1, value2, "dynamicUserid");
            return (Criteria) this;
        }

        public Criteria andDynamicDescriptionIsNull() {
            addCriterion("dynamic_description is null");
            return (Criteria) this;
        }

        public Criteria andDynamicDescriptionIsNotNull() {
            addCriterion("dynamic_description is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicDescriptionEqualTo(String value) {
            addCriterion("dynamic_description =", value, "dynamicDescription");
            return (Criteria) this;
        }

        public Criteria andDynamicDescriptionNotEqualTo(String value) {
            addCriterion("dynamic_description <>", value, "dynamicDescription");
            return (Criteria) this;
        }

        public Criteria andDynamicDescriptionGreaterThan(String value) {
            addCriterion("dynamic_description >", value, "dynamicDescription");
            return (Criteria) this;
        }

        public Criteria andDynamicDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("dynamic_description >=", value, "dynamicDescription");
            return (Criteria) this;
        }

        public Criteria andDynamicDescriptionLessThan(String value) {
            addCriterion("dynamic_description <", value, "dynamicDescription");
            return (Criteria) this;
        }

        public Criteria andDynamicDescriptionLessThanOrEqualTo(String value) {
            addCriterion("dynamic_description <=", value, "dynamicDescription");
            return (Criteria) this;
        }

        public Criteria andDynamicDescriptionLike(String value) {
            addCriterion("dynamic_description like", value, "dynamicDescription");
            return (Criteria) this;
        }

        public Criteria andDynamicDescriptionNotLike(String value) {
            addCriterion("dynamic_description not like", value, "dynamicDescription");
            return (Criteria) this;
        }

        public Criteria andDynamicDescriptionIn(List<String> values) {
            addCriterion("dynamic_description in", values, "dynamicDescription");
            return (Criteria) this;
        }

        public Criteria andDynamicDescriptionNotIn(List<String> values) {
            addCriterion("dynamic_description not in", values, "dynamicDescription");
            return (Criteria) this;
        }

        public Criteria andDynamicDescriptionBetween(String value1, String value2) {
            addCriterion("dynamic_description between", value1, value2, "dynamicDescription");
            return (Criteria) this;
        }

        public Criteria andDynamicDescriptionNotBetween(String value1, String value2) {
            addCriterion("dynamic_description not between", value1, value2, "dynamicDescription");
            return (Criteria) this;
        }

        public Criteria andDynamicImageIsNull() {
            addCriterion("dynamic_image is null");
            return (Criteria) this;
        }

        public Criteria andDynamicImageIsNotNull() {
            addCriterion("dynamic_image is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicImageEqualTo(String value) {
            addCriterion("dynamic_image =", value, "dynamicImage");
            return (Criteria) this;
        }

        public Criteria andDynamicImageNotEqualTo(String value) {
            addCriterion("dynamic_image <>", value, "dynamicImage");
            return (Criteria) this;
        }

        public Criteria andDynamicImageGreaterThan(String value) {
            addCriterion("dynamic_image >", value, "dynamicImage");
            return (Criteria) this;
        }

        public Criteria andDynamicImageGreaterThanOrEqualTo(String value) {
            addCriterion("dynamic_image >=", value, "dynamicImage");
            return (Criteria) this;
        }

        public Criteria andDynamicImageLessThan(String value) {
            addCriterion("dynamic_image <", value, "dynamicImage");
            return (Criteria) this;
        }

        public Criteria andDynamicImageLessThanOrEqualTo(String value) {
            addCriterion("dynamic_image <=", value, "dynamicImage");
            return (Criteria) this;
        }

        public Criteria andDynamicImageLike(String value) {
            addCriterion("dynamic_image like", value, "dynamicImage");
            return (Criteria) this;
        }

        public Criteria andDynamicImageNotLike(String value) {
            addCriterion("dynamic_image not like", value, "dynamicImage");
            return (Criteria) this;
        }

        public Criteria andDynamicImageIn(List<String> values) {
            addCriterion("dynamic_image in", values, "dynamicImage");
            return (Criteria) this;
        }

        public Criteria andDynamicImageNotIn(List<String> values) {
            addCriterion("dynamic_image not in", values, "dynamicImage");
            return (Criteria) this;
        }

        public Criteria andDynamicImageBetween(String value1, String value2) {
            addCriterion("dynamic_image between", value1, value2, "dynamicImage");
            return (Criteria) this;
        }

        public Criteria andDynamicImageNotBetween(String value1, String value2) {
            addCriterion("dynamic_image not between", value1, value2, "dynamicImage");
            return (Criteria) this;
        }

        public Criteria andDynamicDateIsNull() {
            addCriterion("dynamic_date is null");
            return (Criteria) this;
        }

        public Criteria andDynamicDateIsNotNull() {
            addCriterion("dynamic_date is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicDateEqualTo(Date value) {
            addCriterion("dynamic_date =", value, "dynamicDate");
            return (Criteria) this;
        }

        public Criteria andDynamicDateNotEqualTo(Date value) {
            addCriterion("dynamic_date <>", value, "dynamicDate");
            return (Criteria) this;
        }

        public Criteria andDynamicDateGreaterThan(Date value) {
            addCriterion("dynamic_date >", value, "dynamicDate");
            return (Criteria) this;
        }

        public Criteria andDynamicDateGreaterThanOrEqualTo(Date value) {
            addCriterion("dynamic_date >=", value, "dynamicDate");
            return (Criteria) this;
        }

        public Criteria andDynamicDateLessThan(Date value) {
            addCriterion("dynamic_date <", value, "dynamicDate");
            return (Criteria) this;
        }

        public Criteria andDynamicDateLessThanOrEqualTo(Date value) {
            addCriterion("dynamic_date <=", value, "dynamicDate");
            return (Criteria) this;
        }

        public Criteria andDynamicDateIn(List<Date> values) {
            addCriterion("dynamic_date in", values, "dynamicDate");
            return (Criteria) this;
        }

        public Criteria andDynamicDateNotIn(List<Date> values) {
            addCriterion("dynamic_date not in", values, "dynamicDate");
            return (Criteria) this;
        }

        public Criteria andDynamicDateBetween(Date value1, Date value2) {
            addCriterion("dynamic_date between", value1, value2, "dynamicDate");
            return (Criteria) this;
        }

        public Criteria andDynamicDateNotBetween(Date value1, Date value2) {
            addCriterion("dynamic_date not between", value1, value2, "dynamicDate");
            return (Criteria) this;
        }

        public Criteria andDynamicPointnumIsNull() {
            addCriterion("dynamic_pointnum is null");
            return (Criteria) this;
        }

        public Criteria andDynamicPointnumIsNotNull() {
            addCriterion("dynamic_pointnum is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicPointnumEqualTo(Integer value) {
            addCriterion("dynamic_pointnum =", value, "dynamicPointnum");
            return (Criteria) this;
        }

        public Criteria andDynamicPointnumNotEqualTo(Integer value) {
            addCriterion("dynamic_pointnum <>", value, "dynamicPointnum");
            return (Criteria) this;
        }

        public Criteria andDynamicPointnumGreaterThan(Integer value) {
            addCriterion("dynamic_pointnum >", value, "dynamicPointnum");
            return (Criteria) this;
        }

        public Criteria andDynamicPointnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dynamic_pointnum >=", value, "dynamicPointnum");
            return (Criteria) this;
        }

        public Criteria andDynamicPointnumLessThan(Integer value) {
            addCriterion("dynamic_pointnum <", value, "dynamicPointnum");
            return (Criteria) this;
        }

        public Criteria andDynamicPointnumLessThanOrEqualTo(Integer value) {
            addCriterion("dynamic_pointnum <=", value, "dynamicPointnum");
            return (Criteria) this;
        }

        public Criteria andDynamicPointnumIn(List<Integer> values) {
            addCriterion("dynamic_pointnum in", values, "dynamicPointnum");
            return (Criteria) this;
        }

        public Criteria andDynamicPointnumNotIn(List<Integer> values) {
            addCriterion("dynamic_pointnum not in", values, "dynamicPointnum");
            return (Criteria) this;
        }

        public Criteria andDynamicPointnumBetween(Integer value1, Integer value2) {
            addCriterion("dynamic_pointnum between", value1, value2, "dynamicPointnum");
            return (Criteria) this;
        }

        public Criteria andDynamicPointnumNotBetween(Integer value1, Integer value2) {
            addCriterion("dynamic_pointnum not between", value1, value2, "dynamicPointnum");
            return (Criteria) this;
        }

        public Criteria andDynamicViewnumIsNull() {
            addCriterion("dynamic_viewnum is null");
            return (Criteria) this;
        }

        public Criteria andDynamicViewnumIsNotNull() {
            addCriterion("dynamic_viewnum is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicViewnumEqualTo(Integer value) {
            addCriterion("dynamic_viewnum =", value, "dynamicViewnum");
            return (Criteria) this;
        }

        public Criteria andDynamicViewnumNotEqualTo(Integer value) {
            addCriterion("dynamic_viewnum <>", value, "dynamicViewnum");
            return (Criteria) this;
        }

        public Criteria andDynamicViewnumGreaterThan(Integer value) {
            addCriterion("dynamic_viewnum >", value, "dynamicViewnum");
            return (Criteria) this;
        }

        public Criteria andDynamicViewnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dynamic_viewnum >=", value, "dynamicViewnum");
            return (Criteria) this;
        }

        public Criteria andDynamicViewnumLessThan(Integer value) {
            addCriterion("dynamic_viewnum <", value, "dynamicViewnum");
            return (Criteria) this;
        }

        public Criteria andDynamicViewnumLessThanOrEqualTo(Integer value) {
            addCriterion("dynamic_viewnum <=", value, "dynamicViewnum");
            return (Criteria) this;
        }

        public Criteria andDynamicViewnumIn(List<Integer> values) {
            addCriterion("dynamic_viewnum in", values, "dynamicViewnum");
            return (Criteria) this;
        }

        public Criteria andDynamicViewnumNotIn(List<Integer> values) {
            addCriterion("dynamic_viewnum not in", values, "dynamicViewnum");
            return (Criteria) this;
        }

        public Criteria andDynamicViewnumBetween(Integer value1, Integer value2) {
            addCriterion("dynamic_viewnum between", value1, value2, "dynamicViewnum");
            return (Criteria) this;
        }

        public Criteria andDynamicViewnumNotBetween(Integer value1, Integer value2) {
            addCriterion("dynamic_viewnum not between", value1, value2, "dynamicViewnum");
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