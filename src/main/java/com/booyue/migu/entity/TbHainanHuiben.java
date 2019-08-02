package com.booyue.migu.entity;

import java.io.Serializable;

/**
 * tb_hainan_huiben
 * @author 
 */
public class TbHainanHuiben implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 绘本名字
     */
    private String huibenName;

    /**
     * isbn
     */
    private String isbn;

    /**
     * 出版社
     */
    private String publisherName;

    /**
     * 评价数量
     */
    private String pingjiaCount;

    /**
     * 详情页的url
     */
    private String detailUrl;

    /**
     * 绘本在官网的url
     */
    private String url;

    /**
     * 绘本在jd的价格
     */
    private String jdPrice;

    /**
     * 绘本在jd的评价
     */
    private String jdComment;

    /**
     * 绘本在官网的介绍
     */
    private String introduce;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHuibenName() {
        return huibenName;
    }

    public void setHuibenName(String huibenName) {
        this.huibenName = huibenName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getPingjiaCount() {
        return pingjiaCount;
    }

    public void setPingjiaCount(String pingjiaCount) {
        this.pingjiaCount = pingjiaCount;
    }

    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getJdPrice() {
        return jdPrice;
    }

    public void setJdPrice(String jdPrice) {
        this.jdPrice = jdPrice;
    }

    public String getJdComment() {
        return jdComment;
    }

    public void setJdComment(String jdComment) {
        this.jdComment = jdComment;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TbHainanHuiben other = (TbHainanHuiben) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHuibenName() == null ? other.getHuibenName() == null : this.getHuibenName().equals(other.getHuibenName()))
            && (this.getIsbn() == null ? other.getIsbn() == null : this.getIsbn().equals(other.getIsbn()))
            && (this.getPublisherName() == null ? other.getPublisherName() == null : this.getPublisherName().equals(other.getPublisherName()))
            && (this.getPingjiaCount() == null ? other.getPingjiaCount() == null : this.getPingjiaCount().equals(other.getPingjiaCount()))
            && (this.getDetailUrl() == null ? other.getDetailUrl() == null : this.getDetailUrl().equals(other.getDetailUrl()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getJdPrice() == null ? other.getJdPrice() == null : this.getJdPrice().equals(other.getJdPrice()))
            && (this.getJdComment() == null ? other.getJdComment() == null : this.getJdComment().equals(other.getJdComment()))
            && (this.getIntroduce() == null ? other.getIntroduce() == null : this.getIntroduce().equals(other.getIntroduce()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHuibenName() == null) ? 0 : getHuibenName().hashCode());
        result = prime * result + ((getIsbn() == null) ? 0 : getIsbn().hashCode());
        result = prime * result + ((getPublisherName() == null) ? 0 : getPublisherName().hashCode());
        result = prime * result + ((getPingjiaCount() == null) ? 0 : getPingjiaCount().hashCode());
        result = prime * result + ((getDetailUrl() == null) ? 0 : getDetailUrl().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getJdPrice() == null) ? 0 : getJdPrice().hashCode());
        result = prime * result + ((getJdComment() == null) ? 0 : getJdComment().hashCode());
        result = prime * result + ((getIntroduce() == null) ? 0 : getIntroduce().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", huibenName=").append(huibenName);
        sb.append(", isbn=").append(isbn);
        sb.append(", publisherName=").append(publisherName);
        sb.append(", pingjiaCount=").append(pingjiaCount);
        sb.append(", detailUrl=").append(detailUrl);
        sb.append(", url=").append(url);
        sb.append(", jdPrice=").append(jdPrice);
        sb.append(", jdComment=").append(jdComment);
        sb.append(", introduce=").append(introduce);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}