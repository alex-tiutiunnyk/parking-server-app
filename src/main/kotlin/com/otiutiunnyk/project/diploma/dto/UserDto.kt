package com.otiutiunnyk.project.diploma.dto

import com.otiutiunnyk.project.diploma.model.User
import java.util.*

data class UserDto(
    var login: String,
    var password: String,
    var systemLanguage: String,
    var email: String? = null,
    var birthDate: Date? = null
) {
    fun toApiEntity(): User = User(
        login,
        password,
        email,
        birthDate,
        systemLanguage
    )
    fun toEntity(): UserDto = UserDto(
        login,
        password,
        systemLanguage
    )
}