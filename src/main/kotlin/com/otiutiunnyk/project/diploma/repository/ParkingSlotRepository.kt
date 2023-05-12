package com.otiutiunnyk.project.diploma.repository

import com.otiutiunnyk.project.diploma.model.ParkingSlot
import org.springframework.data.jpa.repository.JpaRepository

interface ParkingSlotRepository : JpaRepository<ParkingSlot, Long>