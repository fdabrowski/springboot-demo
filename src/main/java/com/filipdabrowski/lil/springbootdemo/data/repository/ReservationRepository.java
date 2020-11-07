package com.filipdabrowski.lil.springbootdemo.data.repository;

import com.filipdabrowski.lil.springbootdemo.data.entity.Reservation;

import org.springframework.data.repository.CrudRepository;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    
}