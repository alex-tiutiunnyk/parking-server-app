package com.otiutiunnyk.project.diploma.repository

import com.otiutiunnyk.project.diploma.model.NewParkingRequest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NewParkingRequestRepository : JpaRepository<NewParkingRequest, Long>