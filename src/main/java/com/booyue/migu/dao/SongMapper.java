package com.booyue.migu.dao;

import com.booyue.migu.entity.Song;
import com.booyue.migu.entity.SongExample;
import org.springframework.stereotype.Repository;

/**
 * SongMapper继承基类
 */
public interface SongMapper extends MyBatisBaseDao<Song, String, SongExample> {
}