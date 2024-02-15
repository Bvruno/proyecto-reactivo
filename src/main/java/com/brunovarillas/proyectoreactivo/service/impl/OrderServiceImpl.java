package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.order.OrderDto;
import com.brunovarillas.proyectoreactivo.repository.OrderRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.OrderEntity;
import com.brunovarillas.proyectoreactivo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    @Override
    public Mono<OrderDto> createOrder(OrderDto orderDto) {
        return null;
    }

    @Override
    public Mono<OrderDto> cancelOrder(OrderDto orderDto) {
        return null;
    }

    @Override
    public Mono<OrderDto> getOrder(OrderDto orderDto) {
        return null;
    }

    @Override
    public Flux<OrderDto> getAllOrders() {
        return null;
    }

    @Override
    public Flux<OrderDto> updateOrder(OrderDto orderDto) {
        return null;
    }

    @Override
    public Flux<OrderDto> deleteOrder(OrderDto orderDto) {
        return null;
    }

    @Override
    public Flux<OrderDto> getOrdersByUser(OrderDto orderDto) {
        return null;
    }

    @Override
    public Flux<OrderDto> getOrdersByProduct(OrderDto orderDto) {
        return null;
    }
}
