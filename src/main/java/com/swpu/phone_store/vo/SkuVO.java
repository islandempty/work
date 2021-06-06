package com.swpu.phone_store.vo;

import lombok.Data;

import java.util.List;

@Data
public class SkuVO {

    private List<TreeVO> tree;
    private List<PhoneSpecsVO2> list;
    private String price;
    private Integer stock_num;
    private Boolean none_sku;
    private Boolean hide_stock;
}
