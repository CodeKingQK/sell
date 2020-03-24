package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * http请求返回的最外层对象
 * Created by 钱坤
 * 2020/2/22 11:39
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
     private Integer code;

     /** 提示信息. */
     private String msg;

     /** 具体内容. */
     private T data;
}