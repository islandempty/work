package com.swpu.phone_store.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PayStatusEnum {
    UNPAID(0,"未支付"),
    PAID(1,"已支付");


    private Integer code;
    private String msg;


}
