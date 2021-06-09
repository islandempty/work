package com.swpu.phone_store.controller;


import com.swpu.phone_store.dto.OrderDTO;
import com.swpu.phone_store.exception.PhoneException;
import com.swpu.phone_store.form.OrderForm;
import com.swpu.phone_store.service.OrderMasterService;
import com.swpu.phone_store.utils.ResultVOUtil;
import com.swpu.phone_store.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 */
@RestController
@RequestMapping("/order")
@Slf4j
public class OrderMasterController {

    @Autowired
    private OrderMasterService orderMasterService;

    @PostMapping("/create")
    public ResultVO create(@Valid @RequestBody OrderForm orderForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            log.error("【创建订单】参数错误,orderForm={}",orderForm);
            throw new PhoneException(bindingResult.getFieldError().getDefaultMessage());
        }

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerPhone(orderForm.getTel());
        orderDTO.setPhoneQuantity(orderForm.getQuantity());
        orderDTO.setSpecsId(orderForm.getSpecsId());

        String orderId = orderMasterService.createOrder(orderDTO);

        Map<String, String> map = new HashMap<>();
        map.put("orderId",orderId);
        return ResultVOUtil.success(map);
    }


    @GetMapping("/detail/{orderId}")
    public ResultVO detail(@PathVariable("orderId") String orderId){
        return ResultVOUtil.success(orderMasterService.findOrderDetailById(orderId));
    }

    @PutMapping("/pay/{orderId}")
    public ResultVO pay(@PathVariable("orderId") String orderId){

        String s = orderMasterService.payOrder(orderId);
        Map<String, String> map = new HashMap<>();
        map.put("orderId",s);
        return ResultVOUtil.success(map);
    }
}

