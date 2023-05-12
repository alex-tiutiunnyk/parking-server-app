package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*

@Entity
@Table(name = "parking_areas")
class ParkingArea() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Column(name = "id")
    var id: Long? = null

    @get:Column(name = "geolocation", nullable = false)
    var geolocation: String? = null

    @get:Column(name = "capacity", nullable = false)
    var capacity: Int? = null

    @get:Column(name = "is_for_disabled_person")
    var isForDisabledPerson: Boolean? = null

    @get:Column(name = "is_for_electric_car")
    var isForElectricCar: Boolean? = null

    @get:Column(name = "price_hour")
    var priceHour: Double? = null

    constructor(geolocation: String, capacity: Int) : this() {
        this.geolocation = geolocation
        this.capacity = capacity
    }

    constructor(
        geolocation: String, capacity: Int,
        isForDisabledPerson: Boolean?, isForElectricCar: Boolean?,
        priceHour: Double?
    ) : this(geolocation, capacity) {
        this.isForDisabledPerson = isForDisabledPerson
        this.isForElectricCar = isForElectricCar
        this.priceHour = priceHour
    }
}
