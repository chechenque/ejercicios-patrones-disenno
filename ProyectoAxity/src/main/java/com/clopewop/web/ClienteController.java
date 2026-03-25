package com.clopewop.web;

import com.clopewop.entity.ClienteDO;
import com.clopewop.exceptionHandling.ApiException;
import com.clopewop.service.IClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    IClienteService service;

    /**
     * Metodo que crea un cliente desde el controller
     * @param cliente El cliente a crear.
     * @param bindingResult Para errores
     * @return Un response Entity con el Status de HTTTP
     */
    @PostMapping
    public ResponseEntity<HttpStatus> createCliente(@Valid @RequestBody ClienteDO cliente, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
             throw new ApiException(HttpStatus.BAD_REQUEST, bindingResult.getAllErrors().get(0).getDefaultMessage());
        }

        //return service.createCliente(cliente);
        return new ResponseEntity<>(HttpStatus.CREATED);
        //return a;
    }

    @GetMapping("/{idCliente}")
    public ClienteDO getCliente(@PathVariable Long idCliente) {
        return service.findById(idCliente);
    }

}
