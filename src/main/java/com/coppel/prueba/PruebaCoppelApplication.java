package com.coppel.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class })
public class PruebaCoppelApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaCoppelApplication.class, args);
	}

}
