package com.otiutiunnyk.project.diploma.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import jakarta.persistence.*

@Entity
@Table(name = "new_parking_requests")
class NewParkingRequest() { //TODO: check the difference between data and simple class
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Column(name = "id")
    var id: Long? = null

    @get:Column(name = "geolocation", nullable = false)
    var geolocation: String? = null

    @get:Column(name = "capacity", nullable = false)
    var capacity: Int? = null


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JsonIgnoreProperties
    @get:JoinColumn(name = "user_id", nullable = false)
    var user: User? = null

    @get:Column(name = "price_per_hour")
    var pricePerHour: Double? = null

    @get:Column(name = "is_for_disabled_person")
    var isForDisabledPerson: Boolean? = null

    @get:Column(name = "is_for_electric_car")
    var isForElectricCar: Boolean? = null

    @get:Column(name = "comment")
    var comment: String? = null

    constructor(geolocation: String, capacity: Int, user: User) : this() {
        this.geolocation = geolocation
        this.capacity = capacity
        this.user = user
    }

    constructor(
        geolocation: String, capacity: Int, user: User,
        pricePerHour: Double?, isForDisabledPerson: Boolean?,
        isForElectricCar: Boolean?, comment: String?
    ) : this(geolocation, capacity, user) {
        this.pricePerHour = pricePerHour
        this.isForDisabledPerson = isForDisabledPerson
        this.isForElectricCar = isForElectricCar
        this.comment = comment
    }
}

//TODO: probably add the createdAt row to the tables with request to track the time? LocalDate type