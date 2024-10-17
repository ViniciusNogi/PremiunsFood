package com.trabalho.crud.core.mapper;

import org.mapstruct.Mapper;

import com.trabalho.crud.core.dto.PratoDto;
import com.trabalho.crud.core.entity.Prato;

@Mapper(componentModel = "spring")
public interface PratoMapper {

  Prato toEntity(PratoDto dto);

  PratoDto toDto(Prato entity);
  
}
