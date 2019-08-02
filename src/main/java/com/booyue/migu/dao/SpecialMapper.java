package com.booyue.migu.dao;

import com.booyue.migu.entity.TbSspecial;
import com.booyue.migu.entity.TbSspecialExample;
import org.springframework.stereotype.Repository;

/**
 * SpecialMapper继承基类
 */
public interface SpecialMapper extends MyBatisBaseDao<TbSspecial, Integer, TbSspecialExample> {
}