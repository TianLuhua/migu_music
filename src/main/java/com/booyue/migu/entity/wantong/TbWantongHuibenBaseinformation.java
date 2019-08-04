package com.booyue.migu.entity.wantong;

import java.io.Serializable;

/**
 * tb_wantong_huiben_baseinformation
 * @author 
 */
public class TbWantongHuibenBaseinformation implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 对应玩曈bookId
     */
    private Integer bookId;

    /**
     * 对应玩曈的isbn
     */
    private String isbn;

    /**
     * 作者
     */
    private String author;

    /**
     * 出版社
     */
    private String publisher;

    /**
     * 翻译
     */
    private String translater;

    /**
     * 出版年份
     */
    private String publisherYear;

    /**
     * 定价
     */
    private String price;

    /**
     * 装帧
     */
    private String binding;

    /**
     * 页数
     */
    private String page;

    /**
     * 丛书信息
     */
    private String seriesBookTitle;

    /**
     * 丛书的名字
     */
    private String seriesBooksName;

    /**
     * 书原名（国外书的话，名字可能是翻译过来的）
     */
    private String originalName;

    /**
     * 内容简介
     */
    private String conentBrief;

    /**
     * 作者简介
     */
    private String authorBrief;

    /**
     * 豆瓣打的标签
     */
    private String tag;

    /**
     * 预留字段（int 20）
     */
    private Integer extend1;

    /**
     * 预留字段（string 200）
     */
    private String extend2;

    /**
     * 状态（1：可用，0：不可用）
     */
    private Integer status;

    /**
     * 书名
     */
    private String name;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTranslater() {
        return translater;
    }

    public void setTranslater(String translater) {
        this.translater = translater;
    }

    public String getPublisherYear() {
        return publisherYear;
    }

    public void setPublisherYear(String publisherYear) {
        this.publisherYear = publisherYear;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getSeriesBookTitle() {
        return seriesBookTitle;
    }

    public void setSeriesBookTitle(String seriesBookTitle) {
        this.seriesBookTitle = seriesBookTitle;
    }

    public String getSeriesBooksName() {
        return seriesBooksName;
    }

    public void setSeriesBooksName(String seriesBooksName) {
        this.seriesBooksName = seriesBooksName;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getConentBrief() {
        return conentBrief;
    }

    public void setConentBrief(String conentBrief) {
        this.conentBrief = conentBrief;
    }

    public String getAuthorBrief() {
        return authorBrief;
    }

    public void setAuthorBrief(String authorBrief) {
        this.authorBrief = authorBrief;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getExtend1() {
        return extend1;
    }

    public void setExtend1(Integer extend1) {
        this.extend1 = extend1;
    }

    public String getExtend2() {
        return extend2;
    }

    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        TbWantongHuibenBaseinformation other = (TbWantongHuibenBaseinformation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
            && (this.getIsbn() == null ? other.getIsbn() == null : this.getIsbn().equals(other.getIsbn()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getPublisher() == null ? other.getPublisher() == null : this.getPublisher().equals(other.getPublisher()))
            && (this.getTranslater() == null ? other.getTranslater() == null : this.getTranslater().equals(other.getTranslater()))
            && (this.getPublisherYear() == null ? other.getPublisherYear() == null : this.getPublisherYear().equals(other.getPublisherYear()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getBinding() == null ? other.getBinding() == null : this.getBinding().equals(other.getBinding()))
            && (this.getPage() == null ? other.getPage() == null : this.getPage().equals(other.getPage()))
            && (this.getSeriesBookTitle() == null ? other.getSeriesBookTitle() == null : this.getSeriesBookTitle().equals(other.getSeriesBookTitle()))
            && (this.getSeriesBooksName() == null ? other.getSeriesBooksName() == null : this.getSeriesBooksName().equals(other.getSeriesBooksName()))
            && (this.getOriginalName() == null ? other.getOriginalName() == null : this.getOriginalName().equals(other.getOriginalName()))
            && (this.getConentBrief() == null ? other.getConentBrief() == null : this.getConentBrief().equals(other.getConentBrief()))
            && (this.getAuthorBrief() == null ? other.getAuthorBrief() == null : this.getAuthorBrief().equals(other.getAuthorBrief()))
            && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()))
            && (this.getExtend1() == null ? other.getExtend1() == null : this.getExtend1().equals(other.getExtend1()))
            && (this.getExtend2() == null ? other.getExtend2() == null : this.getExtend2().equals(other.getExtend2()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getIsbn() == null) ? 0 : getIsbn().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getPublisher() == null) ? 0 : getPublisher().hashCode());
        result = prime * result + ((getTranslater() == null) ? 0 : getTranslater().hashCode());
        result = prime * result + ((getPublisherYear() == null) ? 0 : getPublisherYear().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getBinding() == null) ? 0 : getBinding().hashCode());
        result = prime * result + ((getPage() == null) ? 0 : getPage().hashCode());
        result = prime * result + ((getSeriesBookTitle() == null) ? 0 : getSeriesBookTitle().hashCode());
        result = prime * result + ((getSeriesBooksName() == null) ? 0 : getSeriesBooksName().hashCode());
        result = prime * result + ((getOriginalName() == null) ? 0 : getOriginalName().hashCode());
        result = prime * result + ((getConentBrief() == null) ? 0 : getConentBrief().hashCode());
        result = prime * result + ((getAuthorBrief() == null) ? 0 : getAuthorBrief().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        result = prime * result + ((getExtend1() == null) ? 0 : getExtend1().hashCode());
        result = prime * result + ((getExtend2() == null) ? 0 : getExtend2().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", bookId=").append(bookId);
        sb.append(", isbn=").append(isbn);
        sb.append(", author=").append(author);
        sb.append(", publisher=").append(publisher);
        sb.append(", translater=").append(translater);
        sb.append(", publisherYear=").append(publisherYear);
        sb.append(", price=").append(price);
        sb.append(", binding=").append(binding);
        sb.append(", page=").append(page);
        sb.append(", seriesBookTitle=").append(seriesBookTitle);
        sb.append(", seriesBooksName=").append(seriesBooksName);
        sb.append(", originalName=").append(originalName);
        sb.append(", conentBrief=").append(conentBrief);
        sb.append(", authorBrief=").append(authorBrief);
        sb.append(", tag=").append(tag);
        sb.append(", extend1=").append(extend1);
        sb.append(", extend2=").append(extend2);
        sb.append(", status=").append(status);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}