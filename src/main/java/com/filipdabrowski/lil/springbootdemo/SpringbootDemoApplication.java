package com.filipdabrowski.lil.springbootdemo;

import com.filipdabrowski.lil.springbootdemo.data.entity.Room;
import com.filipdabrowski.lil.springbootdemo.data.repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

	@RestController
	@RequestMapping("/rooms")
	public class RoomController {
		@Autowired
		private RoomRepository roomRepository;
		
		@GetMapping
		public Iterable<Room> getRooms() {
			return this.roomRepository.findAll();
		}
	}

}
