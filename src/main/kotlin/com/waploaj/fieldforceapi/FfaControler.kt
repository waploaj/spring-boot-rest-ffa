package com.waploaj.fieldforceapi

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/hello")
class FfaControler {

    @GetMapping("spring")
    fun hello():String = "Hello World!"
}