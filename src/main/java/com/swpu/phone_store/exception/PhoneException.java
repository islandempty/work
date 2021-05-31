package com.swpu.phone_store.exception;

import com.swpu.phone_store.enums.ResultEnum;

public class PhoneException extends RuntimeException{

    public PhoneException(ResultEnum resultEnum){
        super(resultEnum.getMsg());
    }

    public PhoneException(String s){
        super(s);
    }
}
