package com.booyue.migu.entity.wantong;

import java.util.ArrayList;
import java.util.List;

public class TbWantongHuibenBaseinformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TbWantongHuibenBaseinformationExample() {
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

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNull() {
            addCriterion("publisher is null");
            return (Criteria) this;
        }

        public Criteria andPublisherIsNotNull() {
            addCriterion("publisher is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherEqualTo(String value) {
            addCriterion("publisher =", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotEqualTo(String value) {
            addCriterion("publisher <>", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThan(String value) {
            addCriterion("publisher >", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherGreaterThanOrEqualTo(String value) {
            addCriterion("publisher >=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThan(String value) {
            addCriterion("publisher <", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLessThanOrEqualTo(String value) {
            addCriterion("publisher <=", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherLike(String value) {
            addCriterion("publisher like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotLike(String value) {
            addCriterion("publisher not like", value, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherIn(List<String> values) {
            addCriterion("publisher in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotIn(List<String> values) {
            addCriterion("publisher not in", values, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherBetween(String value1, String value2) {
            addCriterion("publisher between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andPublisherNotBetween(String value1, String value2) {
            addCriterion("publisher not between", value1, value2, "publisher");
            return (Criteria) this;
        }

        public Criteria andTranslaterIsNull() {
            addCriterion("translater is null");
            return (Criteria) this;
        }

        public Criteria andTranslaterIsNotNull() {
            addCriterion("translater is not null");
            return (Criteria) this;
        }

        public Criteria andTranslaterEqualTo(String value) {
            addCriterion("translater =", value, "translater");
            return (Criteria) this;
        }

        public Criteria andTranslaterNotEqualTo(String value) {
            addCriterion("translater <>", value, "translater");
            return (Criteria) this;
        }

        public Criteria andTranslaterGreaterThan(String value) {
            addCriterion("translater >", value, "translater");
            return (Criteria) this;
        }

        public Criteria andTranslaterGreaterThanOrEqualTo(String value) {
            addCriterion("translater >=", value, "translater");
            return (Criteria) this;
        }

        public Criteria andTranslaterLessThan(String value) {
            addCriterion("translater <", value, "translater");
            return (Criteria) this;
        }

        public Criteria andTranslaterLessThanOrEqualTo(String value) {
            addCriterion("translater <=", value, "translater");
            return (Criteria) this;
        }

        public Criteria andTranslaterLike(String value) {
            addCriterion("translater like", value, "translater");
            return (Criteria) this;
        }

        public Criteria andTranslaterNotLike(String value) {
            addCriterion("translater not like", value, "translater");
            return (Criteria) this;
        }

        public Criteria andTranslaterIn(List<String> values) {
            addCriterion("translater in", values, "translater");
            return (Criteria) this;
        }

        public Criteria andTranslaterNotIn(List<String> values) {
            addCriterion("translater not in", values, "translater");
            return (Criteria) this;
        }

        public Criteria andTranslaterBetween(String value1, String value2) {
            addCriterion("translater between", value1, value2, "translater");
            return (Criteria) this;
        }

        public Criteria andTranslaterNotBetween(String value1, String value2) {
            addCriterion("translater not between", value1, value2, "translater");
            return (Criteria) this;
        }

        public Criteria andPublisherYearIsNull() {
            addCriterion("publisher_year is null");
            return (Criteria) this;
        }

        public Criteria andPublisherYearIsNotNull() {
            addCriterion("publisher_year is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherYearEqualTo(String value) {
            addCriterion("publisher_year =", value, "publisherYear");
            return (Criteria) this;
        }

        public Criteria andPublisherYearNotEqualTo(String value) {
            addCriterion("publisher_year <>", value, "publisherYear");
            return (Criteria) this;
        }

        public Criteria andPublisherYearGreaterThan(String value) {
            addCriterion("publisher_year >", value, "publisherYear");
            return (Criteria) this;
        }

        public Criteria andPublisherYearGreaterThanOrEqualTo(String value) {
            addCriterion("publisher_year >=", value, "publisherYear");
            return (Criteria) this;
        }

        public Criteria andPublisherYearLessThan(String value) {
            addCriterion("publisher_year <", value, "publisherYear");
            return (Criteria) this;
        }

        public Criteria andPublisherYearLessThanOrEqualTo(String value) {
            addCriterion("publisher_year <=", value, "publisherYear");
            return (Criteria) this;
        }

        public Criteria andPublisherYearLike(String value) {
            addCriterion("publisher_year like", value, "publisherYear");
            return (Criteria) this;
        }

        public Criteria andPublisherYearNotLike(String value) {
            addCriterion("publisher_year not like", value, "publisherYear");
            return (Criteria) this;
        }

        public Criteria andPublisherYearIn(List<String> values) {
            addCriterion("publisher_year in", values, "publisherYear");
            return (Criteria) this;
        }

        public Criteria andPublisherYearNotIn(List<String> values) {
            addCriterion("publisher_year not in", values, "publisherYear");
            return (Criteria) this;
        }

        public Criteria andPublisherYearBetween(String value1, String value2) {
            addCriterion("publisher_year between", value1, value2, "publisherYear");
            return (Criteria) this;
        }

        public Criteria andPublisherYearNotBetween(String value1, String value2) {
            addCriterion("publisher_year not between", value1, value2, "publisherYear");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andBindingIsNull() {
            addCriterion("binding is null");
            return (Criteria) this;
        }

        public Criteria andBindingIsNotNull() {
            addCriterion("binding is not null");
            return (Criteria) this;
        }

        public Criteria andBindingEqualTo(String value) {
            addCriterion("binding =", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingNotEqualTo(String value) {
            addCriterion("binding <>", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingGreaterThan(String value) {
            addCriterion("binding >", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingGreaterThanOrEqualTo(String value) {
            addCriterion("binding >=", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingLessThan(String value) {
            addCriterion("binding <", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingLessThanOrEqualTo(String value) {
            addCriterion("binding <=", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingLike(String value) {
            addCriterion("binding like", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingNotLike(String value) {
            addCriterion("binding not like", value, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingIn(List<String> values) {
            addCriterion("binding in", values, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingNotIn(List<String> values) {
            addCriterion("binding not in", values, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingBetween(String value1, String value2) {
            addCriterion("binding between", value1, value2, "binding");
            return (Criteria) this;
        }

        public Criteria andBindingNotBetween(String value1, String value2) {
            addCriterion("binding not between", value1, value2, "binding");
            return (Criteria) this;
        }

        public Criteria andPageIsNull() {
            addCriterion("page is null");
            return (Criteria) this;
        }

        public Criteria andPageIsNotNull() {
            addCriterion("page is not null");
            return (Criteria) this;
        }

        public Criteria andPageEqualTo(String value) {
            addCriterion("page =", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotEqualTo(String value) {
            addCriterion("page <>", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThan(String value) {
            addCriterion("page >", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThanOrEqualTo(String value) {
            addCriterion("page >=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThan(String value) {
            addCriterion("page <", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThanOrEqualTo(String value) {
            addCriterion("page <=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLike(String value) {
            addCriterion("page like", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotLike(String value) {
            addCriterion("page not like", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageIn(List<String> values) {
            addCriterion("page in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotIn(List<String> values) {
            addCriterion("page not in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageBetween(String value1, String value2) {
            addCriterion("page between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotBetween(String value1, String value2) {
            addCriterion("page not between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andSeriesBookTitleIsNull() {
            addCriterion("series_book_title is null");
            return (Criteria) this;
        }

        public Criteria andSeriesBookTitleIsNotNull() {
            addCriterion("series_book_title is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesBookTitleEqualTo(String value) {
            addCriterion("series_book_title =", value, "seriesBookTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesBookTitleNotEqualTo(String value) {
            addCriterion("series_book_title <>", value, "seriesBookTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesBookTitleGreaterThan(String value) {
            addCriterion("series_book_title >", value, "seriesBookTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesBookTitleGreaterThanOrEqualTo(String value) {
            addCriterion("series_book_title >=", value, "seriesBookTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesBookTitleLessThan(String value) {
            addCriterion("series_book_title <", value, "seriesBookTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesBookTitleLessThanOrEqualTo(String value) {
            addCriterion("series_book_title <=", value, "seriesBookTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesBookTitleLike(String value) {
            addCriterion("series_book_title like", value, "seriesBookTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesBookTitleNotLike(String value) {
            addCriterion("series_book_title not like", value, "seriesBookTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesBookTitleIn(List<String> values) {
            addCriterion("series_book_title in", values, "seriesBookTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesBookTitleNotIn(List<String> values) {
            addCriterion("series_book_title not in", values, "seriesBookTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesBookTitleBetween(String value1, String value2) {
            addCriterion("series_book_title between", value1, value2, "seriesBookTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesBookTitleNotBetween(String value1, String value2) {
            addCriterion("series_book_title not between", value1, value2, "seriesBookTitle");
            return (Criteria) this;
        }

        public Criteria andSeriesBooksNameIsNull() {
            addCriterion("series_books_name is null");
            return (Criteria) this;
        }

        public Criteria andSeriesBooksNameIsNotNull() {
            addCriterion("series_books_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeriesBooksNameEqualTo(String value) {
            addCriterion("series_books_name =", value, "seriesBooksName");
            return (Criteria) this;
        }

        public Criteria andSeriesBooksNameNotEqualTo(String value) {
            addCriterion("series_books_name <>", value, "seriesBooksName");
            return (Criteria) this;
        }

        public Criteria andSeriesBooksNameGreaterThan(String value) {
            addCriterion("series_books_name >", value, "seriesBooksName");
            return (Criteria) this;
        }

        public Criteria andSeriesBooksNameGreaterThanOrEqualTo(String value) {
            addCriterion("series_books_name >=", value, "seriesBooksName");
            return (Criteria) this;
        }

        public Criteria andSeriesBooksNameLessThan(String value) {
            addCriterion("series_books_name <", value, "seriesBooksName");
            return (Criteria) this;
        }

        public Criteria andSeriesBooksNameLessThanOrEqualTo(String value) {
            addCriterion("series_books_name <=", value, "seriesBooksName");
            return (Criteria) this;
        }

        public Criteria andSeriesBooksNameLike(String value) {
            addCriterion("series_books_name like", value, "seriesBooksName");
            return (Criteria) this;
        }

        public Criteria andSeriesBooksNameNotLike(String value) {
            addCriterion("series_books_name not like", value, "seriesBooksName");
            return (Criteria) this;
        }

        public Criteria andSeriesBooksNameIn(List<String> values) {
            addCriterion("series_books_name in", values, "seriesBooksName");
            return (Criteria) this;
        }

        public Criteria andSeriesBooksNameNotIn(List<String> values) {
            addCriterion("series_books_name not in", values, "seriesBooksName");
            return (Criteria) this;
        }

        public Criteria andSeriesBooksNameBetween(String value1, String value2) {
            addCriterion("series_books_name between", value1, value2, "seriesBooksName");
            return (Criteria) this;
        }

        public Criteria andSeriesBooksNameNotBetween(String value1, String value2) {
            addCriterion("series_books_name not between", value1, value2, "seriesBooksName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameIsNull() {
            addCriterion("original_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginalNameIsNotNull() {
            addCriterion("original_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalNameEqualTo(String value) {
            addCriterion("original_name =", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotEqualTo(String value) {
            addCriterion("original_name <>", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameGreaterThan(String value) {
            addCriterion("original_name >", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameGreaterThanOrEqualTo(String value) {
            addCriterion("original_name >=", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameLessThan(String value) {
            addCriterion("original_name <", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameLessThanOrEqualTo(String value) {
            addCriterion("original_name <=", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameLike(String value) {
            addCriterion("original_name like", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotLike(String value) {
            addCriterion("original_name not like", value, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameIn(List<String> values) {
            addCriterion("original_name in", values, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotIn(List<String> values) {
            addCriterion("original_name not in", values, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameBetween(String value1, String value2) {
            addCriterion("original_name between", value1, value2, "originalName");
            return (Criteria) this;
        }

        public Criteria andOriginalNameNotBetween(String value1, String value2) {
            addCriterion("original_name not between", value1, value2, "originalName");
            return (Criteria) this;
        }

        public Criteria andConentBriefIsNull() {
            addCriterion("conent_brief is null");
            return (Criteria) this;
        }

        public Criteria andConentBriefIsNotNull() {
            addCriterion("conent_brief is not null");
            return (Criteria) this;
        }

        public Criteria andConentBriefEqualTo(String value) {
            addCriterion("conent_brief =", value, "conentBrief");
            return (Criteria) this;
        }

        public Criteria andConentBriefNotEqualTo(String value) {
            addCriterion("conent_brief <>", value, "conentBrief");
            return (Criteria) this;
        }

        public Criteria andConentBriefGreaterThan(String value) {
            addCriterion("conent_brief >", value, "conentBrief");
            return (Criteria) this;
        }

        public Criteria andConentBriefGreaterThanOrEqualTo(String value) {
            addCriterion("conent_brief >=", value, "conentBrief");
            return (Criteria) this;
        }

        public Criteria andConentBriefLessThan(String value) {
            addCriterion("conent_brief <", value, "conentBrief");
            return (Criteria) this;
        }

        public Criteria andConentBriefLessThanOrEqualTo(String value) {
            addCriterion("conent_brief <=", value, "conentBrief");
            return (Criteria) this;
        }

        public Criteria andConentBriefLike(String value) {
            addCriterion("conent_brief like", value, "conentBrief");
            return (Criteria) this;
        }

        public Criteria andConentBriefNotLike(String value) {
            addCriterion("conent_brief not like", value, "conentBrief");
            return (Criteria) this;
        }

        public Criteria andConentBriefIn(List<String> values) {
            addCriterion("conent_brief in", values, "conentBrief");
            return (Criteria) this;
        }

        public Criteria andConentBriefNotIn(List<String> values) {
            addCriterion("conent_brief not in", values, "conentBrief");
            return (Criteria) this;
        }

        public Criteria andConentBriefBetween(String value1, String value2) {
            addCriterion("conent_brief between", value1, value2, "conentBrief");
            return (Criteria) this;
        }

        public Criteria andConentBriefNotBetween(String value1, String value2) {
            addCriterion("conent_brief not between", value1, value2, "conentBrief");
            return (Criteria) this;
        }

        public Criteria andAuthorBriefIsNull() {
            addCriterion("author_brief is null");
            return (Criteria) this;
        }

        public Criteria andAuthorBriefIsNotNull() {
            addCriterion("author_brief is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorBriefEqualTo(String value) {
            addCriterion("author_brief =", value, "authorBrief");
            return (Criteria) this;
        }

        public Criteria andAuthorBriefNotEqualTo(String value) {
            addCriterion("author_brief <>", value, "authorBrief");
            return (Criteria) this;
        }

        public Criteria andAuthorBriefGreaterThan(String value) {
            addCriterion("author_brief >", value, "authorBrief");
            return (Criteria) this;
        }

        public Criteria andAuthorBriefGreaterThanOrEqualTo(String value) {
            addCriterion("author_brief >=", value, "authorBrief");
            return (Criteria) this;
        }

        public Criteria andAuthorBriefLessThan(String value) {
            addCriterion("author_brief <", value, "authorBrief");
            return (Criteria) this;
        }

        public Criteria andAuthorBriefLessThanOrEqualTo(String value) {
            addCriterion("author_brief <=", value, "authorBrief");
            return (Criteria) this;
        }

        public Criteria andAuthorBriefLike(String value) {
            addCriterion("author_brief like", value, "authorBrief");
            return (Criteria) this;
        }

        public Criteria andAuthorBriefNotLike(String value) {
            addCriterion("author_brief not like", value, "authorBrief");
            return (Criteria) this;
        }

        public Criteria andAuthorBriefIn(List<String> values) {
            addCriterion("author_brief in", values, "authorBrief");
            return (Criteria) this;
        }

        public Criteria andAuthorBriefNotIn(List<String> values) {
            addCriterion("author_brief not in", values, "authorBrief");
            return (Criteria) this;
        }

        public Criteria andAuthorBriefBetween(String value1, String value2) {
            addCriterion("author_brief between", value1, value2, "authorBrief");
            return (Criteria) this;
        }

        public Criteria andAuthorBriefNotBetween(String value1, String value2) {
            addCriterion("author_brief not between", value1, value2, "authorBrief");
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