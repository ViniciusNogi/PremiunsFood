package com.trabalho.crud.inbound.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trabalho.crud.core.dto.PratoDto;
import com.trabalho.crud.core.service.PratoService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class PratoController {

  private final PratoService userService;

  @GetMapping
  public ResponseEntity<List<PratoDto>> getAllUsers() {
    return ResponseEntity.ok(userService.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<PratoDto> getUserById(@PathVariable Long id) {
    return ResponseEntity.ok(userService.findById(id));
  }

  @PostMapping
  public ResponseEntity<PratoDto> createUser(@RequestBody PratoDto pratoDTO) {
    return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(pratoDTO));
  }

  @PutMapping("/{id}")
  public ResponseEntity<PratoDto> updateUser(@PathVariable Long id, @RequestBody PratoDto userDTO) {
    return ResponseEntity.ok(userService.update(id, userDTO));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
    userService.deleteById(id);
    return ResponseEntity.noContent().build();
  }
}
