package com.scapital.aibank.server.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.scapital.aibank.server.entity.po.Product;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductMapper extends BaseMapper<Product> {
}