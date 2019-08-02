package com.booyue.migu.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_wantong_huiben
 * @author 
 */
public class TbWantongHuiben implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 作者
     */
    private String author;

    /**
     * isbn
     */
    private String isbn;

    /**
     * 封面（貌似还需要添加顽童的前缀）
     */
    private String coverimage;

    /**
     * 绘本名字
     */
    private String name;

    /**
     * 出版社
     */
    private String publisher;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createdtime;

    /**
     * 状态：0可用，1不可用
     */
    private Integer state;

    /**
     * 书的类型，0玩瞳书库，1网络
     */
    private Integer bookcategory;

    /**
     * 顽童的bookId
     */
    private Integer bookid;

    /**
     * 图片
     */
    private String thumbnailurl;

    /**
     * 标签
     */
    private String booklabels;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCoverimage() {
        return coverimage;
    }

    public void setCoverimage(String coverimage) {
        this.coverimage = coverimage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getBookcategory() {
        return bookcategory;
    }

    public void setBookcategory(Integer bookcategory) {
        this.bookcategory = bookcategory;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getThumbnailurl() {
        return thumbnailurl;
    }

    public void setThumbnailurl(String thumbnailurl) {
        this.thumbnailurl = thumbnailurl;
    }

    public String getBooklabels() {
        return booklabels;
    }

    public void setBooklabels(String booklabels) {
        this.booklabels = booklabels;
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
        TbWantongHuiben other = (TbWantongHuiben) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAuthor() == null ? other.getAuthor() == null : this.getAuthor().equals(other.getAuthor()))
            && (this.getIsbn() == null ? other.getIsbn() == null : this.getIsbn().equals(other.getIsbn()))
            && (this.getCoverimage() == null ? other.getCoverimage() == null : this.getCoverimage().equals(other.getCoverimage()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPublisher() == null ? other.getPublisher() == null : this.getPublisher().equals(other.getPublisher()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCreatedtime() == null ? other.getCreatedtime() == null : this.getCreatedtime().equals(other.getCreatedtime()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getBookcategory() == null ? other.getBookcategory() == null : this.getBookcategory().equals(other.getBookcategory()))
            && (this.getBookid() == null ? other.getBookid() == null : this.getBookid().equals(other.getBookid()))
            && (this.getThumbnailurl() == null ? other.getThumbnailurl() == null : this.getThumbnailurl().equals(other.getThumbnailurl()))
            && (this.getBooklabels() == null ? other.getBooklabels() == null : this.getBooklabels().equals(other.getBooklabels()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        result = prime * result + ((getIsbn() == null) ? 0 : getIsbn().hashCode());
        result = prime * result + ((getCoverimage() == null) ? 0 : getCoverimage().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPublisher() == null) ? 0 : getPublisher().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCreatedtime() == null) ? 0 : getCreatedtime().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getBookcategory() == null) ? 0 : getBookcategory().hashCode());
        result = prime * result + ((getBookid() == null) ? 0 : getBookid().hashCode());
        result = prime * result + ((getThumbnailurl() == null) ? 0 : getThumbnailurl().hashCode());
        result = prime * result + ((getBooklabels() == null) ? 0 : getBooklabels().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", author=").append(author);
        sb.append(", isbn=").append(isbn);
        sb.append(", coverimage=").append(coverimage);
        sb.append(", name=").append(name);
        sb.append(", publisher=").append(publisher);
        sb.append(", description=").append(description);
        sb.append(", createdtime=").append(createdtime);
        sb.append(", state=").append(state);
        sb.append(", bookcategory=").append(bookcategory);
        sb.append(", bookid=").append(bookid);
        sb.append(", thumbnailurl=").append(thumbnailurl);
        sb.append(", booklabels=").append(booklabels);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}