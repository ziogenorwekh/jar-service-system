package com.jar.service.system.apporder.service.container;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;


@EnableAsync
@EnableKafka
@EnableDiscoveryClient
@EntityScan(basePackages = "com.jar.service.system.apporder.service.jpa.entity")
@EnableJpaRepositories(basePackages = "com.jar.service.system.apporder.service.jpa.repository")
@SpringBootApplication(scanBasePackages = "com.jar.service.system")
public class AppOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppOrderApplication.class, args);
    }
}
