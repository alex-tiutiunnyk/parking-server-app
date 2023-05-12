package com.otiutiunnyk.project.diploma.dto

import com.otiutiunnyk.project.diploma.model.DeleteRequest
import com.otiutiunnyk.project.diploma.model.ParkingArea
import com.otiutiunnyk.project.diploma.model.User
import java.util.*

data class DeleteRequestDto(
    var comment: String,
    var parkingArea: ParkingArea, //id?
    var user: User //userId
) {
    fun toApiEntity(): DeleteRequest = DeleteRequest(
        comment,
        parkingArea,
        user
    )
    fun toEntity(): DeleteRequestDto = DeleteRequestDto(
        comment,
        parkingArea,
        user
    )
}