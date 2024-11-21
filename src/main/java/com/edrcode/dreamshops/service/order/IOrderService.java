package com.edrcode.dreamshops.service.order;

import com.edrcode.dreamshops.dto.OrderDto;
import com.edrcode.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
