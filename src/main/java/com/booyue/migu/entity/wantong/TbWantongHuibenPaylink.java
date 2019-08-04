package com.booyue.migu.entity.wantong;

import java.io.Serializable;

/**
 * tb_wantong_huiben_paylink
 * @author 
 */
public class TbWantongHuibenPaylink implements Serializable {
    private Integer id;

    private Integer bookId;

    private String isbn;

    /**
     * 图标
     */
    private String pic;

    /**
     * 名字
     */
    private String name;

    /**
     * jiage
     */
    private String price;

    /**
     * 节省价格
     */
    private String savePrice;

    /**
     * 优惠信息
     */
    private String discountInformation;

    /**
     * 状态（1：可用，0：不可用）
     */
    private Integer status;

    /**
     * 连接地址
     */
    private String link;

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

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSavePrice() {
        return savePrice;
    }

    public void setSavePrice(String savePrice) {
        this.savePrice = savePrice;
    }

    public String getDiscountInformation() {
        return discountInformation;
    }

    public void setDiscountInformation(String discountInformation) {
        this.discountInformation = discountInformation;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
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
        TbWantongHuibenPaylink other = (TbWantongHuibenPaylink) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
            && (this.getIsbn() == null ? other.getIsbn() == null : this.getIsbn().equals(other.getIsbn()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getSavePrice() == null ? other.getSavePrice() == null : this.getSavePrice().equals(other.getSavePrice()))
            && (this.getDiscountInformation() == null ? other.getDiscountInformation() == null : this.getDiscountInformation().equals(other.getDiscountInformation()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getLink() == null ? other.getLink() == null : this.getLink().equals(other.getLink()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getIsbn() == null) ? 0 : getIsbn().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getSavePrice() == null) ? 0 : getSavePrice().hashCode());
        result = prime * result + ((getDiscountInformation() == null) ? 0 : getDiscountInformation().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getLink() == null) ? 0 : getLink().hashCode());
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
        sb.append(", pic=").append(pic);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", savePrice=").append(savePrice);
        sb.append(", discountInformation=").append(discountInformation);
        sb.append(", status=").append(status);
        sb.append(", link=").append(link);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}