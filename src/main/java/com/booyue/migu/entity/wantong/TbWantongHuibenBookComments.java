package com.booyue.migu.entity.wantong;

import java.io.Serializable;

/**
 * tb_wantong_huiben_book_comments
 * @author 
 */
public class TbWantongHuibenBookComments implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 玩曈对应的bookId
     */
    private Integer bookId;

    /**
     * isbn
     */
    private String isbn;

    /**
     * 评论者头像
     */
    private String headPic;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论者名字
     */
    private String name;

    /**
     * 书评断名字
     */
    private String title;

    /**
     * 评分（5星：力荐，4星：推荐，3星：还行，2星：较差，1星：很差）
     */
    private String score;

    /**
     * 评论时间
     */
    private String time;

    /**
     * 点赞人数
     */
    private String usefull;

    /**
     * 踩人数
     */
    private String useless;

    /**
     * 状态（1：可用，0：不可用）
     */
    private Integer status;

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

    public String getHeadPic() {
        return headPic;
    }

    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUsefull() {
        return usefull;
    }

    public void setUsefull(String usefull) {
        this.usefull = usefull;
    }

    public String getUseless() {
        return useless;
    }

    public void setUseless(String useless) {
        this.useless = useless;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
        TbWantongHuibenBookComments other = (TbWantongHuibenBookComments) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
            && (this.getIsbn() == null ? other.getIsbn() == null : this.getIsbn().equals(other.getIsbn()))
            && (this.getHeadPic() == null ? other.getHeadPic() == null : this.getHeadPic().equals(other.getHeadPic()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getTime() == null ? other.getTime() == null : this.getTime().equals(other.getTime()))
            && (this.getUsefull() == null ? other.getUsefull() == null : this.getUsefull().equals(other.getUsefull()))
            && (this.getUseless() == null ? other.getUseless() == null : this.getUseless().equals(other.getUseless()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getIsbn() == null) ? 0 : getIsbn().hashCode());
        result = prime * result + ((getHeadPic() == null) ? 0 : getHeadPic().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getTime() == null) ? 0 : getTime().hashCode());
        result = prime * result + ((getUsefull() == null) ? 0 : getUsefull().hashCode());
        result = prime * result + ((getUseless() == null) ? 0 : getUseless().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", headPic=").append(headPic);
        sb.append(", content=").append(content);
        sb.append(", name=").append(name);
        sb.append(", title=").append(title);
        sb.append(", score=").append(score);
        sb.append(", time=").append(time);
        sb.append(", usefull=").append(usefull);
        sb.append(", useless=").append(useless);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}