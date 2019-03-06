package site.syso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ClientEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientEurekaApplication.class, args);
    }

    @GetMapping("/")
    public String test(){
        return "hello eureka !";
    }

}
