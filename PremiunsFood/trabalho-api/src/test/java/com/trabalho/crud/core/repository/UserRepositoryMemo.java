package com.trabalho.crud.core.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.test.context.ActiveProfiles;

import com.trabalho.crud.core.entity.Prato;

@ActiveProfiles("test")
@Repository
public class UserRepositoryMemo implements PratoRepository {

  private final List<Prato> pratos = new ArrayList<Prato>();

  @Override
  public List<Prato> findAll() {
    return pratos;
  }

  @Override
  public Optional<Prato> findById(Long id) {
    return pratos.stream().filter(user -> user.getId().equals(id)).findFirst();
  }

  @Override
  public Prato save(Prato prato) {
    var id = pratos.size() + 1;
    prato.setId((long) id);
    pratos.add(prato);
    return prato;
  }

  @Override
  public void deleteById(Long id) {
    pratos.removeIf(user -> user.getId() == id);
  }
}
