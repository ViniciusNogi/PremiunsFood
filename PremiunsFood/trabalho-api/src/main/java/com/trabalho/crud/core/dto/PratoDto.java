package com.trabalho.crud.core.dto;

import lombok.Data;

@Data
public class PratoDto {

  private Long id;

  private String nomePrato;

  private double valor;

  private int quantidade;

}
