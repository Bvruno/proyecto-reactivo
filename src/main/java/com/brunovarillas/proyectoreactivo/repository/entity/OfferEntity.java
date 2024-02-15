package com.brunovarillas.proyectoreactivo.repository.entity;

import com.brunovarillas.proyectoreactivo.controller.dto.offer.OfferDto;
import com.brunovarillas.proyectoreactivo.repository.enums.StateOffer;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Builder
@Table("offers")
public class OfferEntity {
    @Id
    private Integer id;

    @Transient
    @Column("product_id")
    private ProductEntity productId;

    private Integer stock;
    private Double price;
    private StateOffer status;
    private Long date;

    public static OfferEntity from(OfferDto offerDto) {
        return OfferEntity.builder()
                .id(offerDto.offerId())
                .productId(ProductEntity.builder().id(offerDto.productId()).build())
                .stock(offerDto.stock())
                .price(offerDto.price())
                .status(offerDto.status())
                .date(offerDto.date())
                .build();
    }

    public OfferDto toDto() {
        return new OfferDto(id, productId.getId(), stock, price, status, date);
    }
}
