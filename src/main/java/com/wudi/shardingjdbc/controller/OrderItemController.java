package com.wudi.shardingjdbc.controller;

import com.alibaba.fastjson.JSONObject;
import com.wudi.shardingjdbc.entity.OrderItem;
import com.wudi.shardingjdbc.service.OrderItemService;
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
@RequestMapping("/orderItem")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @PutMapping("")
    public long addOne(@RequestBody JSONObject obj) {
        OrderItem item = obj.toJavaObject(OrderItem.class);
        return this.orderItemService.addOne(item);
    }


}
