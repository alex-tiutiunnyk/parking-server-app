package com.otiutiunnyk.project.diploma.model

import jakarta.persistence.*

@Entity
@Table(name = "parking_info_from_users")
class ParkingInfoFromUser() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @get:Column(name = "id")
    var id: Long? = null

    @ManyToOne
    @get:JoinColumn(name = "user_id", nullable = false)
    var user: User? = null

    @get:Column(name = "geolocation", nullable = false)
    var geolocation: String? = null

    @get:Column(name = "free_places_number", nullable = false)
    var freePlacesNumber: Int? = null

    constructor(user: User, geolocation: String, freePlacesNumber: Int) : this() {
        this.user = user
        this.geolocation = geolocation
        this.freePlacesNumber = freePlacesNumber
    }
}
