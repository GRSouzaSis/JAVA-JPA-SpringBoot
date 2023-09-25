package org.appVendas.service;

import org.appVendas.api.dto.PedidoDTO;
import org.appVendas.domain.entity.Pedido;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);
}
