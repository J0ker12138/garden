package com.garden.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiarylogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiarylogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("log_id =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("log_id >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("log_id <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("log_id in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogDiaryidIsNull() {
            addCriterion("log_diaryid is null");
            return (Criteria) this;
        }

        public Criteria andLogDiaryidIsNotNull() {
            addCriterion("log_diaryid is not null");
            return (Criteria) this;
        }

        public Criteria andLogDiaryidEqualTo(Integer value) {
            addCriterion("log_diaryid =", value, "logDiaryid");
            return (Criteria) this;
        }

        public Criteria andLogDiaryidNotEqualTo(Integer value) {
            addCriterion("log_diaryid <>", value, "logDiaryid");
            return (Criteria) this;
        }

        public Criteria andLogDiaryidGreaterThan(Integer value) {
            addCriterion("log_diaryid >", value, "logDiaryid");
            return (Criteria) this;
        }

        public Criteria andLogDiaryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_diaryid >=", value, "logDiaryid");
            return (Criteria) this;
        }

        public Criteria andLogDiaryidLessThan(Integer value) {
            addCriterion("log_diaryid <", value, "logDiaryid");
            return (Criteria) this;
        }

        public Criteria andLogDiaryidLessThanOrEqualTo(Integer value) {
            addCriterion("log_diaryid <=", value, "logDiaryid");
            return (Criteria) this;
        }

        public Criteria andLogDiaryidIn(List<Integer> values) {
            addCriterion("log_diaryid in", values, "logDiaryid");
            return (Criteria) this;
        }

        public Criteria andLogDiaryidNotIn(List<Integer> values) {
            addCriterion("log_diaryid not in", values, "logDiaryid");
            return (Criteria) this;
        }

        public Criteria andLogDiaryidBetween(Integer value1, Integer value2) {
            addCriterion("log_diaryid between", value1, value2, "logDiaryid");
            return (Criteria) this;
        }

        public Criteria andLogDiaryidNotBetween(Integer value1, Integer value2) {
            addCriterion("log_diaryid not between", value1, value2, "logDiaryid");
            return (Criteria) this;
        }

        public Criteria andLogPointnumIsNull() {
            addCriterion("log_pointnum is null");
            return (Criteria) this;
        }

        public Criteria andLogPointnumIsNotNull() {
            addCriterion("log_pointnum is not null");
            return (Criteria) this;
        }

        public Criteria andLogPointnumEqualTo(Integer value) {
            addCriterion("log_pointnum =", value, "logPointnum");
            return (Criteria) this;
        }

        public Criteria andLogPointnumNotEqualTo(Integer value) {
            addCriterion("log_pointnum <>", value, "logPointnum");
            return (Criteria) this;
        }

        public Criteria andLogPointnumGreaterThan(Integer value) {
            addCriterion("log_pointnum >", value, "logPointnum");
            return (Criteria) this;
        }

        public Criteria andLogPointnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_pointnum >=", value, "logPointnum");
            return (Criteria) this;
        }

        public Criteria andLogPointnumLessThan(Integer value) {
            addCriterion("log_pointnum <", value, "logPointnum");
            return (Criteria) this;
        }

        public Criteria andLogPointnumLessThanOrEqualTo(Integer value) {
            addCriterion("log_pointnum <=", value, "logPointnum");
            return (Criteria) this;
        }

        public Criteria andLogPointnumIn(List<Integer> values) {
            addCriterion("log_pointnum in", values, "logPointnum");
            return (Criteria) this;
        }

        public Criteria andLogPointnumNotIn(List<Integer> values) {
            addCriterion("log_pointnum not in", values, "logPointnum");
            return (Criteria) this;
        }

        public Criteria andLogPointnumBetween(Integer value1, Integer value2) {
            addCriterion("log_pointnum between", value1, value2, "logPointnum");
            return (Criteria) this;
        }

        public Criteria andLogPointnumNotBetween(Integer value1, Integer value2) {
            addCriterion("log_pointnum not between", value1, value2, "logPointnum");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNull() {
            addCriterion("log_date is null");
            return (Criteria) this;
        }

        public Criteria andLogDateIsNotNull() {
            addCriterion("log_date is not null");
            return (Criteria) this;
        }

        public Criteria andLogDateEqualTo(Date value) {
            addCriterion("log_date =", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotEqualTo(Date value) {
            addCriterion("log_date <>", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThan(Date value) {
            addCriterion("log_date >", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateGreaterThanOrEqualTo(Date value) {
            addCriterion("log_date >=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThan(Date value) {
            addCriterion("log_date <", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateLessThanOrEqualTo(Date value) {
            addCriterion("log_date <=", value, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateIn(List<Date> values) {
            addCriterion("log_date in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotIn(List<Date> values) {
            addCriterion("log_date not in", values, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateBetween(Date value1, Date value2) {
            addCriterion("log_date between", value1, value2, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogDateNotBetween(Date value1, Date value2) {
            addCriterion("log_date not between", value1, value2, "logDate");
            return (Criteria) this;
        }

        public Criteria andLogImageIsNull() {
            addCriterion("log_image is null");
            return (Criteria) this;
        }

        public Criteria andLogImageIsNotNull() {
            addCriterion("log_image is not null");
            return (Criteria) this;
        }

        public Criteria andLogImageEqualTo(String value) {
            addCriterion("log_image =", value, "logImage");
            return (Criteria) this;
        }

        public Criteria andLogImageNotEqualTo(String value) {
            addCriterion("log_image <>", value, "logImage");
            return (Criteria) this;
        }

        public Criteria andLogImageGreaterThan(String value) {
            addCriterion("log_image >", value, "logImage");
            return (Criteria) this;
        }

        public Criteria andLogImageGreaterThanOrEqualTo(String value) {
            addCriterion("log_image >=", value, "logImage");
            return (Criteria) this;
        }

        public Criteria andLogImageLessThan(String value) {
            addCriterion("log_image <", value, "logImage");
            return (Criteria) this;
        }

        public Criteria andLogImageLessThanOrEqualTo(String value) {
            addCriterion("log_image <=", value, "logImage");
            return (Criteria) this;
        }

        public Criteria andLogImageLike(String value) {
            addCriterion("log_image like", value, "logImage");
            return (Criteria) this;
        }

        public Criteria andLogImageNotLike(String value) {
            addCriterion("log_image not like", value, "logImage");
            return (Criteria) this;
        }

        public Criteria andLogImageIn(List<String> values) {
            addCriterion("log_image in", values, "logImage");
            return (Criteria) this;
        }

        public Criteria andLogImageNotIn(List<String> values) {
            addCriterion("log_image not in", values, "logImage");
            return (Criteria) this;
        }

        public Criteria andLogImageBetween(String value1, String value2) {
            addCriterion("log_image between", value1, value2, "logImage");
            return (Criteria) this;
        }

        public Criteria andLogImageNotBetween(String value1, String value2) {
            addCriterion("log_image not between", value1, value2, "logImage");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionIsNull() {
            addCriterion("log_description is null");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionIsNotNull() {
            addCriterion("log_description is not null");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionEqualTo(String value) {
            addCriterion("log_description =", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionNotEqualTo(String value) {
            addCriterion("log_description <>", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionGreaterThan(String value) {
            addCriterion("log_description >", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("log_description >=", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionLessThan(String value) {
            addCriterion("log_description <", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionLessThanOrEqualTo(String value) {
            addCriterion("log_description <=", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionLike(String value) {
            addCriterion("log_description like", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionNotLike(String value) {
            addCriterion("log_description not like", value, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionIn(List<String> values) {
            addCriterion("log_description in", values, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionNotIn(List<String> values) {
            addCriterion("log_description not in", values, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionBetween(String value1, String value2) {
            addCriterion("log_description between", value1, value2, "logDescription");
            return (Criteria) this;
        }

        public Criteria andLogDescriptionNotBetween(String value1, String value2) {
            addCriterion("log_description not between", value1, value2, "logDescription");
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