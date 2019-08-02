package com.booyue.migu.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * song
 *
 * @author
 */

@Data
public class Song implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String albumId;

    private String albumName;

    private String lyricWriter;

    private String composer;

    private String dynamicLyric;

    private String crbtUrl;

    private String auditionUrl;

    private String artistName;

    private String smallPic;

    private String largePic;

    private String mediumPic;

    private String musicName;

    private String tag;
    
}