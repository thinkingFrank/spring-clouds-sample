package org.freeme.sample.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by minghua.zmh on 2018/9/3.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProvider {
    public static void main(String... args){
        new SpringApplication(EurekaProvider.class).run(args);
    }
}
