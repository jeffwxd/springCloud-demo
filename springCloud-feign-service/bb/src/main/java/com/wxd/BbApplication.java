package com.wxd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author :wxd
 * @Description:
 * @Date: Created in 17:04 2019/7/22
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class BbApplication {
    public static void main(String[] args) {
        SpringApplication.run(BbApplication.class,args);
    }
}
