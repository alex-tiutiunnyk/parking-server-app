package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "users")
class User() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Column(name = "id")
    var id: Long? = null

    @get:Column(name = "login", nullable = false)
    var login: String? = null //як краще тут зробити?

    @get:Column(name = "password", nullable = false)
    var password: String? = null

    @get:Column(name = "system_language", nullable = false)
    var systemLanguage: String? = null

    @get:Column(name = "email")
    var email: String? = null

    @get:Column(name = "birth_date")
    var birthDate: Date? = null

    constructor(login: String, password: String, systemLanguage: String) : this() {
        this.login = login
        this.password = password
        this.systemLanguage = systemLanguage
    }

    constructor(
        login: String, password: String,
        email: String?, birthDate: Date?, systemLanguage: String
    )
            : this(login, password, systemLanguage) {
        this.email = email
        this.birthDate = birthDate
    }
}
