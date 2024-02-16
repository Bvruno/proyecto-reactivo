package com.brunovarillas.proyectoreactivo.controller;

import com.brunovarillas.proyectoreactivo.controller.dto.order.CreateOrderDto;
import com.brunovarillas.proyectoreactivo.controller.dto.order.OrderDto;
import com.brunovarillas.proyectoreactivo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/{orderId}")
    public Mono<OrderDto> getOrder(@RequestParam Integer orderId) {
        return orderService.getOrder(orderId);
    }

    @GetMapping
    public Flux<OrderDto> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public Mono<OrderDto> createOrder(@RequestBody CreateOrderDto orderDto) {
        return orderService.createOrder(orderDto);
    }

    @PatchMapping
    public Mono<OrderDto> updateOrder(@RequestBody OrderDto orderDto) {
        return orderService.updateOrder(orderDto);
    }

    @DeleteMapping
    public Mono<OrderDto> deleteOrder(@RequestHeader Integer orderId) {
        return orderService.deleteOrder(orderId);
    }

}
