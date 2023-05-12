package com.otiutiunnyk.project.diploma.dto

import com.otiutiunnyk.project.diploma.model.ParkingInfoFromUser
import com.otiutiunnyk.project.diploma.model.User
import java.util.*

data class ParkingInfoFromUserDto(
    var user: User, //userId
    var geolocation: String,
    var freePlacesNumber: Int
) {
    fun toApiEntity(): ParkingInfoFromUser = ParkingInfoFromUser(
        user,
        geolocation,
        freePlacesNumber
    )
    fun toEntity(): ParkingInfoFromUserDto = ParkingInfoFromUserDto(
        user,
        geolocation,
        freePlacesNumber
    )
}