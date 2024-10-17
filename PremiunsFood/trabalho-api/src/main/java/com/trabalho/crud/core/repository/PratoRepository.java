package com.trabalho.crud.core.repository;

import java.util.List;
import java.util.Optional;

import com.trabalho.crud.core.entity.Prato;

public interface PratoRepository {

  List<Prato> findAll();

  Optional<Prato> findById(Long id);

  Prato save(Prato prato);

  void deleteById(Long id);
}
