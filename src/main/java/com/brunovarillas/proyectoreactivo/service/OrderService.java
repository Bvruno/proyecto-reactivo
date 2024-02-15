package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.order.OrderDto;
import com.brunovarillas.proyectoreactivo.repository.entity.OrderEntity;
import reactor.core.publisher.Mono;

public interface OrderService {
    Mono<OrderEntity> createOrder(OrderDto orderDto);
    Mono<OrderEntity> cancelOrder(OrderDto orderDto);
    Mono<OrderEntity> getOrder(OrderDto orderDto);
    Mono<OrderEntity> getAllOrders(OrderDto orderDto);
    Mono<OrderEntity> updateOrder(OrderDto orderDto);
    Mono<OrderEntity> deleteOrder(OrderDto orderDto);
    Mono<OrderEntity> getOrdersByUser(OrderDto orderDto);
    Mono<OrderEntity> getOrdersByProduct(OrderDto orderDto);
}
