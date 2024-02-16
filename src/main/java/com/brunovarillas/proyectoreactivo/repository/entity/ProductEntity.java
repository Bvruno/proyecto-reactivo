package com.brunovarillas.proyectoreactivo.repository.entity;

import com.brunovarillas.proyectoreactivo.controller.dto.product.ProductDto;
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
@Table("products")
public class ProductEntity {
    @Id
    private Integer id;
    private String name;
    private String description;
    private String urlImage;

    @Column("shop_id")
    private Integer shopId;

    @Transient
    private ShopEntity shop;

    public static ProductEntity from(ProductDto productDto, Integer shopId) {
        return ProductEntity.builder()
                .name(productDto.name())
                .description(productDto.description())
                .urlImage(productDto.urlImage())
                .shopId(shopId)
                .build();
    }

    public ProductDto toDto() {
        return new ProductDto(id, name, description, urlImage, shopId);
    }

    public ProductEntity update(ProductDto productDto) {
        return ProductEntity.builder()
                .id(productDto.id())
                .name(productDto.name())
                .description(productDto.description())
                .urlImage(productDto.urlImage())
                .shopId(productDto.shopId())
                .build();
    }
}
