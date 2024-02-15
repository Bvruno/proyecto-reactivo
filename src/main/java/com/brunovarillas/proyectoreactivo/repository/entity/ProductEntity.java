package com.brunovarillas.proyectoreactivo.repository.entity;

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

    @Transient
    @Column("shop_id")
    private ShopEntity shopId;
}
