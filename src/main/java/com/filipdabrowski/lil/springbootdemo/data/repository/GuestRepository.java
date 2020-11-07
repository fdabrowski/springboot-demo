package com.filipdabrowski.lil.springbootdemo.data.repository;

import com.filipdabrowski.lil.springbootdemo.data.entity.Guest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository <Guest, Long> {

}
