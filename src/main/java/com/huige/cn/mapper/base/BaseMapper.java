package com.huige.cn.mapper.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 这是对mapper的封装   三个点：
 *      泛型T,封装不同的实体类
 *      Object,封装不同的参数类型
 *      ID，封装不同的基本类型
 */
public interface BaseMapper<T,ID> {
    long countByExample(Object example);

    int deleteByExample(Object example);

    int deleteByPrimaryKey(ID id);

    int insert(T record);

    int insertSelective(T record);

    List<T> selectByExample(Object example);

    T selectByPrimaryKey(ID id);

    int updateByExampleSelective(@Param("record") T record, @Param("example") Object example);

    int updateByExample(@Param("record") T record, @Param("example") Object example);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
