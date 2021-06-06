package com.swpu.phone_store.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class PhoneSpecsVO2 {

    @JsonProperty("s1")
    private Integer specsId;
    @JsonProperty("stock_num")
    private Integer specsStock;
    @JsonProperty("price")
    private BigDecimal specsPrice;
}
