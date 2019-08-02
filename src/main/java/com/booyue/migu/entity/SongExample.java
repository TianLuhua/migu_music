package com.booyue.migu.entity;

import java.util.ArrayList;
import java.util.List;

public class SongExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Long limit;

    private Long offset;

    public SongExample() {
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

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Long getLimit() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAlbumIdIsNull() {
            addCriterion("album_id is null");
            return (Criteria) this;
        }

        public Criteria andAlbumIdIsNotNull() {
            addCriterion("album_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumIdEqualTo(String value) {
            addCriterion("album_id =", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotEqualTo(String value) {
            addCriterion("album_id <>", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdGreaterThan(String value) {
            addCriterion("album_id >", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdGreaterThanOrEqualTo(String value) {
            addCriterion("album_id >=", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdLessThan(String value) {
            addCriterion("album_id <", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdLessThanOrEqualTo(String value) {
            addCriterion("album_id <=", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdLike(String value) {
            addCriterion("album_id like", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotLike(String value) {
            addCriterion("album_id not like", value, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdIn(List<String> values) {
            addCriterion("album_id in", values, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotIn(List<String> values) {
            addCriterion("album_id not in", values, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdBetween(String value1, String value2) {
            addCriterion("album_id between", value1, value2, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumIdNotBetween(String value1, String value2) {
            addCriterion("album_id not between", value1, value2, "albumId");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIsNull() {
            addCriterion("album_name is null");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIsNotNull() {
            addCriterion("album_name is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumNameEqualTo(String value) {
            addCriterion("album_name =", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotEqualTo(String value) {
            addCriterion("album_name <>", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameGreaterThan(String value) {
            addCriterion("album_name >", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameGreaterThanOrEqualTo(String value) {
            addCriterion("album_name >=", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLessThan(String value) {
            addCriterion("album_name <", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLessThanOrEqualTo(String value) {
            addCriterion("album_name <=", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameLike(String value) {
            addCriterion("album_name like", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotLike(String value) {
            addCriterion("album_name not like", value, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameIn(List<String> values) {
            addCriterion("album_name in", values, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotIn(List<String> values) {
            addCriterion("album_name not in", values, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameBetween(String value1, String value2) {
            addCriterion("album_name between", value1, value2, "albumName");
            return (Criteria) this;
        }

        public Criteria andAlbumNameNotBetween(String value1, String value2) {
            addCriterion("album_name not between", value1, value2, "albumName");
            return (Criteria) this;
        }

        public Criteria andLyricWriterIsNull() {
            addCriterion("lyric_writer is null");
            return (Criteria) this;
        }

        public Criteria andLyricWriterIsNotNull() {
            addCriterion("lyric_writer is not null");
            return (Criteria) this;
        }

        public Criteria andLyricWriterEqualTo(String value) {
            addCriterion("lyric_writer =", value, "lyricWriter");
            return (Criteria) this;
        }

        public Criteria andLyricWriterNotEqualTo(String value) {
            addCriterion("lyric_writer <>", value, "lyricWriter");
            return (Criteria) this;
        }

        public Criteria andLyricWriterGreaterThan(String value) {
            addCriterion("lyric_writer >", value, "lyricWriter");
            return (Criteria) this;
        }

        public Criteria andLyricWriterGreaterThanOrEqualTo(String value) {
            addCriterion("lyric_writer >=", value, "lyricWriter");
            return (Criteria) this;
        }

        public Criteria andLyricWriterLessThan(String value) {
            addCriterion("lyric_writer <", value, "lyricWriter");
            return (Criteria) this;
        }

        public Criteria andLyricWriterLessThanOrEqualTo(String value) {
            addCriterion("lyric_writer <=", value, "lyricWriter");
            return (Criteria) this;
        }

        public Criteria andLyricWriterLike(String value) {
            addCriterion("lyric_writer like", value, "lyricWriter");
            return (Criteria) this;
        }

        public Criteria andLyricWriterNotLike(String value) {
            addCriterion("lyric_writer not like", value, "lyricWriter");
            return (Criteria) this;
        }

        public Criteria andLyricWriterIn(List<String> values) {
            addCriterion("lyric_writer in", values, "lyricWriter");
            return (Criteria) this;
        }

        public Criteria andLyricWriterNotIn(List<String> values) {
            addCriterion("lyric_writer not in", values, "lyricWriter");
            return (Criteria) this;
        }

        public Criteria andLyricWriterBetween(String value1, String value2) {
            addCriterion("lyric_writer between", value1, value2, "lyricWriter");
            return (Criteria) this;
        }

        public Criteria andLyricWriterNotBetween(String value1, String value2) {
            addCriterion("lyric_writer not between", value1, value2, "lyricWriter");
            return (Criteria) this;
        }

        public Criteria andComposerIsNull() {
            addCriterion("composer is null");
            return (Criteria) this;
        }

        public Criteria andComposerIsNotNull() {
            addCriterion("composer is not null");
            return (Criteria) this;
        }

        public Criteria andComposerEqualTo(String value) {
            addCriterion("composer =", value, "composer");
            return (Criteria) this;
        }

        public Criteria andComposerNotEqualTo(String value) {
            addCriterion("composer <>", value, "composer");
            return (Criteria) this;
        }

        public Criteria andComposerGreaterThan(String value) {
            addCriterion("composer >", value, "composer");
            return (Criteria) this;
        }

        public Criteria andComposerGreaterThanOrEqualTo(String value) {
            addCriterion("composer >=", value, "composer");
            return (Criteria) this;
        }

        public Criteria andComposerLessThan(String value) {
            addCriterion("composer <", value, "composer");
            return (Criteria) this;
        }

        public Criteria andComposerLessThanOrEqualTo(String value) {
            addCriterion("composer <=", value, "composer");
            return (Criteria) this;
        }

        public Criteria andComposerLike(String value) {
            addCriterion("composer like", value, "composer");
            return (Criteria) this;
        }

        public Criteria andComposerNotLike(String value) {
            addCriterion("composer not like", value, "composer");
            return (Criteria) this;
        }

        public Criteria andComposerIn(List<String> values) {
            addCriterion("composer in", values, "composer");
            return (Criteria) this;
        }

        public Criteria andComposerNotIn(List<String> values) {
            addCriterion("composer not in", values, "composer");
            return (Criteria) this;
        }

        public Criteria andComposerBetween(String value1, String value2) {
            addCriterion("composer between", value1, value2, "composer");
            return (Criteria) this;
        }

        public Criteria andComposerNotBetween(String value1, String value2) {
            addCriterion("composer not between", value1, value2, "composer");
            return (Criteria) this;
        }

        public Criteria andDynamicLyricIsNull() {
            addCriterion("dynamic_lyric is null");
            return (Criteria) this;
        }

        public Criteria andDynamicLyricIsNotNull() {
            addCriterion("dynamic_lyric is not null");
            return (Criteria) this;
        }

        public Criteria andDynamicLyricEqualTo(String value) {
            addCriterion("dynamic_lyric =", value, "dynamicLyric");
            return (Criteria) this;
        }

        public Criteria andDynamicLyricNotEqualTo(String value) {
            addCriterion("dynamic_lyric <>", value, "dynamicLyric");
            return (Criteria) this;
        }

        public Criteria andDynamicLyricGreaterThan(String value) {
            addCriterion("dynamic_lyric >", value, "dynamicLyric");
            return (Criteria) this;
        }

        public Criteria andDynamicLyricGreaterThanOrEqualTo(String value) {
            addCriterion("dynamic_lyric >=", value, "dynamicLyric");
            return (Criteria) this;
        }

        public Criteria andDynamicLyricLessThan(String value) {
            addCriterion("dynamic_lyric <", value, "dynamicLyric");
            return (Criteria) this;
        }

        public Criteria andDynamicLyricLessThanOrEqualTo(String value) {
            addCriterion("dynamic_lyric <=", value, "dynamicLyric");
            return (Criteria) this;
        }

        public Criteria andDynamicLyricLike(String value) {
            addCriterion("dynamic_lyric like", value, "dynamicLyric");
            return (Criteria) this;
        }

        public Criteria andDynamicLyricNotLike(String value) {
            addCriterion("dynamic_lyric not like", value, "dynamicLyric");
            return (Criteria) this;
        }

        public Criteria andDynamicLyricIn(List<String> values) {
            addCriterion("dynamic_lyric in", values, "dynamicLyric");
            return (Criteria) this;
        }

        public Criteria andDynamicLyricNotIn(List<String> values) {
            addCriterion("dynamic_lyric not in", values, "dynamicLyric");
            return (Criteria) this;
        }

        public Criteria andDynamicLyricBetween(String value1, String value2) {
            addCriterion("dynamic_lyric between", value1, value2, "dynamicLyric");
            return (Criteria) this;
        }

        public Criteria andDynamicLyricNotBetween(String value1, String value2) {
            addCriterion("dynamic_lyric not between", value1, value2, "dynamicLyric");
            return (Criteria) this;
        }

        public Criteria andCrbtUrlIsNull() {
            addCriterion("crbt_url is null");
            return (Criteria) this;
        }

        public Criteria andCrbtUrlIsNotNull() {
            addCriterion("crbt_url is not null");
            return (Criteria) this;
        }

        public Criteria andCrbtUrlEqualTo(String value) {
            addCriterion("crbt_url =", value, "crbtUrl");
            return (Criteria) this;
        }

        public Criteria andCrbtUrlNotEqualTo(String value) {
            addCriterion("crbt_url <>", value, "crbtUrl");
            return (Criteria) this;
        }

        public Criteria andCrbtUrlGreaterThan(String value) {
            addCriterion("crbt_url >", value, "crbtUrl");
            return (Criteria) this;
        }

        public Criteria andCrbtUrlGreaterThanOrEqualTo(String value) {
            addCriterion("crbt_url >=", value, "crbtUrl");
            return (Criteria) this;
        }

        public Criteria andCrbtUrlLessThan(String value) {
            addCriterion("crbt_url <", value, "crbtUrl");
            return (Criteria) this;
        }

        public Criteria andCrbtUrlLessThanOrEqualTo(String value) {
            addCriterion("crbt_url <=", value, "crbtUrl");
            return (Criteria) this;
        }

        public Criteria andCrbtUrlLike(String value) {
            addCriterion("crbt_url like", value, "crbtUrl");
            return (Criteria) this;
        }

        public Criteria andCrbtUrlNotLike(String value) {
            addCriterion("crbt_url not like", value, "crbtUrl");
            return (Criteria) this;
        }

        public Criteria andCrbtUrlIn(List<String> values) {
            addCriterion("crbt_url in", values, "crbtUrl");
            return (Criteria) this;
        }

        public Criteria andCrbtUrlNotIn(List<String> values) {
            addCriterion("crbt_url not in", values, "crbtUrl");
            return (Criteria) this;
        }

        public Criteria andCrbtUrlBetween(String value1, String value2) {
            addCriterion("crbt_url between", value1, value2, "crbtUrl");
            return (Criteria) this;
        }

        public Criteria andCrbtUrlNotBetween(String value1, String value2) {
            addCriterion("crbt_url not between", value1, value2, "crbtUrl");
            return (Criteria) this;
        }

        public Criteria andAuditionUrlIsNull() {
            addCriterion("audition_url is null");
            return (Criteria) this;
        }

        public Criteria andAuditionUrlIsNotNull() {
            addCriterion("audition_url is not null");
            return (Criteria) this;
        }

        public Criteria andAuditionUrlEqualTo(String value) {
            addCriterion("audition_url =", value, "auditionUrl");
            return (Criteria) this;
        }

        public Criteria andAuditionUrlNotEqualTo(String value) {
            addCriterion("audition_url <>", value, "auditionUrl");
            return (Criteria) this;
        }

        public Criteria andAuditionUrlGreaterThan(String value) {
            addCriterion("audition_url >", value, "auditionUrl");
            return (Criteria) this;
        }

        public Criteria andAuditionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("audition_url >=", value, "auditionUrl");
            return (Criteria) this;
        }

        public Criteria andAuditionUrlLessThan(String value) {
            addCriterion("audition_url <", value, "auditionUrl");
            return (Criteria) this;
        }

        public Criteria andAuditionUrlLessThanOrEqualTo(String value) {
            addCriterion("audition_url <=", value, "auditionUrl");
            return (Criteria) this;
        }

        public Criteria andAuditionUrlLike(String value) {
            addCriterion("audition_url like", value, "auditionUrl");
            return (Criteria) this;
        }

        public Criteria andAuditionUrlNotLike(String value) {
            addCriterion("audition_url not like", value, "auditionUrl");
            return (Criteria) this;
        }

        public Criteria andAuditionUrlIn(List<String> values) {
            addCriterion("audition_url in", values, "auditionUrl");
            return (Criteria) this;
        }

        public Criteria andAuditionUrlNotIn(List<String> values) {
            addCriterion("audition_url not in", values, "auditionUrl");
            return (Criteria) this;
        }

        public Criteria andAuditionUrlBetween(String value1, String value2) {
            addCriterion("audition_url between", value1, value2, "auditionUrl");
            return (Criteria) this;
        }

        public Criteria andAuditionUrlNotBetween(String value1, String value2) {
            addCriterion("audition_url not between", value1, value2, "auditionUrl");
            return (Criteria) this;
        }

        public Criteria andArtistNameIsNull() {
            addCriterion("artist_name is null");
            return (Criteria) this;
        }

        public Criteria andArtistNameIsNotNull() {
            addCriterion("artist_name is not null");
            return (Criteria) this;
        }

        public Criteria andArtistNameEqualTo(String value) {
            addCriterion("artist_name =", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameNotEqualTo(String value) {
            addCriterion("artist_name <>", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameGreaterThan(String value) {
            addCriterion("artist_name >", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameGreaterThanOrEqualTo(String value) {
            addCriterion("artist_name >=", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameLessThan(String value) {
            addCriterion("artist_name <", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameLessThanOrEqualTo(String value) {
            addCriterion("artist_name <=", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameLike(String value) {
            addCriterion("artist_name like", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameNotLike(String value) {
            addCriterion("artist_name not like", value, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameIn(List<String> values) {
            addCriterion("artist_name in", values, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameNotIn(List<String> values) {
            addCriterion("artist_name not in", values, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameBetween(String value1, String value2) {
            addCriterion("artist_name between", value1, value2, "artistName");
            return (Criteria) this;
        }

        public Criteria andArtistNameNotBetween(String value1, String value2) {
            addCriterion("artist_name not between", value1, value2, "artistName");
            return (Criteria) this;
        }

        public Criteria andSmallPicIsNull() {
            addCriterion("small_pic is null");
            return (Criteria) this;
        }

        public Criteria andSmallPicIsNotNull() {
            addCriterion("small_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSmallPicEqualTo(String value) {
            addCriterion("small_pic =", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotEqualTo(String value) {
            addCriterion("small_pic <>", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicGreaterThan(String value) {
            addCriterion("small_pic >", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicGreaterThanOrEqualTo(String value) {
            addCriterion("small_pic >=", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicLessThan(String value) {
            addCriterion("small_pic <", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicLessThanOrEqualTo(String value) {
            addCriterion("small_pic <=", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicLike(String value) {
            addCriterion("small_pic like", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotLike(String value) {
            addCriterion("small_pic not like", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicIn(List<String> values) {
            addCriterion("small_pic in", values, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotIn(List<String> values) {
            addCriterion("small_pic not in", values, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicBetween(String value1, String value2) {
            addCriterion("small_pic between", value1, value2, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotBetween(String value1, String value2) {
            addCriterion("small_pic not between", value1, value2, "smallPic");
            return (Criteria) this;
        }

        public Criteria andLargePicIsNull() {
            addCriterion("large_pic is null");
            return (Criteria) this;
        }

        public Criteria andLargePicIsNotNull() {
            addCriterion("large_pic is not null");
            return (Criteria) this;
        }

        public Criteria andLargePicEqualTo(String value) {
            addCriterion("large_pic =", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicNotEqualTo(String value) {
            addCriterion("large_pic <>", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicGreaterThan(String value) {
            addCriterion("large_pic >", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicGreaterThanOrEqualTo(String value) {
            addCriterion("large_pic >=", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicLessThan(String value) {
            addCriterion("large_pic <", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicLessThanOrEqualTo(String value) {
            addCriterion("large_pic <=", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicLike(String value) {
            addCriterion("large_pic like", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicNotLike(String value) {
            addCriterion("large_pic not like", value, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicIn(List<String> values) {
            addCriterion("large_pic in", values, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicNotIn(List<String> values) {
            addCriterion("large_pic not in", values, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicBetween(String value1, String value2) {
            addCriterion("large_pic between", value1, value2, "largePic");
            return (Criteria) this;
        }

        public Criteria andLargePicNotBetween(String value1, String value2) {
            addCriterion("large_pic not between", value1, value2, "largePic");
            return (Criteria) this;
        }

        public Criteria andMediumPicIsNull() {
            addCriterion("medium_pic is null");
            return (Criteria) this;
        }

        public Criteria andMediumPicIsNotNull() {
            addCriterion("medium_pic is not null");
            return (Criteria) this;
        }

        public Criteria andMediumPicEqualTo(String value) {
            addCriterion("medium_pic =", value, "mediumPic");
            return (Criteria) this;
        }

        public Criteria andMediumPicNotEqualTo(String value) {
            addCriterion("medium_pic <>", value, "mediumPic");
            return (Criteria) this;
        }

        public Criteria andMediumPicGreaterThan(String value) {
            addCriterion("medium_pic >", value, "mediumPic");
            return (Criteria) this;
        }

        public Criteria andMediumPicGreaterThanOrEqualTo(String value) {
            addCriterion("medium_pic >=", value, "mediumPic");
            return (Criteria) this;
        }

        public Criteria andMediumPicLessThan(String value) {
            addCriterion("medium_pic <", value, "mediumPic");
            return (Criteria) this;
        }

        public Criteria andMediumPicLessThanOrEqualTo(String value) {
            addCriterion("medium_pic <=", value, "mediumPic");
            return (Criteria) this;
        }

        public Criteria andMediumPicLike(String value) {
            addCriterion("medium_pic like", value, "mediumPic");
            return (Criteria) this;
        }

        public Criteria andMediumPicNotLike(String value) {
            addCriterion("medium_pic not like", value, "mediumPic");
            return (Criteria) this;
        }

        public Criteria andMediumPicIn(List<String> values) {
            addCriterion("medium_pic in", values, "mediumPic");
            return (Criteria) this;
        }

        public Criteria andMediumPicNotIn(List<String> values) {
            addCriterion("medium_pic not in", values, "mediumPic");
            return (Criteria) this;
        }

        public Criteria andMediumPicBetween(String value1, String value2) {
            addCriterion("medium_pic between", value1, value2, "mediumPic");
            return (Criteria) this;
        }

        public Criteria andMediumPicNotBetween(String value1, String value2) {
            addCriterion("medium_pic not between", value1, value2, "mediumPic");
            return (Criteria) this;
        }

        public Criteria andMusicNameIsNull() {
            addCriterion("music_name is null");
            return (Criteria) this;
        }

        public Criteria andMusicNameIsNotNull() {
            addCriterion("music_name is not null");
            return (Criteria) this;
        }

        public Criteria andMusicNameEqualTo(String value) {
            addCriterion("music_name =", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotEqualTo(String value) {
            addCriterion("music_name <>", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameGreaterThan(String value) {
            addCriterion("music_name >", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameGreaterThanOrEqualTo(String value) {
            addCriterion("music_name >=", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameLessThan(String value) {
            addCriterion("music_name <", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameLessThanOrEqualTo(String value) {
            addCriterion("music_name <=", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameLike(String value) {
            addCriterion("music_name like", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotLike(String value) {
            addCriterion("music_name not like", value, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameIn(List<String> values) {
            addCriterion("music_name in", values, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotIn(List<String> values) {
            addCriterion("music_name not in", values, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameBetween(String value1, String value2) {
            addCriterion("music_name between", value1, value2, "musicName");
            return (Criteria) this;
        }

        public Criteria andMusicNameNotBetween(String value1, String value2) {
            addCriterion("music_name not between", value1, value2, "musicName");
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