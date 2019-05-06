package com.laba;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController()
public class Controller {

    @Value("${hello.title.prefix}")
    private String prefix;

    @Value("${hello.title.suffix}")
    private String suffix;

    @GetMapping({"/hello/{name}"})
    public String getHello(@PathVariable(required = false) String name) {
        return prefix + " " + name + " " + suffix;
    }

    @GetMapping({"/hello-world"})
    public String getHello() {
        return prefix + " World " + suffix;
    }


}
