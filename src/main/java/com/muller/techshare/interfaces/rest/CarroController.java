package com.muller.techshare.interfaces.rest;

import com.muller.techshare.data.model.CarroModel;
import com.muller.techshare.domain.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CarroController {

    @Autowired
    CarroService carroService;

    @GetMapping(value = "/carro/{id}")
    public ResponseEntity<Mono<CarroModel>> getCarro(@PathVariable Long id) {
        return new ResponseEntity<>(carroService.getCarro(id), HttpStatus.OK);
    }

    @GetMapping(value = "/carro")
    public Flux<CarroModel> getAllCarros() {
        return carroService.getAll();
    }
}
