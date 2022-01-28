package com.ericStudy.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HelloWorldController {
    // test basic GET
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    // test Bean
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        //throw new RuntimeException("Some Error has happened! Contact Support at ***-****");
        return new HelloWorldBean("Hello World - Changed");
    }

    // test with PathVariable
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
