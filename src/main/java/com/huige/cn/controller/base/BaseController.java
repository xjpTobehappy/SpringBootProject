package com.huige.cn.controller.base;

import com.github.pagehelper.PageHelper;
import com.huige.cn.common.http.AxiosResult;
import com.huige.cn.common.http.AxiosStatus;
import com.huige.cn.entity.Brand;
import com.huige.cn.service.base.BaseService;
import com.huige.cn.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

public class BaseController<T, ID> {
    @Autowired
    private BaseService<T, ID> baseService;

    //分页查询所有
    @GetMapping
    public AxiosResult<PageVo<T>> findPage(
            @RequestParam(defaultValue = "1") int currentPage,
            @RequestParam(defaultValue = "5") int pageSize) {
        PageHelper.startPage(currentPage, pageSize);
        PageVo<T> page = baseService.findPage();
        return AxiosResult.success(page);
    }

    //ID查询
    @GetMapping("{id}")
    public AxiosResult<T> findById(@PathVariable ID id) {
        T byId = baseService.findById(id);
        return AxiosResult.success(byId);
    }

    //添加
    @PostMapping
    public AxiosResult<Void> addEntity(@RequestBody T entity) {
        int i = baseService.addEntity(entity);
        return toAxios(i);
    }

    //修改
    @PutMapping
    public AxiosResult<Void> updateEntity(@RequestBody T entity) {
        int i = baseService.updateEntity(entity);
        return toAxios(i);
    }

    //删除
    @DeleteMapping("{id}")
    public AxiosResult<Void> deleteEntity(@PathVariable ID id) {
        return toAxios(baseService.deleteById(id));
    }

    //把里面的方法判断抽取出来  然后上面直接调用即可
    public AxiosResult<Void> toAxios(int row){
        //参数只有大于0说明方法成功   不然则表示失败
        return row>0?AxiosResult.success():AxiosResult.error();
    }
}
