package com.muller.techshare.domain.service;

import com.muller.techshare.data.model.CarroModel;
import com.muller.techshare.data.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CarroService {

    @Autowired
    CarroRepository carroRepository;

    public Mono<CarroModel> getCarro(Long id) {
        return carroRepository.findById(id);
    }

    public Flux<CarroModel> getAll() {
        return carroRepository.findAll();
    }
}
