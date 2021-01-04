package com.huige.cn.service.impl;

import com.huige.cn.entity.Brand;
import com.huige.cn.entity.Category;
import com.huige.cn.service.BrandService;
import com.huige.cn.service.CategoryService;
import com.huige.cn.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional //开启事务
public class CategoryServiceImpl extends BaseServiceImpl<Category,Long> implements CategoryService {


}
