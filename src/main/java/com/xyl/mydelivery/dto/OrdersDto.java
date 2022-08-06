package com.xyl.mydelivery.dto;

import com.xyl.mydelivery.entity.OrderDetail;
import com.xyl.mydelivery.entity.Orders;
import lombok.Data;
import java.util.List;

@Data
public class OrdersDto extends Orders {

    private String userName;

    private String phone;

    private String address;

    private String consignee;

    private List<OrderDetail> orderDetails;

}
