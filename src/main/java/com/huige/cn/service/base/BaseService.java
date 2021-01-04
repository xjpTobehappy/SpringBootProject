package com.huige.cn.service.base;


import com.huige.cn.vo.PageVo;

import java.util.List;

/**
 * Service 封装完成
 *      T：实体类
 *      ID：id类型
 *      PageVO：分页的封装
 */

public interface BaseService<T,ID> {
    /**
     * 分页查询(调用封装好的分页vo)
     */
    PageVo<T> findPage();

    /**
     * 有条件的查询
     */
    PageVo<T> findPage(Object example);

    /**
     * 通过id查询
     */
    T findById(ID id);

    /**
     * 添加操作
     */
    int addEntity(T entity);


    /**
     * 修改操作
     */
    int updateEntity(T entity);


    /**
     * 删除
     */
    int deleteById(ID id);

    /**
     * 批量添加
     */
    int batchAddEntity(List<T> list);

    /**
     * 批量修改
     */
    int batchUpdateEntity(List<T> list);

    /**
     * 批量删除
     */
    int batchDeleteEntity(List<T> ids);

    /**
     * 封装分页数据
     */
    PageVo<T> setPageVo(List<T> list);
}
