package com.muller.techshare.data.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("carro")
public class CarroModel {
    @Id
    private Long id;

    private String modelo;

    private String fabricante;

    private Integer anoFabricacao;

    private Integer anoModelo;
}
