package com.booyue.migu.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * tb_sspecial
 * @author 
 */
public class TbSspecial implements Serializable {
    /**
     * ID号
     */
    private Integer id;

    private Integer sid;

    /**
     * 专辑中文名
     */
    private String name;

    /**
     * 专辑外文名称
     */
    private String nameEn;

    /**
     * 朗读者
     */
    private String reader;

    /**
     * ISRC
     */
    private String isrc;

    /**
     * 地区
     */
    private String area;

    /**
     * 发行时间
     */
    private Date publishtime;

    /**
     * 语种
     */
    private String language;

    /**
     * 出版公司
     */
    private String printcompany;

    /**
     * 文件格式
     */
    private String fileform;

    /**
     * 发行公司
     */
    private String publishcompany;

    /**
     * 音质
     */
    private String quality;

    /**
     * 分类1
     */
    private Integer classid;

    /**
     * 分类2
     */
    private Integer classid2;

    /**
     * 年龄段ID
     */
    private Integer agesectionId;

    /**
     * 时长
     */
    private Integer timelength;

    /**
     * 上下柜状态
     */
    private Boolean status;

    /**
     * 封面图片路径
     */
    private String coverpath;

    /**
     * 商品标签
     */
    private String tag;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 管理员ID
     */
    private Integer createuid;

    /**
     * 修改时间
     */
    private Date edittime;

    /**
     * 管理员ID
     */
    private Integer edituid;

    /**
     * 作曲
     */
    private String compose;

    /**
     * 作词
     */
    private String words;

    /**
     * 评论次数
     */
    private Integer comment;

    /**
     * 收藏数
     */
    private Integer collect;

    /**
     * 浏览次数
     */
    private Integer browse;

    /**
     * 下载次数
     */
    private Integer download;

    /**
     * 描述
     */
    private String description;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public String getIsrc() {
        return isrc;
    }

    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPrintcompany() {
        return printcompany;
    }

    public void setPrintcompany(String printcompany) {
        this.printcompany = printcompany;
    }

    public String getFileform() {
        return fileform;
    }

    public void setFileform(String fileform) {
        this.fileform = fileform;
    }

    public String getPublishcompany() {
        return publishcompany;
    }

    public void setPublishcompany(String publishcompany) {
        this.publishcompany = publishcompany;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getClassid2() {
        return classid2;
    }

    public void setClassid2(Integer classid2) {
        this.classid2 = classid2;
    }

    public Integer getAgesectionId() {
        return agesectionId;
    }

    public void setAgesectionId(Integer agesectionId) {
        this.agesectionId = agesectionId;
    }

    public Integer getTimelength() {
        return timelength;
    }

    public void setTimelength(Integer timelength) {
        this.timelength = timelength;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCoverpath() {
        return coverpath;
    }

    public void setCoverpath(String coverpath) {
        this.coverpath = coverpath;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreateuid() {
        return createuid;
    }

    public void setCreateuid(Integer createuid) {
        this.createuid = createuid;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public Integer getEdituid() {
        return edituid;
    }

    public void setEdituid(Integer edituid) {
        this.edituid = edituid;
    }

    public String getCompose() {
        return compose;
    }

    public void setCompose(String compose) {
        this.compose = compose;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public Integer getCollect() {
        return collect;
    }

    public void setCollect(Integer collect) {
        this.collect = collect;
    }

    public Integer getBrowse() {
        return browse;
    }

    public void setBrowse(Integer browse) {
        this.browse = browse;
    }

    public Integer getDownload() {
        return download;
    }

    public void setDownload(Integer download) {
        this.download = download;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        TbSspecial other = (TbSspecial) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getNameEn() == null ? other.getNameEn() == null : this.getNameEn().equals(other.getNameEn()))
            && (this.getReader() == null ? other.getReader() == null : this.getReader().equals(other.getReader()))
            && (this.getIsrc() == null ? other.getIsrc() == null : this.getIsrc().equals(other.getIsrc()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getPublishtime() == null ? other.getPublishtime() == null : this.getPublishtime().equals(other.getPublishtime()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getPrintcompany() == null ? other.getPrintcompany() == null : this.getPrintcompany().equals(other.getPrintcompany()))
            && (this.getFileform() == null ? other.getFileform() == null : this.getFileform().equals(other.getFileform()))
            && (this.getPublishcompany() == null ? other.getPublishcompany() == null : this.getPublishcompany().equals(other.getPublishcompany()))
            && (this.getQuality() == null ? other.getQuality() == null : this.getQuality().equals(other.getQuality()))
            && (this.getClassid() == null ? other.getClassid() == null : this.getClassid().equals(other.getClassid()))
            && (this.getClassid2() == null ? other.getClassid2() == null : this.getClassid2().equals(other.getClassid2()))
            && (this.getAgesectionId() == null ? other.getAgesectionId() == null : this.getAgesectionId().equals(other.getAgesectionId()))
            && (this.getTimelength() == null ? other.getTimelength() == null : this.getTimelength().equals(other.getTimelength()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCoverpath() == null ? other.getCoverpath() == null : this.getCoverpath().equals(other.getCoverpath()))
            && (this.getTag() == null ? other.getTag() == null : this.getTag().equals(other.getTag()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getCreateuid() == null ? other.getCreateuid() == null : this.getCreateuid().equals(other.getCreateuid()))
            && (this.getEdittime() == null ? other.getEdittime() == null : this.getEdittime().equals(other.getEdittime()))
            && (this.getEdituid() == null ? other.getEdituid() == null : this.getEdituid().equals(other.getEdituid()))
            && (this.getCompose() == null ? other.getCompose() == null : this.getCompose().equals(other.getCompose()))
            && (this.getWords() == null ? other.getWords() == null : this.getWords().equals(other.getWords()))
            && (this.getComment() == null ? other.getComment() == null : this.getComment().equals(other.getComment()))
            && (this.getCollect() == null ? other.getCollect() == null : this.getCollect().equals(other.getCollect()))
            && (this.getBrowse() == null ? other.getBrowse() == null : this.getBrowse().equals(other.getBrowse()))
            && (this.getDownload() == null ? other.getDownload() == null : this.getDownload().equals(other.getDownload()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getNameEn() == null) ? 0 : getNameEn().hashCode());
        result = prime * result + ((getReader() == null) ? 0 : getReader().hashCode());
        result = prime * result + ((getIsrc() == null) ? 0 : getIsrc().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getPublishtime() == null) ? 0 : getPublishtime().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getPrintcompany() == null) ? 0 : getPrintcompany().hashCode());
        result = prime * result + ((getFileform() == null) ? 0 : getFileform().hashCode());
        result = prime * result + ((getPublishcompany() == null) ? 0 : getPublishcompany().hashCode());
        result = prime * result + ((getQuality() == null) ? 0 : getQuality().hashCode());
        result = prime * result + ((getClassid() == null) ? 0 : getClassid().hashCode());
        result = prime * result + ((getClassid2() == null) ? 0 : getClassid2().hashCode());
        result = prime * result + ((getAgesectionId() == null) ? 0 : getAgesectionId().hashCode());
        result = prime * result + ((getTimelength() == null) ? 0 : getTimelength().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCoverpath() == null) ? 0 : getCoverpath().hashCode());
        result = prime * result + ((getTag() == null) ? 0 : getTag().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getCreateuid() == null) ? 0 : getCreateuid().hashCode());
        result = prime * result + ((getEdittime() == null) ? 0 : getEdittime().hashCode());
        result = prime * result + ((getEdituid() == null) ? 0 : getEdituid().hashCode());
        result = prime * result + ((getCompose() == null) ? 0 : getCompose().hashCode());
        result = prime * result + ((getWords() == null) ? 0 : getWords().hashCode());
        result = prime * result + ((getComment() == null) ? 0 : getComment().hashCode());
        result = prime * result + ((getCollect() == null) ? 0 : getCollect().hashCode());
        result = prime * result + ((getBrowse() == null) ? 0 : getBrowse().hashCode());
        result = prime * result + ((getDownload() == null) ? 0 : getDownload().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sid=").append(sid);
        sb.append(", name=").append(name);
        sb.append(", nameEn=").append(nameEn);
        sb.append(", reader=").append(reader);
        sb.append(", isrc=").append(isrc);
        sb.append(", area=").append(area);
        sb.append(", publishtime=").append(publishtime);
        sb.append(", language=").append(language);
        sb.append(", printcompany=").append(printcompany);
        sb.append(", fileform=").append(fileform);
        sb.append(", publishcompany=").append(publishcompany);
        sb.append(", quality=").append(quality);
        sb.append(", classid=").append(classid);
        sb.append(", classid2=").append(classid2);
        sb.append(", agesectionId=").append(agesectionId);
        sb.append(", timelength=").append(timelength);
        sb.append(", status=").append(status);
        sb.append(", coverpath=").append(coverpath);
        sb.append(", tag=").append(tag);
        sb.append(", createtime=").append(createtime);
        sb.append(", createuid=").append(createuid);
        sb.append(", edittime=").append(edittime);
        sb.append(", edituid=").append(edituid);
        sb.append(", compose=").append(compose);
        sb.append(", words=").append(words);
        sb.append(", comment=").append(comment);
        sb.append(", collect=").append(collect);
        sb.append(", browse=").append(browse);
        sb.append(", download=").append(download);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}