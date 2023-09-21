package com.kery.jkeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import springfox.documentation.oas.annotations.EnableOpenApi;

/**
 * @author Kery
 * @Description:
 * @date 2023/9/21
 */
@EnableDiscoveryClient
@EnableOpenApi
@SpringBootApplication
public class JKeeperRocketMQApplication {
    public static void main(String[] args) {
        SpringApplication.run(JKeeperRocketMQApplication.class);
    }
}
