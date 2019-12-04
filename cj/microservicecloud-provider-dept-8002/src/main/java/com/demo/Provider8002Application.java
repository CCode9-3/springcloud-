package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class Provider8002Application
{
    public static void main(String[] args)
    {
        SpringApplication.run(Provider8002Application.class, args);
    }
}

