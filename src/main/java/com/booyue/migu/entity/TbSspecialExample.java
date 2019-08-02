package com.booyue.migu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbSspecialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TbSspecialExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNull() {
            addCriterion("name_en is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("name_en is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("name_en =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("name_en <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("name_en >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("name_en >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("name_en <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("name_en <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("name_en like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("name_en not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("name_en in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("name_en not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("name_en between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("name_en not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andReaderIsNull() {
            addCriterion("reader is null");
            return (Criteria) this;
        }

        public Criteria andReaderIsNotNull() {
            addCriterion("reader is not null");
            return (Criteria) this;
        }

        public Criteria andReaderEqualTo(String value) {
            addCriterion("reader =", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotEqualTo(String value) {
            addCriterion("reader <>", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderGreaterThan(String value) {
            addCriterion("reader >", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderGreaterThanOrEqualTo(String value) {
            addCriterion("reader >=", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderLessThan(String value) {
            addCriterion("reader <", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderLessThanOrEqualTo(String value) {
            addCriterion("reader <=", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderLike(String value) {
            addCriterion("reader like", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotLike(String value) {
            addCriterion("reader not like", value, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderIn(List<String> values) {
            addCriterion("reader in", values, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotIn(List<String> values) {
            addCriterion("reader not in", values, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderBetween(String value1, String value2) {
            addCriterion("reader between", value1, value2, "reader");
            return (Criteria) this;
        }

        public Criteria andReaderNotBetween(String value1, String value2) {
            addCriterion("reader not between", value1, value2, "reader");
            return (Criteria) this;
        }

        public Criteria andIsrcIsNull() {
            addCriterion("isrc is null");
            return (Criteria) this;
        }

        public Criteria andIsrcIsNotNull() {
            addCriterion("isrc is not null");
            return (Criteria) this;
        }

        public Criteria andIsrcEqualTo(String value) {
            addCriterion("isrc =", value, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcNotEqualTo(String value) {
            addCriterion("isrc <>", value, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcGreaterThan(String value) {
            addCriterion("isrc >", value, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcGreaterThanOrEqualTo(String value) {
            addCriterion("isrc >=", value, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcLessThan(String value) {
            addCriterion("isrc <", value, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcLessThanOrEqualTo(String value) {
            addCriterion("isrc <=", value, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcLike(String value) {
            addCriterion("isrc like", value, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcNotLike(String value) {
            addCriterion("isrc not like", value, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcIn(List<String> values) {
            addCriterion("isrc in", values, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcNotIn(List<String> values) {
            addCriterion("isrc not in", values, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcBetween(String value1, String value2) {
            addCriterion("isrc between", value1, value2, "isrc");
            return (Criteria) this;
        }

        public Criteria andIsrcNotBetween(String value1, String value2) {
            addCriterion("isrc not between", value1, value2, "isrc");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNull() {
            addCriterion("publishtime is null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIsNotNull() {
            addCriterion("publishtime is not null");
            return (Criteria) this;
        }

        public Criteria andPublishtimeEqualTo(Date value) {
            addCriterionForJDBCDate("publishtime =", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("publishtime <>", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("publishtime >", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publishtime >=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThan(Date value) {
            addCriterionForJDBCDate("publishtime <", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publishtime <=", value, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeIn(List<Date> values) {
            addCriterionForJDBCDate("publishtime in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("publishtime not in", values, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publishtime between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andPublishtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publishtime not between", value1, value2, "publishtime");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("`language` is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("`language` is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("`language` =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("`language` <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("`language` >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("`language` >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("`language` <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("`language` <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("`language` like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("`language` not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("`language` in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("`language` not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("`language` between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("`language` not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andPrintcompanyIsNull() {
            addCriterion("printcompany is null");
            return (Criteria) this;
        }

        public Criteria andPrintcompanyIsNotNull() {
            addCriterion("printcompany is not null");
            return (Criteria) this;
        }

        public Criteria andPrintcompanyEqualTo(String value) {
            addCriterion("printcompany =", value, "printcompany");
            return (Criteria) this;
        }

        public Criteria andPrintcompanyNotEqualTo(String value) {
            addCriterion("printcompany <>", value, "printcompany");
            return (Criteria) this;
        }

        public Criteria andPrintcompanyGreaterThan(String value) {
            addCriterion("printcompany >", value, "printcompany");
            return (Criteria) this;
        }

        public Criteria andPrintcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("printcompany >=", value, "printcompany");
            return (Criteria) this;
        }

        public Criteria andPrintcompanyLessThan(String value) {
            addCriterion("printcompany <", value, "printcompany");
            return (Criteria) this;
        }

        public Criteria andPrintcompanyLessThanOrEqualTo(String value) {
            addCriterion("printcompany <=", value, "printcompany");
            return (Criteria) this;
        }

        public Criteria andPrintcompanyLike(String value) {
            addCriterion("printcompany like", value, "printcompany");
            return (Criteria) this;
        }

        public Criteria andPrintcompanyNotLike(String value) {
            addCriterion("printcompany not like", value, "printcompany");
            return (Criteria) this;
        }

        public Criteria andPrintcompanyIn(List<String> values) {
            addCriterion("printcompany in", values, "printcompany");
            return (Criteria) this;
        }

        public Criteria andPrintcompanyNotIn(List<String> values) {
            addCriterion("printcompany not in", values, "printcompany");
            return (Criteria) this;
        }

        public Criteria andPrintcompanyBetween(String value1, String value2) {
            addCriterion("printcompany between", value1, value2, "printcompany");
            return (Criteria) this;
        }

        public Criteria andPrintcompanyNotBetween(String value1, String value2) {
            addCriterion("printcompany not between", value1, value2, "printcompany");
            return (Criteria) this;
        }

        public Criteria andFileformIsNull() {
            addCriterion("fileform is null");
            return (Criteria) this;
        }

        public Criteria andFileformIsNotNull() {
            addCriterion("fileform is not null");
            return (Criteria) this;
        }

        public Criteria andFileformEqualTo(String value) {
            addCriterion("fileform =", value, "fileform");
            return (Criteria) this;
        }

        public Criteria andFileformNotEqualTo(String value) {
            addCriterion("fileform <>", value, "fileform");
            return (Criteria) this;
        }

        public Criteria andFileformGreaterThan(String value) {
            addCriterion("fileform >", value, "fileform");
            return (Criteria) this;
        }

        public Criteria andFileformGreaterThanOrEqualTo(String value) {
            addCriterion("fileform >=", value, "fileform");
            return (Criteria) this;
        }

        public Criteria andFileformLessThan(String value) {
            addCriterion("fileform <", value, "fileform");
            return (Criteria) this;
        }

        public Criteria andFileformLessThanOrEqualTo(String value) {
            addCriterion("fileform <=", value, "fileform");
            return (Criteria) this;
        }

        public Criteria andFileformLike(String value) {
            addCriterion("fileform like", value, "fileform");
            return (Criteria) this;
        }

        public Criteria andFileformNotLike(String value) {
            addCriterion("fileform not like", value, "fileform");
            return (Criteria) this;
        }

        public Criteria andFileformIn(List<String> values) {
            addCriterion("fileform in", values, "fileform");
            return (Criteria) this;
        }

        public Criteria andFileformNotIn(List<String> values) {
            addCriterion("fileform not in", values, "fileform");
            return (Criteria) this;
        }

        public Criteria andFileformBetween(String value1, String value2) {
            addCriterion("fileform between", value1, value2, "fileform");
            return (Criteria) this;
        }

        public Criteria andFileformNotBetween(String value1, String value2) {
            addCriterion("fileform not between", value1, value2, "fileform");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyIsNull() {
            addCriterion("publishcompany is null");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyIsNotNull() {
            addCriterion("publishcompany is not null");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyEqualTo(String value) {
            addCriterion("publishcompany =", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyNotEqualTo(String value) {
            addCriterion("publishcompany <>", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyGreaterThan(String value) {
            addCriterion("publishcompany >", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("publishcompany >=", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyLessThan(String value) {
            addCriterion("publishcompany <", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyLessThanOrEqualTo(String value) {
            addCriterion("publishcompany <=", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyLike(String value) {
            addCriterion("publishcompany like", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyNotLike(String value) {
            addCriterion("publishcompany not like", value, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyIn(List<String> values) {
            addCriterion("publishcompany in", values, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyNotIn(List<String> values) {
            addCriterion("publishcompany not in", values, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyBetween(String value1, String value2) {
            addCriterion("publishcompany between", value1, value2, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andPublishcompanyNotBetween(String value1, String value2) {
            addCriterion("publishcompany not between", value1, value2, "publishcompany");
            return (Criteria) this;
        }

        public Criteria andQualityIsNull() {
            addCriterion("quality is null");
            return (Criteria) this;
        }

        public Criteria andQualityIsNotNull() {
            addCriterion("quality is not null");
            return (Criteria) this;
        }

        public Criteria andQualityEqualTo(String value) {
            addCriterion("quality =", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotEqualTo(String value) {
            addCriterion("quality <>", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThan(String value) {
            addCriterion("quality >", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThanOrEqualTo(String value) {
            addCriterion("quality >=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThan(String value) {
            addCriterion("quality <", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThanOrEqualTo(String value) {
            addCriterion("quality <=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLike(String value) {
            addCriterion("quality like", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotLike(String value) {
            addCriterion("quality not like", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityIn(List<String> values) {
            addCriterion("quality in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotIn(List<String> values) {
            addCriterion("quality not in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityBetween(String value1, String value2) {
            addCriterion("quality between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotBetween(String value1, String value2) {
            addCriterion("quality not between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andClassidIsNull() {
            addCriterion("classid is null");
            return (Criteria) this;
        }

        public Criteria andClassidIsNotNull() {
            addCriterion("classid is not null");
            return (Criteria) this;
        }

        public Criteria andClassidEqualTo(Integer value) {
            addCriterion("classid =", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotEqualTo(Integer value) {
            addCriterion("classid <>", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThan(Integer value) {
            addCriterion("classid >", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("classid >=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThan(Integer value) {
            addCriterion("classid <", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidLessThanOrEqualTo(Integer value) {
            addCriterion("classid <=", value, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidIn(List<Integer> values) {
            addCriterion("classid in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotIn(List<Integer> values) {
            addCriterion("classid not in", values, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidBetween(Integer value1, Integer value2) {
            addCriterion("classid between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("classid not between", value1, value2, "classid");
            return (Criteria) this;
        }

        public Criteria andClassid2IsNull() {
            addCriterion("classid2 is null");
            return (Criteria) this;
        }

        public Criteria andClassid2IsNotNull() {
            addCriterion("classid2 is not null");
            return (Criteria) this;
        }

        public Criteria andClassid2EqualTo(Integer value) {
            addCriterion("classid2 =", value, "classid2");
            return (Criteria) this;
        }

        public Criteria andClassid2NotEqualTo(Integer value) {
            addCriterion("classid2 <>", value, "classid2");
            return (Criteria) this;
        }

        public Criteria andClassid2GreaterThan(Integer value) {
            addCriterion("classid2 >", value, "classid2");
            return (Criteria) this;
        }

        public Criteria andClassid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("classid2 >=", value, "classid2");
            return (Criteria) this;
        }

        public Criteria andClassid2LessThan(Integer value) {
            addCriterion("classid2 <", value, "classid2");
            return (Criteria) this;
        }

        public Criteria andClassid2LessThanOrEqualTo(Integer value) {
            addCriterion("classid2 <=", value, "classid2");
            return (Criteria) this;
        }

        public Criteria andClassid2In(List<Integer> values) {
            addCriterion("classid2 in", values, "classid2");
            return (Criteria) this;
        }

        public Criteria andClassid2NotIn(List<Integer> values) {
            addCriterion("classid2 not in", values, "classid2");
            return (Criteria) this;
        }

        public Criteria andClassid2Between(Integer value1, Integer value2) {
            addCriterion("classid2 between", value1, value2, "classid2");
            return (Criteria) this;
        }

        public Criteria andClassid2NotBetween(Integer value1, Integer value2) {
            addCriterion("classid2 not between", value1, value2, "classid2");
            return (Criteria) this;
        }

        public Criteria andAgesectionIdIsNull() {
            addCriterion("agesection_id is null");
            return (Criteria) this;
        }

        public Criteria andAgesectionIdIsNotNull() {
            addCriterion("agesection_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgesectionIdEqualTo(Integer value) {
            addCriterion("agesection_id =", value, "agesectionId");
            return (Criteria) this;
        }

        public Criteria andAgesectionIdNotEqualTo(Integer value) {
            addCriterion("agesection_id <>", value, "agesectionId");
            return (Criteria) this;
        }

        public Criteria andAgesectionIdGreaterThan(Integer value) {
            addCriterion("agesection_id >", value, "agesectionId");
            return (Criteria) this;
        }

        public Criteria andAgesectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agesection_id >=", value, "agesectionId");
            return (Criteria) this;
        }

        public Criteria andAgesectionIdLessThan(Integer value) {
            addCriterion("agesection_id <", value, "agesectionId");
            return (Criteria) this;
        }

        public Criteria andAgesectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("agesection_id <=", value, "agesectionId");
            return (Criteria) this;
        }

        public Criteria andAgesectionIdIn(List<Integer> values) {
            addCriterion("agesection_id in", values, "agesectionId");
            return (Criteria) this;
        }

        public Criteria andAgesectionIdNotIn(List<Integer> values) {
            addCriterion("agesection_id not in", values, "agesectionId");
            return (Criteria) this;
        }

        public Criteria andAgesectionIdBetween(Integer value1, Integer value2) {
            addCriterion("agesection_id between", value1, value2, "agesectionId");
            return (Criteria) this;
        }

        public Criteria andAgesectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agesection_id not between", value1, value2, "agesectionId");
            return (Criteria) this;
        }

        public Criteria andTimelengthIsNull() {
            addCriterion("timelength is null");
            return (Criteria) this;
        }

        public Criteria andTimelengthIsNotNull() {
            addCriterion("timelength is not null");
            return (Criteria) this;
        }

        public Criteria andTimelengthEqualTo(Integer value) {
            addCriterion("timelength =", value, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthNotEqualTo(Integer value) {
            addCriterion("timelength <>", value, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthGreaterThan(Integer value) {
            addCriterion("timelength >", value, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("timelength >=", value, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthLessThan(Integer value) {
            addCriterion("timelength <", value, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthLessThanOrEqualTo(Integer value) {
            addCriterion("timelength <=", value, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthIn(List<Integer> values) {
            addCriterion("timelength in", values, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthNotIn(List<Integer> values) {
            addCriterion("timelength not in", values, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthBetween(Integer value1, Integer value2) {
            addCriterion("timelength between", value1, value2, "timelength");
            return (Criteria) this;
        }

        public Criteria andTimelengthNotBetween(Integer value1, Integer value2) {
            addCriterion("timelength not between", value1, value2, "timelength");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCoverpathIsNull() {
            addCriterion("coverpath is null");
            return (Criteria) this;
        }

        public Criteria andCoverpathIsNotNull() {
            addCriterion("coverpath is not null");
            return (Criteria) this;
        }

        public Criteria andCoverpathEqualTo(String value) {
            addCriterion("coverpath =", value, "coverpath");
            return (Criteria) this;
        }

        public Criteria andCoverpathNotEqualTo(String value) {
            addCriterion("coverpath <>", value, "coverpath");
            return (Criteria) this;
        }

        public Criteria andCoverpathGreaterThan(String value) {
            addCriterion("coverpath >", value, "coverpath");
            return (Criteria) this;
        }

        public Criteria andCoverpathGreaterThanOrEqualTo(String value) {
            addCriterion("coverpath >=", value, "coverpath");
            return (Criteria) this;
        }

        public Criteria andCoverpathLessThan(String value) {
            addCriterion("coverpath <", value, "coverpath");
            return (Criteria) this;
        }

        public Criteria andCoverpathLessThanOrEqualTo(String value) {
            addCriterion("coverpath <=", value, "coverpath");
            return (Criteria) this;
        }

        public Criteria andCoverpathLike(String value) {
            addCriterion("coverpath like", value, "coverpath");
            return (Criteria) this;
        }

        public Criteria andCoverpathNotLike(String value) {
            addCriterion("coverpath not like", value, "coverpath");
            return (Criteria) this;
        }

        public Criteria andCoverpathIn(List<String> values) {
            addCriterion("coverpath in", values, "coverpath");
            return (Criteria) this;
        }

        public Criteria andCoverpathNotIn(List<String> values) {
            addCriterion("coverpath not in", values, "coverpath");
            return (Criteria) this;
        }

        public Criteria andCoverpathBetween(String value1, String value2) {
            addCriterion("coverpath between", value1, value2, "coverpath");
            return (Criteria) this;
        }

        public Criteria andCoverpathNotBetween(String value1, String value2) {
            addCriterion("coverpath not between", value1, value2, "coverpath");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateuidIsNull() {
            addCriterion("createuid is null");
            return (Criteria) this;
        }

        public Criteria andCreateuidIsNotNull() {
            addCriterion("createuid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuidEqualTo(Integer value) {
            addCriterion("createuid =", value, "createuid");
            return (Criteria) this;
        }

        public Criteria andCreateuidNotEqualTo(Integer value) {
            addCriterion("createuid <>", value, "createuid");
            return (Criteria) this;
        }

        public Criteria andCreateuidGreaterThan(Integer value) {
            addCriterion("createuid >", value, "createuid");
            return (Criteria) this;
        }

        public Criteria andCreateuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("createuid >=", value, "createuid");
            return (Criteria) this;
        }

        public Criteria andCreateuidLessThan(Integer value) {
            addCriterion("createuid <", value, "createuid");
            return (Criteria) this;
        }

        public Criteria andCreateuidLessThanOrEqualTo(Integer value) {
            addCriterion("createuid <=", value, "createuid");
            return (Criteria) this;
        }

        public Criteria andCreateuidIn(List<Integer> values) {
            addCriterion("createuid in", values, "createuid");
            return (Criteria) this;
        }

        public Criteria andCreateuidNotIn(List<Integer> values) {
            addCriterion("createuid not in", values, "createuid");
            return (Criteria) this;
        }

        public Criteria andCreateuidBetween(Integer value1, Integer value2) {
            addCriterion("createuid between", value1, value2, "createuid");
            return (Criteria) this;
        }

        public Criteria andCreateuidNotBetween(Integer value1, Integer value2) {
            addCriterion("createuid not between", value1, value2, "createuid");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return (Criteria) this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return (Criteria) this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterion("edittime =", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotEqualTo(Date value) {
            addCriterion("edittime <>", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThan(Date value) {
            addCriterion("edittime >", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edittime >=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThan(Date value) {
            addCriterion("edittime <", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Date value) {
            addCriterion("edittime <=", value, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeIn(List<Date> values) {
            addCriterion("edittime in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotIn(List<Date> values) {
            addCriterion("edittime not in", values, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
            return (Criteria) this;
        }

        public Criteria andEdituidIsNull() {
            addCriterion("edituid is null");
            return (Criteria) this;
        }

        public Criteria andEdituidIsNotNull() {
            addCriterion("edituid is not null");
            return (Criteria) this;
        }

        public Criteria andEdituidEqualTo(Integer value) {
            addCriterion("edituid =", value, "edituid");
            return (Criteria) this;
        }

        public Criteria andEdituidNotEqualTo(Integer value) {
            addCriterion("edituid <>", value, "edituid");
            return (Criteria) this;
        }

        public Criteria andEdituidGreaterThan(Integer value) {
            addCriterion("edituid >", value, "edituid");
            return (Criteria) this;
        }

        public Criteria andEdituidGreaterThanOrEqualTo(Integer value) {
            addCriterion("edituid >=", value, "edituid");
            return (Criteria) this;
        }

        public Criteria andEdituidLessThan(Integer value) {
            addCriterion("edituid <", value, "edituid");
            return (Criteria) this;
        }

        public Criteria andEdituidLessThanOrEqualTo(Integer value) {
            addCriterion("edituid <=", value, "edituid");
            return (Criteria) this;
        }

        public Criteria andEdituidIn(List<Integer> values) {
            addCriterion("edituid in", values, "edituid");
            return (Criteria) this;
        }

        public Criteria andEdituidNotIn(List<Integer> values) {
            addCriterion("edituid not in", values, "edituid");
            return (Criteria) this;
        }

        public Criteria andEdituidBetween(Integer value1, Integer value2) {
            addCriterion("edituid between", value1, value2, "edituid");
            return (Criteria) this;
        }

        public Criteria andEdituidNotBetween(Integer value1, Integer value2) {
            addCriterion("edituid not between", value1, value2, "edituid");
            return (Criteria) this;
        }

        public Criteria andComposeIsNull() {
            addCriterion("compose is null");
            return (Criteria) this;
        }

        public Criteria andComposeIsNotNull() {
            addCriterion("compose is not null");
            return (Criteria) this;
        }

        public Criteria andComposeEqualTo(String value) {
            addCriterion("compose =", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeNotEqualTo(String value) {
            addCriterion("compose <>", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeGreaterThan(String value) {
            addCriterion("compose >", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeGreaterThanOrEqualTo(String value) {
            addCriterion("compose >=", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeLessThan(String value) {
            addCriterion("compose <", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeLessThanOrEqualTo(String value) {
            addCriterion("compose <=", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeLike(String value) {
            addCriterion("compose like", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeNotLike(String value) {
            addCriterion("compose not like", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeIn(List<String> values) {
            addCriterion("compose in", values, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeNotIn(List<String> values) {
            addCriterion("compose not in", values, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeBetween(String value1, String value2) {
            addCriterion("compose between", value1, value2, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeNotBetween(String value1, String value2) {
            addCriterion("compose not between", value1, value2, "compose");
            return (Criteria) this;
        }

        public Criteria andWordsIsNull() {
            addCriterion("words is null");
            return (Criteria) this;
        }

        public Criteria andWordsIsNotNull() {
            addCriterion("words is not null");
            return (Criteria) this;
        }

        public Criteria andWordsEqualTo(String value) {
            addCriterion("words =", value, "words");
            return (Criteria) this;
        }

        public Criteria andWordsNotEqualTo(String value) {
            addCriterion("words <>", value, "words");
            return (Criteria) this;
        }

        public Criteria andWordsGreaterThan(String value) {
            addCriterion("words >", value, "words");
            return (Criteria) this;
        }

        public Criteria andWordsGreaterThanOrEqualTo(String value) {
            addCriterion("words >=", value, "words");
            return (Criteria) this;
        }

        public Criteria andWordsLessThan(String value) {
            addCriterion("words <", value, "words");
            return (Criteria) this;
        }

        public Criteria andWordsLessThanOrEqualTo(String value) {
            addCriterion("words <=", value, "words");
            return (Criteria) this;
        }

        public Criteria andWordsLike(String value) {
            addCriterion("words like", value, "words");
            return (Criteria) this;
        }

        public Criteria andWordsNotLike(String value) {
            addCriterion("words not like", value, "words");
            return (Criteria) this;
        }

        public Criteria andWordsIn(List<String> values) {
            addCriterion("words in", values, "words");
            return (Criteria) this;
        }

        public Criteria andWordsNotIn(List<String> values) {
            addCriterion("words not in", values, "words");
            return (Criteria) this;
        }

        public Criteria andWordsBetween(String value1, String value2) {
            addCriterion("words between", value1, value2, "words");
            return (Criteria) this;
        }

        public Criteria andWordsNotBetween(String value1, String value2) {
            addCriterion("words not between", value1, value2, "words");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("`comment` is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("`comment` is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(Integer value) {
            addCriterion("`comment` =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(Integer value) {
            addCriterion("`comment` <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(Integer value) {
            addCriterion("`comment` >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(Integer value) {
            addCriterion("`comment` >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(Integer value) {
            addCriterion("`comment` <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(Integer value) {
            addCriterion("`comment` <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<Integer> values) {
            addCriterion("`comment` in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<Integer> values) {
            addCriterion("`comment` not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(Integer value1, Integer value2) {
            addCriterion("`comment` between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(Integer value1, Integer value2) {
            addCriterion("`comment` not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCollectIsNull() {
            addCriterion("`collect` is null");
            return (Criteria) this;
        }

        public Criteria andCollectIsNotNull() {
            addCriterion("`collect` is not null");
            return (Criteria) this;
        }

        public Criteria andCollectEqualTo(Integer value) {
            addCriterion("`collect` =", value, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectNotEqualTo(Integer value) {
            addCriterion("`collect` <>", value, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectGreaterThan(Integer value) {
            addCriterion("`collect` >", value, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectGreaterThanOrEqualTo(Integer value) {
            addCriterion("`collect` >=", value, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectLessThan(Integer value) {
            addCriterion("`collect` <", value, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectLessThanOrEqualTo(Integer value) {
            addCriterion("`collect` <=", value, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectIn(List<Integer> values) {
            addCriterion("`collect` in", values, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectNotIn(List<Integer> values) {
            addCriterion("`collect` not in", values, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectBetween(Integer value1, Integer value2) {
            addCriterion("`collect` between", value1, value2, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectNotBetween(Integer value1, Integer value2) {
            addCriterion("`collect` not between", value1, value2, "collect");
            return (Criteria) this;
        }

        public Criteria andBrowseIsNull() {
            addCriterion("`browse` is null");
            return (Criteria) this;
        }

        public Criteria andBrowseIsNotNull() {
            addCriterion("`browse` is not null");
            return (Criteria) this;
        }

        public Criteria andBrowseEqualTo(Integer value) {
            addCriterion("`browse` =", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseNotEqualTo(Integer value) {
            addCriterion("`browse` <>", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseGreaterThan(Integer value) {
            addCriterion("`browse` >", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseGreaterThanOrEqualTo(Integer value) {
            addCriterion("`browse` >=", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseLessThan(Integer value) {
            addCriterion("`browse` <", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseLessThanOrEqualTo(Integer value) {
            addCriterion("`browse` <=", value, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseIn(List<Integer> values) {
            addCriterion("`browse` in", values, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseNotIn(List<Integer> values) {
            addCriterion("`browse` not in", values, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseBetween(Integer value1, Integer value2) {
            addCriterion("`browse` between", value1, value2, "browse");
            return (Criteria) this;
        }

        public Criteria andBrowseNotBetween(Integer value1, Integer value2) {
            addCriterion("`browse` not between", value1, value2, "browse");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNull() {
            addCriterion("download is null");
            return (Criteria) this;
        }

        public Criteria andDownloadIsNotNull() {
            addCriterion("download is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadEqualTo(Integer value) {
            addCriterion("download =", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotEqualTo(Integer value) {
            addCriterion("download <>", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThan(Integer value) {
            addCriterion("download >", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("download >=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThan(Integer value) {
            addCriterion("download <", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadLessThanOrEqualTo(Integer value) {
            addCriterion("download <=", value, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadIn(List<Integer> values) {
            addCriterion("download in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotIn(List<Integer> values) {
            addCriterion("download not in", values, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadBetween(Integer value1, Integer value2) {
            addCriterion("download between", value1, value2, "download");
            return (Criteria) this;
        }

        public Criteria andDownloadNotBetween(Integer value1, Integer value2) {
            addCriterion("download not between", value1, value2, "download");
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