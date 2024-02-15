package com.brunovarillas.proyectoreactivo.repository.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Builder
@Table("shops")
public class ShopEntity {
    @Id
    private Integer id;
    private String name;
    private String description;
    private String address;
    private String schedule;
}
