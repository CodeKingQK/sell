package com.imooc.enums;

import lombok.Getter;

/**
 * 商品状态
 * Created by 钱坤
 * 2020/2/22 10:52
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private String message;

    private Integer code;

    ProductStatusEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
