package com.clopewop.service;

import com.clopewop.entity.ClienteDO;

public interface IClienteService {

    public ClienteDO createCliente(ClienteDO cliente);

    public ClienteDO findById(Long id);
}
