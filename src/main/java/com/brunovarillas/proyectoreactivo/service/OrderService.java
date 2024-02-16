package com.brunovarillas.proyectoreactivo.service;

import com.brunovarillas.proyectoreactivo.controller.dto.order.CreateOrderDto;
import com.brunovarillas.proyectoreactivo.controller.dto.order.OrderDto;
import com.brunovarillas.proyectoreactivo.repository.entity.OrderEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface OrderService {
    Mono<OrderDto> createOrder(CreateOrderDto orderDto);
    Mono<OrderDto> getOrder(Integer orderId);
    Flux<OrderDto> getAllOrders();
    Mono<OrderDto> updateOrder(OrderDto orderDto);
    Mono<OrderDto> deleteOrder(Integer orderId);
}
