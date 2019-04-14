package com.garden.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TechniqueExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TechniqueExample() {
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

        public Criteria andTechIdIsNull() {
            addCriterion("tech_id is null");
            return (Criteria) this;
        }

        public Criteria andTechIdIsNotNull() {
            addCriterion("tech_id is not null");
            return (Criteria) this;
        }

        public Criteria andTechIdEqualTo(Integer value) {
            addCriterion("tech_id =", value, "techId");
            return (Criteria) this;
        }

        public Criteria andTechIdNotEqualTo(Integer value) {
            addCriterion("tech_id <>", value, "techId");
            return (Criteria) this;
        }

        public Criteria andTechIdGreaterThan(Integer value) {
            addCriterion("tech_id >", value, "techId");
            return (Criteria) this;
        }

        public Criteria andTechIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tech_id >=", value, "techId");
            return (Criteria) this;
        }

        public Criteria andTechIdLessThan(Integer value) {
            addCriterion("tech_id <", value, "techId");
            return (Criteria) this;
        }

        public Criteria andTechIdLessThanOrEqualTo(Integer value) {
            addCriterion("tech_id <=", value, "techId");
            return (Criteria) this;
        }

        public Criteria andTechIdIn(List<Integer> values) {
            addCriterion("tech_id in", values, "techId");
            return (Criteria) this;
        }

        public Criteria andTechIdNotIn(List<Integer> values) {
            addCriterion("tech_id not in", values, "techId");
            return (Criteria) this;
        }

        public Criteria andTechIdBetween(Integer value1, Integer value2) {
            addCriterion("tech_id between", value1, value2, "techId");
            return (Criteria) this;
        }

        public Criteria andTechIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tech_id not between", value1, value2, "techId");
            return (Criteria) this;
        }

        public Criteria andTechNameIsNull() {
            addCriterion("tech_name is null");
            return (Criteria) this;
        }

        public Criteria andTechNameIsNotNull() {
            addCriterion("tech_name is not null");
            return (Criteria) this;
        }

        public Criteria andTechNameEqualTo(String value) {
            addCriterion("tech_name =", value, "techName");
            return (Criteria) this;
        }

        public Criteria andTechNameNotEqualTo(String value) {
            addCriterion("tech_name <>", value, "techName");
            return (Criteria) this;
        }

        public Criteria andTechNameGreaterThan(String value) {
            addCriterion("tech_name >", value, "techName");
            return (Criteria) this;
        }

        public Criteria andTechNameGreaterThanOrEqualTo(String value) {
            addCriterion("tech_name >=", value, "techName");
            return (Criteria) this;
        }

        public Criteria andTechNameLessThan(String value) {
            addCriterion("tech_name <", value, "techName");
            return (Criteria) this;
        }

        public Criteria andTechNameLessThanOrEqualTo(String value) {
            addCriterion("tech_name <=", value, "techName");
            return (Criteria) this;
        }

        public Criteria andTechNameLike(String value) {
            addCriterion("tech_name like", value, "techName");
            return (Criteria) this;
        }

        public Criteria andTechNameNotLike(String value) {
            addCriterion("tech_name not like", value, "techName");
            return (Criteria) this;
        }

        public Criteria andTechNameIn(List<String> values) {
            addCriterion("tech_name in", values, "techName");
            return (Criteria) this;
        }

        public Criteria andTechNameNotIn(List<String> values) {
            addCriterion("tech_name not in", values, "techName");
            return (Criteria) this;
        }

        public Criteria andTechNameBetween(String value1, String value2) {
            addCriterion("tech_name between", value1, value2, "techName");
            return (Criteria) this;
        }

        public Criteria andTechNameNotBetween(String value1, String value2) {
            addCriterion("tech_name not between", value1, value2, "techName");
            return (Criteria) this;
        }

        public Criteria andTechTypeIsNull() {
            addCriterion("tech_type is null");
            return (Criteria) this;
        }

        public Criteria andTechTypeIsNotNull() {
            addCriterion("tech_type is not null");
            return (Criteria) this;
        }

        public Criteria andTechTypeEqualTo(String value) {
            addCriterion("tech_type =", value, "techType");
            return (Criteria) this;
        }

        public Criteria andTechTypeNotEqualTo(String value) {
            addCriterion("tech_type <>", value, "techType");
            return (Criteria) this;
        }

        public Criteria andTechTypeGreaterThan(String value) {
            addCriterion("tech_type >", value, "techType");
            return (Criteria) this;
        }

        public Criteria andTechTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tech_type >=", value, "techType");
            return (Criteria) this;
        }

        public Criteria andTechTypeLessThan(String value) {
            addCriterion("tech_type <", value, "techType");
            return (Criteria) this;
        }

        public Criteria andTechTypeLessThanOrEqualTo(String value) {
            addCriterion("tech_type <=", value, "techType");
            return (Criteria) this;
        }

        public Criteria andTechTypeLike(String value) {
            addCriterion("tech_type like", value, "techType");
            return (Criteria) this;
        }

        public Criteria andTechTypeNotLike(String value) {
            addCriterion("tech_type not like", value, "techType");
            return (Criteria) this;
        }

        public Criteria andTechTypeIn(List<String> values) {
            addCriterion("tech_type in", values, "techType");
            return (Criteria) this;
        }

        public Criteria andTechTypeNotIn(List<String> values) {
            addCriterion("tech_type not in", values, "techType");
            return (Criteria) this;
        }

        public Criteria andTechTypeBetween(String value1, String value2) {
            addCriterion("tech_type between", value1, value2, "techType");
            return (Criteria) this;
        }

        public Criteria andTechTypeNotBetween(String value1, String value2) {
            addCriterion("tech_type not between", value1, value2, "techType");
            return (Criteria) this;
        }

        public Criteria andTechDescriptionIsNull() {
            addCriterion("tech_description is null");
            return (Criteria) this;
        }

        public Criteria andTechDescriptionIsNotNull() {
            addCriterion("tech_description is not null");
            return (Criteria) this;
        }

        public Criteria andTechDescriptionEqualTo(String value) {
            addCriterion("tech_description =", value, "techDescription");
            return (Criteria) this;
        }

        public Criteria andTechDescriptionNotEqualTo(String value) {
            addCriterion("tech_description <>", value, "techDescription");
            return (Criteria) this;
        }

        public Criteria andTechDescriptionGreaterThan(String value) {
            addCriterion("tech_description >", value, "techDescription");
            return (Criteria) this;
        }

        public Criteria andTechDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("tech_description >=", value, "techDescription");
            return (Criteria) this;
        }

        public Criteria andTechDescriptionLessThan(String value) {
            addCriterion("tech_description <", value, "techDescription");
            return (Criteria) this;
        }

        public Criteria andTechDescriptionLessThanOrEqualTo(String value) {
            addCriterion("tech_description <=", value, "techDescription");
            return (Criteria) this;
        }

        public Criteria andTechDescriptionLike(String value) {
            addCriterion("tech_description like", value, "techDescription");
            return (Criteria) this;
        }

        public Criteria andTechDescriptionNotLike(String value) {
            addCriterion("tech_description not like", value, "techDescription");
            return (Criteria) this;
        }

        public Criteria andTechDescriptionIn(List<String> values) {
            addCriterion("tech_description in", values, "techDescription");
            return (Criteria) this;
        }

        public Criteria andTechDescriptionNotIn(List<String> values) {
            addCriterion("tech_description not in", values, "techDescription");
            return (Criteria) this;
        }

        public Criteria andTechDescriptionBetween(String value1, String value2) {
            addCriterion("tech_description between", value1, value2, "techDescription");
            return (Criteria) this;
        }

        public Criteria andTechDescriptionNotBetween(String value1, String value2) {
            addCriterion("tech_description not between", value1, value2, "techDescription");
            return (Criteria) this;
        }

        public Criteria andTechImageIsNull() {
            addCriterion("tech_image is null");
            return (Criteria) this;
        }

        public Criteria andTechImageIsNotNull() {
            addCriterion("tech_image is not null");
            return (Criteria) this;
        }

        public Criteria andTechImageEqualTo(String value) {
            addCriterion("tech_image =", value, "techImage");
            return (Criteria) this;
        }

        public Criteria andTechImageNotEqualTo(String value) {
            addCriterion("tech_image <>", value, "techImage");
            return (Criteria) this;
        }

        public Criteria andTechImageGreaterThan(String value) {
            addCriterion("tech_image >", value, "techImage");
            return (Criteria) this;
        }

        public Criteria andTechImageGreaterThanOrEqualTo(String value) {
            addCriterion("tech_image >=", value, "techImage");
            return (Criteria) this;
        }

        public Criteria andTechImageLessThan(String value) {
            addCriterion("tech_image <", value, "techImage");
            return (Criteria) this;
        }

        public Criteria andTechImageLessThanOrEqualTo(String value) {
            addCriterion("tech_image <=", value, "techImage");
            return (Criteria) this;
        }

        public Criteria andTechImageLike(String value) {
            addCriterion("tech_image like", value, "techImage");
            return (Criteria) this;
        }

        public Criteria andTechImageNotLike(String value) {
            addCriterion("tech_image not like", value, "techImage");
            return (Criteria) this;
        }

        public Criteria andTechImageIn(List<String> values) {
            addCriterion("tech_image in", values, "techImage");
            return (Criteria) this;
        }

        public Criteria andTechImageNotIn(List<String> values) {
            addCriterion("tech_image not in", values, "techImage");
            return (Criteria) this;
        }

        public Criteria andTechImageBetween(String value1, String value2) {
            addCriterion("tech_image between", value1, value2, "techImage");
            return (Criteria) this;
        }

        public Criteria andTechImageNotBetween(String value1, String value2) {
            addCriterion("tech_image not between", value1, value2, "techImage");
            return (Criteria) this;
        }

        public Criteria andTechPointnumIsNull() {
            addCriterion("tech_pointnum is null");
            return (Criteria) this;
        }

        public Criteria andTechPointnumIsNotNull() {
            addCriterion("tech_pointnum is not null");
            return (Criteria) this;
        }

        public Criteria andTechPointnumEqualTo(Integer value) {
            addCriterion("tech_pointnum =", value, "techPointnum");
            return (Criteria) this;
        }

        public Criteria andTechPointnumNotEqualTo(Integer value) {
            addCriterion("tech_pointnum <>", value, "techPointnum");
            return (Criteria) this;
        }

        public Criteria andTechPointnumGreaterThan(Integer value) {
            addCriterion("tech_pointnum >", value, "techPointnum");
            return (Criteria) this;
        }

        public Criteria andTechPointnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tech_pointnum >=", value, "techPointnum");
            return (Criteria) this;
        }

        public Criteria andTechPointnumLessThan(Integer value) {
            addCriterion("tech_pointnum <", value, "techPointnum");
            return (Criteria) this;
        }

        public Criteria andTechPointnumLessThanOrEqualTo(Integer value) {
            addCriterion("tech_pointnum <=", value, "techPointnum");
            return (Criteria) this;
        }

        public Criteria andTechPointnumIn(List<Integer> values) {
            addCriterion("tech_pointnum in", values, "techPointnum");
            return (Criteria) this;
        }

        public Criteria andTechPointnumNotIn(List<Integer> values) {
            addCriterion("tech_pointnum not in", values, "techPointnum");
            return (Criteria) this;
        }

        public Criteria andTechPointnumBetween(Integer value1, Integer value2) {
            addCriterion("tech_pointnum between", value1, value2, "techPointnum");
            return (Criteria) this;
        }

        public Criteria andTechPointnumNotBetween(Integer value1, Integer value2) {
            addCriterion("tech_pointnum not between", value1, value2, "techPointnum");
            return (Criteria) this;
        }

        public Criteria andTechDateIsNull() {
            addCriterion("tech_date is null");
            return (Criteria) this;
        }

        public Criteria andTechDateIsNotNull() {
            addCriterion("tech_date is not null");
            return (Criteria) this;
        }

        public Criteria andTechDateEqualTo(Date value) {
            addCriterion("tech_date =", value, "techDate");
            return (Criteria) this;
        }

        public Criteria andTechDateNotEqualTo(Date value) {
            addCriterion("tech_date <>", value, "techDate");
            return (Criteria) this;
        }

        public Criteria andTechDateGreaterThan(Date value) {
            addCriterion("tech_date >", value, "techDate");
            return (Criteria) this;
        }

        public Criteria andTechDateGreaterThanOrEqualTo(Date value) {
            addCriterion("tech_date >=", value, "techDate");
            return (Criteria) this;
        }

        public Criteria andTechDateLessThan(Date value) {
            addCriterion("tech_date <", value, "techDate");
            return (Criteria) this;
        }

        public Criteria andTechDateLessThanOrEqualTo(Date value) {
            addCriterion("tech_date <=", value, "techDate");
            return (Criteria) this;
        }

        public Criteria andTechDateIn(List<Date> values) {
            addCriterion("tech_date in", values, "techDate");
            return (Criteria) this;
        }

        public Criteria andTechDateNotIn(List<Date> values) {
            addCriterion("tech_date not in", values, "techDate");
            return (Criteria) this;
        }

        public Criteria andTechDateBetween(Date value1, Date value2) {
            addCriterion("tech_date between", value1, value2, "techDate");
            return (Criteria) this;
        }

        public Criteria andTechDateNotBetween(Date value1, Date value2) {
            addCriterion("tech_date not between", value1, value2, "techDate");
            return (Criteria) this;
        }

        public Criteria andTechViewnumIsNull() {
            addCriterion("tech_viewnum is null");
            return (Criteria) this;
        }

        public Criteria andTechViewnumIsNotNull() {
            addCriterion("tech_viewnum is not null");
            return (Criteria) this;
        }

        public Criteria andTechViewnumEqualTo(Integer value) {
            addCriterion("tech_viewnum =", value, "techViewnum");
            return (Criteria) this;
        }

        public Criteria andTechViewnumNotEqualTo(Integer value) {
            addCriterion("tech_viewnum <>", value, "techViewnum");
            return (Criteria) this;
        }

        public Criteria andTechViewnumGreaterThan(Integer value) {
            addCriterion("tech_viewnum >", value, "techViewnum");
            return (Criteria) this;
        }

        public Criteria andTechViewnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tech_viewnum >=", value, "techViewnum");
            return (Criteria) this;
        }

        public Criteria andTechViewnumLessThan(Integer value) {
            addCriterion("tech_viewnum <", value, "techViewnum");
            return (Criteria) this;
        }

        public Criteria andTechViewnumLessThanOrEqualTo(Integer value) {
            addCriterion("tech_viewnum <=", value, "techViewnum");
            return (Criteria) this;
        }

        public Criteria andTechViewnumIn(List<Integer> values) {
            addCriterion("tech_viewnum in", values, "techViewnum");
            return (Criteria) this;
        }

        public Criteria andTechViewnumNotIn(List<Integer> values) {
            addCriterion("tech_viewnum not in", values, "techViewnum");
            return (Criteria) this;
        }

        public Criteria andTechViewnumBetween(Integer value1, Integer value2) {
            addCriterion("tech_viewnum between", value1, value2, "techViewnum");
            return (Criteria) this;
        }

        public Criteria andTechViewnumNotBetween(Integer value1, Integer value2) {
            addCriterion("tech_viewnum not between", value1, value2, "techViewnum");
            return (Criteria) this;
        }

        public Criteria andTechUseridIsNull() {
            addCriterion("tech_userid is null");
            return (Criteria) this;
        }

        public Criteria andTechUseridIsNotNull() {
            addCriterion("tech_userid is not null");
            return (Criteria) this;
        }

        public Criteria andTechUseridEqualTo(String value) {
            addCriterion("tech_userid =", value, "techUserid");
            return (Criteria) this;
        }

        public Criteria andTechUseridNotEqualTo(String value) {
            addCriterion("tech_userid <>", value, "techUserid");
            return (Criteria) this;
        }

        public Criteria andTechUseridGreaterThan(String value) {
            addCriterion("tech_userid >", value, "techUserid");
            return (Criteria) this;
        }

        public Criteria andTechUseridGreaterThanOrEqualTo(String value) {
            addCriterion("tech_userid >=", value, "techUserid");
            return (Criteria) this;
        }

        public Criteria andTechUseridLessThan(String value) {
            addCriterion("tech_userid <", value, "techUserid");
            return (Criteria) this;
        }

        public Criteria andTechUseridLessThanOrEqualTo(String value) {
            addCriterion("tech_userid <=", value, "techUserid");
            return (Criteria) this;
        }

        public Criteria andTechUseridLike(String value) {
            addCriterion("tech_userid like", value, "techUserid");
            return (Criteria) this;
        }

        public Criteria andTechUseridNotLike(String value) {
            addCriterion("tech_userid not like", value, "techUserid");
            return (Criteria) this;
        }

        public Criteria andTechUseridIn(List<String> values) {
            addCriterion("tech_userid in", values, "techUserid");
            return (Criteria) this;
        }

        public Criteria andTechUseridNotIn(List<String> values) {
            addCriterion("tech_userid not in", values, "techUserid");
            return (Criteria) this;
        }

        public Criteria andTechUseridBetween(String value1, String value2) {
            addCriterion("tech_userid between", value1, value2, "techUserid");
            return (Criteria) this;
        }

        public Criteria andTechUseridNotBetween(String value1, String value2) {
            addCriterion("tech_userid not between", value1, value2, "techUserid");
            return (Criteria) this;
        }

        public Criteria andTechTypetopIsNull() {
            addCriterion("tech_typetop is null");
            return (Criteria) this;
        }

        public Criteria andTechTypetopIsNotNull() {
            addCriterion("tech_typetop is not null");
            return (Criteria) this;
        }

        public Criteria andTechTypetopEqualTo(String value) {
            addCriterion("tech_typetop =", value, "techTypetop");
            return (Criteria) this;
        }

        public Criteria andTechTypetopNotEqualTo(String value) {
            addCriterion("tech_typetop <>", value, "techTypetop");
            return (Criteria) this;
        }

        public Criteria andTechTypetopGreaterThan(String value) {
            addCriterion("tech_typetop >", value, "techTypetop");
            return (Criteria) this;
        }

        public Criteria andTechTypetopGreaterThanOrEqualTo(String value) {
            addCriterion("tech_typetop >=", value, "techTypetop");
            return (Criteria) this;
        }

        public Criteria andTechTypetopLessThan(String value) {
            addCriterion("tech_typetop <", value, "techTypetop");
            return (Criteria) this;
        }

        public Criteria andTechTypetopLessThanOrEqualTo(String value) {
            addCriterion("tech_typetop <=", value, "techTypetop");
            return (Criteria) this;
        }

        public Criteria andTechTypetopLike(String value) {
            addCriterion("tech_typetop like", value, "techTypetop");
            return (Criteria) this;
        }

        public Criteria andTechTypetopNotLike(String value) {
            addCriterion("tech_typetop not like", value, "techTypetop");
            return (Criteria) this;
        }

        public Criteria andTechTypetopIn(List<String> values) {
            addCriterion("tech_typetop in", values, "techTypetop");
            return (Criteria) this;
        }

        public Criteria andTechTypetopNotIn(List<String> values) {
            addCriterion("tech_typetop not in", values, "techTypetop");
            return (Criteria) this;
        }

        public Criteria andTechTypetopBetween(String value1, String value2) {
            addCriterion("tech_typetop between", value1, value2, "techTypetop");
            return (Criteria) this;
        }

        public Criteria andTechTypetopNotBetween(String value1, String value2) {
            addCriterion("tech_typetop not between", value1, value2, "techTypetop");
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