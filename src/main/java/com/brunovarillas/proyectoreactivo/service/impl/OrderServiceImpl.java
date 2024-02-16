package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.order.CreateOrderDto;
import com.brunovarillas.proyectoreactivo.controller.dto.order.OrderDto;
import com.brunovarillas.proyectoreactivo.repository.OfferRepository;
import com.brunovarillas.proyectoreactivo.repository.OrderRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.OfferEntity;
import com.brunovarillas.proyectoreactivo.repository.entity.OrderEntity;
import com.brunovarillas.proyectoreactivo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final OfferRepository offerRepository;

    @Override
    public Mono<OrderDto> createOrder(CreateOrderDto orderDto) {
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
    public Mono<OrderDto> getOrder(Integer orderId) {
        return orderRepository.findById(orderId).map(OrderEntity::toDto);
    }

    @Override
    public Flux<OrderDto> getAllOrders() {
        return orderRepository.findAll().map(OrderEntity::toDto);
    }

    @Override
    public Mono<OrderDto> updateOrder(OrderDto orderDto) {
        return orderRepository.findById(orderDto.offerId())
                .flatMap(orderEntity -> orderRepository.save(orderEntity.update(orderDto)).thenReturn(orderEntity))
                .map(OrderEntity::toDto);
    }

    @Override
    public Mono<OrderDto> deleteOrder(Integer orderId) {
        return orderRepository.findById(orderId)
                .flatMap(orderEntity -> orderRepository.delete(orderEntity).thenReturn(orderEntity))
                .map(OrderEntity::toDto);
    }

}
