package com.example.nativespringecho

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NativeSpringEchoApplication

fun main(args: Array<String>) {
    runApplication<NativeSpringEchoApplication>(*args)
}
