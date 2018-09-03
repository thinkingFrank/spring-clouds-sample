package org.freeme.sample.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by minghua.zmh on 2018/9/3.
 */
@FeignClient(name= "eureka-provider")
public interface HomeRemote {

    @RequestMapping(value = "/home/")
    String home();


}
