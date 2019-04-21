package com.garden.po;

import java.util.ArrayList;
import java.util.List;

public class DiaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiaryExample() {
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

        public Criteria andDiaryIdIsNull() {
            addCriterion("diary_id is null");
            return (Criteria) this;
        }

        public Criteria andDiaryIdIsNotNull() {
            addCriterion("diary_id is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryIdEqualTo(Integer value) {
            addCriterion("diary_id =", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdNotEqualTo(Integer value) {
            addCriterion("diary_id <>", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdGreaterThan(Integer value) {
            addCriterion("diary_id >", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("diary_id >=", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdLessThan(Integer value) {
            addCriterion("diary_id <", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("diary_id <=", value, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdIn(List<Integer> values) {
            addCriterion("diary_id in", values, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdNotIn(List<Integer> values) {
            addCriterion("diary_id not in", values, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdBetween(Integer value1, Integer value2) {
            addCriterion("diary_id between", value1, value2, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("diary_id not between", value1, value2, "diaryId");
            return (Criteria) this;
        }

        public Criteria andDiaryUseridIsNull() {
            addCriterion("diary_userid is null");
            return (Criteria) this;
        }

        public Criteria andDiaryUseridIsNotNull() {
            addCriterion("diary_userid is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryUseridEqualTo(String value) {
            addCriterion("diary_userid =", value, "diaryUserid");
            return (Criteria) this;
        }

        public Criteria andDiaryUseridNotEqualTo(String value) {
            addCriterion("diary_userid <>", value, "diaryUserid");
            return (Criteria) this;
        }

        public Criteria andDiaryUseridGreaterThan(String value) {
            addCriterion("diary_userid >", value, "diaryUserid");
            return (Criteria) this;
        }

        public Criteria andDiaryUseridGreaterThanOrEqualTo(String value) {
            addCriterion("diary_userid >=", value, "diaryUserid");
            return (Criteria) this;
        }

        public Criteria andDiaryUseridLessThan(String value) {
            addCriterion("diary_userid <", value, "diaryUserid");
            return (Criteria) this;
        }

        public Criteria andDiaryUseridLessThanOrEqualTo(String value) {
            addCriterion("diary_userid <=", value, "diaryUserid");
            return (Criteria) this;
        }

        public Criteria andDiaryUseridLike(String value) {
            addCriterion("diary_userid like", value, "diaryUserid");
            return (Criteria) this;
        }

        public Criteria andDiaryUseridNotLike(String value) {
            addCriterion("diary_userid not like", value, "diaryUserid");
            return (Criteria) this;
        }

        public Criteria andDiaryUseridIn(List<String> values) {
            addCriterion("diary_userid in", values, "diaryUserid");
            return (Criteria) this;
        }

        public Criteria andDiaryUseridNotIn(List<String> values) {
            addCriterion("diary_userid not in", values, "diaryUserid");
            return (Criteria) this;
        }

        public Criteria andDiaryUseridBetween(String value1, String value2) {
            addCriterion("diary_userid between", value1, value2, "diaryUserid");
            return (Criteria) this;
        }

        public Criteria andDiaryUseridNotBetween(String value1, String value2) {
            addCriterion("diary_userid not between", value1, value2, "diaryUserid");
            return (Criteria) this;
        }

        public Criteria andDiaryPlantnameIsNull() {
            addCriterion("diary_plantname is null");
            return (Criteria) this;
        }

        public Criteria andDiaryPlantnameIsNotNull() {
            addCriterion("diary_plantname is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryPlantnameEqualTo(String value) {
            addCriterion("diary_plantname =", value, "diaryPlantname");
            return (Criteria) this;
        }

        public Criteria andDiaryPlantnameNotEqualTo(String value) {
            addCriterion("diary_plantname <>", value, "diaryPlantname");
            return (Criteria) this;
        }

        public Criteria andDiaryPlantnameGreaterThan(String value) {
            addCriterion("diary_plantname >", value, "diaryPlantname");
            return (Criteria) this;
        }

        public Criteria andDiaryPlantnameGreaterThanOrEqualTo(String value) {
            addCriterion("diary_plantname >=", value, "diaryPlantname");
            return (Criteria) this;
        }

        public Criteria andDiaryPlantnameLessThan(String value) {
            addCriterion("diary_plantname <", value, "diaryPlantname");
            return (Criteria) this;
        }

        public Criteria andDiaryPlantnameLessThanOrEqualTo(String value) {
            addCriterion("diary_plantname <=", value, "diaryPlantname");
            return (Criteria) this;
        }

        public Criteria andDiaryPlantnameLike(String value) {
            addCriterion("diary_plantname like", value, "diaryPlantname");
            return (Criteria) this;
        }

        public Criteria andDiaryPlantnameNotLike(String value) {
            addCriterion("diary_plantname not like", value, "diaryPlantname");
            return (Criteria) this;
        }

        public Criteria andDiaryPlantnameIn(List<String> values) {
            addCriterion("diary_plantname in", values, "diaryPlantname");
            return (Criteria) this;
        }

        public Criteria andDiaryPlantnameNotIn(List<String> values) {
            addCriterion("diary_plantname not in", values, "diaryPlantname");
            return (Criteria) this;
        }

        public Criteria andDiaryPlantnameBetween(String value1, String value2) {
            addCriterion("diary_plantname between", value1, value2, "diaryPlantname");
            return (Criteria) this;
        }

        public Criteria andDiaryPlantnameNotBetween(String value1, String value2) {
            addCriterion("diary_plantname not between", value1, value2, "diaryPlantname");
            return (Criteria) this;
        }

        public Criteria andDiarySpaceIsNull() {
            addCriterion("diary_space is null");
            return (Criteria) this;
        }

        public Criteria andDiarySpaceIsNotNull() {
            addCriterion("diary_space is not null");
            return (Criteria) this;
        }

        public Criteria andDiarySpaceEqualTo(String value) {
            addCriterion("diary_space =", value, "diarySpace");
            return (Criteria) this;
        }

        public Criteria andDiarySpaceNotEqualTo(String value) {
            addCriterion("diary_space <>", value, "diarySpace");
            return (Criteria) this;
        }

        public Criteria andDiarySpaceGreaterThan(String value) {
            addCriterion("diary_space >", value, "diarySpace");
            return (Criteria) this;
        }

        public Criteria andDiarySpaceGreaterThanOrEqualTo(String value) {
            addCriterion("diary_space >=", value, "diarySpace");
            return (Criteria) this;
        }

        public Criteria andDiarySpaceLessThan(String value) {
            addCriterion("diary_space <", value, "diarySpace");
            return (Criteria) this;
        }

        public Criteria andDiarySpaceLessThanOrEqualTo(String value) {
            addCriterion("diary_space <=", value, "diarySpace");
            return (Criteria) this;
        }

        public Criteria andDiarySpaceLike(String value) {
            addCriterion("diary_space like", value, "diarySpace");
            return (Criteria) this;
        }

        public Criteria andDiarySpaceNotLike(String value) {
            addCriterion("diary_space not like", value, "diarySpace");
            return (Criteria) this;
        }

        public Criteria andDiarySpaceIn(List<String> values) {
            addCriterion("diary_space in", values, "diarySpace");
            return (Criteria) this;
        }

        public Criteria andDiarySpaceNotIn(List<String> values) {
            addCriterion("diary_space not in", values, "diarySpace");
            return (Criteria) this;
        }

        public Criteria andDiarySpaceBetween(String value1, String value2) {
            addCriterion("diary_space between", value1, value2, "diarySpace");
            return (Criteria) this;
        }

        public Criteria andDiarySpaceNotBetween(String value1, String value2) {
            addCriterion("diary_space not between", value1, value2, "diarySpace");
            return (Criteria) this;
        }

        public Criteria andDiaryMethodIsNull() {
            addCriterion("diary_method is null");
            return (Criteria) this;
        }

        public Criteria andDiaryMethodIsNotNull() {
            addCriterion("diary_method is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryMethodEqualTo(String value) {
            addCriterion("diary_method =", value, "diaryMethod");
            return (Criteria) this;
        }

        public Criteria andDiaryMethodNotEqualTo(String value) {
            addCriterion("diary_method <>", value, "diaryMethod");
            return (Criteria) this;
        }

        public Criteria andDiaryMethodGreaterThan(String value) {
            addCriterion("diary_method >", value, "diaryMethod");
            return (Criteria) this;
        }

        public Criteria andDiaryMethodGreaterThanOrEqualTo(String value) {
            addCriterion("diary_method >=", value, "diaryMethod");
            return (Criteria) this;
        }

        public Criteria andDiaryMethodLessThan(String value) {
            addCriterion("diary_method <", value, "diaryMethod");
            return (Criteria) this;
        }

        public Criteria andDiaryMethodLessThanOrEqualTo(String value) {
            addCriterion("diary_method <=", value, "diaryMethod");
            return (Criteria) this;
        }

        public Criteria andDiaryMethodLike(String value) {
            addCriterion("diary_method like", value, "diaryMethod");
            return (Criteria) this;
        }

        public Criteria andDiaryMethodNotLike(String value) {
            addCriterion("diary_method not like", value, "diaryMethod");
            return (Criteria) this;
        }

        public Criteria andDiaryMethodIn(List<String> values) {
            addCriterion("diary_method in", values, "diaryMethod");
            return (Criteria) this;
        }

        public Criteria andDiaryMethodNotIn(List<String> values) {
            addCriterion("diary_method not in", values, "diaryMethod");
            return (Criteria) this;
        }

        public Criteria andDiaryMethodBetween(String value1, String value2) {
            addCriterion("diary_method between", value1, value2, "diaryMethod");
            return (Criteria) this;
        }

        public Criteria andDiaryMethodNotBetween(String value1, String value2) {
            addCriterion("diary_method not between", value1, value2, "diaryMethod");
            return (Criteria) this;
        }

        public Criteria andDiaryCityIsNull() {
            addCriterion("diary_city is null");
            return (Criteria) this;
        }

        public Criteria andDiaryCityIsNotNull() {
            addCriterion("diary_city is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryCityEqualTo(String value) {
            addCriterion("diary_city =", value, "diaryCity");
            return (Criteria) this;
        }

        public Criteria andDiaryCityNotEqualTo(String value) {
            addCriterion("diary_city <>", value, "diaryCity");
            return (Criteria) this;
        }

        public Criteria andDiaryCityGreaterThan(String value) {
            addCriterion("diary_city >", value, "diaryCity");
            return (Criteria) this;
        }

        public Criteria andDiaryCityGreaterThanOrEqualTo(String value) {
            addCriterion("diary_city >=", value, "diaryCity");
            return (Criteria) this;
        }

        public Criteria andDiaryCityLessThan(String value) {
            addCriterion("diary_city <", value, "diaryCity");
            return (Criteria) this;
        }

        public Criteria andDiaryCityLessThanOrEqualTo(String value) {
            addCriterion("diary_city <=", value, "diaryCity");
            return (Criteria) this;
        }

        public Criteria andDiaryCityLike(String value) {
            addCriterion("diary_city like", value, "diaryCity");
            return (Criteria) this;
        }

        public Criteria andDiaryCityNotLike(String value) {
            addCriterion("diary_city not like", value, "diaryCity");
            return (Criteria) this;
        }

        public Criteria andDiaryCityIn(List<String> values) {
            addCriterion("diary_city in", values, "diaryCity");
            return (Criteria) this;
        }

        public Criteria andDiaryCityNotIn(List<String> values) {
            addCriterion("diary_city not in", values, "diaryCity");
            return (Criteria) this;
        }

        public Criteria andDiaryCityBetween(String value1, String value2) {
            addCriterion("diary_city between", value1, value2, "diaryCity");
            return (Criteria) this;
        }

        public Criteria andDiaryCityNotBetween(String value1, String value2) {
            addCriterion("diary_city not between", value1, value2, "diaryCity");
            return (Criteria) this;
        }

        public Criteria andDiarySunIsNull() {
            addCriterion("diary_sun is null");
            return (Criteria) this;
        }

        public Criteria andDiarySunIsNotNull() {
            addCriterion("diary_sun is not null");
            return (Criteria) this;
        }

        public Criteria andDiarySunEqualTo(String value) {
            addCriterion("diary_sun =", value, "diarySun");
            return (Criteria) this;
        }

        public Criteria andDiarySunNotEqualTo(String value) {
            addCriterion("diary_sun <>", value, "diarySun");
            return (Criteria) this;
        }

        public Criteria andDiarySunGreaterThan(String value) {
            addCriterion("diary_sun >", value, "diarySun");
            return (Criteria) this;
        }

        public Criteria andDiarySunGreaterThanOrEqualTo(String value) {
            addCriterion("diary_sun >=", value, "diarySun");
            return (Criteria) this;
        }

        public Criteria andDiarySunLessThan(String value) {
            addCriterion("diary_sun <", value, "diarySun");
            return (Criteria) this;
        }

        public Criteria andDiarySunLessThanOrEqualTo(String value) {
            addCriterion("diary_sun <=", value, "diarySun");
            return (Criteria) this;
        }

        public Criteria andDiarySunLike(String value) {
            addCriterion("diary_sun like", value, "diarySun");
            return (Criteria) this;
        }

        public Criteria andDiarySunNotLike(String value) {
            addCriterion("diary_sun not like", value, "diarySun");
            return (Criteria) this;
        }

        public Criteria andDiarySunIn(List<String> values) {
            addCriterion("diary_sun in", values, "diarySun");
            return (Criteria) this;
        }

        public Criteria andDiarySunNotIn(List<String> values) {
            addCriterion("diary_sun not in", values, "diarySun");
            return (Criteria) this;
        }

        public Criteria andDiarySunBetween(String value1, String value2) {
            addCriterion("diary_sun between", value1, value2, "diarySun");
            return (Criteria) this;
        }

        public Criteria andDiarySunNotBetween(String value1, String value2) {
            addCriterion("diary_sun not between", value1, value2, "diarySun");
            return (Criteria) this;
        }

        public Criteria andDiaryWaterIsNull() {
            addCriterion("diary_water is null");
            return (Criteria) this;
        }

        public Criteria andDiaryWaterIsNotNull() {
            addCriterion("diary_water is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryWaterEqualTo(String value) {
            addCriterion("diary_water =", value, "diaryWater");
            return (Criteria) this;
        }

        public Criteria andDiaryWaterNotEqualTo(String value) {
            addCriterion("diary_water <>", value, "diaryWater");
            return (Criteria) this;
        }

        public Criteria andDiaryWaterGreaterThan(String value) {
            addCriterion("diary_water >", value, "diaryWater");
            return (Criteria) this;
        }

        public Criteria andDiaryWaterGreaterThanOrEqualTo(String value) {
            addCriterion("diary_water >=", value, "diaryWater");
            return (Criteria) this;
        }

        public Criteria andDiaryWaterLessThan(String value) {
            addCriterion("diary_water <", value, "diaryWater");
            return (Criteria) this;
        }

        public Criteria andDiaryWaterLessThanOrEqualTo(String value) {
            addCriterion("diary_water <=", value, "diaryWater");
            return (Criteria) this;
        }

        public Criteria andDiaryWaterLike(String value) {
            addCriterion("diary_water like", value, "diaryWater");
            return (Criteria) this;
        }

        public Criteria andDiaryWaterNotLike(String value) {
            addCriterion("diary_water not like", value, "diaryWater");
            return (Criteria) this;
        }

        public Criteria andDiaryWaterIn(List<String> values) {
            addCriterion("diary_water in", values, "diaryWater");
            return (Criteria) this;
        }

        public Criteria andDiaryWaterNotIn(List<String> values) {
            addCriterion("diary_water not in", values, "diaryWater");
            return (Criteria) this;
        }

        public Criteria andDiaryWaterBetween(String value1, String value2) {
            addCriterion("diary_water between", value1, value2, "diaryWater");
            return (Criteria) this;
        }

        public Criteria andDiaryWaterNotBetween(String value1, String value2) {
            addCriterion("diary_water not between", value1, value2, "diaryWater");
            return (Criteria) this;
        }

        public Criteria andDiaryTemperatureIsNull() {
            addCriterion("diary_temperature is null");
            return (Criteria) this;
        }

        public Criteria andDiaryTemperatureIsNotNull() {
            addCriterion("diary_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryTemperatureEqualTo(String value) {
            addCriterion("diary_temperature =", value, "diaryTemperature");
            return (Criteria) this;
        }

        public Criteria andDiaryTemperatureNotEqualTo(String value) {
            addCriterion("diary_temperature <>", value, "diaryTemperature");
            return (Criteria) this;
        }

        public Criteria andDiaryTemperatureGreaterThan(String value) {
            addCriterion("diary_temperature >", value, "diaryTemperature");
            return (Criteria) this;
        }

        public Criteria andDiaryTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("diary_temperature >=", value, "diaryTemperature");
            return (Criteria) this;
        }

        public Criteria andDiaryTemperatureLessThan(String value) {
            addCriterion("diary_temperature <", value, "diaryTemperature");
            return (Criteria) this;
        }

        public Criteria andDiaryTemperatureLessThanOrEqualTo(String value) {
            addCriterion("diary_temperature <=", value, "diaryTemperature");
            return (Criteria) this;
        }

        public Criteria andDiaryTemperatureLike(String value) {
            addCriterion("diary_temperature like", value, "diaryTemperature");
            return (Criteria) this;
        }

        public Criteria andDiaryTemperatureNotLike(String value) {
            addCriterion("diary_temperature not like", value, "diaryTemperature");
            return (Criteria) this;
        }

        public Criteria andDiaryTemperatureIn(List<String> values) {
            addCriterion("diary_temperature in", values, "diaryTemperature");
            return (Criteria) this;
        }

        public Criteria andDiaryTemperatureNotIn(List<String> values) {
            addCriterion("diary_temperature not in", values, "diaryTemperature");
            return (Criteria) this;
        }

        public Criteria andDiaryTemperatureBetween(String value1, String value2) {
            addCriterion("diary_temperature between", value1, value2, "diaryTemperature");
            return (Criteria) this;
        }

        public Criteria andDiaryTemperatureNotBetween(String value1, String value2) {
            addCriterion("diary_temperature not between", value1, value2, "diaryTemperature");
            return (Criteria) this;
        }

        public Criteria andDiarySoilIsNull() {
            addCriterion("diary_soil is null");
            return (Criteria) this;
        }

        public Criteria andDiarySoilIsNotNull() {
            addCriterion("diary_soil is not null");
            return (Criteria) this;
        }

        public Criteria andDiarySoilEqualTo(String value) {
            addCriterion("diary_soil =", value, "diarySoil");
            return (Criteria) this;
        }

        public Criteria andDiarySoilNotEqualTo(String value) {
            addCriterion("diary_soil <>", value, "diarySoil");
            return (Criteria) this;
        }

        public Criteria andDiarySoilGreaterThan(String value) {
            addCriterion("diary_soil >", value, "diarySoil");
            return (Criteria) this;
        }

        public Criteria andDiarySoilGreaterThanOrEqualTo(String value) {
            addCriterion("diary_soil >=", value, "diarySoil");
            return (Criteria) this;
        }

        public Criteria andDiarySoilLessThan(String value) {
            addCriterion("diary_soil <", value, "diarySoil");
            return (Criteria) this;
        }

        public Criteria andDiarySoilLessThanOrEqualTo(String value) {
            addCriterion("diary_soil <=", value, "diarySoil");
            return (Criteria) this;
        }

        public Criteria andDiarySoilLike(String value) {
            addCriterion("diary_soil like", value, "diarySoil");
            return (Criteria) this;
        }

        public Criteria andDiarySoilNotLike(String value) {
            addCriterion("diary_soil not like", value, "diarySoil");
            return (Criteria) this;
        }

        public Criteria andDiarySoilIn(List<String> values) {
            addCriterion("diary_soil in", values, "diarySoil");
            return (Criteria) this;
        }

        public Criteria andDiarySoilNotIn(List<String> values) {
            addCriterion("diary_soil not in", values, "diarySoil");
            return (Criteria) this;
        }

        public Criteria andDiarySoilBetween(String value1, String value2) {
            addCriterion("diary_soil between", value1, value2, "diarySoil");
            return (Criteria) this;
        }

        public Criteria andDiarySoilNotBetween(String value1, String value2) {
            addCriterion("diary_soil not between", value1, value2, "diarySoil");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeIsNull() {
            addCriterion("diary_time is null");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeIsNotNull() {
            addCriterion("diary_time is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeEqualTo(String value) {
            addCriterion("diary_time =", value, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeNotEqualTo(String value) {
            addCriterion("diary_time <>", value, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeGreaterThan(String value) {
            addCriterion("diary_time >", value, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeGreaterThanOrEqualTo(String value) {
            addCriterion("diary_time >=", value, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeLessThan(String value) {
            addCriterion("diary_time <", value, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeLessThanOrEqualTo(String value) {
            addCriterion("diary_time <=", value, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeLike(String value) {
            addCriterion("diary_time like", value, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeNotLike(String value) {
            addCriterion("diary_time not like", value, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeIn(List<String> values) {
            addCriterion("diary_time in", values, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeNotIn(List<String> values) {
            addCriterion("diary_time not in", values, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeBetween(String value1, String value2) {
            addCriterion("diary_time between", value1, value2, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryTimeNotBetween(String value1, String value2) {
            addCriterion("diary_time not between", value1, value2, "diaryTime");
            return (Criteria) this;
        }

        public Criteria andDiaryImageIsNull() {
            addCriterion("diary_image is null");
            return (Criteria) this;
        }

        public Criteria andDiaryImageIsNotNull() {
            addCriterion("diary_image is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryImageEqualTo(String value) {
            addCriterion("diary_image =", value, "diaryImage");
            return (Criteria) this;
        }

        public Criteria andDiaryImageNotEqualTo(String value) {
            addCriterion("diary_image <>", value, "diaryImage");
            return (Criteria) this;
        }

        public Criteria andDiaryImageGreaterThan(String value) {
            addCriterion("diary_image >", value, "diaryImage");
            return (Criteria) this;
        }

        public Criteria andDiaryImageGreaterThanOrEqualTo(String value) {
            addCriterion("diary_image >=", value, "diaryImage");
            return (Criteria) this;
        }

        public Criteria andDiaryImageLessThan(String value) {
            addCriterion("diary_image <", value, "diaryImage");
            return (Criteria) this;
        }

        public Criteria andDiaryImageLessThanOrEqualTo(String value) {
            addCriterion("diary_image <=", value, "diaryImage");
            return (Criteria) this;
        }

        public Criteria andDiaryImageLike(String value) {
            addCriterion("diary_image like", value, "diaryImage");
            return (Criteria) this;
        }

        public Criteria andDiaryImageNotLike(String value) {
            addCriterion("diary_image not like", value, "diaryImage");
            return (Criteria) this;
        }

        public Criteria andDiaryImageIn(List<String> values) {
            addCriterion("diary_image in", values, "diaryImage");
            return (Criteria) this;
        }

        public Criteria andDiaryImageNotIn(List<String> values) {
            addCriterion("diary_image not in", values, "diaryImage");
            return (Criteria) this;
        }

        public Criteria andDiaryImageBetween(String value1, String value2) {
            addCriterion("diary_image between", value1, value2, "diaryImage");
            return (Criteria) this;
        }

        public Criteria andDiaryImageNotBetween(String value1, String value2) {
            addCriterion("diary_image not between", value1, value2, "diaryImage");
            return (Criteria) this;
        }

        public Criteria andDiaryPointnumIsNull() {
            addCriterion("diary_pointnum is null");
            return (Criteria) this;
        }

        public Criteria andDiaryPointnumIsNotNull() {
            addCriterion("diary_pointnum is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryPointnumEqualTo(Integer value) {
            addCriterion("diary_pointnum =", value, "diaryPointnum");
            return (Criteria) this;
        }

        public Criteria andDiaryPointnumNotEqualTo(Integer value) {
            addCriterion("diary_pointnum <>", value, "diaryPointnum");
            return (Criteria) this;
        }

        public Criteria andDiaryPointnumGreaterThan(Integer value) {
            addCriterion("diary_pointnum >", value, "diaryPointnum");
            return (Criteria) this;
        }

        public Criteria andDiaryPointnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("diary_pointnum >=", value, "diaryPointnum");
            return (Criteria) this;
        }

        public Criteria andDiaryPointnumLessThan(Integer value) {
            addCriterion("diary_pointnum <", value, "diaryPointnum");
            return (Criteria) this;
        }

        public Criteria andDiaryPointnumLessThanOrEqualTo(Integer value) {
            addCriterion("diary_pointnum <=", value, "diaryPointnum");
            return (Criteria) this;
        }

        public Criteria andDiaryPointnumIn(List<Integer> values) {
            addCriterion("diary_pointnum in", values, "diaryPointnum");
            return (Criteria) this;
        }

        public Criteria andDiaryPointnumNotIn(List<Integer> values) {
            addCriterion("diary_pointnum not in", values, "diaryPointnum");
            return (Criteria) this;
        }

        public Criteria andDiaryPointnumBetween(Integer value1, Integer value2) {
            addCriterion("diary_pointnum between", value1, value2, "diaryPointnum");
            return (Criteria) this;
        }

        public Criteria andDiaryPointnumNotBetween(Integer value1, Integer value2) {
            addCriterion("diary_pointnum not between", value1, value2, "diaryPointnum");
            return (Criteria) this;
        }

        public Criteria andDiaryFloweringIsNull() {
            addCriterion("diary_flowering is null");
            return (Criteria) this;
        }

        public Criteria andDiaryFloweringIsNotNull() {
            addCriterion("diary_flowering is not null");
            return (Criteria) this;
        }

        public Criteria andDiaryFloweringEqualTo(String value) {
            addCriterion("diary_flowering =", value, "diaryFlowering");
            return (Criteria) this;
        }

        public Criteria andDiaryFloweringNotEqualTo(String value) {
            addCriterion("diary_flowering <>", value, "diaryFlowering");
            return (Criteria) this;
        }

        public Criteria andDiaryFloweringGreaterThan(String value) {
            addCriterion("diary_flowering >", value, "diaryFlowering");
            return (Criteria) this;
        }

        public Criteria andDiaryFloweringGreaterThanOrEqualTo(String value) {
            addCriterion("diary_flowering >=", value, "diaryFlowering");
            return (Criteria) this;
        }

        public Criteria andDiaryFloweringLessThan(String value) {
            addCriterion("diary_flowering <", value, "diaryFlowering");
            return (Criteria) this;
        }

        public Criteria andDiaryFloweringLessThanOrEqualTo(String value) {
            addCriterion("diary_flowering <=", value, "diaryFlowering");
            return (Criteria) this;
        }

        public Criteria andDiaryFloweringLike(String value) {
            addCriterion("diary_flowering like", value, "diaryFlowering");
            return (Criteria) this;
        }

        public Criteria andDiaryFloweringNotLike(String value) {
            addCriterion("diary_flowering not like", value, "diaryFlowering");
            return (Criteria) this;
        }

        public Criteria andDiaryFloweringIn(List<String> values) {
            addCriterion("diary_flowering in", values, "diaryFlowering");
            return (Criteria) this;
        }

        public Criteria andDiaryFloweringNotIn(List<String> values) {
            addCriterion("diary_flowering not in", values, "diaryFlowering");
            return (Criteria) this;
        }

        public Criteria andDiaryFloweringBetween(String value1, String value2) {
            addCriterion("diary_flowering between", value1, value2, "diaryFlowering");
            return (Criteria) this;
        }

        public Criteria andDiaryFloweringNotBetween(String value1, String value2) {
            addCriterion("diary_flowering not between", value1, value2, "diaryFlowering");
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