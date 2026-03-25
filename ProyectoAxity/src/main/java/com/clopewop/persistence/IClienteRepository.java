package com.clopewop.persistence;

import com.clopewop.entity.ClienteDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la conexion a la base de datos desde la tabla cliente.
 * @author Kassandra Mirael
 * @version 1.0
 */
@Repository
public interface IClienteRepository extends JpaRepository<ClienteDO, Long> {
}
