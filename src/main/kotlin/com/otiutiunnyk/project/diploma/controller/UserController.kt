package com.otiutiunnyk.project.diploma.controller

import com.otiutiunnyk.project.diploma.dto.UserDto
import com.otiutiunnyk.project.diploma.model.User
import com.otiutiunnyk.project.diploma.repository.UserRepository
import org.springframework.lang.NonNull
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/users")
class UserController(
    private val userRepository: UserRepository
) {
    @GetMapping("")
    fun getAllUsers(): MutableIterable<User> = userRepository.findAll()

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): Optional<User> = userRepository.findById(id)

    @PostMapping("") //TODO: це тільки для нових чи і для оновлення старих?
    //TODO: check the null validation and if I should add the @Valid annotation?
    fun createUser(@RequestBody @NonNull user: UserDto) =
        userRepository.save(user.toApiEntity())
}