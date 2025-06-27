package com.isai.demo_api_rest_clientes.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.isai.demo_api_rest_clientes.models.dao.ClienteDao;
import com.isai.demo_api_rest_clientes.models.entity.Cliente;
import com.isai.demo_api_rest_clientes.service.ClienteService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl
        implements ClienteService {

    private final ClienteDao clienteDao;

    @Override
    @Transactional
    public Cliente guardarCliente(Cliente cliente) {
        return clienteDao.save(cliente);
    }

    @Override
    @Transactional(readOnly = true)
    public Cliente obtenerClientePorID(Long idCliente) {
        return clienteDao.findById(idCliente)
                .orElseThrow();
    }

    @Override
    @Transactional
    public void eliminarClientePorId(Cliente clienteEliminar) {
        clienteDao.delete(clienteEliminar);
    }

}
