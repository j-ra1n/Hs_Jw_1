package com.hanwha.ict.procurement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class PurchaseSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseSystemApplication.class, args);
	}

}
