package com.wudi.shardingjdbc.dao;

import com.wudi.shardingjdbc.entity.OrderItem;

import java.util.List;

/**
 * 类功能简述：
 * 类功能详述：
 *
 * @author fanxb
 * @date 2019/3/22 16:25
 */
public interface OrderItemDao {
    /**
     * Description:
     *
     * @param orderItem orderItem
     * @author fanxb
     * @date 2019/3/25 14:12
     */
    void addOne(OrderItem orderItem);

    /**
     * Description:
     *
     * @param id id
     * @return java.util.List<com.fanxb.sjdemo.entity.OrderItem>
     * @author fanxb
     * @date 2019/3/25 14:12
     */
    List<OrderItem> getByOrderId(int id);

    /**
     * Description: 根据订单金额连表查询
     *
     * @author fanxb
     * @date 2019/3/26 16:55
     * @param price
     * @return java.util.List<com.fanxb.sjdemo.entity.OrderItem>
     */
    List<OrderItem> getOrderItemByPrice(int price);


}
