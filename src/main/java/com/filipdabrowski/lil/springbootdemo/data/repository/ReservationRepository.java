package com.filipdabrowski.lil.springbootdemo.data.repository;

import com.filipdabrowski.lil.springbootdemo.data.entity.Reservation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    
}