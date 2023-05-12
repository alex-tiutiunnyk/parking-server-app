package com.otiutiunnyk.project.diploma.dto

import com.otiutiunnyk.project.diploma.model.FavouritePlace
import com.otiutiunnyk.project.diploma.model.ParkingArea
import com.otiutiunnyk.project.diploma.model.User
import java.util.*

data class FavouritePlaceDto(
    var parkingArea: ParkingArea, //id?
    var user: User //userId
) {
    fun toApiEntity(): FavouritePlace = FavouritePlace(
        parkingArea,
        user
    )
    fun toEntity(): FavouritePlaceDto = FavouritePlaceDto(
        parkingArea,
        user
    )
}