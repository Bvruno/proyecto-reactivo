package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.order.OrderDto;
import com.brunovarillas.proyectoreactivo.repository.entity.OrderEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderService {
    Mono<OrderDto> createOrder(OrderDto orderDto);
    Mono<OrderDto> cancelOrder(Integer orderId);
    Mono<OrderDto> getOrder(Integer orderId);
    Flux<OrderDto> getAllOrders();
    Flux<OrderDto> updateOrder(OrderDto orderDto);
    Flux<OrderDto> deleteOrder(Integer orderId);
    Flux<OrderDto> getOrdersByUser(OrderDto orderDto);
    Flux<OrderDto> getOrdersByProduct(OrderDto orderDto);
}
