package com.github.liukeshao.logto.spring.boot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LogtoSpringBootStarterApplication

fun main(args: Array<String>) {
	runApplication<LogtoSpringBootStarterApplication>(*args)
}
