package com.swpu.phone_store.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderForm {

    @NotEmpty(message = "买家姓名不能为空")
    private String name;
    @NotEmpty(message = "电话不能为空")
    private String tel;
    @NotEmpty(message = "地址不能为空")
    private String address;
    @NotNull(message = "规格不能为空")
    private Integer specsId;
    @NotNull(message = "数量不能为空")
    private Integer quantity;
}
