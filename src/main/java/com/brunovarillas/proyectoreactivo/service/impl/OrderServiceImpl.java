package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.order.OrderDto;
import com.brunovarillas.proyectoreactivo.repository.OrderRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.OrderEntity;
import com.brunovarillas.proyectoreactivo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    @Override
    public Mono<OrderEntity> createOrder(OrderDto orderDto) {
        return null;
    }

    @Override
    public Mono<OrderEntity> cancelOrder(OrderDto orderDto) {
        return null;
    }

    @Override
    public Mono<OrderEntity> getOrder(OrderDto orderDto) {
        return null;
    }

    @Override
    public Mono<OrderEntity> getAllOrders(OrderDto orderDto) {
        return null;
    }

    @Override
    public Mono<OrderEntity> updateOrder(OrderDto orderDto) {
        return null;
    }

    @Override
    public Mono<OrderEntity> deleteOrder(OrderDto orderDto) {
        return null;
    }

    @Override
    public Mono<OrderEntity> getOrdersByUser(OrderDto orderDto) {
        return null;
    }

    @Override
    public Mono<OrderEntity> getOrdersByProduct(OrderDto orderDto) {
        return null;
    }
}
