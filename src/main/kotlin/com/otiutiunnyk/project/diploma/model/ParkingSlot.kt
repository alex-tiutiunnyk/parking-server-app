package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*

@Entity
@Table(name = "parking_slots")
class ParkingSlot() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Column(name = "id")
    var id: Long? = null

    @get:Column(name = "geolocation", nullable = false)
    var geolocation: String? = null

    @ManyToOne
    @get:JoinColumn(name = "parking_area_id", nullable = false)
    var parkingArea: ParkingArea? = null

    constructor(geolocation: String, parkingArea: ParkingArea) : this() {
        this.geolocation = geolocation
        this.parkingArea = parkingArea
    }
}
