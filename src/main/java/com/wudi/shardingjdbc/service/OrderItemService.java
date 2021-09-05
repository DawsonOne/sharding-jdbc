package com.wudi.shardingjdbc.service;

import com.wudi.shardingjdbc.dao.OrderItemDao;
import com.wudi.shardingjdbc.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 类功能简述：
 * 类功能详述：
 *
 * @author fanxb
 * @date 2019/3/25 14:53
 */
@Service
public class OrderItemService {
    @Autowired
    private OrderItemDao orderItemDao;

    public long addOne(OrderItem item){
        this.orderItemDao.addOne(item);
        return item.getOrderItemId();
    }



}
