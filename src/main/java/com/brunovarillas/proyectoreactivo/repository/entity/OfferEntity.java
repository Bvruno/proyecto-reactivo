package com.brunovarillas.proyectoreactivo.repository.entity;

import com.brunovarillas.proyectoreactivo.controller.dto.offer.CreateOfferDto;
import com.brunovarillas.proyectoreactivo.controller.dto.offer.OfferDto;
import com.brunovarillas.proyectoreactivo.controller.dto.offer.UpdateOfferDto;
import com.brunovarillas.proyectoreactivo.repository.enums.StateOffer;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

@Getter
@Setter
@Builder
@Table("offers")
public class OfferEntity {
    @Id
    private Integer id;

    @Column("product_id")
    private Integer productId;

    @Column("shop_id")
    private Integer shopId;

    private Integer stock;
    private Double price;
    private StateOffer status;
    private Long date;

    @Transient
    private ProductEntity product;
    @Transient
    private ShopEntity shop;

    public static OfferEntity from(CreateOfferDto createOfferDto, Integer shopId) {
        return OfferEntity.builder()
                .productId(createOfferDto.productId())
                .shopId(shopId)
                .stock(createOfferDto.stock())
                .price(createOfferDto.price())
                .status(StateOffer.ACTIVE)
                .date(new Date().getTime())
                .build();
    }

    public OfferDto toDto() {
        return new OfferDto(id, productId, stock, price, status, date);
    }

    public OfferEntity update(UpdateOfferDto updateOfferDto) {
        return OfferEntity.builder()
                .stock(updateOfferDto.stock())
                .price(updateOfferDto.price())
                .status(updateOfferDto.status())
                .date(updateOfferDto.date())
                .build();
    }
}
