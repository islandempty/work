package com.swpu.phone_store.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO<T> {

    private Integer code;
    private String msg;
    private T data;
}
