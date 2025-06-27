package com.isai.demo_api_rest_clientes.service;

import com.isai.demo_api_rest_clientes.models.entity.Cliente;

public interface ClienteService {

    Cliente guardarCliente(Cliente cliente);

    Cliente obtenerClientePorID(Long idCliente);

    void eliminarClientePorId(Cliente clienteEliminar);

}
