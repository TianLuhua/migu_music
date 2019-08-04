package com.booyue.migu.entity.wantong;

import java.io.Serializable;

/**
 * tb_wantong_huiben_score
 * @author 
 */
public class TbWantongHuibenScore implements Serializable {
    /**
     * 主键id
     */
    private Integer id;

    /**
     * 对应玩曈的bookId
     */
    private Integer bookId;

    /**
     * isbn
     */
    private String isnb;

    /**
     * 评分
     */
    private String score;

    /**
     * 评分人数
     */
    private String number;

    /**
     * 5星比例（5星：力荐，4星：推荐，3星：还行，2星：较差，1星：很差）
     */
    private String star5Score;

    /**
     * 4星比例（5星：力荐，4星：推荐，3星：还行，2星：较差，1星：很差）
     */
    private String star4Score;

    /**
     * 3星比例（5星：力荐，4星：推荐，3星：还行，2星：较差，1星：很差）
     */
    private String star3Score;

    /**
     * 2星比例（5星：力荐，4星：推荐，3星：还行，2星：较差，1星：很差）
     */
    private String star2Score;

    /**
     * 1星比例（5星：力荐，4星：推荐，3星：还行，2星：较差，1星：很差）
     */
    private String star1Score;

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

    public String getIsnb() {
        return isnb;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStar5Score() {
        return star5Score;
    }

    public void setStar5Score(String star5Score) {
        this.star5Score = star5Score;
    }

    public String getStar4Score() {
        return star4Score;
    }

    public void setStar4Score(String star4Score) {
        this.star4Score = star4Score;
    }

    public String getStar3Score() {
        return star3Score;
    }

    public void setStar3Score(String star3Score) {
        this.star3Score = star3Score;
    }

    public String getStar2Score() {
        return star2Score;
    }

    public void setStar2Score(String star2Score) {
        this.star2Score = star2Score;
    }

    public String getStar1Score() {
        return star1Score;
    }

    public void setStar1Score(String star1Score) {
        this.star1Score = star1Score;
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
        TbWantongHuibenScore other = (TbWantongHuibenScore) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBookId() == null ? other.getBookId() == null : this.getBookId().equals(other.getBookId()))
            && (this.getIsnb() == null ? other.getIsnb() == null : this.getIsnb().equals(other.getIsnb()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getStar5Score() == null ? other.getStar5Score() == null : this.getStar5Score().equals(other.getStar5Score()))
            && (this.getStar4Score() == null ? other.getStar4Score() == null : this.getStar4Score().equals(other.getStar4Score()))
            && (this.getStar3Score() == null ? other.getStar3Score() == null : this.getStar3Score().equals(other.getStar3Score()))
            && (this.getStar2Score() == null ? other.getStar2Score() == null : this.getStar2Score().equals(other.getStar2Score()))
            && (this.getStar1Score() == null ? other.getStar1Score() == null : this.getStar1Score().equals(other.getStar1Score()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBookId() == null) ? 0 : getBookId().hashCode());
        result = prime * result + ((getIsnb() == null) ? 0 : getIsnb().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getStar5Score() == null) ? 0 : getStar5Score().hashCode());
        result = prime * result + ((getStar4Score() == null) ? 0 : getStar4Score().hashCode());
        result = prime * result + ((getStar3Score() == null) ? 0 : getStar3Score().hashCode());
        result = prime * result + ((getStar2Score() == null) ? 0 : getStar2Score().hashCode());
        result = prime * result + ((getStar1Score() == null) ? 0 : getStar1Score().hashCode());
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
        sb.append(", isnb=").append(isnb);
        sb.append(", score=").append(score);
        sb.append(", number=").append(number);
        sb.append(", star5Score=").append(star5Score);
        sb.append(", star4Score=").append(star4Score);
        sb.append(", star3Score=").append(star3Score);
        sb.append(", star2Score=").append(star2Score);
        sb.append(", star1Score=").append(star1Score);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}