package org.appVendas.service;

import org.appVendas.api.dto.PedidoDTO;
import org.appVendas.domain.entity.Pedido;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);
    Optional<Pedido> obterPedidoCompleto(Integer id);
}
