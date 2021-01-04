package com.huige.cn.service.impl;

import com.huige.cn.entity.Supplier;
import com.huige.cn.mapper.SupplierMapper;
import com.huige.cn.service.SupplierService;
import com.huige.cn.service.base.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional //开启事务
public class SupplierServiceImpl extends BaseServiceImpl<Supplier,Long> implements SupplierService {

}
