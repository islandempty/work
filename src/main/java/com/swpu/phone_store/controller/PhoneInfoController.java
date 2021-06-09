package com.swpu.phone_store.controller;


import com.swpu.phone_store.service.PhoneInfoService;
import com.swpu.phone_store.service.PhoneSpecsService;
import com.swpu.phone_store.utils.ResultVOUtil;
import com.swpu.phone_store.vo.DataVO;
import com.swpu.phone_store.vo.PhoneInfoVO;
import com.swpu.phone_store.vo.ResultVO;
import com.swpu.phone_store.vo.SpecsPackageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 商品表 前端控制器
 * </p>
 */
@RestController
@RequestMapping("/phone")
public class PhoneInfoController {

    @Autowired
    private PhoneInfoService phoneInfoService;

    @Autowired
    private PhoneSpecsService phoneSpecsService;

    @GetMapping("/index")
    public ResultVO<DataVO> index(){
        return ResultVOUtil.success(phoneInfoService.findDataVO());
    }


    @GetMapping("/findByCategoryType/{type}")
    public ResultVO<List<PhoneInfoVO>> findByCategoryType(@PathVariable("type") Integer type){
        return ResultVOUtil.success(phoneInfoService.findByCategoryType(type));
    }

    @GetMapping("/findSpecsByPhoneId/{id}")
    public ResultVO<SpecsPackageVO> findSpecsByPhoneId(@PathVariable("id") Integer id){
        return  ResultVOUtil.success(phoneSpecsService.findSpecsByPhoneId(id));
    }
}

