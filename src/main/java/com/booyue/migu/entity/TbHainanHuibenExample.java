package com.booyue.migu.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbHainanHuibenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TbHainanHuibenExample() {
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

        public Criteria andHuibenNameIsNull() {
            addCriterion("huiben_name is null");
            return (Criteria) this;
        }

        public Criteria andHuibenNameIsNotNull() {
            addCriterion("huiben_name is not null");
            return (Criteria) this;
        }

        public Criteria andHuibenNameEqualTo(String value) {
            addCriterion("huiben_name =", value, "huibenName");
            return (Criteria) this;
        }

        public Criteria andHuibenNameNotEqualTo(String value) {
            addCriterion("huiben_name <>", value, "huibenName");
            return (Criteria) this;
        }

        public Criteria andHuibenNameGreaterThan(String value) {
            addCriterion("huiben_name >", value, "huibenName");
            return (Criteria) this;
        }

        public Criteria andHuibenNameGreaterThanOrEqualTo(String value) {
            addCriterion("huiben_name >=", value, "huibenName");
            return (Criteria) this;
        }

        public Criteria andHuibenNameLessThan(String value) {
            addCriterion("huiben_name <", value, "huibenName");
            return (Criteria) this;
        }

        public Criteria andHuibenNameLessThanOrEqualTo(String value) {
            addCriterion("huiben_name <=", value, "huibenName");
            return (Criteria) this;
        }

        public Criteria andHuibenNameLike(String value) {
            addCriterion("huiben_name like", value, "huibenName");
            return (Criteria) this;
        }

        public Criteria andHuibenNameNotLike(String value) {
            addCriterion("huiben_name not like", value, "huibenName");
            return (Criteria) this;
        }

        public Criteria andHuibenNameIn(List<String> values) {
            addCriterion("huiben_name in", values, "huibenName");
            return (Criteria) this;
        }

        public Criteria andHuibenNameNotIn(List<String> values) {
            addCriterion("huiben_name not in", values, "huibenName");
            return (Criteria) this;
        }

        public Criteria andHuibenNameBetween(String value1, String value2) {
            addCriterion("huiben_name between", value1, value2, "huibenName");
            return (Criteria) this;
        }

        public Criteria andHuibenNameNotBetween(String value1, String value2) {
            addCriterion("huiben_name not between", value1, value2, "huibenName");
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

        public Criteria andPublisherNameIsNull() {
            addCriterion("publisher_name is null");
            return (Criteria) this;
        }

        public Criteria andPublisherNameIsNotNull() {
            addCriterion("publisher_name is not null");
            return (Criteria) this;
        }

        public Criteria andPublisherNameEqualTo(String value) {
            addCriterion("publisher_name =", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameNotEqualTo(String value) {
            addCriterion("publisher_name <>", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameGreaterThan(String value) {
            addCriterion("publisher_name >", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameGreaterThanOrEqualTo(String value) {
            addCriterion("publisher_name >=", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameLessThan(String value) {
            addCriterion("publisher_name <", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameLessThanOrEqualTo(String value) {
            addCriterion("publisher_name <=", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameLike(String value) {
            addCriterion("publisher_name like", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameNotLike(String value) {
            addCriterion("publisher_name not like", value, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameIn(List<String> values) {
            addCriterion("publisher_name in", values, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameNotIn(List<String> values) {
            addCriterion("publisher_name not in", values, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameBetween(String value1, String value2) {
            addCriterion("publisher_name between", value1, value2, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPublisherNameNotBetween(String value1, String value2) {
            addCriterion("publisher_name not between", value1, value2, "publisherName");
            return (Criteria) this;
        }

        public Criteria andPingjiaCountIsNull() {
            addCriterion("pingjia_count is null");
            return (Criteria) this;
        }

        public Criteria andPingjiaCountIsNotNull() {
            addCriterion("pingjia_count is not null");
            return (Criteria) this;
        }

        public Criteria andPingjiaCountEqualTo(String value) {
            addCriterion("pingjia_count =", value, "pingjiaCount");
            return (Criteria) this;
        }

        public Criteria andPingjiaCountNotEqualTo(String value) {
            addCriterion("pingjia_count <>", value, "pingjiaCount");
            return (Criteria) this;
        }

        public Criteria andPingjiaCountGreaterThan(String value) {
            addCriterion("pingjia_count >", value, "pingjiaCount");
            return (Criteria) this;
        }

        public Criteria andPingjiaCountGreaterThanOrEqualTo(String value) {
            addCriterion("pingjia_count >=", value, "pingjiaCount");
            return (Criteria) this;
        }

        public Criteria andPingjiaCountLessThan(String value) {
            addCriterion("pingjia_count <", value, "pingjiaCount");
            return (Criteria) this;
        }

        public Criteria andPingjiaCountLessThanOrEqualTo(String value) {
            addCriterion("pingjia_count <=", value, "pingjiaCount");
            return (Criteria) this;
        }

        public Criteria andPingjiaCountLike(String value) {
            addCriterion("pingjia_count like", value, "pingjiaCount");
            return (Criteria) this;
        }

        public Criteria andPingjiaCountNotLike(String value) {
            addCriterion("pingjia_count not like", value, "pingjiaCount");
            return (Criteria) this;
        }

        public Criteria andPingjiaCountIn(List<String> values) {
            addCriterion("pingjia_count in", values, "pingjiaCount");
            return (Criteria) this;
        }

        public Criteria andPingjiaCountNotIn(List<String> values) {
            addCriterion("pingjia_count not in", values, "pingjiaCount");
            return (Criteria) this;
        }

        public Criteria andPingjiaCountBetween(String value1, String value2) {
            addCriterion("pingjia_count between", value1, value2, "pingjiaCount");
            return (Criteria) this;
        }

        public Criteria andPingjiaCountNotBetween(String value1, String value2) {
            addCriterion("pingjia_count not between", value1, value2, "pingjiaCount");
            return (Criteria) this;
        }

        public Criteria andDetailUrlIsNull() {
            addCriterion("detail_url is null");
            return (Criteria) this;
        }

        public Criteria andDetailUrlIsNotNull() {
            addCriterion("detail_url is not null");
            return (Criteria) this;
        }

        public Criteria andDetailUrlEqualTo(String value) {
            addCriterion("detail_url =", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotEqualTo(String value) {
            addCriterion("detail_url <>", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlGreaterThan(String value) {
            addCriterion("detail_url >", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("detail_url >=", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlLessThan(String value) {
            addCriterion("detail_url <", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlLessThanOrEqualTo(String value) {
            addCriterion("detail_url <=", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlLike(String value) {
            addCriterion("detail_url like", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotLike(String value) {
            addCriterion("detail_url not like", value, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlIn(List<String> values) {
            addCriterion("detail_url in", values, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotIn(List<String> values) {
            addCriterion("detail_url not in", values, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlBetween(String value1, String value2) {
            addCriterion("detail_url between", value1, value2, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andDetailUrlNotBetween(String value1, String value2) {
            addCriterion("detail_url not between", value1, value2, "detailUrl");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andJdPriceIsNull() {
            addCriterion("jd_price is null");
            return (Criteria) this;
        }

        public Criteria andJdPriceIsNotNull() {
            addCriterion("jd_price is not null");
            return (Criteria) this;
        }

        public Criteria andJdPriceEqualTo(BigDecimal value) {
            addCriterion("jd_price =", value, "jdPrice");
            return (Criteria) this;
        }

        public Criteria andJdPriceNotEqualTo(BigDecimal value) {
            addCriterion("jd_price <>", value, "jdPrice");
            return (Criteria) this;
        }

        public Criteria andJdPriceGreaterThan(BigDecimal value) {
            addCriterion("jd_price >", value, "jdPrice");
            return (Criteria) this;
        }

        public Criteria andJdPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jd_price >=", value, "jdPrice");
            return (Criteria) this;
        }

        public Criteria andJdPriceLessThan(BigDecimal value) {
            addCriterion("jd_price <", value, "jdPrice");
            return (Criteria) this;
        }

        public Criteria andJdPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jd_price <=", value, "jdPrice");
            return (Criteria) this;
        }

        public Criteria andJdPriceIn(List<BigDecimal> values) {
            addCriterion("jd_price in", values, "jdPrice");
            return (Criteria) this;
        }

        public Criteria andJdPriceNotIn(List<BigDecimal> values) {
            addCriterion("jd_price not in", values, "jdPrice");
            return (Criteria) this;
        }

        public Criteria andJdPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jd_price between", value1, value2, "jdPrice");
            return (Criteria) this;
        }

        public Criteria andJdPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jd_price not between", value1, value2, "jdPrice");
            return (Criteria) this;
        }

        public Criteria andJdCommentIsNull() {
            addCriterion("jd_comment is null");
            return (Criteria) this;
        }

        public Criteria andJdCommentIsNotNull() {
            addCriterion("jd_comment is not null");
            return (Criteria) this;
        }

        public Criteria andJdCommentEqualTo(String value) {
            addCriterion("jd_comment =", value, "jdComment");
            return (Criteria) this;
        }

        public Criteria andJdCommentNotEqualTo(String value) {
            addCriterion("jd_comment <>", value, "jdComment");
            return (Criteria) this;
        }

        public Criteria andJdCommentGreaterThan(String value) {
            addCriterion("jd_comment >", value, "jdComment");
            return (Criteria) this;
        }

        public Criteria andJdCommentGreaterThanOrEqualTo(String value) {
            addCriterion("jd_comment >=", value, "jdComment");
            return (Criteria) this;
        }

        public Criteria andJdCommentLessThan(String value) {
            addCriterion("jd_comment <", value, "jdComment");
            return (Criteria) this;
        }

        public Criteria andJdCommentLessThanOrEqualTo(String value) {
            addCriterion("jd_comment <=", value, "jdComment");
            return (Criteria) this;
        }

        public Criteria andJdCommentLike(String value) {
            addCriterion("jd_comment like", value, "jdComment");
            return (Criteria) this;
        }

        public Criteria andJdCommentNotLike(String value) {
            addCriterion("jd_comment not like", value, "jdComment");
            return (Criteria) this;
        }

        public Criteria andJdCommentIn(List<String> values) {
            addCriterion("jd_comment in", values, "jdComment");
            return (Criteria) this;
        }

        public Criteria andJdCommentNotIn(List<String> values) {
            addCriterion("jd_comment not in", values, "jdComment");
            return (Criteria) this;
        }

        public Criteria andJdCommentBetween(String value1, String value2) {
            addCriterion("jd_comment between", value1, value2, "jdComment");
            return (Criteria) this;
        }

        public Criteria andJdCommentNotBetween(String value1, String value2) {
            addCriterion("jd_comment not between", value1, value2, "jdComment");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNull() {
            addCriterion("introduce is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceIsNotNull() {
            addCriterion("introduce is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceEqualTo(String value) {
            addCriterion("introduce =", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotEqualTo(String value) {
            addCriterion("introduce <>", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThan(String value) {
            addCriterion("introduce >", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("introduce >=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThan(String value) {
            addCriterion("introduce <", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLessThanOrEqualTo(String value) {
            addCriterion("introduce <=", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceLike(String value) {
            addCriterion("introduce like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotLike(String value) {
            addCriterion("introduce not like", value, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceIn(List<String> values) {
            addCriterion("introduce in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotIn(List<String> values) {
            addCriterion("introduce not in", values, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceBetween(String value1, String value2) {
            addCriterion("introduce between", value1, value2, "introduce");
            return (Criteria) this;
        }

        public Criteria andIntroduceNotBetween(String value1, String value2) {
            addCriterion("introduce not between", value1, value2, "introduce");
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