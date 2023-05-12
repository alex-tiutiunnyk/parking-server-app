package com.otiutiunnyk.project.diploma.dto

import com.otiutiunnyk.project.diploma.model.NewParkingRequest
import com.otiutiunnyk.project.diploma.model.User
import java.util.*

data class NewParkingRequestDto(
    var geolocation: String,
    var capacity: Int,
    var userId: Long,
    var pricePerHour: Double? = null,
    var isForDisabledPerson: Boolean? = null,
    var isForElectricCar: Boolean? = null,
    var comment: String? = null
) {

    fun toApiEntity(user: User): NewParkingRequest = NewParkingRequest(
        geolocation,
        capacity,
        user,
        pricePerHour,
        isForDisabledPerson,
        isForElectricCar,
        comment
    )

//    fun toEntity(): NewParkingRequestDto = NewParkingRequestDto(
//        geolocation,
//        capacity,
//        user.id
//    )
}

