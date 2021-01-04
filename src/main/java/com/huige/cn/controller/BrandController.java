package com.huige.cn.controller;

import com.huige.cn.controller.base.BaseController;
import com.huige.cn.entity.Brand;
import com.huige.cn.entity.Supplier;
import com.huige.cn.service.BrandService;
import com.huige.cn.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandController extends BaseController<Brand,Long> {

}
