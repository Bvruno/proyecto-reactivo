package com.brunovarillas.proyectoreactivo.service.impl;

import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.CreatePurcharseDetailDto;
import com.brunovarillas.proyectoreactivo.controller.dto.purchaseDetail.PurchaseDetailDto;
import com.brunovarillas.proyectoreactivo.repository.OrderRepository;
import com.brunovarillas.proyectoreactivo.repository.PurchaseDetailRepository;
import com.brunovarillas.proyectoreactivo.repository.entity.OrderEntity;
import com.brunovarillas.proyectoreactivo.repository.entity.PurchaseDetailEntity;
import com.brunovarillas.proyectoreactivo.repository.entity.UserEntity;
import com.brunovarillas.proyectoreactivo.repository.enums.StateSale;
import com.brunovarillas.proyectoreactivo.service.PurchaseDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PurchaseDetailServiceImpl implements PurchaseDetailService {
    private final PurchaseDetailRepository purchaseDetailRepository;
    private final OrderRepository orderRepository;

    @Override
    public Mono<PurchaseDetailDto> createPurchaseDetail(CreatePurcharseDetailDto createPurcharseDetailDto, Integer userId) {
        return orderRepository.findAllById(createPurcharseDetailDto.listOrderId())
                .collectList()
                .flatMap(orderEntities ->
                        purchaseDetailRepository.save(PurchaseDetailEntity.from(createPurcharseDetailDto, orderEntities, userId))
                                .map(PurchaseDetailEntity::toDto));

    }

    @Override
    public Mono<PurchaseDetailDto> updatePurchaseDetail(PurchaseDetailDto purchaseDetailDto, Integer purchaseDetailId) {
        return purchaseDetailRepository.findById(purchaseDetailId)
                .flatMap(purchaseDetailEntity -> purchaseDetailRepository.save(purchaseDetailEntity.update(purchaseDetailDto, purchaseDetailId)).thenReturn(purchaseDetailEntity))
                .map(PurchaseDetailEntity::toDto);
    }

    @Override
    public Mono<PurchaseDetailDto> deletePurchaseDetail(Integer purchaseDetailDto) {
        return purchaseDetailRepository.findById(purchaseDetailDto)
                .flatMap(purchaseDetailEntity -> purchaseDetailRepository.delete(purchaseDetailEntity).thenReturn(purchaseDetailEntity))
                .map(PurchaseDetailEntity::toDto);
    }

    @Override
    public Mono<PurchaseDetailDto> getPurchaseDetail(Integer purchaseDetailDto) {
        return purchaseDetailRepository.findById(purchaseDetailDto).map(PurchaseDetailEntity::toDto);
    }

    @Override
    public Flux<PurchaseDetailDto> getAllPurchaseDetails() {
        return purchaseDetailRepository.findAll().map(PurchaseDetailEntity::toDto);
    }

    @Override
    public Flux<PurchaseDetailDto> getPurchaseDetailsByDate(Long date) {
        return purchaseDetailRepository.findByDate(date).map(PurchaseDetailEntity::toDto);
    }

    @Override
    public Flux<PurchaseDetailDto> getPurchaseDetailsByStatus(StateSale status) {
        return purchaseDetailRepository.findByStatus(status).map(PurchaseDetailEntity::toDto);
    }

}
