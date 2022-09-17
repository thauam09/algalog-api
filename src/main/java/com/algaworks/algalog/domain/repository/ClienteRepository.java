package com.algaworks.algalog.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algaworks.algalog.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	// Spring Data JPA provides generation of query methods automatically by
	// providing to the method name sufix + "by" + property name.
	// Ex. find + by + name = findByName

	List<Cliente> findByNome(String nome);

	List<Cliente> findByNomeContaining(String nome);
	
	Optional<Cliente> findByEmail(String email);
}
