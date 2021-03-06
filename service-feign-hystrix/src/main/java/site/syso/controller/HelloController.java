package site.syso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import site.syso.consumer.HelloConsumer;

@RestController
public class HelloController {

    @Autowired
    private HelloConsumer helloConsumer;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return appName + ":" + helloConsumer.hello(name);
    }

}
