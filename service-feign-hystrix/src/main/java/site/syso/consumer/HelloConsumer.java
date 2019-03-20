package site.syso.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client-eureka", fallback = HelloConsumerHystrix.class)
public interface HelloConsumer {

    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);


}
