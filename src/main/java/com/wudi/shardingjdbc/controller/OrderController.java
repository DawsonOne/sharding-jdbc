package com.wudi.shardingjdbc.controller;

import com.alibaba.fastjson.JSONObject;
import com.wudi.shardingjdbc.entity.Order;
import com.wudi.shardingjdbc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类功能简述：
 * 类功能详述：
 *
 * @author fanxb
 * @date 2019/3/25 14:25
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PutMapping("")
    public long addOne(@RequestBody JSONObject obj){
        Order order = obj.toJavaObject(Order.class);
        return this.orderService.insertOne(order);
    }

}
