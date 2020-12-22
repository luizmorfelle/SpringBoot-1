package br.com.programa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.programa.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
