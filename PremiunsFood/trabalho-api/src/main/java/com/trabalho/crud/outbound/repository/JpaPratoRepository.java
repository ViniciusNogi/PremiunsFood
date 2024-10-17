package com.trabalho.crud.outbound.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalho.crud.core.entity.Prato;
import com.trabalho.crud.core.repository.PratoRepository;

@Profile("!test")
public interface JpaPratoRepository extends PratoRepository, JpaRepository<Prato, Long> {
}
