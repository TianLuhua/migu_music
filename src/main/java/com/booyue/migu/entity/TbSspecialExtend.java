package com.booyue.migu.entity;

import java.io.Serializable;

/**
 * tb_sspecial_extend
 * @author 
 */
public class TbSspecialExtend implements Serializable {
    private Integer id;

    private Integer specialid;

    private String allage;

    private String allearly;

    private String allscene;

    private String allclass;

    private Integer extend1;

    private String extend2;

    private String extend3;

    /**
     * 绘本简介
     */
    private String brief;

    /**
     * 购买链接
     */
    private String paylinke;

    /**
     * 豆瓣评分。（根据绘本的isbn去豆瓣读书的接口去爬取）
     */
    private String boubanScore;

    /**
     * 绘本借阅次数。（根据绘本的名字去绘本借阅网爬取）
     */
    private String borrowNum;

    /**
     * 绘本的isbn号码
     */
    private String isbn;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpecialid() {
        return specialid;
    }

    public void setSpecialid(Integer specialid) {
        this.specialid = specialid;
    }

    public String getAllage() {
        return allage;
    }

    public void setAllage(String allage) {
        this.allage = allage;
    }

    public String getAllearly() {
        return allearly;
    }

    public void setAllearly(String allearly) {
        this.allearly = allearly;
    }

    public String getAllscene() {
        return allscene;
    }

    public void setAllscene(String allscene) {
        this.allscene = allscene;
    }

    public String getAllclass() {
        return allclass;
    }

    public void setAllclass(String allclass) {
        this.allclass = allclass;
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

    public String getExtend3() {
        return extend3;
    }

    public void setExtend3(String extend3) {
        this.extend3 = extend3;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getPaylinke() {
        return paylinke;
    }

    public void setPaylinke(String paylinke) {
        this.paylinke = paylinke;
    }

    public String getBoubanScore() {
        return boubanScore;
    }

    public void setBoubanScore(String boubanScore) {
        this.boubanScore = boubanScore;
    }

    public String getBorrowNum() {
        return borrowNum;
    }

    public void setBorrowNum(String borrowNum) {
        this.borrowNum = borrowNum;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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
        TbSspecialExtend other = (TbSspecialExtend) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSpecialid() == null ? other.getSpecialid() == null : this.getSpecialid().equals(other.getSpecialid()))
            && (this.getAllage() == null ? other.getAllage() == null : this.getAllage().equals(other.getAllage()))
            && (this.getAllearly() == null ? other.getAllearly() == null : this.getAllearly().equals(other.getAllearly()))
            && (this.getAllscene() == null ? other.getAllscene() == null : this.getAllscene().equals(other.getAllscene()))
            && (this.getAllclass() == null ? other.getAllclass() == null : this.getAllclass().equals(other.getAllclass()))
            && (this.getExtend1() == null ? other.getExtend1() == null : this.getExtend1().equals(other.getExtend1()))
            && (this.getExtend2() == null ? other.getExtend2() == null : this.getExtend2().equals(other.getExtend2()))
            && (this.getExtend3() == null ? other.getExtend3() == null : this.getExtend3().equals(other.getExtend3()))
            && (this.getBrief() == null ? other.getBrief() == null : this.getBrief().equals(other.getBrief()))
            && (this.getPaylinke() == null ? other.getPaylinke() == null : this.getPaylinke().equals(other.getPaylinke()))
            && (this.getBoubanScore() == null ? other.getBoubanScore() == null : this.getBoubanScore().equals(other.getBoubanScore()))
            && (this.getBorrowNum() == null ? other.getBorrowNum() == null : this.getBorrowNum().equals(other.getBorrowNum()))
            && (this.getIsbn() == null ? other.getIsbn() == null : this.getIsbn().equals(other.getIsbn()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSpecialid() == null) ? 0 : getSpecialid().hashCode());
        result = prime * result + ((getAllage() == null) ? 0 : getAllage().hashCode());
        result = prime * result + ((getAllearly() == null) ? 0 : getAllearly().hashCode());
        result = prime * result + ((getAllscene() == null) ? 0 : getAllscene().hashCode());
        result = prime * result + ((getAllclass() == null) ? 0 : getAllclass().hashCode());
        result = prime * result + ((getExtend1() == null) ? 0 : getExtend1().hashCode());
        result = prime * result + ((getExtend2() == null) ? 0 : getExtend2().hashCode());
        result = prime * result + ((getExtend3() == null) ? 0 : getExtend3().hashCode());
        result = prime * result + ((getBrief() == null) ? 0 : getBrief().hashCode());
        result = prime * result + ((getPaylinke() == null) ? 0 : getPaylinke().hashCode());
        result = prime * result + ((getBoubanScore() == null) ? 0 : getBoubanScore().hashCode());
        result = prime * result + ((getBorrowNum() == null) ? 0 : getBorrowNum().hashCode());
        result = prime * result + ((getIsbn() == null) ? 0 : getIsbn().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", specialid=").append(specialid);
        sb.append(", allage=").append(allage);
        sb.append(", allearly=").append(allearly);
        sb.append(", allscene=").append(allscene);
        sb.append(", allclass=").append(allclass);
        sb.append(", extend1=").append(extend1);
        sb.append(", extend2=").append(extend2);
        sb.append(", extend3=").append(extend3);
        sb.append(", brief=").append(brief);
        sb.append(", paylinke=").append(paylinke);
        sb.append(", boubanScore=").append(boubanScore);
        sb.append(", borrowNum=").append(borrowNum);
        sb.append(", isbn=").append(isbn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}