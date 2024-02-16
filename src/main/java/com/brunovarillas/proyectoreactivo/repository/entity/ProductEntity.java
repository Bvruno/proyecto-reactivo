package com.brunovarillas.proyectoreactivo.repository.entity;

import com.brunovarillas.proyectoreactivo.controller.dto.product.ProductDto;
import com.brunovarillas.proyectoreactivo.repository.enums.StateProduct;
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
    @Column("product_id")
    private Integer productId;
    private String name;
    private String description;

    @Column("url_image")
    private String urlImage;

    @Column("shop_id")
    private Integer shopId;

    private StateProduct status;

    public static ProductEntity from(ProductDto productDto, Integer shopId) {
        return ProductEntity.builder()
                .name(productDto.name())
                .description(productDto.description())
                .urlImage(productDto.urlImage())
                .shopId(shopId)
                .status(StateProduct.ACTIVE)
                .build();
    }

    public ProductDto toDto() {
        return new ProductDto(productId, name, description, urlImage, shopId, status);
    }

    public ProductEntity update(ProductDto productDto) {
        return ProductEntity.builder()
                .productId(productDto.id())
                .name(productDto.name())
                .description(productDto.description())
                .urlImage(productDto.urlImage())
                .shopId(productDto.shopId())
                .status(StateProduct.ACTIVE)
                .build();
    }
}
