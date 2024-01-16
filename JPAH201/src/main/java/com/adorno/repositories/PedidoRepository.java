package com.adorno.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adorno.modelo.Pedido;
import com.adorno.modelo.Persona;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	public List<Pedido> findByPersona(Persona persona);
}
