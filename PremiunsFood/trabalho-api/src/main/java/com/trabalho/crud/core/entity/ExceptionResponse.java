package com.trabalho.crud.core.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ExceptionResponse {

  private String message;

  private String status;

}
