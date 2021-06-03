package com.example.SpringbootLogging

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootLoggingApplication

fun main(args: Array<String>) {
	runApplication<SpringBootLoggingApplication>(*args)
}
