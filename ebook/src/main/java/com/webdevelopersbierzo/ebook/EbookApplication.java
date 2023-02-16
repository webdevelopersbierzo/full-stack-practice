package com.webdevelopersbierzo.ebook;

import com.webdevelopersbierzo.ebook.domain.Car;
import com.webdevelopersbierzo.ebook.domain.CarRepository;
import com.webdevelopersbierzo.ebook.domain.Owner;
import com.webdevelopersbierzo.ebook.domain.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class EbookApplication  implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(EbookApplication.class);
	@Autowired
	private CarRepository repository;
	@Autowired
	private OwnerRepository orepository;
	public static void main(String[] args) {
		SpringApplication.run(EbookApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// add owner objects and save these to db
		Owner owner1 = new Owner("John", "Johnson");
		Owner owner2 = new Owner("Paul", "Carrie");
		orepository.saveAll(Arrays.asList(owner1, owner2));

		repository.save(new Car("Ford", "Mustang", "Red","ADF-1121", 2021, 59000, owner1));
		repository.save(new Car("Toyota", "Prius", "Silver","kk0-0212", 2020, 3900, owner1));
		repository.save(new Car("Nissan", "Leaf", "White","ADF-1150", 2019, 29000, owner2));

		// fetch all cars an log to console

		for(Car car: repository.findAll()){
			logger.info(car.getBrand()+ " " + car.getModel());
		}
	}
}
