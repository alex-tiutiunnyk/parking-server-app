package com.otiutiunnyk.project.diploma.repository

import com.otiutiunnyk.project.diploma.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
//    fun findByName(name: String): Optional<User>
}