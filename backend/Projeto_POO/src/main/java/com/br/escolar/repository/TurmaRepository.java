package com.br.escolar.repository;

import com.br.escolar.domain.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository extends JpaRepository<Turma, String> {
}
