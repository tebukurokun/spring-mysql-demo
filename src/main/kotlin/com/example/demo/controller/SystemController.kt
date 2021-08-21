package com.example.demo.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/healthcheck")
class SystemController {

    val log: Logger = LoggerFactory.getLogger(SystemController::class.java)

    @GetMapping
    fun healthCheck(): String {
        log.info("healthcheck OK")

        return "OK"
    }
}
