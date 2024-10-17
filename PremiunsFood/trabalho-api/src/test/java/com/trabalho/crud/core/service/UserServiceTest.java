package com.trabalho.crud.core.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.trabalho.crud.core.entity.Prato;
import com.trabalho.crud.core.repository.PratoRepository;

@ActiveProfiles("test")
@SpringBootTest
class PratoServiceTest {

  @Autowired
  private PratoRepository repository;

  @Autowired
  private PratoService service;

  @BeforeEach
  void populateRepository() {
    MockitoAnnotations.openMocks(this);
    repository.save(Prato.builder().nomePrato("Prato 1").valor(45).quantidade(100).build());
    repository.save(Prato.builder().nomePrato("Prato 2").valor(38.90).quantidade(100).build());
    repository.save(Prato.builder().nomePrato("Prato 3").valor(68.90).quantidade(100).build());
  }

  @Test
  @DisplayName("Busca todos os usuários")
  void testBuscarTodosOsUsuarios() {
    var todosPratos = service.findAll();

    assertEquals(3, todosPratos.size());
  }
}
