package com.otiutiunnyk.project.diploma.dto

import com.otiutiunnyk.project.diploma.model.ParkingArea
import com.otiutiunnyk.project.diploma.model.ParkingSlot
import com.otiutiunnyk.project.diploma.model.User
import java.util.*

data class ParkingSlotDto( //TODO: подвитися, якщо вони однакові, то не треба дто. подумати які спільні дто треба
    var geolocation: String,
    var parkingArea: ParkingArea //id?
) {
    fun toApiEntity(): ParkingSlot = ParkingSlot(
        geolocation,
        parkingArea
    )
    fun toEntity(): ParkingSlotDto = ParkingSlotDto(
        geolocation,
        parkingArea
    )
}