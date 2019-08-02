package com.booyue.migu.entity;

import java.util.ArrayList;
import java.util.List;

public class TbSspecialExtendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TbSspecialExtendExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSpecialidIsNull() {
            addCriterion("specialId is null");
            return (Criteria) this;
        }

        public Criteria andSpecialidIsNotNull() {
            addCriterion("specialId is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialidEqualTo(Integer value) {
            addCriterion("specialId =", value, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidNotEqualTo(Integer value) {
            addCriterion("specialId <>", value, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidGreaterThan(Integer value) {
            addCriterion("specialId >", value, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidGreaterThanOrEqualTo(Integer value) {
            addCriterion("specialId >=", value, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidLessThan(Integer value) {
            addCriterion("specialId <", value, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidLessThanOrEqualTo(Integer value) {
            addCriterion("specialId <=", value, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidIn(List<Integer> values) {
            addCriterion("specialId in", values, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidNotIn(List<Integer> values) {
            addCriterion("specialId not in", values, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidBetween(Integer value1, Integer value2) {
            addCriterion("specialId between", value1, value2, "specialid");
            return (Criteria) this;
        }

        public Criteria andSpecialidNotBetween(Integer value1, Integer value2) {
            addCriterion("specialId not between", value1, value2, "specialid");
            return (Criteria) this;
        }

        public Criteria andAllageIsNull() {
            addCriterion("allage is null");
            return (Criteria) this;
        }

        public Criteria andAllageIsNotNull() {
            addCriterion("allage is not null");
            return (Criteria) this;
        }

        public Criteria andAllageEqualTo(String value) {
            addCriterion("allage =", value, "allage");
            return (Criteria) this;
        }

        public Criteria andAllageNotEqualTo(String value) {
            addCriterion("allage <>", value, "allage");
            return (Criteria) this;
        }

        public Criteria andAllageGreaterThan(String value) {
            addCriterion("allage >", value, "allage");
            return (Criteria) this;
        }

        public Criteria andAllageGreaterThanOrEqualTo(String value) {
            addCriterion("allage >=", value, "allage");
            return (Criteria) this;
        }

        public Criteria andAllageLessThan(String value) {
            addCriterion("allage <", value, "allage");
            return (Criteria) this;
        }

        public Criteria andAllageLessThanOrEqualTo(String value) {
            addCriterion("allage <=", value, "allage");
            return (Criteria) this;
        }

        public Criteria andAllageLike(String value) {
            addCriterion("allage like", value, "allage");
            return (Criteria) this;
        }

        public Criteria andAllageNotLike(String value) {
            addCriterion("allage not like", value, "allage");
            return (Criteria) this;
        }

        public Criteria andAllageIn(List<String> values) {
            addCriterion("allage in", values, "allage");
            return (Criteria) this;
        }

        public Criteria andAllageNotIn(List<String> values) {
            addCriterion("allage not in", values, "allage");
            return (Criteria) this;
        }

        public Criteria andAllageBetween(String value1, String value2) {
            addCriterion("allage between", value1, value2, "allage");
            return (Criteria) this;
        }

        public Criteria andAllageNotBetween(String value1, String value2) {
            addCriterion("allage not between", value1, value2, "allage");
            return (Criteria) this;
        }

        public Criteria andAllearlyIsNull() {
            addCriterion("allearly is null");
            return (Criteria) this;
        }

        public Criteria andAllearlyIsNotNull() {
            addCriterion("allearly is not null");
            return (Criteria) this;
        }

        public Criteria andAllearlyEqualTo(String value) {
            addCriterion("allearly =", value, "allearly");
            return (Criteria) this;
        }

        public Criteria andAllearlyNotEqualTo(String value) {
            addCriterion("allearly <>", value, "allearly");
            return (Criteria) this;
        }

        public Criteria andAllearlyGreaterThan(String value) {
            addCriterion("allearly >", value, "allearly");
            return (Criteria) this;
        }

        public Criteria andAllearlyGreaterThanOrEqualTo(String value) {
            addCriterion("allearly >=", value, "allearly");
            return (Criteria) this;
        }

        public Criteria andAllearlyLessThan(String value) {
            addCriterion("allearly <", value, "allearly");
            return (Criteria) this;
        }

        public Criteria andAllearlyLessThanOrEqualTo(String value) {
            addCriterion("allearly <=", value, "allearly");
            return (Criteria) this;
        }

        public Criteria andAllearlyLike(String value) {
            addCriterion("allearly like", value, "allearly");
            return (Criteria) this;
        }

        public Criteria andAllearlyNotLike(String value) {
            addCriterion("allearly not like", value, "allearly");
            return (Criteria) this;
        }

        public Criteria andAllearlyIn(List<String> values) {
            addCriterion("allearly in", values, "allearly");
            return (Criteria) this;
        }

        public Criteria andAllearlyNotIn(List<String> values) {
            addCriterion("allearly not in", values, "allearly");
            return (Criteria) this;
        }

        public Criteria andAllearlyBetween(String value1, String value2) {
            addCriterion("allearly between", value1, value2, "allearly");
            return (Criteria) this;
        }

        public Criteria andAllearlyNotBetween(String value1, String value2) {
            addCriterion("allearly not between", value1, value2, "allearly");
            return (Criteria) this;
        }

        public Criteria andAllsceneIsNull() {
            addCriterion("allscene is null");
            return (Criteria) this;
        }

        public Criteria andAllsceneIsNotNull() {
            addCriterion("allscene is not null");
            return (Criteria) this;
        }

        public Criteria andAllsceneEqualTo(String value) {
            addCriterion("allscene =", value, "allscene");
            return (Criteria) this;
        }

        public Criteria andAllsceneNotEqualTo(String value) {
            addCriterion("allscene <>", value, "allscene");
            return (Criteria) this;
        }

        public Criteria andAllsceneGreaterThan(String value) {
            addCriterion("allscene >", value, "allscene");
            return (Criteria) this;
        }

        public Criteria andAllsceneGreaterThanOrEqualTo(String value) {
            addCriterion("allscene >=", value, "allscene");
            return (Criteria) this;
        }

        public Criteria andAllsceneLessThan(String value) {
            addCriterion("allscene <", value, "allscene");
            return (Criteria) this;
        }

        public Criteria andAllsceneLessThanOrEqualTo(String value) {
            addCriterion("allscene <=", value, "allscene");
            return (Criteria) this;
        }

        public Criteria andAllsceneLike(String value) {
            addCriterion("allscene like", value, "allscene");
            return (Criteria) this;
        }

        public Criteria andAllsceneNotLike(String value) {
            addCriterion("allscene not like", value, "allscene");
            return (Criteria) this;
        }

        public Criteria andAllsceneIn(List<String> values) {
            addCriterion("allscene in", values, "allscene");
            return (Criteria) this;
        }

        public Criteria andAllsceneNotIn(List<String> values) {
            addCriterion("allscene not in", values, "allscene");
            return (Criteria) this;
        }

        public Criteria andAllsceneBetween(String value1, String value2) {
            addCriterion("allscene between", value1, value2, "allscene");
            return (Criteria) this;
        }

        public Criteria andAllsceneNotBetween(String value1, String value2) {
            addCriterion("allscene not between", value1, value2, "allscene");
            return (Criteria) this;
        }

        public Criteria andAllclassIsNull() {
            addCriterion("allclass is null");
            return (Criteria) this;
        }

        public Criteria andAllclassIsNotNull() {
            addCriterion("allclass is not null");
            return (Criteria) this;
        }

        public Criteria andAllclassEqualTo(String value) {
            addCriterion("allclass =", value, "allclass");
            return (Criteria) this;
        }

        public Criteria andAllclassNotEqualTo(String value) {
            addCriterion("allclass <>", value, "allclass");
            return (Criteria) this;
        }

        public Criteria andAllclassGreaterThan(String value) {
            addCriterion("allclass >", value, "allclass");
            return (Criteria) this;
        }

        public Criteria andAllclassGreaterThanOrEqualTo(String value) {
            addCriterion("allclass >=", value, "allclass");
            return (Criteria) this;
        }

        public Criteria andAllclassLessThan(String value) {
            addCriterion("allclass <", value, "allclass");
            return (Criteria) this;
        }

        public Criteria andAllclassLessThanOrEqualTo(String value) {
            addCriterion("allclass <=", value, "allclass");
            return (Criteria) this;
        }

        public Criteria andAllclassLike(String value) {
            addCriterion("allclass like", value, "allclass");
            return (Criteria) this;
        }

        public Criteria andAllclassNotLike(String value) {
            addCriterion("allclass not like", value, "allclass");
            return (Criteria) this;
        }

        public Criteria andAllclassIn(List<String> values) {
            addCriterion("allclass in", values, "allclass");
            return (Criteria) this;
        }

        public Criteria andAllclassNotIn(List<String> values) {
            addCriterion("allclass not in", values, "allclass");
            return (Criteria) this;
        }

        public Criteria andAllclassBetween(String value1, String value2) {
            addCriterion("allclass between", value1, value2, "allclass");
            return (Criteria) this;
        }

        public Criteria andAllclassNotBetween(String value1, String value2) {
            addCriterion("allclass not between", value1, value2, "allclass");
            return (Criteria) this;
        }

        public Criteria andExtend1IsNull() {
            addCriterion("extend1 is null");
            return (Criteria) this;
        }

        public Criteria andExtend1IsNotNull() {
            addCriterion("extend1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend1EqualTo(Integer value) {
            addCriterion("extend1 =", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotEqualTo(Integer value) {
            addCriterion("extend1 <>", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1GreaterThan(Integer value) {
            addCriterion("extend1 >", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1GreaterThanOrEqualTo(Integer value) {
            addCriterion("extend1 >=", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1LessThan(Integer value) {
            addCriterion("extend1 <", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1LessThanOrEqualTo(Integer value) {
            addCriterion("extend1 <=", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1In(List<Integer> values) {
            addCriterion("extend1 in", values, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotIn(List<Integer> values) {
            addCriterion("extend1 not in", values, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1Between(Integer value1, Integer value2) {
            addCriterion("extend1 between", value1, value2, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotBetween(Integer value1, Integer value2) {
            addCriterion("extend1 not between", value1, value2, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend2IsNull() {
            addCriterion("extend2 is null");
            return (Criteria) this;
        }

        public Criteria andExtend2IsNotNull() {
            addCriterion("extend2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend2EqualTo(String value) {
            addCriterion("extend2 =", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotEqualTo(String value) {
            addCriterion("extend2 <>", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2GreaterThan(String value) {
            addCriterion("extend2 >", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2GreaterThanOrEqualTo(String value) {
            addCriterion("extend2 >=", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2LessThan(String value) {
            addCriterion("extend2 <", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2LessThanOrEqualTo(String value) {
            addCriterion("extend2 <=", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2Like(String value) {
            addCriterion("extend2 like", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotLike(String value) {
            addCriterion("extend2 not like", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2In(List<String> values) {
            addCriterion("extend2 in", values, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotIn(List<String> values) {
            addCriterion("extend2 not in", values, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2Between(String value1, String value2) {
            addCriterion("extend2 between", value1, value2, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotBetween(String value1, String value2) {
            addCriterion("extend2 not between", value1, value2, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend3IsNull() {
            addCriterion("extend3 is null");
            return (Criteria) this;
        }

        public Criteria andExtend3IsNotNull() {
            addCriterion("extend3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend3EqualTo(String value) {
            addCriterion("extend3 =", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotEqualTo(String value) {
            addCriterion("extend3 <>", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3GreaterThan(String value) {
            addCriterion("extend3 >", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3GreaterThanOrEqualTo(String value) {
            addCriterion("extend3 >=", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3LessThan(String value) {
            addCriterion("extend3 <", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3LessThanOrEqualTo(String value) {
            addCriterion("extend3 <=", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3Like(String value) {
            addCriterion("extend3 like", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotLike(String value) {
            addCriterion("extend3 not like", value, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3In(List<String> values) {
            addCriterion("extend3 in", values, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotIn(List<String> values) {
            addCriterion("extend3 not in", values, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3Between(String value1, String value2) {
            addCriterion("extend3 between", value1, value2, "extend3");
            return (Criteria) this;
        }

        public Criteria andExtend3NotBetween(String value1, String value2) {
            addCriterion("extend3 not between", value1, value2, "extend3");
            return (Criteria) this;
        }

        public Criteria andBriefIsNull() {
            addCriterion("brief is null");
            return (Criteria) this;
        }

        public Criteria andBriefIsNotNull() {
            addCriterion("brief is not null");
            return (Criteria) this;
        }

        public Criteria andBriefEqualTo(String value) {
            addCriterion("brief =", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotEqualTo(String value) {
            addCriterion("brief <>", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThan(String value) {
            addCriterion("brief >", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThanOrEqualTo(String value) {
            addCriterion("brief >=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThan(String value) {
            addCriterion("brief <", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThanOrEqualTo(String value) {
            addCriterion("brief <=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLike(String value) {
            addCriterion("brief like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotLike(String value) {
            addCriterion("brief not like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefIn(List<String> values) {
            addCriterion("brief in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotIn(List<String> values) {
            addCriterion("brief not in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefBetween(String value1, String value2) {
            addCriterion("brief between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotBetween(String value1, String value2) {
            addCriterion("brief not between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andPaylinkeIsNull() {
            addCriterion("paylinke is null");
            return (Criteria) this;
        }

        public Criteria andPaylinkeIsNotNull() {
            addCriterion("paylinke is not null");
            return (Criteria) this;
        }

        public Criteria andPaylinkeEqualTo(String value) {
            addCriterion("paylinke =", value, "paylinke");
            return (Criteria) this;
        }

        public Criteria andPaylinkeNotEqualTo(String value) {
            addCriterion("paylinke <>", value, "paylinke");
            return (Criteria) this;
        }

        public Criteria andPaylinkeGreaterThan(String value) {
            addCriterion("paylinke >", value, "paylinke");
            return (Criteria) this;
        }

        public Criteria andPaylinkeGreaterThanOrEqualTo(String value) {
            addCriterion("paylinke >=", value, "paylinke");
            return (Criteria) this;
        }

        public Criteria andPaylinkeLessThan(String value) {
            addCriterion("paylinke <", value, "paylinke");
            return (Criteria) this;
        }

        public Criteria andPaylinkeLessThanOrEqualTo(String value) {
            addCriterion("paylinke <=", value, "paylinke");
            return (Criteria) this;
        }

        public Criteria andPaylinkeLike(String value) {
            addCriterion("paylinke like", value, "paylinke");
            return (Criteria) this;
        }

        public Criteria andPaylinkeNotLike(String value) {
            addCriterion("paylinke not like", value, "paylinke");
            return (Criteria) this;
        }

        public Criteria andPaylinkeIn(List<String> values) {
            addCriterion("paylinke in", values, "paylinke");
            return (Criteria) this;
        }

        public Criteria andPaylinkeNotIn(List<String> values) {
            addCriterion("paylinke not in", values, "paylinke");
            return (Criteria) this;
        }

        public Criteria andPaylinkeBetween(String value1, String value2) {
            addCriterion("paylinke between", value1, value2, "paylinke");
            return (Criteria) this;
        }

        public Criteria andPaylinkeNotBetween(String value1, String value2) {
            addCriterion("paylinke not between", value1, value2, "paylinke");
            return (Criteria) this;
        }

        public Criteria andBoubanScoreIsNull() {
            addCriterion("bouban_score is null");
            return (Criteria) this;
        }

        public Criteria andBoubanScoreIsNotNull() {
            addCriterion("bouban_score is not null");
            return (Criteria) this;
        }

        public Criteria andBoubanScoreEqualTo(String value) {
            addCriterion("bouban_score =", value, "boubanScore");
            return (Criteria) this;
        }

        public Criteria andBoubanScoreNotEqualTo(String value) {
            addCriterion("bouban_score <>", value, "boubanScore");
            return (Criteria) this;
        }

        public Criteria andBoubanScoreGreaterThan(String value) {
            addCriterion("bouban_score >", value, "boubanScore");
            return (Criteria) this;
        }

        public Criteria andBoubanScoreGreaterThanOrEqualTo(String value) {
            addCriterion("bouban_score >=", value, "boubanScore");
            return (Criteria) this;
        }

        public Criteria andBoubanScoreLessThan(String value) {
            addCriterion("bouban_score <", value, "boubanScore");
            return (Criteria) this;
        }

        public Criteria andBoubanScoreLessThanOrEqualTo(String value) {
            addCriterion("bouban_score <=", value, "boubanScore");
            return (Criteria) this;
        }

        public Criteria andBoubanScoreLike(String value) {
            addCriterion("bouban_score like", value, "boubanScore");
            return (Criteria) this;
        }

        public Criteria andBoubanScoreNotLike(String value) {
            addCriterion("bouban_score not like", value, "boubanScore");
            return (Criteria) this;
        }

        public Criteria andBoubanScoreIn(List<String> values) {
            addCriterion("bouban_score in", values, "boubanScore");
            return (Criteria) this;
        }

        public Criteria andBoubanScoreNotIn(List<String> values) {
            addCriterion("bouban_score not in", values, "boubanScore");
            return (Criteria) this;
        }

        public Criteria andBoubanScoreBetween(String value1, String value2) {
            addCriterion("bouban_score between", value1, value2, "boubanScore");
            return (Criteria) this;
        }

        public Criteria andBoubanScoreNotBetween(String value1, String value2) {
            addCriterion("bouban_score not between", value1, value2, "boubanScore");
            return (Criteria) this;
        }

        public Criteria andBorrowNumIsNull() {
            addCriterion("borrow_num is null");
            return (Criteria) this;
        }

        public Criteria andBorrowNumIsNotNull() {
            addCriterion("borrow_num is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowNumEqualTo(String value) {
            addCriterion("borrow_num =", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumNotEqualTo(String value) {
            addCriterion("borrow_num <>", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumGreaterThan(String value) {
            addCriterion("borrow_num >", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_num >=", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumLessThan(String value) {
            addCriterion("borrow_num <", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumLessThanOrEqualTo(String value) {
            addCriterion("borrow_num <=", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumLike(String value) {
            addCriterion("borrow_num like", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumNotLike(String value) {
            addCriterion("borrow_num not like", value, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumIn(List<String> values) {
            addCriterion("borrow_num in", values, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumNotIn(List<String> values) {
            addCriterion("borrow_num not in", values, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumBetween(String value1, String value2) {
            addCriterion("borrow_num between", value1, value2, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andBorrowNumNotBetween(String value1, String value2) {
            addCriterion("borrow_num not between", value1, value2, "borrowNum");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("isbn is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("isbn is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("isbn =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("isbn <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("isbn >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("isbn >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("isbn <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("isbn <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("isbn like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("isbn not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("isbn in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("isbn not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("isbn between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("isbn not between", value1, value2, "isbn");
            return (Criteria) this;
        }
    }

    /**
     */
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