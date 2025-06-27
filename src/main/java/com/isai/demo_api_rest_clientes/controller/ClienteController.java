package com.isai.demo_api_rest_clientes.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.isai.demo_api_rest_clientes.models.entity.Cliente;
import com.isai.demo_api_rest_clientes.service.ClienteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    /* codigo de respuesta */
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/cliente", method = RequestMethod.POST)
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return clienteService.guardarCliente(cliente);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(path = "/cliente", method = RequestMethod.PUT)
    public void actualizarCliente(@RequestBody Cliente cliente) {
        clienteService.guardarCliente(cliente);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(path = "/cliente/{id}", method = RequestMethod.DELETE)
    public void eliminarClientePorId(@PathVariable Long id) {
        Cliente clienteBuscadoEliminar = clienteService.obtenerClientePorID(id);
        clienteService.eliminarClientePorId(clienteBuscadoEliminar);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(path = "/cliente/{id}", method = RequestMethod.GET)
    public Cliente obtenerClientePorId(@PathVariable Long id) {
        return clienteService.obtenerClientePorID(id);
    }

}
