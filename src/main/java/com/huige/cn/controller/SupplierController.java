package com.huige.cn.controller;

import com.huige.cn.controller.base.BaseController;
import com.huige.cn.entity.Supplier;
import com.huige.cn.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("supplier")
public class SupplierController extends BaseController<Supplier,Long> {


}
