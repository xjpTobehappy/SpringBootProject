package com.huige.cn.service.impl;

import com.huige.cn.entity.Brand;
import com.huige.cn.mapper.BrandMapper;
import com.huige.cn.service.BrandService;
import com.huige.cn.service.base.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional //开启事务
public class BrandServiceImpl extends BaseServiceImpl<Brand,Long> implements BrandService {


}
