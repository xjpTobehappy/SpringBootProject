package com.huige.cn.controller;

import com.huige.cn.controller.base.BaseController;
import com.huige.cn.entity.Category;
import com.huige.cn.entity.Supplier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Category")
public class CategoryController extends BaseController<Category,Long> {
}
