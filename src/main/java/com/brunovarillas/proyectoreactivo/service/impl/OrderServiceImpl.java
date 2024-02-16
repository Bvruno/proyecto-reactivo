package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.order.OrderDto;
import com.brunovarillas.proyectoreactivo.repository.OfferRepository;
import com.brunovarillas.proyectoreactivo.repository.OrderRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.OrderEntity;
import com.brunovarillas.proyectoreactivo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final OfferRepository offerRepository;

    @Override
    public Mono<OrderDto> createOrder(OrderDto orderDto) {
        return offerRepository.findById(orderDto.offerId())
                .flatMap(offerEntity -> {
                    if (offerEntity.getStock() < orderDto.quantity()) {
                        throw new RuntimeException("Not enough stock");
                    }
                    offerEntity.setStock(offerEntity.getStock() - orderDto.quantity());
                    return offerRepository.save(offerEntity)
                            .flatMap(offerEntity1 ->
                                    orderRepository.save(OrderEntity.from(orderDto, offerEntity))
                                            .map(OrderEntity::toDto));
                });
    }

    @Override
    public Mono<OrderDto> cancelOrder(Integer orderId) {
        return null;
    }

    @Override
    public Mono<OrderDto> getOrder(Integer orderId) {
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
    public Flux<OrderDto> deleteOrder(Integer orderId) {
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
