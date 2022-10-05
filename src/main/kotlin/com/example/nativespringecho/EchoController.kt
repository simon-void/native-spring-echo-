package com.example.nativespringecho

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class EchoController {
    @GetMapping("/echo/{msg}")
    fun echo(@PathVariable msg: String): String = msg
}