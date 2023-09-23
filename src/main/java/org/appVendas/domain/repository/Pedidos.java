package org.appVendas.domain.repository;

import org.appVendas.domain.entity.Pedido;
import org.appVendas.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {
      List<Pedido> findByCliente(Cliente cliente);
}
