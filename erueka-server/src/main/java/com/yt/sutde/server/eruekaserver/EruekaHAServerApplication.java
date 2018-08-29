package com.yt.sutde.server.eruekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EruekaHAServerApplication
{

	public static void main(String[] args) {
		SpringApplication.run(EruekaHAServerApplication.class, args);
	}
}
