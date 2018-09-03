package org.freeme.sample.eureka.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by minghua.zmh on 2018/9/3.
 */
@RestController
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "Hello world";
    }
}
