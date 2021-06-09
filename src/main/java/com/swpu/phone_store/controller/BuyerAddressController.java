package com.swpu.phone_store.controller;


import com.swpu.phone_store.exception.PhoneException;
import com.swpu.phone_store.form.AddressForm;
import com.swpu.phone_store.service.BuyerAddressService;
import com.swpu.phone_store.utils.ResultVOUtil;
import com.swpu.phone_store.vo.AddressVO;
import com.swpu.phone_store.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.validation.Valid;
import java.util.List;

/**
 * <p>
 * 收货地址表 前端控制器
 * </p>
 */
@RestController
@RequestMapping("/address")
@Slf4j
public class BuyerAddressController {

    @Autowired
    private BuyerAddressService buyerAddressService;

    @GetMapping("/list")
    public ResultVO<List<AddressVO>> list(){
        return ResultVOUtil.success(buyerAddressService.findAllAddresses());
    }

    @PostMapping("/create")
    public ResultVO create(@Valid @RequestBody AddressForm form, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            log.error("【新增地址】参数错误,addressForm={}",form);
            throw new PhoneException(bindingResult.getFieldError().getDefaultMessage());
        }

        buyerAddressService.saveOrUpdateAddress(form);

        return ResultVOUtil.success(null);

    }

    @PutMapping("/update")
    public ResultVO update(@Valid @RequestBody AddressForm form,BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            log.error("【修改地址】参数错误,addressForm={}",form);
            throw new PhoneException(bindingResult.getFieldError().getDefaultMessage());
        }

        buyerAddressService.saveOrUpdateAddress(form);
        return ResultVOUtil.success(null);
    }

    @DeleteMapping("/delete/{id}")
    public ResultVO delete(@PathVariable("id") Integer id){
        buyerAddressService.deleteAddress(id);
        return ResultVOUtil.success(null);
    }
}

