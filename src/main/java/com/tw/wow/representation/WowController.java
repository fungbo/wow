package com.tw.wow.representation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WowController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
