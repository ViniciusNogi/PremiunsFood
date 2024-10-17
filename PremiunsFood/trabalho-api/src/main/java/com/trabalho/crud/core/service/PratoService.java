package com.trabalho.crud.core.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.trabalho.crud.core.dto.PratoDto;
import com.trabalho.crud.core.entity.BusinessException;
import com.trabalho.crud.core.mapper.PratoMapper;
import com.trabalho.crud.core.repository.PratoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PratoService {

  private final PratoRepository repository;

  private final PratoMapper mapper;

  public List<PratoDto> findAll() {
    return repository.findAll().stream().map(user -> mapper.toDto(user)).toList();
  }

  public PratoDto findById(Long id) {
    return repository.findById(id).map(user -> mapper.toDto(user))
        .orElseThrow(() -> BusinessException.notFoundException("Usuário não encontrado"));
  }

  public PratoDto save(PratoDto userDto) {
    var user = mapper.toEntity(userDto);
    return mapper.toDto(repository.save(user));
  }

  public PratoDto update(Long id, PratoDto userDto) {
    var existingUser = this.findById(id);
    userDto.setId(existingUser.getId());
    var user = mapper.toEntity(userDto);
    return mapper.toDto(repository.save(user));
  }

  public void deleteById(Long id) {
    this.findById(id);
    repository.deleteById(id);
  }

}
