package site.syso.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("client-eureka")
public interface HelloConsumer {

    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);


}
