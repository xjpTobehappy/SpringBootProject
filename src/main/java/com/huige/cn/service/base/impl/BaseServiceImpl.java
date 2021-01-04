package com.huige.cn.service.base.impl;

import com.github.pagehelper.PageInfo;
import com.huige.cn.mapper.base.BaseMapper;
import com.huige.cn.service.base.BaseService;
import com.huige.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class BaseServiceImpl<T, ID> implements BaseService<T, ID> {
    //引入封装好的mapper
    @Autowired
    private BaseMapper<T, ID> baseMapper;

    //分页查询全部
    @Override
    public PageVo<T> findPage() {
        List<T> ts = baseMapper.selectByExample(null);
        //调用下面封装好的分页方法
        PageVo<T> pageVo = setPageVo(ts);
        return pageVo;
    }

    //有条件的分页查询
    @Override
    public PageVo<T> findPage(Object example) {
        List<T> ts = baseMapper.selectByExample(example);
        //调用下面封装好的分页方法
        PageVo<T> pageVo = setPageVo(ts);
        return pageVo;
    }

    //查询单个
    @Override
    public T findById(ID id) {
        return baseMapper.selectByPrimaryKey(id);
    }

    //添加单个
    @Override
    public int addEntity(T entity) {
        return baseMapper.insert(entity);
    }

    //修改单个
    @Override
    public int updateEntity(T entity) {
        return baseMapper.updateByPrimaryKey(entity);
    }

    //删除单个
    @Override
    public int deleteById(ID id) {
        return baseMapper.deleteByPrimaryKey(id);
    }

    //添加多个
    @Override
    public int batchAddEntity(List<T> list) {
        //假设都成功了  如果不成功让他去走异常处理
        list.forEach(item->baseMapper.insert(item));
        return 1;
    }

    //修改多个
    @Override
    public int batchUpdateEntity(List<T> list) {
        list.forEach(item->baseMapper.updateByPrimaryKey(item));
        return 1;
    }

    //删除多个
    @Override
    public int batchDeleteEntity(List<T> ids) {
        ids.forEach(item->baseMapper.deleteByPrimaryKey((ID) item));
        return 1;
    }

    /**
     *封装分页数据
     */
    @Override
    public PageVo<T> setPageVo(List<T> list) {
        //分页的参数封装类
        PageInfo<T> pageInfo = new PageInfo<>(list);
        //拿到总条数
        long total = pageInfo.getTotal();
        //调用封装分页属性
        PageVo<T> pageVo = new PageVo<>();
        //结果集
        pageVo.setList(list);
        //封装总条数到分页中
        pageVo.setTotal(total);
        //返回的是早就封装好数据的分页
        return pageVo;
    }


}
