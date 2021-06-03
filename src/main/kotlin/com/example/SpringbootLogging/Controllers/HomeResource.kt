package com.example.SpringbootLogging.Controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeResource {

    @RequestMapping("/")
    fun home():String{
        return "Hello from Spring boot";
    }
}