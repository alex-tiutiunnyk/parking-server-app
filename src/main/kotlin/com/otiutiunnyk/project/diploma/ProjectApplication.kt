package com.otiutiunnyk.project.diploma

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*


@SpringBootApplication
class ProjectApplication

fun main(args: Array<String>) {
    runApplication<ProjectApplication>(*args)
}

//@RestController
//@RequestMapping("/v1/examples")
//class MessageController(val service: MessageService) {
//
//    @GetMapping
//    fun index(): List<Message> = service.findMessages()
//}