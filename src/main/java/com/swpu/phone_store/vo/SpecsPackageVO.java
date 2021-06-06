package com.swpu.phone_store.vo;

import lombok.Data;

import java.util.Map;

@Data
public class SpecsPackageVO {
    Map<String,String> goods;
    SkuVO sku;
}
