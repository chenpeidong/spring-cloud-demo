package site.syso.consumer;

import org.springframework.stereotype.Component;

@Component
public class HelloConsumerHystrix implements HelloConsumer {
    @Override
    public String hello(String name) {
        return "Error, "+ name;
    }
}
