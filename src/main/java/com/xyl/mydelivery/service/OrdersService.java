package com.xyl.mydelivery.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xyl.mydelivery.entity.OrderDetail;
import com.xyl.mydelivery.entity.Orders;

import java.util.List;

public interface OrdersService extends IService<Orders> {

    public void submit(Orders orders);

    public List<OrderDetail> getOrderDetailsByOrderId(Long orderId);
}
