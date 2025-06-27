package com.isai.demo_api_rest_clientes.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.isai.demo_api_rest_clientes.models.entity.Cliente;

@Repository
public interface ClienteDao
        extends CrudRepository<Cliente, Long> {

}
