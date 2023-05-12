package com.otiutiunnyk.project.diploma.dto

import com.otiutiunnyk.project.diploma.model.Comment
import com.otiutiunnyk.project.diploma.model.ParkingArea
import com.otiutiunnyk.project.diploma.model.User
import java.util.*

data class CommentDto(
    var content: String,
    var parkingArea: ParkingArea, //id?
    var user: User //userId
) {
    fun toApiEntity(): Comment = Comment(
        content,
        parkingArea,
        user
    )
    fun toEntity(): CommentDto = CommentDto(
        content,
        parkingArea,
        user
    )
}