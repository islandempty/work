package com.swpu.phone_store.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class PhoneInfoVO {

    @JsonProperty("id")
    private Integer phoneId;

    @JsonProperty("title")
    private String phoneName;

    @JsonProperty("price")
    private String phonePrice;

    @JsonProperty("desc")
    private String phoneDescription;

    private List<Map<String,String>> tag;

    @JsonProperty("thumb")
    private String phoneIcon;
}
