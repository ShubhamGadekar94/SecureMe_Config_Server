package com.secureme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SecureMeConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecureMeConfigServerApplication.class, args);
	}

}
