package org.example.rlsb_zxks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RlsbZxksApplication {

	public static void main(String[] args) {
		SpringApplication.run(RlsbZxksApplication.class, args);
	}

}
