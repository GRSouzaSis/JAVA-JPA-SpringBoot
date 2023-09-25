package org.appVendas.service;

import org.appVendas.api.dto.PedidoDTO;
import org.appVendas.domain.entity.Pedido;
import org.appVendas.domain.enums.StatusPedido;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
