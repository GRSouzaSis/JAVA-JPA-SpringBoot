package org.appVendas.service.impl;

import org.appVendas.domain.repository.Pedidos;
import org.appVendas.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {
    private Pedidos pedidosRepository;

    public PedidoServiceImpl(Pedidos pedidosRepository) {
        this.pedidosRepository = pedidosRepository;
    }
}
