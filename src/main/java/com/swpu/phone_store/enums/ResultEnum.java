package com.swpu.phone_store.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum  ResultEnum {
    PHONE_STOCK_ERROR(0,"手机库存不足"),
    ORDER_NOT_EXIST(1,"订单不存在"),
    DOUBLE_PAYMENT(2,"重复支付"),
    SPECS_NOT_EXIST(3,"规格不存在"),
    PHONE_NOT_EXIST(4,"手机不存在");

    private Integer code;
    private String msg;


}
