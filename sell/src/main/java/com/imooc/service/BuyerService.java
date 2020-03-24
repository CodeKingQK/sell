package com.imooc.service;

import com.imooc.dto.OrderDTO;

/**
 * 买家
 * Created by 钱坤
 * 2020/2/29 10:11
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);


}
