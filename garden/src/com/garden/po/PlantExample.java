package com.garden.po;

import java.util.ArrayList;
import java.util.List;

public class PlantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlantExample() {
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

        public Criteria andPlantIdIsNull() {
            addCriterion("plant_id is null");
            return (Criteria) this;
        }

        public Criteria andPlantIdIsNotNull() {
            addCriterion("plant_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlantIdEqualTo(Integer value) {
            addCriterion("plant_id =", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotEqualTo(Integer value) {
            addCriterion("plant_id <>", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThan(Integer value) {
            addCriterion("plant_id >", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_id >=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThan(Integer value) {
            addCriterion("plant_id <", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThanOrEqualTo(Integer value) {
            addCriterion("plant_id <=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdIn(List<Integer> values) {
            addCriterion("plant_id in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotIn(List<Integer> values) {
            addCriterion("plant_id not in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdBetween(Integer value1, Integer value2) {
            addCriterion("plant_id between", value1, value2, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plant_id not between", value1, value2, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantNameIsNull() {
            addCriterion("plant_name is null");
            return (Criteria) this;
        }

        public Criteria andPlantNameIsNotNull() {
            addCriterion("plant_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlantNameEqualTo(String value) {
            addCriterion("plant_name =", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotEqualTo(String value) {
            addCriterion("plant_name <>", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameGreaterThan(String value) {
            addCriterion("plant_name >", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameGreaterThanOrEqualTo(String value) {
            addCriterion("plant_name >=", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLessThan(String value) {
            addCriterion("plant_name <", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLessThanOrEqualTo(String value) {
            addCriterion("plant_name <=", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameLike(String value) {
            addCriterion("plant_name like", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotLike(String value) {
            addCriterion("plant_name not like", value, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameIn(List<String> values) {
            addCriterion("plant_name in", values, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotIn(List<String> values) {
            addCriterion("plant_name not in", values, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameBetween(String value1, String value2) {
            addCriterion("plant_name between", value1, value2, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantNameNotBetween(String value1, String value2) {
            addCriterion("plant_name not between", value1, value2, "plantName");
            return (Criteria) this;
        }

        public Criteria andPlantMethodIsNull() {
            addCriterion("plant_method is null");
            return (Criteria) this;
        }

        public Criteria andPlantMethodIsNotNull() {
            addCriterion("plant_method is not null");
            return (Criteria) this;
        }

        public Criteria andPlantMethodEqualTo(String value) {
            addCriterion("plant_method =", value, "plantMethod");
            return (Criteria) this;
        }

        public Criteria andPlantMethodNotEqualTo(String value) {
            addCriterion("plant_method <>", value, "plantMethod");
            return (Criteria) this;
        }

        public Criteria andPlantMethodGreaterThan(String value) {
            addCriterion("plant_method >", value, "plantMethod");
            return (Criteria) this;
        }

        public Criteria andPlantMethodGreaterThanOrEqualTo(String value) {
            addCriterion("plant_method >=", value, "plantMethod");
            return (Criteria) this;
        }

        public Criteria andPlantMethodLessThan(String value) {
            addCriterion("plant_method <", value, "plantMethod");
            return (Criteria) this;
        }

        public Criteria andPlantMethodLessThanOrEqualTo(String value) {
            addCriterion("plant_method <=", value, "plantMethod");
            return (Criteria) this;
        }

        public Criteria andPlantMethodLike(String value) {
            addCriterion("plant_method like", value, "plantMethod");
            return (Criteria) this;
        }

        public Criteria andPlantMethodNotLike(String value) {
            addCriterion("plant_method not like", value, "plantMethod");
            return (Criteria) this;
        }

        public Criteria andPlantMethodIn(List<String> values) {
            addCriterion("plant_method in", values, "plantMethod");
            return (Criteria) this;
        }

        public Criteria andPlantMethodNotIn(List<String> values) {
            addCriterion("plant_method not in", values, "plantMethod");
            return (Criteria) this;
        }

        public Criteria andPlantMethodBetween(String value1, String value2) {
            addCriterion("plant_method between", value1, value2, "plantMethod");
            return (Criteria) this;
        }

        public Criteria andPlantMethodNotBetween(String value1, String value2) {
            addCriterion("plant_method not between", value1, value2, "plantMethod");
            return (Criteria) this;
        }

        public Criteria andPlantTimesIsNull() {
            addCriterion("plant_times is null");
            return (Criteria) this;
        }

        public Criteria andPlantTimesIsNotNull() {
            addCriterion("plant_times is not null");
            return (Criteria) this;
        }

        public Criteria andPlantTimesEqualTo(String value) {
            addCriterion("plant_times =", value, "plantTimes");
            return (Criteria) this;
        }

        public Criteria andPlantTimesNotEqualTo(String value) {
            addCriterion("plant_times <>", value, "plantTimes");
            return (Criteria) this;
        }

        public Criteria andPlantTimesGreaterThan(String value) {
            addCriterion("plant_times >", value, "plantTimes");
            return (Criteria) this;
        }

        public Criteria andPlantTimesGreaterThanOrEqualTo(String value) {
            addCriterion("plant_times >=", value, "plantTimes");
            return (Criteria) this;
        }

        public Criteria andPlantTimesLessThan(String value) {
            addCriterion("plant_times <", value, "plantTimes");
            return (Criteria) this;
        }

        public Criteria andPlantTimesLessThanOrEqualTo(String value) {
            addCriterion("plant_times <=", value, "plantTimes");
            return (Criteria) this;
        }

        public Criteria andPlantTimesLike(String value) {
            addCriterion("plant_times like", value, "plantTimes");
            return (Criteria) this;
        }

        public Criteria andPlantTimesNotLike(String value) {
            addCriterion("plant_times not like", value, "plantTimes");
            return (Criteria) this;
        }

        public Criteria andPlantTimesIn(List<String> values) {
            addCriterion("plant_times in", values, "plantTimes");
            return (Criteria) this;
        }

        public Criteria andPlantTimesNotIn(List<String> values) {
            addCriterion("plant_times not in", values, "plantTimes");
            return (Criteria) this;
        }

        public Criteria andPlantTimesBetween(String value1, String value2) {
            addCriterion("plant_times between", value1, value2, "plantTimes");
            return (Criteria) this;
        }

        public Criteria andPlantTimesNotBetween(String value1, String value2) {
            addCriterion("plant_times not between", value1, value2, "plantTimes");
            return (Criteria) this;
        }

        public Criteria andPlantFloweringIsNull() {
            addCriterion("plant_flowering is null");
            return (Criteria) this;
        }

        public Criteria andPlantFloweringIsNotNull() {
            addCriterion("plant_flowering is not null");
            return (Criteria) this;
        }

        public Criteria andPlantFloweringEqualTo(String value) {
            addCriterion("plant_flowering =", value, "plantFlowering");
            return (Criteria) this;
        }

        public Criteria andPlantFloweringNotEqualTo(String value) {
            addCriterion("plant_flowering <>", value, "plantFlowering");
            return (Criteria) this;
        }

        public Criteria andPlantFloweringGreaterThan(String value) {
            addCriterion("plant_flowering >", value, "plantFlowering");
            return (Criteria) this;
        }

        public Criteria andPlantFloweringGreaterThanOrEqualTo(String value) {
            addCriterion("plant_flowering >=", value, "plantFlowering");
            return (Criteria) this;
        }

        public Criteria andPlantFloweringLessThan(String value) {
            addCriterion("plant_flowering <", value, "plantFlowering");
            return (Criteria) this;
        }

        public Criteria andPlantFloweringLessThanOrEqualTo(String value) {
            addCriterion("plant_flowering <=", value, "plantFlowering");
            return (Criteria) this;
        }

        public Criteria andPlantFloweringLike(String value) {
            addCriterion("plant_flowering like", value, "plantFlowering");
            return (Criteria) this;
        }

        public Criteria andPlantFloweringNotLike(String value) {
            addCriterion("plant_flowering not like", value, "plantFlowering");
            return (Criteria) this;
        }

        public Criteria andPlantFloweringIn(List<String> values) {
            addCriterion("plant_flowering in", values, "plantFlowering");
            return (Criteria) this;
        }

        public Criteria andPlantFloweringNotIn(List<String> values) {
            addCriterion("plant_flowering not in", values, "plantFlowering");
            return (Criteria) this;
        }

        public Criteria andPlantFloweringBetween(String value1, String value2) {
            addCriterion("plant_flowering between", value1, value2, "plantFlowering");
            return (Criteria) this;
        }

        public Criteria andPlantFloweringNotBetween(String value1, String value2) {
            addCriterion("plant_flowering not between", value1, value2, "plantFlowering");
            return (Criteria) this;
        }

        public Criteria andPlantOthernameIsNull() {
            addCriterion("plant_othername is null");
            return (Criteria) this;
        }

        public Criteria andPlantOthernameIsNotNull() {
            addCriterion("plant_othername is not null");
            return (Criteria) this;
        }

        public Criteria andPlantOthernameEqualTo(String value) {
            addCriterion("plant_othername =", value, "plantOthername");
            return (Criteria) this;
        }

        public Criteria andPlantOthernameNotEqualTo(String value) {
            addCriterion("plant_othername <>", value, "plantOthername");
            return (Criteria) this;
        }

        public Criteria andPlantOthernameGreaterThan(String value) {
            addCriterion("plant_othername >", value, "plantOthername");
            return (Criteria) this;
        }

        public Criteria andPlantOthernameGreaterThanOrEqualTo(String value) {
            addCriterion("plant_othername >=", value, "plantOthername");
            return (Criteria) this;
        }

        public Criteria andPlantOthernameLessThan(String value) {
            addCriterion("plant_othername <", value, "plantOthername");
            return (Criteria) this;
        }

        public Criteria andPlantOthernameLessThanOrEqualTo(String value) {
            addCriterion("plant_othername <=", value, "plantOthername");
            return (Criteria) this;
        }

        public Criteria andPlantOthernameLike(String value) {
            addCriterion("plant_othername like", value, "plantOthername");
            return (Criteria) this;
        }

        public Criteria andPlantOthernameNotLike(String value) {
            addCriterion("plant_othername not like", value, "plantOthername");
            return (Criteria) this;
        }

        public Criteria andPlantOthernameIn(List<String> values) {
            addCriterion("plant_othername in", values, "plantOthername");
            return (Criteria) this;
        }

        public Criteria andPlantOthernameNotIn(List<String> values) {
            addCriterion("plant_othername not in", values, "plantOthername");
            return (Criteria) this;
        }

        public Criteria andPlantOthernameBetween(String value1, String value2) {
            addCriterion("plant_othername between", value1, value2, "plantOthername");
            return (Criteria) this;
        }

        public Criteria andPlantOthernameNotBetween(String value1, String value2) {
            addCriterion("plant_othername not between", value1, value2, "plantOthername");
            return (Criteria) this;
        }

        public Criteria andPlantImageIsNull() {
            addCriterion("plant_image is null");
            return (Criteria) this;
        }

        public Criteria andPlantImageIsNotNull() {
            addCriterion("plant_image is not null");
            return (Criteria) this;
        }

        public Criteria andPlantImageEqualTo(String value) {
            addCriterion("plant_image =", value, "plantImage");
            return (Criteria) this;
        }

        public Criteria andPlantImageNotEqualTo(String value) {
            addCriterion("plant_image <>", value, "plantImage");
            return (Criteria) this;
        }

        public Criteria andPlantImageGreaterThan(String value) {
            addCriterion("plant_image >", value, "plantImage");
            return (Criteria) this;
        }

        public Criteria andPlantImageGreaterThanOrEqualTo(String value) {
            addCriterion("plant_image >=", value, "plantImage");
            return (Criteria) this;
        }

        public Criteria andPlantImageLessThan(String value) {
            addCriterion("plant_image <", value, "plantImage");
            return (Criteria) this;
        }

        public Criteria andPlantImageLessThanOrEqualTo(String value) {
            addCriterion("plant_image <=", value, "plantImage");
            return (Criteria) this;
        }

        public Criteria andPlantImageLike(String value) {
            addCriterion("plant_image like", value, "plantImage");
            return (Criteria) this;
        }

        public Criteria andPlantImageNotLike(String value) {
            addCriterion("plant_image not like", value, "plantImage");
            return (Criteria) this;
        }

        public Criteria andPlantImageIn(List<String> values) {
            addCriterion("plant_image in", values, "plantImage");
            return (Criteria) this;
        }

        public Criteria andPlantImageNotIn(List<String> values) {
            addCriterion("plant_image not in", values, "plantImage");
            return (Criteria) this;
        }

        public Criteria andPlantImageBetween(String value1, String value2) {
            addCriterion("plant_image between", value1, value2, "plantImage");
            return (Criteria) this;
        }

        public Criteria andPlantImageNotBetween(String value1, String value2) {
            addCriterion("plant_image not between", value1, value2, "plantImage");
            return (Criteria) this;
        }

        public Criteria andPlantDescriptionIsNull() {
            addCriterion("plant_description is null");
            return (Criteria) this;
        }

        public Criteria andPlantDescriptionIsNotNull() {
            addCriterion("plant_description is not null");
            return (Criteria) this;
        }

        public Criteria andPlantDescriptionEqualTo(String value) {
            addCriterion("plant_description =", value, "plantDescription");
            return (Criteria) this;
        }

        public Criteria andPlantDescriptionNotEqualTo(String value) {
            addCriterion("plant_description <>", value, "plantDescription");
            return (Criteria) this;
        }

        public Criteria andPlantDescriptionGreaterThan(String value) {
            addCriterion("plant_description >", value, "plantDescription");
            return (Criteria) this;
        }

        public Criteria andPlantDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("plant_description >=", value, "plantDescription");
            return (Criteria) this;
        }

        public Criteria andPlantDescriptionLessThan(String value) {
            addCriterion("plant_description <", value, "plantDescription");
            return (Criteria) this;
        }

        public Criteria andPlantDescriptionLessThanOrEqualTo(String value) {
            addCriterion("plant_description <=", value, "plantDescription");
            return (Criteria) this;
        }

        public Criteria andPlantDescriptionLike(String value) {
            addCriterion("plant_description like", value, "plantDescription");
            return (Criteria) this;
        }

        public Criteria andPlantDescriptionNotLike(String value) {
            addCriterion("plant_description not like", value, "plantDescription");
            return (Criteria) this;
        }

        public Criteria andPlantDescriptionIn(List<String> values) {
            addCriterion("plant_description in", values, "plantDescription");
            return (Criteria) this;
        }

        public Criteria andPlantDescriptionNotIn(List<String> values) {
            addCriterion("plant_description not in", values, "plantDescription");
            return (Criteria) this;
        }

        public Criteria andPlantDescriptionBetween(String value1, String value2) {
            addCriterion("plant_description between", value1, value2, "plantDescription");
            return (Criteria) this;
        }

        public Criteria andPlantDescriptionNotBetween(String value1, String value2) {
            addCriterion("plant_description not between", value1, value2, "plantDescription");
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