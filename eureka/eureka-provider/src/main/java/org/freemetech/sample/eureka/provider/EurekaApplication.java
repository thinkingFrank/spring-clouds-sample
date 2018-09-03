package org.freemetech.sample.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by minghua.zmh on 2018/9/3.
 */
@SpringBootApplication
public class EurekaApplication {


    public static void main(String[] args) {
        new SpringApplication(EurekaApplication.class).run(args);
    }

}
