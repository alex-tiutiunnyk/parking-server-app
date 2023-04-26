package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: String,
    @Column(name = "login")
    var login: String,
    @Column(name = "password")
    var password: String,
    @Column(name = "email")
    var email: String?,
    @Column(name = "birth_date")
    var birthDate: Date?,
    @Column(name="system_language")
    var systemLanguage: String
)
