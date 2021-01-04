package com.huige.cn.vo;

import lombok.Data;

import java.util.List;

/**
 * 分页的封装
 */

//lombok注解
@Data
public class PageVo<T> {

    private long total;
    private List<T> list;
}
