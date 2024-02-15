package com.brunovarillas.proyectoreactivo.controller;

import com.brunovarillas.proyectoreactivo.controller.dto.order.OrderDto;
import com.brunovarillas.proyectoreactivo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping
    public Mono<OrderDto> getOrder(@RequestHeader Integer orderId) {
        return orderService.getOrder(orderId);
    }

    @GetMapping("/all")
    public Flux<OrderDto> getAllOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public Mono<OrderDto> createOrder(@RequestBody OrderDto orderDto) {
        return orderService.createOrder(orderDto);
    }

    @PutMapping
    public Flux<OrderDto> updateOrder(@RequestBody OrderDto orderDto) {
        return orderService.updateOrder(orderDto);
    }

    @DeleteMapping
    public Flux<OrderDto> deleteOrder(@RequestBody Integer orderId) {
        return orderService.deleteOrder(orderId);
    }

    @GetMapping("/user")
    public Flux<OrderDto> getOrdersByUser(@RequestBody OrderDto orderDto) {
        return orderService.getOrdersByUser(orderDto);
    }

    @GetMapping("/product")
    public Flux<OrderDto> getOrdersByProduct(@RequestBody OrderDto orderDto) {
        return orderService.getOrdersByProduct(orderDto);
    }
}
