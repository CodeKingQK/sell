package com.imooc.repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 钱坤
 * 2020/2/22 10:09
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    /** 查询上架商品 */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
