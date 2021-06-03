package com.example.SpringbootLogging.Controllers

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeResource {
    /*
    By default configuration logback is present in our project
    We will make a logger object by using static method get logger of LoggerFactory and pass it name of current class
    Level of logging
    trace
    debug
    info
    warn
    error
    Default level is info
     */
    val logger = LoggerFactory.getLogger(this.javaClass.name);

    @RequestMapping("/")
    fun home():String{
        logger.trace("Error happend");
        return "Hello from Spring boot";
    }
}