package com.swpu.phone_store.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressForm {

    private Integer id;
    @NotEmpty(message = "买家名字不能为空")
    private String name;
    @NotEmpty(message = "买家电话不能为空")
    private String tel;
    @NotEmpty(message = "省不能为空")
    private String province;
    @NotEmpty(message = "市名字不能为空")
    private String city;
    @NotEmpty(message = "区不能为空")
    private String county;
    @NotEmpty(message = "详细地址不能为空")
    private String addressDetail;
    @NotEmpty(message = "地址编码不能为空")
    private String areaCode;
}
