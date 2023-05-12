package com.otiutiunnyk.project.diploma.repository

import com.otiutiunnyk.project.diploma.model.DeleteRequest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DeleteRequestRepository : JpaRepository<DeleteRequest, Long>