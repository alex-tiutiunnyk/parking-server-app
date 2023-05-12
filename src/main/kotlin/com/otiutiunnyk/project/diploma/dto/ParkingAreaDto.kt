package com.otiutiunnyk.project.diploma.dto

import com.otiutiunnyk.project.diploma.model.ParkingArea
import com.otiutiunnyk.project.diploma.model.User
import java.util.*

data class ParkingAreaDto(
    var geolocation: String,
    var capacity: Int,
    var isForDisabledPerson: Boolean? = null,
    var isForElectricCar: Boolean? = null,
    var priceHour: Double? = null
) {
    fun toApiEntity(): ParkingArea = ParkingArea(
        geolocation,
        capacity,
        isForDisabledPerson,
        isForElectricCar,
        priceHour
    )
    fun toEntity(): ParkingAreaDto = ParkingAreaDto(
        geolocation,
        capacity
    )
}