package com.springcloud.eurekaserverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaserverconfigApplication.class, args);
    }

}
