package cn.flysheep.eurekaribbonconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(method = RequestMethod.GET, value = "/ribbon-consumer")
    public String helloConsumer() {
        return restTemplate.getForEntity("http://06-eureka-service-product/hello", String.class).getBody();
    }
}
