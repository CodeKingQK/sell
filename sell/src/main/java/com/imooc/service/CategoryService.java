package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * Created by 钱坤
 * 2020/2/21 19:48
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
