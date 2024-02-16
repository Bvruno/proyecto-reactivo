package com.brunovarillas.proyectoreactivo.repository.entity;

import com.brunovarillas.proyectoreactivo.repository.enums.StateShop;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Builder
@Table("shops")
public class ShopEntity {
    @Id
    @Column("shop_id")
    private Integer shopId;
    private String name;
    private String description;
    private String address;
    private String schedule;
    private StateShop status;
}
