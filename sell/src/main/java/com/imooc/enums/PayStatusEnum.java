package com.imooc.enums;

import lombok.Getter;

/**
 * Created by 钱坤
 * 2020/2/23 9:36
 */
@Getter
public enum PayStatusEnum {

    WAIT(0,"等待支付"),
    SUCCESSS(1,"支付成功"),

    ;


    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
