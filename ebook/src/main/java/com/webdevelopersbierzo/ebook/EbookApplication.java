package com.webdevelopersbierzo.ebook;

import com.webdevelopersbierzo.ebook.domain.Car;
import com.webdevelopersbierzo.ebook.domain.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EbookApplication  implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(EbookApplication.class);
	@Autowired
	private CarRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(EbookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Car("Ford", "Mustang", "Red","ADF-1121", 2021, 59000));
		repository.save(new Car("Toyota", "Prius", "Silver","kk0-0212", 2020, 3900));
		repository.save(new Car("Nissan", "Leaf", "White","ADF-1150", 2019, 29000));

		// fetch all cars an log to console

		for(Car car: repository.findAll()){
			logger.info(car.getBrand()+ " " + car.getModel());
		}
	}
}
