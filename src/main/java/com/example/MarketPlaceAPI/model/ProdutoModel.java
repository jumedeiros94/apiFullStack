package com.example.MarketPlaceAPI.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "TB_PRODUTOS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "O nome do produto é obrigatório")
    @Size(max = 100, message = "O nome do produto não pode ter mais de 100 caracteres")
    private String nome;

    @NotNull(message = "O valor do produto é obrigatório")
    @DecimalMin(value = "0.01", message = "O valor do produto deve ser no mínimo 0.01")
    private BigDecimal preco;

    @Min(value = 0, message = "A quantidade do produto não pode ser negativa")
    private int quantidade;
}
