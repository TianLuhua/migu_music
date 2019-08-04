package com.booyue.migu.entity.wantong;

import java.io.Serializable;

/**
 * tb_wantong_huiben_aboutbook
 * @author 
 */
public class TbWantongHuibenAboutbook implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 读者喜欢的书本关联过来的id
     */
    private Integer originId;

    /**
     * 书名
     */
    private String bookName;

    /**
     * 书本图片
     */
    private String bookPic;

    /**
     * 状态（1：可用，0：不可用）
     */
    private Integer status;

    /**
     * 读者喜欢的书本关联过来的bookId(就是玩曈的bookId)
     */
    private Integer originBookId;

    /**
     * 读者喜欢的书本关联过来的isbn
     */
    private String originIsbn;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOriginId() {
        return originId;
    }

    public void setOriginId(Integer originId) {
        this.originId = originId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPic() {
        return bookPic;
    }

    public void setBookPic(String bookPic) {
        this.bookPic = bookPic;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOriginBookId() {
        return originBookId;
    }

    public void setOriginBookId(Integer originBookId) {
        this.originBookId = originBookId;
    }

    public String getOriginIsbn() {
        return originIsbn;
    }

    public void setOriginIsbn(String originIsbn) {
        this.originIsbn = originIsbn;
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
        TbWantongHuibenAboutbook other = (TbWantongHuibenAboutbook) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOriginId() == null ? other.getOriginId() == null : this.getOriginId().equals(other.getOriginId()))
            && (this.getBookName() == null ? other.getBookName() == null : this.getBookName().equals(other.getBookName()))
            && (this.getBookPic() == null ? other.getBookPic() == null : this.getBookPic().equals(other.getBookPic()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOriginBookId() == null ? other.getOriginBookId() == null : this.getOriginBookId().equals(other.getOriginBookId()))
            && (this.getOriginIsbn() == null ? other.getOriginIsbn() == null : this.getOriginIsbn().equals(other.getOriginIsbn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOriginId() == null) ? 0 : getOriginId().hashCode());
        result = prime * result + ((getBookName() == null) ? 0 : getBookName().hashCode());
        result = prime * result + ((getBookPic() == null) ? 0 : getBookPic().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOriginBookId() == null) ? 0 : getOriginBookId().hashCode());
        result = prime * result + ((getOriginIsbn() == null) ? 0 : getOriginIsbn().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", originId=").append(originId);
        sb.append(", bookName=").append(bookName);
        sb.append(", bookPic=").append(bookPic);
        sb.append(", status=").append(status);
        sb.append(", originBookId=").append(originBookId);
        sb.append(", originIsbn=").append(originIsbn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}