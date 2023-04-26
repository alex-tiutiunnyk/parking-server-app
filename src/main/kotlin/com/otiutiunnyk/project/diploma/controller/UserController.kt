package com.otiutiunnyk.project.diploma.controller

import com.otiutiunnyk.project.diploma.model.User
import com.otiutiunnyk.project.diploma.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserController(
    private val userRepository: UserRepository
) {
    @GetMapping("")
    fun getAllUsers(): MutableIterable<User> = userRepository.findAll()
}