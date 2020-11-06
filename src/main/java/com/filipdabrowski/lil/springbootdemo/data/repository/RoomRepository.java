package com.filipdabrowski.lil.springbootdemo.data.repository;

import com.filipdabrowski.lil.springbootdemo.data.entity.Room;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    
}
