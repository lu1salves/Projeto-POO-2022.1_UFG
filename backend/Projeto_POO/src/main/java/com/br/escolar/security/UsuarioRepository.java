package com.br.escolar.security;

import com.br.escolar.security.config.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuarios, String> {

}
