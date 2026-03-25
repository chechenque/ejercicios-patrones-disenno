package com.clopewop.service.impl;

import com.clopewop.entity.ClienteDO;
import com.clopewop.persistence.IClienteRepository;
import com.clopewop.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements IClienteService {

    @Autowired
    IClienteRepository repository;

    @Override
    public ClienteDO createCliente(ClienteDO cliente) {
        return repository.save(cliente);
    }

    @Override
    public ClienteDO findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
