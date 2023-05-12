package com.otiutiunnyk.project.diploma.repository

import com.otiutiunnyk.project.diploma.model.ParkingInfoFromUser
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ParkingInfoFromUserRepository : JpaRepository<ParkingInfoFromUser, Long>