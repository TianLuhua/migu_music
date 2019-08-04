package com.booyue.migu.entity.wantong;

import java.util.ArrayList;
import java.util.List;

public class TbWantongHuibenScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TbWantongHuibenScoreExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andIsnbIsNull() {
            addCriterion("isnb is null");
            return (Criteria) this;
        }

        public Criteria andIsnbIsNotNull() {
            addCriterion("isnb is not null");
            return (Criteria) this;
        }

        public Criteria andIsnbEqualTo(String value) {
            addCriterion("isnb =", value, "isnb");
            return (Criteria) this;
        }

        public Criteria andIsnbNotEqualTo(String value) {
            addCriterion("isnb <>", value, "isnb");
            return (Criteria) this;
        }

        public Criteria andIsnbGreaterThan(String value) {
            addCriterion("isnb >", value, "isnb");
            return (Criteria) this;
        }

        public Criteria andIsnbGreaterThanOrEqualTo(String value) {
            addCriterion("isnb >=", value, "isnb");
            return (Criteria) this;
        }

        public Criteria andIsnbLessThan(String value) {
            addCriterion("isnb <", value, "isnb");
            return (Criteria) this;
        }

        public Criteria andIsnbLessThanOrEqualTo(String value) {
            addCriterion("isnb <=", value, "isnb");
            return (Criteria) this;
        }

        public Criteria andIsnbLike(String value) {
            addCriterion("isnb like", value, "isnb");
            return (Criteria) this;
        }

        public Criteria andIsnbNotLike(String value) {
            addCriterion("isnb not like", value, "isnb");
            return (Criteria) this;
        }

        public Criteria andIsnbIn(List<String> values) {
            addCriterion("isnb in", values, "isnb");
            return (Criteria) this;
        }

        public Criteria andIsnbNotIn(List<String> values) {
            addCriterion("isnb not in", values, "isnb");
            return (Criteria) this;
        }

        public Criteria andIsnbBetween(String value1, String value2) {
            addCriterion("isnb between", value1, value2, "isnb");
            return (Criteria) this;
        }

        public Criteria andIsnbNotBetween(String value1, String value2) {
            addCriterion("isnb not between", value1, value2, "isnb");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("`number` is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("`number` is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("`number` =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("`number` <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("`number` >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("`number` >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("`number` <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("`number` <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("`number` like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("`number` not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("`number` in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("`number` not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("`number` between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("`number` not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andStar5ScoreIsNull() {
            addCriterion("star_5_score is null");
            return (Criteria) this;
        }

        public Criteria andStar5ScoreIsNotNull() {
            addCriterion("star_5_score is not null");
            return (Criteria) this;
        }

        public Criteria andStar5ScoreEqualTo(String value) {
            addCriterion("star_5_score =", value, "star5Score");
            return (Criteria) this;
        }

        public Criteria andStar5ScoreNotEqualTo(String value) {
            addCriterion("star_5_score <>", value, "star5Score");
            return (Criteria) this;
        }

        public Criteria andStar5ScoreGreaterThan(String value) {
            addCriterion("star_5_score >", value, "star5Score");
            return (Criteria) this;
        }

        public Criteria andStar5ScoreGreaterThanOrEqualTo(String value) {
            addCriterion("star_5_score >=", value, "star5Score");
            return (Criteria) this;
        }

        public Criteria andStar5ScoreLessThan(String value) {
            addCriterion("star_5_score <", value, "star5Score");
            return (Criteria) this;
        }

        public Criteria andStar5ScoreLessThanOrEqualTo(String value) {
            addCriterion("star_5_score <=", value, "star5Score");
            return (Criteria) this;
        }

        public Criteria andStar5ScoreLike(String value) {
            addCriterion("star_5_score like", value, "star5Score");
            return (Criteria) this;
        }

        public Criteria andStar5ScoreNotLike(String value) {
            addCriterion("star_5_score not like", value, "star5Score");
            return (Criteria) this;
        }

        public Criteria andStar5ScoreIn(List<String> values) {
            addCriterion("star_5_score in", values, "star5Score");
            return (Criteria) this;
        }

        public Criteria andStar5ScoreNotIn(List<String> values) {
            addCriterion("star_5_score not in", values, "star5Score");
            return (Criteria) this;
        }

        public Criteria andStar5ScoreBetween(String value1, String value2) {
            addCriterion("star_5_score between", value1, value2, "star5Score");
            return (Criteria) this;
        }

        public Criteria andStar5ScoreNotBetween(String value1, String value2) {
            addCriterion("star_5_score not between", value1, value2, "star5Score");
            return (Criteria) this;
        }

        public Criteria andStar4ScoreIsNull() {
            addCriterion("star_4_score is null");
            return (Criteria) this;
        }

        public Criteria andStar4ScoreIsNotNull() {
            addCriterion("star_4_score is not null");
            return (Criteria) this;
        }

        public Criteria andStar4ScoreEqualTo(String value) {
            addCriterion("star_4_score =", value, "star4Score");
            return (Criteria) this;
        }

        public Criteria andStar4ScoreNotEqualTo(String value) {
            addCriterion("star_4_score <>", value, "star4Score");
            return (Criteria) this;
        }

        public Criteria andStar4ScoreGreaterThan(String value) {
            addCriterion("star_4_score >", value, "star4Score");
            return (Criteria) this;
        }

        public Criteria andStar4ScoreGreaterThanOrEqualTo(String value) {
            addCriterion("star_4_score >=", value, "star4Score");
            return (Criteria) this;
        }

        public Criteria andStar4ScoreLessThan(String value) {
            addCriterion("star_4_score <", value, "star4Score");
            return (Criteria) this;
        }

        public Criteria andStar4ScoreLessThanOrEqualTo(String value) {
            addCriterion("star_4_score <=", value, "star4Score");
            return (Criteria) this;
        }

        public Criteria andStar4ScoreLike(String value) {
            addCriterion("star_4_score like", value, "star4Score");
            return (Criteria) this;
        }

        public Criteria andStar4ScoreNotLike(String value) {
            addCriterion("star_4_score not like", value, "star4Score");
            return (Criteria) this;
        }

        public Criteria andStar4ScoreIn(List<String> values) {
            addCriterion("star_4_score in", values, "star4Score");
            return (Criteria) this;
        }

        public Criteria andStar4ScoreNotIn(List<String> values) {
            addCriterion("star_4_score not in", values, "star4Score");
            return (Criteria) this;
        }

        public Criteria andStar4ScoreBetween(String value1, String value2) {
            addCriterion("star_4_score between", value1, value2, "star4Score");
            return (Criteria) this;
        }

        public Criteria andStar4ScoreNotBetween(String value1, String value2) {
            addCriterion("star_4_score not between", value1, value2, "star4Score");
            return (Criteria) this;
        }

        public Criteria andStar3ScoreIsNull() {
            addCriterion("star_3_score is null");
            return (Criteria) this;
        }

        public Criteria andStar3ScoreIsNotNull() {
            addCriterion("star_3_score is not null");
            return (Criteria) this;
        }

        public Criteria andStar3ScoreEqualTo(String value) {
            addCriterion("star_3_score =", value, "star3Score");
            return (Criteria) this;
        }

        public Criteria andStar3ScoreNotEqualTo(String value) {
            addCriterion("star_3_score <>", value, "star3Score");
            return (Criteria) this;
        }

        public Criteria andStar3ScoreGreaterThan(String value) {
            addCriterion("star_3_score >", value, "star3Score");
            return (Criteria) this;
        }

        public Criteria andStar3ScoreGreaterThanOrEqualTo(String value) {
            addCriterion("star_3_score >=", value, "star3Score");
            return (Criteria) this;
        }

        public Criteria andStar3ScoreLessThan(String value) {
            addCriterion("star_3_score <", value, "star3Score");
            return (Criteria) this;
        }

        public Criteria andStar3ScoreLessThanOrEqualTo(String value) {
            addCriterion("star_3_score <=", value, "star3Score");
            return (Criteria) this;
        }

        public Criteria andStar3ScoreLike(String value) {
            addCriterion("star_3_score like", value, "star3Score");
            return (Criteria) this;
        }

        public Criteria andStar3ScoreNotLike(String value) {
            addCriterion("star_3_score not like", value, "star3Score");
            return (Criteria) this;
        }

        public Criteria andStar3ScoreIn(List<String> values) {
            addCriterion("star_3_score in", values, "star3Score");
            return (Criteria) this;
        }

        public Criteria andStar3ScoreNotIn(List<String> values) {
            addCriterion("star_3_score not in", values, "star3Score");
            return (Criteria) this;
        }

        public Criteria andStar3ScoreBetween(String value1, String value2) {
            addCriterion("star_3_score between", value1, value2, "star3Score");
            return (Criteria) this;
        }

        public Criteria andStar3ScoreNotBetween(String value1, String value2) {
            addCriterion("star_3_score not between", value1, value2, "star3Score");
            return (Criteria) this;
        }

        public Criteria andStar2ScoreIsNull() {
            addCriterion("star_2_score is null");
            return (Criteria) this;
        }

        public Criteria andStar2ScoreIsNotNull() {
            addCriterion("star_2_score is not null");
            return (Criteria) this;
        }

        public Criteria andStar2ScoreEqualTo(String value) {
            addCriterion("star_2_score =", value, "star2Score");
            return (Criteria) this;
        }

        public Criteria andStar2ScoreNotEqualTo(String value) {
            addCriterion("star_2_score <>", value, "star2Score");
            return (Criteria) this;
        }

        public Criteria andStar2ScoreGreaterThan(String value) {
            addCriterion("star_2_score >", value, "star2Score");
            return (Criteria) this;
        }

        public Criteria andStar2ScoreGreaterThanOrEqualTo(String value) {
            addCriterion("star_2_score >=", value, "star2Score");
            return (Criteria) this;
        }

        public Criteria andStar2ScoreLessThan(String value) {
            addCriterion("star_2_score <", value, "star2Score");
            return (Criteria) this;
        }

        public Criteria andStar2ScoreLessThanOrEqualTo(String value) {
            addCriterion("star_2_score <=", value, "star2Score");
            return (Criteria) this;
        }

        public Criteria andStar2ScoreLike(String value) {
            addCriterion("star_2_score like", value, "star2Score");
            return (Criteria) this;
        }

        public Criteria andStar2ScoreNotLike(String value) {
            addCriterion("star_2_score not like", value, "star2Score");
            return (Criteria) this;
        }

        public Criteria andStar2ScoreIn(List<String> values) {
            addCriterion("star_2_score in", values, "star2Score");
            return (Criteria) this;
        }

        public Criteria andStar2ScoreNotIn(List<String> values) {
            addCriterion("star_2_score not in", values, "star2Score");
            return (Criteria) this;
        }

        public Criteria andStar2ScoreBetween(String value1, String value2) {
            addCriterion("star_2_score between", value1, value2, "star2Score");
            return (Criteria) this;
        }

        public Criteria andStar2ScoreNotBetween(String value1, String value2) {
            addCriterion("star_2_score not between", value1, value2, "star2Score");
            return (Criteria) this;
        }

        public Criteria andStar1ScoreIsNull() {
            addCriterion("star_1_score is null");
            return (Criteria) this;
        }

        public Criteria andStar1ScoreIsNotNull() {
            addCriterion("star_1_score is not null");
            return (Criteria) this;
        }

        public Criteria andStar1ScoreEqualTo(String value) {
            addCriterion("star_1_score =", value, "star1Score");
            return (Criteria) this;
        }

        public Criteria andStar1ScoreNotEqualTo(String value) {
            addCriterion("star_1_score <>", value, "star1Score");
            return (Criteria) this;
        }

        public Criteria andStar1ScoreGreaterThan(String value) {
            addCriterion("star_1_score >", value, "star1Score");
            return (Criteria) this;
        }

        public Criteria andStar1ScoreGreaterThanOrEqualTo(String value) {
            addCriterion("star_1_score >=", value, "star1Score");
            return (Criteria) this;
        }

        public Criteria andStar1ScoreLessThan(String value) {
            addCriterion("star_1_score <", value, "star1Score");
            return (Criteria) this;
        }

        public Criteria andStar1ScoreLessThanOrEqualTo(String value) {
            addCriterion("star_1_score <=", value, "star1Score");
            return (Criteria) this;
        }

        public Criteria andStar1ScoreLike(String value) {
            addCriterion("star_1_score like", value, "star1Score");
            return (Criteria) this;
        }

        public Criteria andStar1ScoreNotLike(String value) {
            addCriterion("star_1_score not like", value, "star1Score");
            return (Criteria) this;
        }

        public Criteria andStar1ScoreIn(List<String> values) {
            addCriterion("star_1_score in", values, "star1Score");
            return (Criteria) this;
        }

        public Criteria andStar1ScoreNotIn(List<String> values) {
            addCriterion("star_1_score not in", values, "star1Score");
            return (Criteria) this;
        }

        public Criteria andStar1ScoreBetween(String value1, String value2) {
            addCriterion("star_1_score between", value1, value2, "star1Score");
            return (Criteria) this;
        }

        public Criteria andStar1ScoreNotBetween(String value1, String value2) {
            addCriterion("star_1_score not between", value1, value2, "star1Score");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
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