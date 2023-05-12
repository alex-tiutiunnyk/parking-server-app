package com.otiutiunnyk.project.diploma.repository

import com.otiutiunnyk.project.diploma.model.Comment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommentRepository : JpaRepository<Comment, Long>