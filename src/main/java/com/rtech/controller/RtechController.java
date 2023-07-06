package com.rtech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rtech")
public class RtechController {
    @GetMapping("/")
    public String getOrder() {
        return "Hello";
    }
}
