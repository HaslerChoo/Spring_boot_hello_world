package mz.co.haslerchoo.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping
    public String hello_world() {
        return "Hello World";
    }
    
    @RequestMapping("helloSpring")
    public String hello_world_spring_boot() {
        return "Hello Spring Boot World";
    }
}
