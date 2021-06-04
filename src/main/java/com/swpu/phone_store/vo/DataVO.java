package com.swpu.phone_store.vo;

import lombok.Data;

import java.util.List;

@Data
public class DataVO {
   List<PhoneCategoryVO> categories;
   List<PhoneInfoVO> phones;
}
