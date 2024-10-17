package com.trabalho.crud.core.mapper;

import com.trabalho.crud.core.dto.PratoDto;
import com.trabalho.crud.core.entity.Prato;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T21:26:21-0300",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class PratoMapperImpl implements PratoMapper {

    @Override
    public Prato toEntity(PratoDto dto) {
        if ( dto == null ) {
            return null;
        }

        Prato.PratoBuilder prato = Prato.builder();

        prato.id( dto.getId() );
        prato.nomePrato( dto.getNomePrato() );
        prato.quantidade( dto.getQuantidade() );
        prato.valor( dto.getValor() );

        return prato.build();
    }

    @Override
    public PratoDto toDto(Prato entity) {
        if ( entity == null ) {
            return null;
        }

        PratoDto pratoDto = new PratoDto();

        pratoDto.setId( entity.getId() );
        pratoDto.setNomePrato( entity.getNomePrato() );
        pratoDto.setQuantidade( entity.getQuantidade() );
        pratoDto.setValor( entity.getValor() );

        return pratoDto;
    }
}
