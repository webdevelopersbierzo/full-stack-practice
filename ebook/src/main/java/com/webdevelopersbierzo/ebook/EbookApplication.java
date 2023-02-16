package com.webdevelopersbierzo.ebook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EbookApplication {
	private static final Logger logger = LoggerFactory.getLogger(EbookApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EbookApplication.class, args);
	}

}
