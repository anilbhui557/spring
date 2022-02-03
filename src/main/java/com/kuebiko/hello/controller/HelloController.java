package com.kuebiko.hello.controller;

import com.kuebiko.hello.controller.service.HelloService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/myapp")
public class HelloController {

    //GET -> reads data
    String var;

    @GetMapping
    @RequestMapping("/hello")
    public String sayHello(@RequestParam("input") String input) {
        var = input;
        return "Hello, " + input;
    }

    @GetMapping
    @RequestMapping("/goodBye")
    public String sayBye() {
        return "Good Bye!" + var;
    }

    @PostMapping
    @RequestMapping("/save")
    public String Save(@RequestBody String data) {

        HelloService service = new HelloService();
        String response = service.save(data);

        return response;
    }

    //PUT -> update existing data


    //DELETE -> delete data


}
