package org.freeme.sample.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by minghua.zmh on 2018/9/3.
 */
@RestController
public class HomeController {

    @Autowired
    HomeRemote homeRemote;

    @RequestMapping("/home/")
    public String index() {
        return homeRemote.home();
    }

}
