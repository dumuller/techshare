package com.muller.techshare.data.repository;

import com.muller.techshare.data.model.CarroModel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends ReactiveCrudRepository<CarroModel, Long> {

}
