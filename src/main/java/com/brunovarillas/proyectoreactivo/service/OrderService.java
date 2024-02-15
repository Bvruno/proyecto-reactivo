package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.order.OrderDto;
import com.brunovarillas.proyectoreactivo.repository.entity.OrderEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface OrderService {
    Mono<OrderDto> createOrder(OrderDto orderDto);
    Mono<OrderDto> cancelOrder(OrderDto orderDto);
    Mono<OrderDto> getOrder(OrderDto orderDto);
    Flux<OrderDto> getAllOrders();
    Flux<OrderDto> updateOrder(OrderDto orderDto);
    Flux<OrderDto> deleteOrder(OrderDto orderDto);
    Flux<OrderDto> getOrdersByUser(OrderDto orderDto);
    Flux<OrderDto> getOrdersByProduct(OrderDto orderDto);
}
